package com.example.competition.utils;

import com.example.competition.enums.ErrorEnum;
import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期通用工具类
 * @作者：刘富国
 * @创建时间：2018/1/16 11:12
 */
@Slf4j
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
    /**
     * Date转字符串
     * @author 崔世磊
     * @date 2017年10月10日 下午5:35:15
     * @param date
     * @param formatStr
     * @return
     */
    public static String date2String(Date date, String formatStr){
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(date);
    }

    /**
     * Date转字符串
     * @author 崔世磊
     * @date 2017年10月10日 下午5:36:38
     * @param date
     * @return
     */
    public static String date2String(Date date){
        return date2String(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * data 转换 data 去掉后缀 .0
     * @param date
     * @return
     */
    public static Date data2Data(Date date){
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return sdf.parse(sdf.format(date));
        } catch (ParseException e) {
            log.error("【日期转换失败】，date={}",date.toString());
            e.printStackTrace();
        }
        return null;
    }
}
