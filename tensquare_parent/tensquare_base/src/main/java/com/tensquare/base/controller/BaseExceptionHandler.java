package com.tensquare.base.controller;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Willie Chen
 * @Description
 * @Date 2018/10/18
 * @Param $param
 **/

/**
 * 全局异常处理
 */
@ControllerAdvice
public class BaseExceptionHandler {

      // 异常处理方法
    @ExceptionHandler(value = Exception.class)
    @ResponseBody // 转换json格式注解不能省
    public Result error(Exception e){
        return  new Result(false, StatusCode.ERROR,"出现故障： "+e.getMessage());

    }
}
