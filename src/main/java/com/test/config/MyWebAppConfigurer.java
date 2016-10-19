/*
 * Project: alex.-test-sprint-boot
 * 
 * File Created at 2016��9��23��
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.test.interceptor.MyInterceptor1;
import com.test.interceptor.ParamsInterceptor;

/**
 * 
 * @author alex
 *
 */

@Configuration
public class MyWebAppConfigurer  extends WebMvcConfigurerAdapter  {

//    @Autowired
//    private  MyInterceptor1  myInterceptor1;
    
    @Autowired
    private ParamsInterceptor  paramsInterceptor;
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        System.err.println("---------addInterceptors--");
//        registry.addInterceptor(myInterceptor1).addPathPatterns("/**");
        registry.addInterceptor(paramsInterceptor).addPathPatterns("/**");
//        super.addInterceptors(registry);
    }

    
    
    
    

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016��9��23�� alex creat
 */