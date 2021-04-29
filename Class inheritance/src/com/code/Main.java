package com.code;

public class Main {

    public static void main(String[] args) {

        com.code.Rectangle c_rectangle = new com.code.Rectangle(5.5, 6.0);
        System.out.println("THe Rectangle length is " + c_rectangle.getLength() + ", width is " + c_rectangle.getWidth());
        System.out.println("The area of the Rectangle is " + c_rectangle.getArea());

        System.out.println();

        com.code.Square c_square = new com.code.Square(5.5);
        System.out.println("the Square sideLength is " + c_square.getLength());
        System.out.println("The area of the Square is " + c_square.getArea());

        System.out.println();

        com.code.Circle c_circle = new com.code.Circle(5);
        System.out.println("the Circle radius is " + c_circle.getRadius());
        System.out.println("The area of the Circle is " + c_circle.getArea());
    }
}
