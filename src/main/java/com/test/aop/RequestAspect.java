/*
 * Project: alex-test-spring-boot
 * 
 * File Created at 2016年10月8日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.test.aop;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.test.domain.Response;

/**
 * @Type RequestAspect.java
 * @Desc 
 * @author alex
 * @date 2016年10月8日 下午4:05:42
 * @version 
 */

@Aspect
@Service
public class RequestAspect {
    
//    
//    
    @Pointcut("execution(public * com.test.web.HttpClientRsaController.doRequest(..))")
    public void doRequestPointcut() {
        //I'm a pointcut
        System.out.println("I'm a pointcut  @doRequestPointcut");
    }
//
    @Pointcut("execution(public * com.test.interceptor.ParamsInterceptor.preHandle(..))")
    public void preHandlePointCut() {
        //I'm a pointcut
        System.out.println("I'm a pointcut @preHandlePointCut");
    }
//
    @Around("com.test.aop.RequestAspect.doRequestPointcut()")
    public Object doRequestAround(ProceedingJoinPoint pjp) throws Throwable {
        Date requestTime = new Date();
        Response response = (Response) pjp.proceed();
        long end = System.currentTimeMillis();
        
        response.getResultMap().toJSONString();
        return response;
    }
//
    @Around("com.test.aop.RequestAspect.preHandlePointCut()")
    public Object preHandleAroud(ProceedingJoinPoint pjp) throws Throwable {
        Object retVal = pjp.proceed();
        Boolean flag = Boolean.parseBoolean(retVal.toString());
        return retVal;
    }
//    
//    
//    
//    

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年10月8日 alex creat
 */