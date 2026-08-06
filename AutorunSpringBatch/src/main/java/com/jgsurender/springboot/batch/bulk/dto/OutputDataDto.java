package com.jgSurender.springboot.batch.bulk.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*************************************
 * This Class is used to 
 * Author  : Surender Dalal
 * File    : com.jgSurender.springboot.batch.bulk.dto.OutputDataDto
 * Date    : 01-11-2025
 * Version : 1.0
 **************************************/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutputDataDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String firstName;
    private String lastName;
    @Override
    public String toString() {
        return "InputDataDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
