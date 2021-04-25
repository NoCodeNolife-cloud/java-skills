package com.code;

public class Main {

    public static void main(String[] args) {
        // 声明整数变量
        byte byteNum = 16;
        System.out.println("ByteNum = "+byteNum);
        short shortNum = 16;
        System.out.println("shortNum = "+shortNum);
        int intNum = 16;
        long longNum = 16L;
        System.out.println("intNum = "+intNum);
        System.out.println("longNum = "+longNum);
        // byte类型转换为int类型
        intNum = byteNum;
        System.out.println("intNum = "+intNum);

        // 声明char变量
        char charNum = '花';
        System.out.println("intNum = "+charNum);
        // char类型转换为int类型
        intNum = charNum;
        System.out.println("intNum = "+intNum);

        // 声明浮点变量
        // long类型转换为float类型
        float floatNum = longNum;
        System.out.println("floatNum = "+floatNum);
        // float类型转换为double类型
        double doubleNum = floatNum;
        System.out.println("doubleNum = "+doubleNum);
        //表达式计算后类型是double
        double result = floatNum * intNum + doubleNum / shortNum;
        System.out.println("result = "+result);
    }
}
