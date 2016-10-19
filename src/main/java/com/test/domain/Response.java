/*
 * Project: credit-dsp-open
 * 
 * File Created at 2016年8月28日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.test.domain;

import com.alibaba.fastjson.JSONObject;

/**
 * @Type Response.java
 * @Desc 请求响应
 * @author Lucifer
 * @date 2016年8月28日 下午4:37:46
 * @version 
 */
public class Response {

    private boolean successSign;
    private String errorMessage;
    private JSONObject resultMap;

    public boolean isSuccessSign() {
        return successSign;
    }

    public void setSuccessSign(boolean successSign) {
        this.successSign = successSign;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public JSONObject getResultMap() {
        return resultMap;
    }

    public void setResultMap(JSONObject resultMap) {
        this.resultMap = resultMap;
    }

}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年8月28日 Lucifer creat
 */
