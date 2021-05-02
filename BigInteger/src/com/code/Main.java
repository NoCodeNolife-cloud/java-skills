package com.code;

public class Main {

    public static void main(String[] args) {

        java.math.BigInteger number1 = new java.math.BigInteger("999999999999");
        java.math.BigInteger number2 = new java.math.BigInteger("567800000", 16);

        System.out.println("加法操作：" + number1.add(number2));
        System.out.println("减法操作：" + number1.subtract(number2));
        System.out.println("乘法操作：" + number1.multiply(number2));
        System.out.println("除法操作：" + number1.divide(number2));
    }
}
