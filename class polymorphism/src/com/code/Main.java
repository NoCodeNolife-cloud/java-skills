package com.code;

public class Main {

    public static void main(String[] args) {

        com.code.Figure f1 = new com.code.Figure();
        f1.onDraw();

        // f2变量是父类类型，指向子类实例，发生多态
        com.code.Figure f2 = new com.code.Triangle();
        f2.onDraw();

        // f3变量是父类类型，指向子类实例，发生多态
        com.code.Figure f3 = new com.code.Ellipse();
        f3.onDraw();

        com.code.Triangle f4 = new com.code.Triangle();
        f4.onDraw();
    }
}
