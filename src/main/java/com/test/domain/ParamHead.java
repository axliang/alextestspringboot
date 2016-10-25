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

import java.util.Date;

/**
 * @Type ParamHead.java
 * @Desc 
 * @author 
 * @date 2016年8月28日 下午5:19:11
 * @version 
 */
public class ParamHead {

    private Integer developerId;
    private Integer applicationId;
    private String serviceCode;
    private String ip;
    private String ak;
    private String sn;
    private Date timeStamp;
    private String requestUrl;

    private String keyId;

    private String resultType;
    private String serverIp;
    private Integer serverPort;
    private String serverLoginName;
    private String serverPassword;
    private String serverFilePath;
    private String serverFileName;
    private Integer serverType;
    
    public Integer getDeveloperId() {
        return developerId;
    }
    public void setDeveloperId(Integer developerId) {
        this.developerId = developerId;
    }
    public Integer getApplicationId() {
        return applicationId;
    }
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }
    public String getServiceCode() {
        return serviceCode;
    }
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getAk() {
        return ak;
    }
    public void setAk(String ak) {
        this.ak = ak;
    }
    public String getSn() {
        return sn;
    }
    public void setSn(String sn) {
        this.sn = sn;
    }
    public Date getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getRequestUrl() {
        return requestUrl;
    }
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }
    public String getKeyId() {
        return keyId;
    }
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    public String getResultType() {
        return resultType;
    }
    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
    public String getServerIp() {
        return serverIp;
    }
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }
    public Integer getServerPort() {
        return serverPort;
    }
    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }
    public String getServerLoginName() {
        return serverLoginName;
    }
    public void setServerLoginName(String serverLoginName) {
        this.serverLoginName = serverLoginName;
    }
    public String getServerPassword() {
        return serverPassword;
    }
    public void setServerPassword(String serverPassword) {
        this.serverPassword = serverPassword;
    }
    public String getServerFilePath() {
        return serverFilePath;
    }
    public void setServerFilePath(String serverFilePath) {
        this.serverFilePath = serverFilePath;
    }
    public String getServerFileName() {
        return serverFileName;
    }
    public void setServerFileName(String serverFileName) {
        this.serverFileName = serverFileName;
    }
    public Integer getServerType() {
        return serverType;
    }
    public void setServerType(Integer serverType) {
        this.serverType = serverType;
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
