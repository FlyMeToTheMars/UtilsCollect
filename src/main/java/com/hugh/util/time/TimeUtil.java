package com.hugh.util.time;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @Author Fly.Hugh
 * @Date 2020/7/9 5:19 上午
 * @Version 1.0
 **/
public class TimeUtil {
    /**
     * 在Java中需要处理的时间问题主要有两类
     * 第一类是日期时间的格式化问题
     * 第二类是时区问题
     */
    public static void main(String[] args) {
        timeZoneDemo();
        System.out.println("=======================");
        /**
         * 普遍意义上的伦敦时间就是格林尼治时间 但是因为一些原因
         * 英国采用了夏令时和冬令时 也就是说 ————
         * 英国的冬令时就是标准的0时区时间，夏令时比冬令时快一个小时
         * 月份间隔分别是三月和十月
         * */
        timeZoneCheck();
    }

    public static void localeDemo(){
        Date date = new Date();
        Locale locale = Locale.CHINA;
        DateFormat shortdf = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, locale);
        System.out.println("中国格式：" + shortdf.format(date));

        locale = Locale.ENGLISH;
        shortdf = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, locale);
        System.out.println("英国格式：" + shortdf.format(date));
    }

    public static void timeZoneDemo() {
        Date date = new Date();
        Locale locale = Locale.CHINA;
        DateFormat shortdf = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, locale);
        shortdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        System.out.println(TimeZone.getTimeZone("GMT+8").getID());
        System.out.println("中国当前日期："+shortdf.format(date));

        locale = Locale.ENGLISH;
        shortdf = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, locale);
        shortdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(TimeZone.getTimeZone("GMT+0").getID());
        System.out.println("英国当前日期"+shortdf.format(date));
    }

    public static void timeZoneCheck() {
        Date date = new Date();
        Locale locale = Locale.CHINA;
        DateFormat shortDf = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, locale);
        shortDf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));//Asia/Chongqing
        System.out.println(TimeZone.getDefault().getID());
        System.out.println("中国当前日期时间：" + shortDf.format(date));

        locale = Locale.ENGLISH;
        shortDf = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, locale);
        shortDf.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        System.out.println(TimeZone.getTimeZone("Europe/London").getID());
        System.out.println("英国当前日期时间："+shortDf.format(date));
    }
}
