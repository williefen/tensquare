package com.tensquare.base;

/**
 * @Author Willie Chen
 * @Description
 * @Date 2018/10/18
 * @Param $param
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/**
 * 基础微服务启动类
 */
@SpringBootApplication
public class BaseApplication {

    public static void main(String[] args) {

        SpringApplication.run(BaseApplication.class, args);

    }

    /**
     * 初始化IdWork
     */
    @Bean
    public IdWorker idWorker() {

        return new IdWorker();
    }

}
