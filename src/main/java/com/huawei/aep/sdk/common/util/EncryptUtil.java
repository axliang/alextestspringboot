package com.huawei.aep.sdk.common.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class EncryptUtil for encryption.
 */
public final class EncryptUtil {

    private static final Logger logger = LoggerFactory.getLogger(EncryptUtil.class);

    public static final String ENCRYPT_SHA256_TYPE = "SHA-256";

    public static final String ENCRYPT_SHA1_TYPE = "SHA-1";

    /**
     * Instantiates a new encrypt util.
     */
    private EncryptUtil() {
    }

    /**
     * Encrypt sha256 base64.
     * <p>
     * encrypt the source,first sha256,then base64<br>
     * 
     * @param source the source
     * @return the string
     */
    public static String encryptSha256Base64(String source) {
        MessageDigest msgDigest;
        try {
            msgDigest = MessageDigest.getInstance(ENCRYPT_SHA256_TYPE);
            msgDigest.update(source.getBytes());

            return Base64.encodeBase64String(msgDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            logger.error("Encrypt the wsse header failed! It will use String empty.");
        }
        return "";
    }

    /**
     * Encrypt sha1 base64.
     * <p>
     * encrypt the source,first sha1,then base64<br>
     * 
     * @param source the source
     * @return the string
     */
    public static String encryptSha1Base64(String source) {
        MessageDigest msgDigest;
        try {
            msgDigest = MessageDigest.getInstance(ENCRYPT_SHA1_TYPE);
            msgDigest.update(source.getBytes());

            return Base64.encodeBase64String(msgDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            logger.error("Encrypt the wsse header failed! It will use String empty.");
        }
        return "";
    }

}
