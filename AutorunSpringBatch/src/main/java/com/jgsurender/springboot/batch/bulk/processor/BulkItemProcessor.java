package com.jgSurender.springboot.batch.bulk.processor;

import com.jgSurender.springboot.batch.bulk.dto.InputDataDto;
import com.jgSurender.springboot.batch.bulk.dto.OutputDataDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/*************************************
 * This Class is used to 
 * Author  : Surender Dalal
 * File    : com.jgSurender.springboot.batch.bulk.processor.FixedFileItemWriter
 * Date    : 01-11-2025
 * Version : 1.0
 **************************************/
@Component
@Log4j2
public class BulkItemProcessor implements ItemProcessor<InputDataDto, OutputDataDto> {

    /**
     * @param item
     * @return
     * @throws Exception
     */
    @Override
    public OutputDataDto process(InputDataDto item) throws Exception {
        log.info("Processing item: {}", item);
        OutputDataDto outputDataDto = new OutputDataDto();
        outputDataDto.setId(item.getId());
        outputDataDto.setFirstName(item.getFirstName());
        outputDataDto.setLastName(item.getLastName());
        return outputDataDto;
    }
}
