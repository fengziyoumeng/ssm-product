package com.cn.wubin.utils;

import org.apache.shiro.codec.Hex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtil {

    public static String md5(String data) throws NoSuchAlgorithmException,
            UnsupportedEncodingException {

        return Hex.encodeToString(MessageDigest.getInstance("MD5").digest(
                data.getBytes("utf8")));

    }
}
