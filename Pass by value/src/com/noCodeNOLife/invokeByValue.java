package com.noCodeNOLife;

public class invokeByValue {

    public void tryChange(int ix) {

        ix = ix * 2;
    }

    public void showDiffer() {

        int ix = 10;
        System.out.println("����tryChange����֮ǰ��ix=" + ix);
        tryChange(ix);
        System.out.println("����tryChange����֮��ix=" + ix);
    }
}
