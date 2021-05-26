package com.nocodenolife;

public class Main {

    public static void main(String[] args) {

        // 继承泛型类
        derivedGen<Integer, String> oa = new derivedGen<>(100, "Value is");
        System.out.println(oa.getDob());
        System.out.println(oa.getOb());

        // 继承非泛型类
        derivedNonGen<String> ob=new derivedNonGen<>(20,"value is");
        System.out.println(ob.getDob());
        System.out.println(ob.getOb());
    }
}
