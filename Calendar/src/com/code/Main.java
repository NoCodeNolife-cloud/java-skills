package com.code;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // static Calendar getInstance()：使用默认时区和语言环境获得一个日历。
        Calendar calendar = Calendar.getInstance();

        // void set(int field, int value)：将给定的日历字段设置为给定值。
        calendar.set(2018, 7, 18);

        // Date getTime()：返回一个表示此Calendar时间值（从1970年1月1日00:00:00至现在的毫秒数）的Date对象。
        Date date = calendar.getTime();

        System.out.println("格式化前date = " + date);

        // SimpleDateFormat(String pattern)：用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat。
        // pattern参数是日期和时间格式模式。
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("格式化后date = " + df.format(date));

        System.out.println();

        calendar.clear();

        // 设置日期2018年8月28日
        // void set(int field, int value)：将给定的日历字段设置为给定值。
        calendar.set(Calendar.YEAR,2018);
        calendar.set(Calendar.MONTH,7);
        calendar.set(Calendar.DATE,28);

        date=calendar.getTime();
        System.out.println("格式化前date = "+date);

        // String format(Date date)：将一个Date格式化为日期/时间字符串。
        System.out.println("格式化后date = "+df.format(date));
    }
}
