package com.jgSurender.springboot.batch.skippolicy.processor;

import com.jgSurender.springboot.batch.entity.EmpEntity;
import com.jgSurender.springboot.batch.exception.NameStartsWithException;
import lombok.extern.log4j.Log4j2;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/*************************************
 * This Class is used to 
 * Author  : Surender Dalal
 * File    : com.jgSurender.springboot.batch.skippolicy.processor.SkipPolicyFileItemProcessor
 * Date    : 16-08-2024
 * Version : 1.0
 **************************************/
@Component
@Log4j2
public class SkipPolicyFileItemProcessor implements ItemProcessor<EmpEntity,EmpEntity>, StepExecutionListener {

    @Override
    public void beforeStep(StepExecution stepExecution) {
        log.info("File Processing Step Initialized");
    }

    /**
     * @param item
     * @return
     * @throws Exception
     */
    @Override
    public EmpEntity process(EmpEntity item) throws Exception {
        log.info("Data Received From Reader is ::", item.toString());
        if(!item.getFirstName().startsWith("S")) {
            log.info("Name Not Starts with S :: {} ",item.getFirstName());
            throw new NameStartsWithException("NAME_NOT_START_WITH_S");
        }
        return item;
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        return ExitStatus.COMPLETED;
    }
}
