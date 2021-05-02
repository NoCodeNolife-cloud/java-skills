package com.code;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        // 使用now方法获得LocalDate对象
        // static LocalDate now()：LocalDate静态工厂方法，该方法使用默认时区获得当前日期，返回LocalDate对象。
        LocalDate date1 = LocalDate.now();
        System.out.println("date1 = " + date1);

        // 使用of方法获得LocalDate对象2018-08-18
        // static LocalDate of(int year, int month, int dayOfMonth)：按照指定的年、月和日获得一个LocalDate实例，
        // 日期中年、月和日必须有效，否则将抛出异常。
        LocalDate date2 = LocalDate.of(2018, 8, 18);
        System.out.println("date2 = " + date2);

        // 使用now方法获得LocalTime对象
        // static LocalDate now()：LocalDate静态工厂方法，该方法使用默认时区获得当前日期，返回LocalDate对象。
        LocalTime time1 = LocalTime.now();
        System.out.println("time1 = " + time1);

        // 使用of方法获得LocalTime对象08:58:18
        // static LocalTime of(int hour, int minute, int second)：按照指定的小时、分钟和秒获取一个LocalTime实例。
        LocalTime time2 = LocalTime.of(8, 58, 18);
        System.out.println("time2 = " + time2);

        // 使用now方法获得LocalDateTime对象
        // static LocalDateTime now()：LocalDateTime静态工厂方法，该方法使用默认时区获得当前日期时间，返回LocalDateTime对象。
        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println("dateTime1 = " + dateTime1);

        // 使用of方法获得LocalDateTime对象2018-08-18T08:58:18
        // static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)：
        // 按照指定的年、月、日、小时、分钟和秒获得LocalDateTime实例，将纳秒设置为零。
        LocalDateTime dateTime2 = LocalDateTime.of(2018, 8, 18, 8, 58, 18);
        System.out.println("dateTime2 = " + dateTime2);
    }
}
