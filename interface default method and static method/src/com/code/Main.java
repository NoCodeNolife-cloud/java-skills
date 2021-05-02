package com.code;

import com.code.interfaceA;

public class Main {

    public static void main(String[] args) {

        // 声明接口类型，对象是实现类，发生多态
        com.code.interfaceA abc=new ABC();

        // 访问实现方法
        System.out.println(abc.methodB());

        // 访问默认方法
        System.out.println(abc.methodC());
        System.out.println(abc.methodD());

        // 访问静态方法
        System.out.println(com.code.interfaceA.methodE());
    }
}
