/*
 * Project: credit-combination-dispatcher
 * 
 * File Created at 2016�?9�?19�?
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.test.util;

import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

import org.apache.commons.codec.binary.Base64;

public class RSAUtil {

    /**
     * 根据公钥对原文进行加�?
     * 
     * @param plainText �?要加密的原文
     * @param publicKey RSA公钥
     * @return 返回经过Base64编码的密�?
     * @throws Exception
     */
    public static String encrypt(String plainText, String publicKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] res = Base64.decodeBase64(publicKey);
        X509EncodedKeySpec KeySpec = new X509EncodedKeySpec(res);
        RSAPublicKey key = (RSAPublicKey) keyFactory.generatePublic(KeySpec);
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] cipherData = cipher.doFinal(plainText.getBytes());
        return Base64.encodeBase64String(cipherData);
    }

    /**
     * 根据私钥对经过Base64编码的密文进行解�?
     *  
     * @param cipherText 经过Base64编码的密�?
     * @param privateKey RSR私钥
     * @return 返回解密后的原文
     * @throws Exception
     */
    public static String decrypt(String cipherText, String privateKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] res = Base64.decodeBase64(privateKey);
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(res);
        RSAPrivateKey key = (RSAPrivateKey) keyFactory.generatePrivate(keySpec);
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] plainData = cipher.doFinal(Base64.decodeBase64(cipherText));
        return new String(plainData, "UTF-8");
    }

    /**
     * 生成随机RSA公私钥串
     * 
     * @throws Exception
     */
    public static void generateRandomKeyPair() throws Exception {
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
        random.setSeed(System.currentTimeMillis());
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(1024, random);
        KeyPair pair = keyGen.generateKeyPair();
        Key pubKey = pair.getPublic();
        Key privKey = pair.getPrivate();
        System.out.println(Base64.encodeBase64String(pubKey.getEncoded()));
        System.out.println(Base64.encodeBase64String(privKey.getEncoded()));

    }
    
    public static void main(String[] args){
//        try {
//            RSAUtil.generateRandomKeyPair();
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
     String publicKey ="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCyxzat1GTQ8vC3lSj0RnJrVIR/rSjLaxz5keLxvgObxdeXL9Jt5Z5FPc2/xHCYTRvZ9OMbbfK3dytOzzT/cAyOZ/2QlZNTRwklf5333JxCVhXt033hhToKMWRWQzCRjMUV4EjRr+Cawxa5ZdLUzk8PeGt0eGlpZtuBE7qgpAnVEQIDAQAB";   
     String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALLHNq3UZNDy8LeVKPRGcmtUhH+tKMtrHPmR4vG+A5vF15cv0m3lnkU9zb/EcJhNG9n04xtt8rd3K07PNP9wDI5n/ZCVk1NHCSV/nffcnEJWFe3TfeGFOgoxZFZDMJGMxRXgSNGv4JrDFrll0tTOTw94a3R4aWlm24ETuqCkCdURAgMBAAECgYAA0M3cDysClQkqHUEZlDSzbqhIGNclznBMZzD831wO2uE37FzuaWzGbhjBNjk5SKjG3somduLzmVSWQHXCcJVuEvEKNz4iskbN+FpYIgClgO+8zQkhyoL+SfhkhlGlJ3jiDNXgeZpN2XPAWfbBhJQml/IM9jzpJHHgaz2wSZUYPQJBAODFDD7Qg/lwWO1hBOQ1i0yeXRx/FA3zP4gdIYaD3zGTMv6PN+kSUq4OUSjTHuSH1IXP2ANi3dMORGQLIz/Xq0MCQQDLnkS9M+DuIZPtlLhz4ZKT9oF/ZoyzZO3LzFjxnOFYmC53nssGWk8j7giWzn7UqEKSKdFLLnXeRhN9FBFHnVcbAkEAxYAffGpYLKvtV9fyJlxuJEra4hk/k+pznrSKKtphGfyPyGIr7J5vDAYEhmzMLl6z/UheNMuAwt08dvPaa1SkZQJAXpMcimTWTMT72JYDNo/HbUJJ08rl/00Zxlcb2N1tLaFBs/3lfwXjTGT7SFCRSGT+xrT1qV3jEWKrGqV/gSvrkQJAFfiCarFkKHcPI1+JZ7LWnMry3JxU5A5m+/+aE2a3syyerrW23qoNYA12YsBYtfPVnv20wmvXdROjwLx9b56DKw=="; 
     String painTxt ="testNum";
     try{
         String  encodeString = RSAUtil.encrypt(painTxt, publicKey);
         String  decodeString = RSAUtil.decrypt(encodeString, privateKey);
         System.out.println(" painTxt:"+painTxt);
         System.out.println(" encode Result:"+encodeString);
         System.out.println("after decode painTxt:"+decodeString);
         
     } catch(Exception e){
         e.printStackTrace();
     }
    
     
        
        
    }
    
    
}

