package com.code;

public class Main {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 5;

        display((a, b) -> {
            return a + b;
        }, n1, n2);

        display((a, b) -> a - b, n1, n2);
    }

    public static void display(Calculable calc, int n1, int n2) {

        System.out.println(calc.calculate(n1, n2));
    }
}
