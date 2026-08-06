package com.jgSurender.springboot.batch.fixedfile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*************************************
 * This Class is used to 
 * Author  : Surender Dalal
 * File    : com.jgSurender.springboot.batch.fixedfile.dto.InputDataDto
 * Date    : 01-11-2025
 * Version : 1.0
 **************************************/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputDataDto extends BaseDto {

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
