package com.code;

public class Graphics {

    private double area;
    private double perimeter;

    public Graphics() {
    }

    protected void setArea(double _area) {

        area = _area;
    }

    protected void setPerimeter(double _perimeter) {

        perimeter = _perimeter;
    }

    public double getArea() {

        return area;
    }

    public double getPerimeter() {

        return perimeter;
    }
}
