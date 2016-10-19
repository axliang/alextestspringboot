/*
 * Project: credit-combination-dispatcher
 * 
 * File Created at 2016年9月18日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.test.enums;

import com.alibaba.fastjson.JSONObject;

/**
 * @Type OpenResponse.java
 * @Desc 通用接口响应
 * @author Lucifer
 * @date 2016年9月18日 下午4:55:15
 * @version 
 */
public class OpenResponse {

    private JSONObject json = new JSONObject();
//
//    public OpenResponse(OpenResponseStatus status) {
//        json.put(Constants.KEY_RESPONSE_CODE, status.code());
//        json.put(Constants.KEY_RESPONSE_MESSAGE, status.message());
//    }
//
//    public OpenResponse(OpenResponseStatus status, String errorMessage) {
//        json.put(Constants.KEY_RESPONSE_CODE, status.code());
//        if (errorMessage == null || errorMessage.trim().isEmpty()) {
//            json.put(Constants.KEY_RESPONSE_MESSAGE, status.message());
//        } else {
//            json.put(Constants.KEY_RESPONSE_MESSAGE, errorMessage);
//        }
//    }
//
//    public OpenResponse(OpenResponseStatus status, JSONObject result) {
//        this(status);
//        if (result != null) {
//            for (Entry<String, Object> entry : result.entrySet()) {
//                json.put(entry.getKey(), entry.getValue());
//            }
//        }
//    }

    @Override
    public String toString() {
        return json.toJSONString();
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年9月18日 Lucifer creat
 */
