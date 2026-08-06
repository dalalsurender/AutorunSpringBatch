package com.jgSurender.springboot.batch.iface;

import com.jgSurender.springboot.batch.entity.EmpEntity;

import java.util.List;

/*************************************
 * This interface is used to 
 * Author  : Surender Dalal
 * File    : com.jgSurender.springboot.batch.iface.EmpIFace
 * Date    : 14-08-2024
 * Version : 1.0
 **************************************/
public interface EmpIFace {

    public EmpEntity fetchById(Long id);

    public List<EmpEntity> fetchAll();

}
