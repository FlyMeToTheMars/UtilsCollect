package com.hugh.util.str.blank;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.w3c.dom.CharacterData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @Author Fly.Hugh
 * @Date 2020/7/7 5:33 下午
 * @Version 1.0
 **/
public class StrBlank {

    /**
     * CharSequence is a readable sequence of char values.
     * This interface provides uniform, readonly access to many different kinds of char sequence.
     * It is therefore inappropriate to use arbitrary CharSequence instance as elements in a set or as keys in a map.
     * */
    public static void main(String[] args) throws ParseException {
        Date nightMill = nightMill("00:00:00");
        System.out.println(nightMill);

        System.out.println("获取时间戳");
        String format = DateFormatUtils.format(nightMill, "yyyy-MM-dd HH:mm:ss");
        System.out.println(format);
        System.out.println(nightMill.getTime());
    }


    public static Date nightMill(String hourminsecStr) throws ParseException {
        Date date = DateUtils.parseDateStrictly(hourminsecStr, "HH:mm:ss");
        return date;
    }

}