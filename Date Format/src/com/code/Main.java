package com.code;

import java.text.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        // create date object
        Date date = new Date();
        System.out.println("格式化前date = " + date);

        // date format
        DateFormat df = new SimpleDateFormat();
        System.out.println("默认SimpleDataFormat格式化后date = " + df.format(date));
        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("格式化后date = " + df.format(date));
    }
}
