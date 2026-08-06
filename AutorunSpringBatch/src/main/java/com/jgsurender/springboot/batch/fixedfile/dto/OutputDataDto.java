package com.jgSurender.springboot.batch.fixedfile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*************************************
 * This Class is used to 
 * Author  : Surender Dalal
 * File    : com.jgSurender.springboot.batch.fixedfile.dto.OutputDataDto
 * Date    : 01-11-2025
 * Version : 1.0
 **************************************/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutputDataDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String firstName;

    private String lastName;

    private String village;

    private String mandal;

    private String disctrict;

    @Override
    public String toString() {
        return "InputDataDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", village='" + village + '\'' +
                ", mandal='" + mandal + '\'' +
                ", disctrict='" + disctrict + '\'' +
                '}';
    }
}
