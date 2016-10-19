/*
 * Project: alex-test-spring-boot
 * 
 * File Created at 2016年9月29日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.test.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.test.domain.ParamBody;
import com.test.domain.ParamHead;
import com.test.domain.Response;
import com.test.service.OpenService;

/**
 * @Type PhoneNoAndIdCardVerifyServiceImpl.java
 * @Desc 验证手机号和身份证是否一致
 * @author alex
 * @date 2016年9月29日 上午9:34:08
 * @version 
 */
@Service("VerifyCardPhone")
public class PhoneNoAndIdCardVerifyServiceImpl implements OpenService {

    @Override
    public Response invoke(ParamHead paramHead, ParamBody paramBody) {
        // TODO Auto-generated method stub
        System.out.println("验证手机号和身份证： 一致");
        Response response = new Response();
        response.setSuccessSign(true);
        response.setSuccessSign(true);
        
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("phoneNo", "18767123602");
        jsonObject.put("cardNo", "33102319861213");
        jsonObject.put("name", "alex.xi");
        response.setResultMap(jsonObject);
        return response;
    }

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年9月29日 alex creat
 */