package com.test.domain;

import java.util.Map;

/**
 * @Type ParamBody.java
 * @Desc 
 * @author 
 * @date 2016年8月28日 下午5:20:21
 * @version 
 */
public class ParamBody {

    private String keyId;
    private Map<String, Object> paramBodyMap;
    
    public String getKeyId() {
        return keyId;
    }
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    public Map<String, Object> getParamBodyMap() {
        return paramBodyMap;
    }
    public void setParamBodyMap(Map<String, Object> paramBodyMap) {
        this.paramBodyMap = paramBodyMap;
    }
    
}


/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年8月28日  creat
 */