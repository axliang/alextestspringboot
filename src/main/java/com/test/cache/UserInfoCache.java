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
package com.test.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.test.dao.ServiceStaticDao;
import com.test.domain.ServiceUserBean;

/**
 * @Type StaticCache.java
 * @Desc  统计缓存
 * @author alex
 * @date 2016年10月18日 下午3:38:34
 * @version 
 */
@Service
public class UserInfoCache implements InitializingBean {
    
    @Value("${service.invoke.quota}")
    private int quota;//TODO 目前将调用配额都设置成相同，后期建议维护一份服务调用者和配额关系
    @Autowired
    private ServiceStaticDao serviceStaticDao;
    private Map<String,AtomicLong> courrentMap = new ConcurrentHashMap<String,AtomicLong>();
    private Lock sucessLock = new ReentrantLock();
    
    
    public boolean exceedLimit(String userId) {
        if (courrentMap.containsKey(userId)) {
            AtomicLong count = courrentMap.get(userId);
            return count.get() >= quota;
        }
        return false;
    }
    
    
    public void incre(String userId, boolean success) {
        if (success) {
            sucessLock.lock();
            AtomicLong count = courrentMap.get(userId);
            if (null == count) {
                courrentMap.put(userId, new AtomicLong(1));
                return;
            }
            count.incrementAndGet();
            courrentMap.put(userId, count);
            sucessLock.unlock();
        }
    }
    


    /**
     * to init
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        List<ServiceUserBean>  serviceUserBeans = serviceStaticDao.getAllBean();
        Map<String,AtomicLong> map  = new HashMap<String,AtomicLong>();
        for( ServiceUserBean serviceUserBean : serviceUserBeans  ){
            map.put(serviceUserBean.getUserId(), new AtomicLong(serviceUserBean.getSucessCount()));
        }
        Lock lock = new ReentrantLock();
        lock.lock();
        try{
            courrentMap.clear();
            courrentMap.putAll(map);  
        }finally{
            map = null;
           lock.unlock();
        }
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