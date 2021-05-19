package com.noCodeNOLife;

abstract class absClass {

    // 声明一个抽象方法
    abstract public void absfun();

    // 普通实例方法
    public void instance() {

        System.out.println("这是一个普通的实例方法");
    }

    // 普通静态方法
    public static void stFun() {

        System.out.println("这是一个普通的静态方法");
    }
}
