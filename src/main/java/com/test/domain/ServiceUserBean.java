/*
 * Project: alex-test-spring-boot
 * 
 * File Created at 2016年10月18日
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

/**
 * @Type ServiceBean.java
 * @Desc 
 * @author alex
 * @date 2016年10月18日 下午4:07:22
 * @version 
 */
public class ServiceUserBean {
    
    private String userId;
    private long sucessCount;
    
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public long getSucessCount() {
        return sucessCount;
    }
    public void setSucessCount(long sucessCount) {
        this.sucessCount = sucessCount;
    }

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年10月18日 alex creat
 */