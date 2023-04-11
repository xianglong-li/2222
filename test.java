package com.lixianglong.common.tools.date;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * 日期工具
 */
public class DateTools {

    /**
     * 获取当前时间
     * @return 当前时间 格式 String yyyy-MM-dd
     */
    public static String getCurrentDate(){
        return DateUtil.today();
    }

    /**
     * 获取当前时间
     * @return 当前时间 格式 Integer yyyyMMdd
     */
    public static Integer getCurrentDateInteger(){
        return getDateInteger(getCurrentDate());
    }

    /**
     * 获取指定时间的Integer yyyyMMdd 格式
     * @param date 日期 格式 yyyy-MM-dd
     * @return 时间 格式 Integer yyyyMMdd
     */
    public static Integer getDateInteger(String date){
        return Integer.valueOf(date.replaceAll("-",""));
    }

    /**
     * 获取两个时间的差额
     * @param date1 时间1
     * @param date2 时间2
     * @param unit 单位
     * @return 差额值
     */
    public static Integer getBetweenInteger(Integer date1, Integer date2, DateUnit unit){
        return Math.toIntExact(DateUtil.between(integerParseToDate(date1), integerParseToDate(date2), unit));
    }

    /**
     * 日期转换  yyyyMMdd  转换为 Date  yyyy-MM-dd 00:00:00
     * @param date Integer yyyyMMdd 格式日期
     * @return Date 日期 格式 yyyy-MM-dd 00:00:00
     */
    public static Date integerParseToDate(Integer date){
        return DateUtil.parse(LocalDate.parse(date+"", DateTimeFormatter.BASIC_ISO_DATE).toString());
    }

    public static String formatFullTime(LocalDateTime localDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DatePattern.NORM_DATETIME_PATTERN);
        return localDateTime.format(dateTimeFormatter);
    }


    public static void main(String[] args) {
        System.out.prientln("111")
    }
}
