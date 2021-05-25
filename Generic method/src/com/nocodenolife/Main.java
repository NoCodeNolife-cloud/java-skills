package com.nocodenolife;

public class Main {

    public static <T> void showGenMsg(T ob, int n) {

        T localOb = ob;
        System.out.println(localOb.getClass().getName());
    }

    public static <T> void showGenMsg(T ob) {

        System.out.println(ob.getClass().getName());
    }

    public static void main(String[] args) {

        // 生成
        String string = "parameter";
        Integer integer = new Integer(123);

        // 测试
        Main.<Integer>showGenMsg(integer, 1);

        showGenMsg(string);
    }
}
