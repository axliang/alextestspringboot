/*
 * Project: credit-dsp-open
 * 
 * File Created at 2016年8月29日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.test.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Type ResponseUtil.java
 * @Desc 响应工具类
 * @author Lucifer
 * @date 2016年8月29日 下午2:34:51
 * @version 
 */
public class ResponseUtil {

    private final static Logger logger = LoggerFactory.getLogger(ResponseUtil.class);

    /**
     * 将JSON格式的异常信息刷写到响应
     * 
     * @param errorMessage 异常
     * @param response 响应
     */
    public static void writeJsonResponse(String jsonData, HttpServletResponse response) {
        response.setContentType("application/json;charset=UTF-8");
        response.setHeader("Charset", "UTF-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.write(jsonData);
            out.flush();
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            out.close();
        }
    }

}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年8月29日 Lucifer creat
 */
