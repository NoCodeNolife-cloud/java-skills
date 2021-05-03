package com.code;

public class Outer {

    private int value = 10;

    public void add(final int x, int y) {

        int z = 100;

        class Inner {

            void display() {

                int sum = x + z + value;
                System.out.println("Sum = " + sum);
            }
        }

        new Inner().display();
    }
}
