package com.code;

public class Main {

    public static void main(String[] args) {

        com.code.Shape c_shape = new com.code.Shape(5.0, 9.6);
        System.out.println("shape length is " + c_shape.getLength() + ", width is " + c_shape.getWidth());
        System.out.println("shape area is " + c_shape.getArea());

        System.out.println();

        com.code.Plus c_plus = new com.code.Plus(5.5);
        System.out.println("Plus side is " + c_plus.getLength());
        System.out.println("Plus area is " + c_plus.getArea());
    }
}
