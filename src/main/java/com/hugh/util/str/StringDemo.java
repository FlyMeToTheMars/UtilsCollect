package com.hugh.util.str;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

/**
 * @Author Fly.Hugh
 * @Date 2020/7/6 10:20 上午
 * @Version 1.0
 **/
public class StringDemo {
    private static Logger logger = LogManager.getLogger(StringDemo.class.getName());

    public static void main(String[] args) {

        System.out.println("==================================>>测试年月日时间<<==================================");

        String timeStr = "2017-07-31 23:59:59";
        String format = "yyyy-MM-dd HH:mm:ss";

        Date date = null;

        try{
            if(org.apache.commons.lang3.StringUtils.isNoneBlank(timeStr)){
                date = DateUtils.parseDate(timeStr, format);
            }
        } catch (Exception e){
                logger.error("错误的时间格式", e);
        }

        System.out.println(date);

        System.out.println("==================================>>仅时间<<==================================");

        String nightTimeStr = "23:59:59";
        String nightTimeformat = "HH:mm:ss";

        Date hourDate = null;

        try{
            if(org.apache.commons.lang3.StringUtils.isNoneBlank(nightTimeStr)){
                date = DateUtils.parseDate(nightTimeStr, nightTimeformat);
            }
        }catch(Exception e){
            logger.error("错误的时间格式", e);
        }

        System.out.println(date);
    }


}
