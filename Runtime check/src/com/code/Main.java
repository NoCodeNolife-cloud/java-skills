package com.code;

public class Main {

    public static void main(String[] args) {

        double a = 0.0;
        double b = 5.0;
        int c = 0;
        double d = 1.0;

        if (divide(b, a) != 0.0) {
            System.out.println(divide(b, a));
        }
        if (divide(b, c) != 0.0) {
            System.out.println(divide(b, c));
        }
        if (divide(b, d) != 0.0) {
            System.out.println(divide(b, d));
        }
    }

    public static double divide(double _a, double _b) {

        if (_b == 0.0) {

            System.out.println("Zero");
            return 0;
        } else {

            return _a / _b;
        }
    }
}
