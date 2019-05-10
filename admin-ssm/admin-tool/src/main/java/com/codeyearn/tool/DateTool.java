package com.codeyearn.tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author CaiYu
 * @Data 2019/5/7 15:00
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public class DateTool {

    /**
     * Date 转换成 String
     * @param date
     * @param datePattern
     * @return
     */
    public static String date2String(Date date,String datePattern){
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        return sdf.format(date);
    }

    /**
     * String 转换成 Date
     * @param dateString
     * @param datePattern
     * @return
     * @throws ParseException
     */
    public static Date string2Date(String dateString,String datePattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        return sdf.parse(dateString);
    }

}
