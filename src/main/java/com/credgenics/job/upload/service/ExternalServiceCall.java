package com.credgenics.job.upload.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;

@Service
@Slf4j
public class ExternalServiceCall {

    @Lazy
    public ExternalServiceCall(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    RestTemplate restTemplate;


    @Value("${server.external.base.url.recovery}")
    String recoveryServiceBaseURL;


    @Value("${server.external.base.url.user}")
    String userServiceBaseURL;



    @Value("${server.auth.token}")
    String authToken;


    public HashMap<String, Object> getCompanyDetails(String companyId){
        String uri = "";
        try {
            long startTime = System.currentTimeMillis();
            uri =
                    userServiceBaseURL + "/company?company_id={companyId}".replace("{companyId}", companyId);

            HttpHeaders headers = new HttpHeaders();

            headers.add("authenticationtoken", authToken);

            HttpEntity bodyAndHeaders = new HttpEntity<>(headers);
            log.info(uri);
            ResponseEntity<HashMap> response =
                    restTemplate.exchange(uri, HttpMethod.GET, bodyAndHeaders, HashMap.class);

            log.info(response.getBody().toString());

            HashMap<String, Object> responseBody = (HashMap<String, Object>) ((HashMap<String, Object>)((HashMap<String, Object>) response.getBody()).get("data")).get("company_details");
            long endTime = System.currentTimeMillis();
            log.info("User Service took time : {} milliseconds, companyId : {}}", endTime - startTime, companyId);
            return responseBody;
        } catch (HttpClientErrorException e) {
            log.error("Error fetching company details. URI: {}, Response Body: {}", uri, e.getResponseBodyAsString(), e);
            throw e;
        } catch (Exception e) {
            log.error("Error fetching company details. URI: {}", uri, e);
            throw e;
        }
    }

    public HashMap<String, Object> verifyLoan(String loanId, String companyId, HashMap<String, Object> userInfo,
                                              HashMap<String, Object> companyInfo) {
        String uri = "";
        try {
            long startTime = System.currentTimeMillis();
            uri =
                    recoveryServiceBaseURL + "/loan/{loanId}?fields={fields}&company_id={companyId}".replace(
                            "{loanId}", loanId).replace("{fields}", "loan").replace("{companyId}", companyId);

            HttpHeaders headers = new HttpHeaders();

            JSONObject userInfoMap = new JSONObject(userInfo);
            JSONObject companyInfoMap = new JSONObject(companyInfo);
            headers.add("x-cg-user", userInfoMap.toString());
            headers.add("x-cg-company", companyInfoMap.toString());

            HttpEntity bodyAndHeaders = new HttpEntity<>(headers);
            log.info(uri);

            ResponseEntity<HashMap> response =
                    restTemplate.exchange(uri, HttpMethod.GET, bodyAndHeaders, HashMap.class);

            log.info(response.getBody().get("output").toString());

            HashMap<String, Object> responseBody = (HashMap<String, Object>) ((HashMap<String, Object>) response.getBody()).get("output");
            long endTime = System.currentTimeMillis();
            log.info("Recovery took time : {} milliseconds, companyId : {}, loanId : {}", endTime - startTime, companyId, loanId);
            return responseBody;
        } catch (HttpClientErrorException e) {
            log.error("Error fetching loan details. URI: {}, Response Body: {}", uri, e.getResponseBodyAsString(), e);
            throw e;
        } catch (Exception e) {
            log.error("Error fetching loan details. URI: {}", uri, e);
            throw e;
        }
    }
}
