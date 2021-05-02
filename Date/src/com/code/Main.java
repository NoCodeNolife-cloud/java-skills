package com.code;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date now=new Date();
        System.out.println("now ="+now);
        System.out.println("now.getTime() = "+now.getTime());
        System.out.println();

        Date date=new Date(1234567890123L);
        System.out.println("date = "+date);

        // 测试now和date日期
        display(now,date);

        // 重新设置日期time
        date.setTime(9999999999999L);

        System.out.println("修改之后的date="+date);

        // 重新测试now和date日期
        display(now,date);
    }

    public static void display(Date _now,Date _date){

        System.out.println();
        System.out.println("now.after(date)="+_now.after(_date));
        System.out.println("now.before(date)="+_now.before(_date));
        System.out.println("now.compareTo(date)="+_now.compareTo(_date));
        System.out.println();
    }
}
