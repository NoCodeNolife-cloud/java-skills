package com.code;

import java.text.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        // create date object
        Date date = new Date(1234567890123L);
        System.out.println("格式化前date = " + date);

        // date format
        DateFormat df = new SimpleDateFormat();
        System.out.println("格式化后date = " + df.format(date));
        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("格式化后date = " + df.format(date));

        String dateString = "2018-08-18 08:18:58";
        Date date1 = df.parse(dateString);
        System.out.println("从字符串获得日期对象 = " + date1);
    }
}
