package com.code;

public class Main {

    public static void main(String[] args) {
        //声明一个字符类型变量
        char charNum = 'A';
        // 声明一个整数类型变量
        int intResult = charNum + 1;
        System.out.println(intResult);
        intResult = intResult - 1;
        System.out.println(intResult);
        intResult = intResult * 2;
        System.out.println(intResult);
        intResult = intResult / 2;
        System.out.println(intResult);
        intResult = intResult + 8;
        intResult = intResult % 7;
        System.out.println(intResult);
        System.out.println("-------");
        // 声明一个浮点型变量
        double doubleResult = 10.0;
        System.out.println(doubleResult);
        doubleResult = doubleResult - 1;
        System.out.println(doubleResult);
        doubleResult = doubleResult * 2;
        System.out.println(doubleResult);
        doubleResult = doubleResult / 2;
        System.out.println(doubleResult);
        doubleResult = doubleResult + 8;
        doubleResult = doubleResult % 7;
        System.out.println(doubleResult);
    }
}
