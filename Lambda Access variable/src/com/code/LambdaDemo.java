package com.code;

public class LambdaDemo {

    private int value = 10;

    private static int staticValue = 5;

    // 匿名类
    public static Calculable add() {

        int localValue = 20;

        Calculable result = (int a, int b) -> {

            int c = a + b + localValue;
            return c;
        };

        return result;
    }

    // 匿名类
    // 不是静态函数
    public Calculable sub() {

        final int localValue = 20;

        Calculable result = (int a, int b) -> {

            int c = a - b - staticValue - this.value;
            return c;
        };

        return result;
    }
}
