package com.code;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal number1 = new BigDecimal(999999999.99988888);
        BigDecimal number2 = new BigDecimal(567800000.888888);

        System.out.println("加法操作：" + number1.add(number2));
        System.out.println("减法操作：" + number1.subtract(number2));
        System.out.println("乘法操作：" + number1.multiply(number2));
        System.out.println("除法操作：" + number1.divide(number2, BigDecimal.ROUND_HALF_UP));
    }
}
