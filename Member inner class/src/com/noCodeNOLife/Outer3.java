package com.noCodeNOLife;

public class Outer3 {

    int CommValue = 100;
    static int SV = 200;

    public static void sfun() {

        final int fv = 3;
        int k = 10;

        class localize {

            public void call() {

                System.out.println("外部类的静态变量SV=" + SV);
                System.out.println("方法的局部变量fv=" + fv);
            }
        }

        System.out.println("这是外部类的成员方法");
    }
}
