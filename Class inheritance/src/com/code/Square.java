package com.code;

public class Square extends com.code.Rectangle {

    public Square() {
    }

    public Square(double _sideLength) {

        setLength(_sideLength);
        setWidth(_sideLength);

        setArea(_sideLength * _sideLength);
        setPerimeter(4 * _sideLength);
    }
}
