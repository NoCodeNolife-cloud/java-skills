package com.noCodeNOLife;

public class ConstructWithPara {

    private int x = 0;

    public ConstructWithPara(int ix) {

        System.out.println("���Ǵ������Ĺ��췽��");
        x = ix;
    }

    public ConstructWithPara() {

        this(100);
        System.out.println("�����޲����Ĺ��췽��");
    }

    public int getX() {

        return x;
    }
}
