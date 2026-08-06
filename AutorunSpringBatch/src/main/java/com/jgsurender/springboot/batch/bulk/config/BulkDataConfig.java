package com.jgSurender.springboot.batch.bulk.config;

import com.jgSurender.springboot.batch.bulk.dto.InputDataDto;
import com.jgSurender.springboot.batch.bulk.dto.OutputDataDto;
import com.jgSurender.springboot.batch.bulk.processor.BulkItemProcessor;
import com.jgSurender.springboot.batch.bulk.reader.BulkItemReader;
import com.jgSurender.springboot.batch.bulk.writer.BulkItemWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

/*************************************
 * This Class is used to
 * Author  : Surender Dalal
 * File    : com.jgSurender.springboot.batch.bulk.config.BulkDataConfig
 * Date    : 01-11-2025
 * Version : 1.0
 **************************************/
@Configuration
public class BulkDataConfig {

    @Autowired
    private BulkItemReader bulkItemReader;

    @Autowired
    private BulkItemProcessor bulkItemProcessor;

    @Autowired
    private BulkItemWriter bulkItemWriter;

    // Define your batch job configuration here
    @Bean
    @Qualifier("bulkJob")
    public Job bulkJob(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager) {
        return new JobBuilder("bulkJob",jobRepository).
                start(bulkJobStep(jobRepository,platformTransactionManager)).
                build();
    }

    @Bean
    public Step bulkJobStep(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager) {
        return new StepBuilder("bulkJobStep",jobRepository).<InputDataDto, OutputDataDto>chunk(2,platformTransactionManager).
                reader(bulkItemReader).
                processor(bulkItemProcessor).
                writer(bulkItemWriter).
                build();
    }


}
