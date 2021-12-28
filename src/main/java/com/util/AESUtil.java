package com.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.GeneralSecurityException;

/**
 * ClassName: AESUtil
 *
 * @author: davidwang2006@aliyun.com DavidWang
 * @date: 2021/1/6 11:12
 * @description:
 */
@Slf4j
public abstract class AESUtil {

    public static final String ALGO_CBC_PKCS7 = "AES/CBC/PKCS7Padding";
    public static final String ALGO_ECB_PKCS5 = "AES/ECB/PKCS5Padding";


    private AESUtil() {
    }


    /**
     * 加密
     *
     * @param algorithm
     * @param key
     * @param iv
     * @param message
     * @return
     * @throws GeneralSecurityException
     * @author davidwang2006@aliyun.com wangweiwei
     * @date 2021-01-06 11:16:29
     */
    public static byte[] encrypt(String algorithm, byte[] key, byte[] iv, byte[] message) throws GeneralSecurityException {

        SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance(algorithm);
        if (iv != null && iv.length > 0) {
            IvParameterSpec ivv = new IvParameterSpec(iv);
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivv);
        } else {
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        }
        return cipher.doFinal(message);
    }

    /**
     * 解密
     *
     * @param algorithm
     * @param key
     * @param iv
     * @param message
     * @return
     * @throws GeneralSecurityException
     * @author davidwang2006@aliyun.com wangweiwei
     * @date 2021-01-06 11:16:29
     */
    public static byte[] decrypt(String algorithm, byte[] key, byte[] iv, byte[] message) throws GeneralSecurityException {

        SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance(algorithm);
        if (iv != null && iv.length > 0) {
            IvParameterSpec ivv = new IvParameterSpec(iv);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivv);
        } else {
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        }
        return cipher.doFinal(message);
    }

    /**
     * 加密
     *
     * @param algorithm
     * @param key
     * @param message
     * @return
     * @throws GeneralSecurityException
     * @author davidwang2006@aliyun.com wangweiwei
     */
    public static byte[] encrypt(String algorithm, byte[] key, byte[] message) throws GeneralSecurityException {

        SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        return cipher.doFinal(message);
    }

    /**
     * 解密
     *
     * @param algorithm
     * @param key
     * @param message
     * @return
     * @throws GeneralSecurityException
     * @author davidwang2006@aliyun.com wangweiwei
     */
    public static byte[] decrypt(String algorithm, byte[] key, byte[] message) throws GeneralSecurityException {

        SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        return cipher.doFinal(message);
    }

    /**
     * 加密
     *
     * @param data(机密参数)
     * @param ivParameter(偏移值)
     * @param publicKey(密码)
     * @return
     */
    public static String encrypt(String data, String ivParameter, String publicKey) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/noPadding");
            int blockSize = cipher.getBlockSize();
            byte[] dataBytes = data.getBytes();
            int plaintextLength = dataBytes.length;
            if (plaintextLength % blockSize != 0) {
                plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
            } else {
                plaintextLength = plaintextLength + blockSize;
            }
            byte[] plaintext = new byte[plaintextLength];
            System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);
            IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes());
            SecretKeySpec sKeySpec = new SecretKeySpec(publicKey.getBytes(), "AES");
            cipher.init(Cipher.ENCRYPT_MODE, sKeySpec, iv);
            byte[] encrypted = cipher.doFinal(plaintext);
            return Base64.encodeBase64String(encrypted);
        } catch (Exception e) {
            //e.printStackTrace();
            log.error("AESUtil.encrypt is error,", e);
            return null;
        }
    }

    public static String decrypt(String data, String keys, String OFFSET) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            SecretKeySpec skeySpec = new SecretKeySpec(keys.getBytes("ASCII"), "AES");
            IvParameterSpec iv = new IvParameterSpec(OFFSET.getBytes());
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] buffer = Base64.decodeBase64(data);
            byte[] encrypted = cipher.doFinal(buffer);
            String originalString = new String(encrypted, "utf-8");//此处使用BASE64做转码。
            originalString = originalString.replaceAll(System.getProperty("line.separator"), "");
            originalString = originalString.trim();
            return originalString;
        } catch (Exception e) {
            log.error("AESUtil.decrypt is error,", e);
            return null;
        }


    }


}
