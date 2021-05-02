package com.code;

public class Main {

    public static void main(String[] args) {

        Figure f1 = new Triangle();
        f1.onDraw();

        System.out.println(f1.name);
        System.out.println(Figure.name);

        Figure f2 = new Ellipse();
        f2.onDraw();
    }
}
