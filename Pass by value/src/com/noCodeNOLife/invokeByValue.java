package com.noCodeNOLife;

public class invokeByValue {

    public void tryChange(int ix) {

        ix = ix * 2;
    }

    public void showDiffer() {

        int ix = 10;
        System.out.println("调用tryChange方法之前，ix=" + ix);
        tryChange(ix);
        System.out.println("调用tryChange方法之后，ix=" + ix);
    }
}
