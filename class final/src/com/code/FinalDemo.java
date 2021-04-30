package com.code;

public class FinalDemo {

    void doSomething() {
        // 没有在声明的同时赋值
        final int e;
        // 只能赋值一次
        e = 100;
        System.out.print(e);
        // 声明的同时赋值
        final int f = 200;
    }

    // 实例常量
    final int a = 5;
    final int b;

    // 静态常量
    final static int c = 12;// 直接赋值
    final static int d;// 空白final变量

    // 静态代码块
    static {
        // 初始化静态变量
        d = 32;
    }

    // 构造方法
    FinalDemo() {
        // 初始化实例变量
        b = 3;
        // 第二次赋值，会发生编译错误
        // b=4;
    }
}
