/*
 * Project: alex-personal-tools
 * 
 * File Created at 2016��10��21��
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

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Type bootConfig.java
 * @Desc  从配置文件中读参数
 * @author alex
 * 
 * @version 
 */
@Configuration
public class BootConfig {

    @Value("${zj.host}")
    private String zjHost;

    public String getZjHost() {
        return zjHost;
    }

    public void setZjHost(String zjHost) {
        this.zjHost = zjHost;
    }
    
    @Value("${hb.host}")
    private String hbHost;

    public String getHbHost() {
        return hbHost;
    }

    public void setHbHost(String hbHost) {
        this.hbHost = hbHost;
    }
    
    
    

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016��10��21�� alex creat
 */