package com.noCodeNOLife;

public class ConstructWithPara {

    private int x = 0;

    public ConstructWithPara(int ix) {

        System.out.println("这是带参数的构造方法");
        x = ix;
    }

    public ConstructWithPara() {

        this(100);
        System.out.println("这是无参数的构造方法");
    }

    public int getX() {

        return x;
    }
}
