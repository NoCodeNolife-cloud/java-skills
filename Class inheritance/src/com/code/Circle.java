package com.code;

public class Circle extends Graphics {

    final double PI = 3.14159;

    private double radius;

    public Circle(int _radius) {

        radius = _radius;

        setArea(PI * radius * radius);
        setPerimeter(2 * PI * _radius);
    }

    public double getRadius() {

        return radius;
    }
}
