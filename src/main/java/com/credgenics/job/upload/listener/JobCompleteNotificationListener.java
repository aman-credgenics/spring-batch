package com.credgenics.job.upload.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JobCompleteNotificationListener implements JobExecutionListener {

    private static final Logger log = LoggerFactory.getLogger(JobCompleteNotificationListener.class);

    private final JdbcTemplate jdbcTemplate;

    public JobCompleteNotificationListener(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
            log.info("JOB FINISHED! Time to verify the results");

//            jdbcTemplate
//                    .query("SELECT loan_id, company_id FROM loans", new DataClassRowMapper<>(Loan.class))
//                    .forEach(loan -> log.info("Found <{{}}> in the database.", loan.getLoanId()));
        }
    }
}