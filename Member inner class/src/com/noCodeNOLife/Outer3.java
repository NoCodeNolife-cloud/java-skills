package com.noCodeNOLife;

public class Outer3 {

    int CommValue = 100;
    static int SV = 200;

    public static void sfun() {

        final int fv = 3;
        int k = 10;

        class localize {

            public void call() {

                System.out.println("�ⲿ��ľ�̬����SV=" + SV);
                System.out.println("�����ľֲ�����fv=" + fv);
            }
        }

        System.out.println("�����ⲿ��ĳ�Ա����");
    }
}
