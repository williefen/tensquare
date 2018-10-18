package com.tensquare.base.dao;

/**
 * @Author Willie Chen
 * @Description
 * @Date 2018/10/17
 * @Param $param
 **/

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 标签dao
 */
public interface LabelDao extends JpaRepository<Label,String>{

 }


