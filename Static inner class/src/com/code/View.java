package com.code;

// 外部类
public class View {

    // 外部类实例变量
    private int x=20;

    // 外部类静态变量
    private static int staticX=10;

    // 静态内部类
    static class Button{

        // 内部类方法
        void onClick(){

            // 访问外部类的静态变量
            System.out.println(staticX);
            // 不能访问外部类的非静态成员
            // System.out.println(x);// 编译错误
        }
    }
}
