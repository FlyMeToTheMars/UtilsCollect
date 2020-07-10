package com.hugh.util.time;

import java.text.DateFormat;
import java.util.Calendar;
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


    /**
     * 天数差 返回Int
     * @param date1
     * @param date2
     * @return
     */
    public static int differentDays(Date date1,Date date2)
    {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        int day1= cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);

        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if(year1 != year2)   //不同一年
        {
            int timeDistance = 0 ;
            for(int i = year1 ; i < year2 ; i ++)
            {
                if(i%4==0 && i%100!=0 || i%400==0)    //闰年
                {
                    timeDistance += 366;
                }
                else    //不是闰年
                {
                    timeDistance += 365;
                }
            }
            return timeDistance + (day2-day1);
        }
        else    //同一年
        {
            System.out.println("判断day2 - day1 : " + (day2-day1));
            return day2-day1;
        }
    }
}
