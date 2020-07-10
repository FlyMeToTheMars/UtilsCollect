package com.hugh.util.time;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import com.hugh.util.str.blank.StrBlank;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Fly.Hugh
 * @Date 2020/7/9 10:31 上午
 * @Version 1.0
 **/
public class DynamicGetTime {
    public static void main(String[] args) throws ParseException {
        /**
         * 传入的参数有四个
         * 分别是startTime EndTime nightStartTime nightEndTime
         * startTime EndTime是指明的某个日期
         * nightStartTime 和nightEndTime是每天夜间时间的划定
         * 要求返回的值是一个Map (countStartTime, countEndTime)
         * */

        Date startTime = dateGenerate("2020-04-23 11:40:11");
        Date endTime = dateGenerate("2020-05-02 11:40:11");

        String nightStartTime = "22:00:00";
        String nightEndTime = "06:00:00";

        System.out.println(date2Str(startTime));

        System.out.println(date2DayStr(startTime));



    }

    public static Date dateGenerate(String timeStr) throws ParseException {
        Date date = DateUtils.parseDateStrictly(timeStr, "yyyy-MM-dd HH:mm:ss");
        return date;
    }

    public static int dateCompare(Date date1, Date date2) {
        /**
         * 比较两个Date的大小
         * 第三个参数的作用是指定比较部分吗
         * 第三个参数能比较的值比较多
         * 时分秒都能选
         * */
        int i = DateUtils.truncatedCompareTo(date1, date2, Calendar.MILLISECOND);
        /**
         * date1 > date2 的时候 结果是1 反之-1 相等是0
         * */
        return i;
    }

    public static String date2Str(Date date){
        /**
         * 还原出原本的DateString
         * */
        return DateFormat.getDateTimeInstance().format(date);
    }

    public static String date2DayStr(Date date) {
        /**
         * 获得一个精确到天的String
         * */
        return DateFormat.getDateInstance().format(date) + " ";
    }


    public static HashMap<Date, Date> initDate(Date startTime, Date endTime, String nightStartTime, String nightEndTime) throws ParseException {
        HashMap<Date, Date> hashMap= new HashMap<Date, Date>();

        String nightStartTimeFull = date2DayStr(startTime) + nightStartTime;
        String nightEndTimeFull = date2DayStr(endTime) + nightEndTime;
        String format = "yyyy-MM-dd HH:mm:ss";

        Date nightStartDateFull = DateUtils.parseDate(nightStartTimeFull, format);
        Date nightEndDateFull = DateUtils.parseDate(nightEndTimeFull, format);

        int days = TimeUtil.differentDays(nightStartDateFull, nightEndDateFull);

        

        // dateCompare大于等于0的时候 是查询的时间比规定的夜晚时间晚，需要单独计算
        if(dateCompare(nightStartDateFull, startTime) >= 0){

        }
        return hashMap;
    }

    public static void countWithDay(HashMap<Date, Date> dateHashMap){

    }

    public static void countWithOri(Date date1, Date date2) {

    }
}
