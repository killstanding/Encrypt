package com.jerry.commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Jerry on 2015/10/12.
 */
public class StringUtil {


    public static double stringToDouble(String str) throws ClassCastException {
        if (isEmpty(str)) return 0d;
        return Double.parseDouble(str);
    }

    public static Integer stringToInt(String str) throws ClassCastException {
        if (isEmpty(str)) return 0;
        return Integer.parseInt(str);
    }


    public static String dateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return sdf.format(date);
    }

    public static Date strToDate(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        Date date = sdf.parse(str);
        return date;
    }

    public static boolean isEmpty(String str) {
        if (str == null || str.equals("")) return true;
        return false;
    }

    public static long stringToLong(String str)throws ClassCastException{
        if(isEmpty(str)) return 0l;
        return Long.parseLong(str);
    }

    public static String subFilPath(String path){
        if(path.indexOf("file:") != -1) return path.substring(5);
        return path;
    }

}