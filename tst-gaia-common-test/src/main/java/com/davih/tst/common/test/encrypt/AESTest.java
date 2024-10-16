package com.davih.tst.common.test.encrypt;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;

public class AESTest {

    public static void main(String[] args) throws Exception {
        String secretKey = getSecretKey();
        byte[] bytes = Base64.decodeBase64(secretKey);
        String secretKey2 = Base64.encodeBase64URLSafeString(bytes);
        System.out.println("secretKey: " + secretKey);
        System.out.println("secretKey2: " + secretKey2);
        System.out.println(secretKey.equals(secretKey2));
    }

    public static void test() throws Exception {
        String value = "rawchen";
        System.out.println("待加密值：" + value);
        // 加密算法
        String algorithm = "AES";
        // 转换模式
        String transformation = "AES";

        String secretKey = "9gkEtnafZViq07q/HwVgihy7DnOvZLawRL3ZV0A3XU8=";
        // 生成秘钥材料
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decodeBase64(secretKey), algorithm);

        // 实例化密码对象
        Cipher cipher = Cipher.getInstance(transformation);
        // 设置模式（ENCRYPT_MODE：加密模式；DECRYPT_MODE：解密模式）和指定秘钥
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        // 加密
        byte[] encrypt = cipher.doFinal(value.getBytes());
        System.out.println("AES加密结果：" + Base64.encodeBase64URLSafeString(encrypt));
        // 解密
        // 设置为解密模式
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] decrypt = cipher.doFinal(encrypt);
        System.out.println("AES解密结果：" + new String(decrypt));
    }

    public static String getSecretKey() throws NoSuchAlgorithmException {
        // 加密算法
        String algorithm = "AES";
        // --- 生成秘钥 ---
        // 实例化秘钥生成器
        KeyGenerator keyGenerator = KeyGenerator.getInstance(algorithm);
        // 初始化秘钥长度
        keyGenerator.init(256);
        // 生成秘钥
        SecretKey secretKey = keyGenerator.generateKey();
        // 生成秘钥材料
        String secretKeyString = Base64.encodeBase64URLSafeString(secretKey.getEncoded());

        System.out.println("AES秘钥：" + secretKeyString);
        return secretKeyString;
    }
}
