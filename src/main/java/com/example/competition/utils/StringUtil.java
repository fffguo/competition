package com.example.competition.utils;

import java.util.Random;

/**
 * @作者：刘富国
 * @创建时间：2018/1/25 9:49
 */
public class StringUtil {
    public static final String allChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * 指定长度的随机字符串，（包含大写字母，小写字母，数字）
     * @param length
     * @return
     */
    public static String generateString(int length) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(allChar.charAt(random.nextInt(allChar.length())));
        }
        return sb.toString();
    }
}
