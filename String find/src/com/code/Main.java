package com.code;

public class Main {

    public static void main(String[] args) {
        String sourceStr = "There is a string accessing example.";
        System.out.println("原始字符串:" + sourceStr);

        //获得字符串长度
        int len = sourceStr.length();
        System.out.println("字符串长度:" + len);

        //获得索引位置16的字符
        char ch = sourceStr.charAt(16);
        System.out.println("索引16的字符:" + ch);

        //查找字符和子字符串
        int firstChar1 = sourceStr.indexOf('r');
        System.out.println("从前往后搜索r字符，第一次找到它所在索引:" + firstChar1);

        int lastChar1 = sourceStr.lastIndexOf('r');
        System.out.println("从后往前搜索r字符，第一次找到它所在索引:" + lastChar1);

        int firstStr1 = sourceStr.indexOf("ing");
        System.out.println("从前往后搜索ing字符串，第一次找到它所在索引:" + firstStr1);

        int lastStr1 = sourceStr.lastIndexOf("ing");
        System.out.println("从后往前搜索ing字符串，第一次找到它所在索引:" + lastStr1);

        int firstChar2 = sourceStr.indexOf('e', 15);
        System.out.println("从索引为15位置开始，从前往后搜索e字符，第一次找到它所在索引:" + firstChar2);

        int lastChar2 = sourceStr.lastIndexOf('e', 15);
        System.out.println("从索引为15位置开始，从后往前搜索e字符，第一次找到它所在索引:" + lastChar2);

        int firstStr2 = sourceStr.indexOf("ing", 5);
        System.out.println("从索引为5位置开始，从前往后搜索ing字符串，第一次找到它所在索引:" + firstStr2);

        int lastStr2 = sourceStr.lastIndexOf("ing", 5);
        System.out.println("从索引为5位置开始，从后往前搜索ing字符串，第一次找到它所在索引:" + lastStr2);
    }
}
