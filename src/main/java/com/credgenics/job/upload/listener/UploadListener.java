package com.credgenics.job.upload.listener;

import com.credgenics.job.upload.service.ExternalServiceCall;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Slf4j
public class UploadListener implements JobExecutionListener {

    private final JdbcTemplate jdbcTemplate;
    private final ExternalServiceCall session;

    @Value("${server.job.companyId}")
    String companyId;


    public UploadListener(JdbcTemplate jdbcTemplate, ExternalServiceCall session) {
        this.jdbcTemplate = jdbcTemplate;
        this.session = session;
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
            log.info("JOB FINISHED! Time to verify the results");

            HashMap<String, Object> companyDetails = session.getCompanyDetails("e0bb14b2-4ce1-443f-bbe4-c2854850c6e5");
            log.info(companyDetails.toString());


//            jdbcTemplate
//                    .query("SELECT loan_id, company_id FROM loans", new DataClassRowMapper<>(Loan.class))
//                    .forEach(loan -> log.info("Found <{{}}> in the database.", loan.getLoanId()));
        }
    }

    @Override
    public void beforeJob(JobExecution jobExecution) {

        log.info("JOB Starting!");
        HashMap<String, Object> companyDetails = session.getCompanyDetails(companyId);
        log.info(companyDetails.toString());
    }
}