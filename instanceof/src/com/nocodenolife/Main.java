package com.nocodenolife;

public class Main {

    public static void main(String[] args) {

        showName(new Shape());
        showName(new Circle());
    }

    public static void showName(Shape shape) {

        Class c1 = shape.getClass();
        System.out.println(c1.getName());
        if (shape instanceof Shape) {

            System.out.println("This is a shape object.");
        } else if (shape instanceof Circle) {

            System.out.println("This is a shape object.");
        }
    }
}
