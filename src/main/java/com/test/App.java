/*
 * Project: alex.-test-sprint-boot
 * 
 * File Created at 2016年9月23日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Type App.java
 * @Desc 
 * @author alex
 * @date 2016年9月23日 上午9:15:32
 * @version 
 * 
 * 
 * /**
 * 
 * 
 * 大家也许会看到有些demo使用了3个注解： @Configuration；
 * 
 * @EnableAutoConfiguration
 * @ComponentScan
 * 
 *              其实：@SpringBootApplication申明让spring boot自动给程序进行必要的配置，
 * 
 *                等价于以默认属性使用@Configuration，
 *                @EnableAutoConfiguration和@ComponentScan
 * 
 * 所以大家不要被一些文档误导了，让自己很迷茫了，希望本文章对您有所启发；
 * 
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
//@SpringBootApplication
//@ServletComponentScan  //添加filter 扫描

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class App {
    
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年9月23日 alex creat
 */