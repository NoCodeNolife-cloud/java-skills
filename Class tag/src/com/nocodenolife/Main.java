package com.nocodenolife;

public class Main {

    public static void main(String[] args) {

        showName(new Circle());
        showName(new Shape());
    }

    public static void showName(Shape shape) {

        Class c1 = shape.getClass();
        System.out.println(c1.getName());
        if (c1 == Shape.class) {

            System.out.println("This is a shape object");
        } else if (c1 == Circle.class) {

            System.out.println("This is a circle object");
        }
    }
}
