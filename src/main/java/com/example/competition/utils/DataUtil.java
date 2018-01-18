package com.example.competition.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * 日期通用工具类
 * @作者：刘富国
 * @创建时间：2018/1/16 11:12
 */
public class DataUtil {

    /**
     * 数据库Timestamp转换为String
     * @param timestamp
     * @param format
     * @return
     */
    public static String timeStamp2String(Timestamp timestamp, String format) {
        String time = null;
        if (timestamp == null) {
            return null;
        }
        DateFormat sdf = new SimpleDateFormat(format);
        try {
            time = sdf.format(timestamp);
            return time;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 数据库Timestamp转换为String 默认yyyy-MM-dd HH:mm:ss格式
     * @param timestamp
     * @return
     */
    public static String timeStamp2String(Timestamp timestamp) {
        return timeStamp2String(timestamp, "yyyy-MM-dd HH:mm:ss");
    }
}
