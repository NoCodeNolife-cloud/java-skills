package com.code;

public class Main {

    public static void main(String[] args) {
        String specialCharTab1 = "Hello\tWorld.";//在Hello和World插入制表符
        String specialCharTab2 = "Hello\u0009World.";//在Hello和World插入制表符，制表符采用Unicode编码\u0009表示
        String specialCharNewLine = "Hello\nWorld.";// 在Hello和World插入换行符
        String specialCharReturn = "Hello\rWorld.";//在Hello和World插入回车符
        String specialCharQuotationMark = "Hello\"World\".";//在Hello和World插入双引号
        String specialCharApostrophe = "Hello\'World\'.";//在Hello和World插入单引号
        String specialCharReverseSolidus = "Hello\\World.";//在Hello和World插入反斜杠

        // println
        System.out.println("水平制表符tab1: " + specialCharTab1);
        System.out.println("水平制表符tab2: " + specialCharTab2);
        System.out.println("换行: " + specialCharNewLine);
        System.out.println("回车: " + specialCharReturn);
        System.out.println("双引号: " + specialCharQuotationMark);
        System.out.println("单引号: " + specialCharApostrophe);
        System.out.println("反斜杠: " + specialCharReverseSolidus);
    }
}
