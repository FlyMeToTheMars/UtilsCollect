package com.hugh.util.time;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

/**
 * @Author Fly.Hugh
 * @Date 2020/7/15 4:07 下午
 * @Version 1.0
 **/
public class MinusDays {
    public static void main(String[] args) {
        Date date = new Date();
        Date pastDate = DateUtils.addMonths(date, -2);
        System.out.println(pastDate);
    }
}