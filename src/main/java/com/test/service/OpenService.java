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
package com.test.service;

import com.test.domain.ParamBody;
import com.test.domain.ParamHead;
import com.test.domain.Response;

/**
 * @Type OpenService.java
 * @Desc 
 * @author alex
 * @date 2016年9月29日 上午9:28:02
 * @version 
 */
public interface OpenService {
    
    public Response  invoke(ParamHead paramHead,ParamBody paramBody);

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年9月29日 alex creat
 */