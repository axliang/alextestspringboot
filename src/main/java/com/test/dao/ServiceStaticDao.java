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
package com.test.dao;

import java.util.List;

import com.test.domain.ServiceUserBean;

/**
 * @Type ServiceStaticDao.java
 * @Desc 
 * @author alex
 * @date 2016年10月18日 下午4:06:42
 * @version 
 */
public interface ServiceStaticDao {
    
    
    public List<ServiceUserBean> getAllBean();
    
    public List<ServiceUserBean> flushAllBean();
    

}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年10月18日 alex creat
 */