package com.credgenics.job.upload.config;

import com.credgenics.job.upload.listener.JobCompleteNotificationListener;
import com.credgenics.job.upload.step.QueryWriter;
import com.credgenics.job.upload.step.RowProcessor;
import com.credgenics.job.upload.utils.ExcelMapper;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONObject;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.extensions.excel.poi.PoiItemReader;
import org.springframework.batch.item.ItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.Date;


//@EnableBatchProcessing(tablePrefix = "SPRING.JOB.LOAN.UPLOAD")
@Slf4j
@Configuration
@EnableJpaRepositories
public class UploadConfig {


    @Bean
    public RowProcessor rowProcessor() {
        return new RowProcessor();
    }

    @Bean
    public QueryWriter queryWriter() {
        return new QueryWriter();
    }

    @Bean
    public ItemReader<JSONObject> excelReader() {
        PoiItemReader<JSONObject> reader = new PoiItemReader<>();
        reader.setLinesToSkip(1); // HEADERS
        reader.setResource(new ClassPathResource("loan-upload-100.xlsx"));
        reader.setRowMapper(new ExcelMapper());
        return reader;
    }

    @Bean
    public Step step1(JobRepository jobRepository, PlatformTransactionManager transactionManager,
                     ItemReader<JSONObject> excelReader, RowProcessor rowProcessor, QueryWriter queryWriter) {
        return new StepBuilder("step1", jobRepository)
                .<JSONObject, JSONObject>chunk(1, transactionManager)
                .reader(excelReader)
                .processor(rowProcessor)
                .writer(queryWriter)
                .build();
    }

    @Bean
    public Job UploadJob(JobRepository jobRepository, Step step1, JobCompleteNotificationListener listener) {
        return new JobBuilder("uploadJob: " + new Date(), jobRepository)
                .listener(listener)
                .start(step1)
                .build();
    }
}
