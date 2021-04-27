package com.code;

public class Main {

    public static void main(String[] args) {
        String sourceStr="There is a string accessing example.";
        String subStr1=sourceStr.substring(28);
        String subStr2=sourceStr.substring(11,17);
        System.out.println(sourceStr);
        System.out.println(subStr1);
        System.out.println(subStr2);

        System.out.println("-----use split method-----");
        String array[]=sourceStr.split(" ");
        for(String str:array){
            System.out.println(str);
        }
    }
}
