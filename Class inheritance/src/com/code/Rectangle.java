package com.code;

public class Rectangle extends Graphics {

    private double length;

    private double width;

    public Rectangle() {
    }

    public Rectangle(double _length, double _width) {

        this.length = _length;
        this.width = _width;

        setArea(this.length * this.width);
        setPerimeter(2 * _length * _width);
    }

    protected void setLength(double _length) {

        length = _length;
    }

    protected void setWidth(double _width) {

        width = _width;
    }

    public double getLength() {

        return length;
    }

    public double getWidth() {

        return width;
    }
}
