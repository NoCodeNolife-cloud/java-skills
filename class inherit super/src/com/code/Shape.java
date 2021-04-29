package com.code;

public class Shape {

    private double area;
    private double length;
    private double width;

    public Shape(double _length, double _width) {

        length = _length;
        width = _width;
        area = _length * _width;
    }

    public double getArea() {

        return area;
    }

    public double getLength() {

        return length;
    }

    public double getWidth() {

        return width;
    }
}
