package com.noCodeNOLife;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(4, 5);
        Point p2 = p1;
        System.out.println("p2 x=" + p2.getX() + ", y=" + p2.getY());
    }
}
