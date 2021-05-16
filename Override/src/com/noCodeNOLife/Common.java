package com.noCodeNOLife;

public class Common {

    protected int x = 100;

    public int getX() {

        return x;
    }

    public final void setX(int ix) {

        x = ix;
    }

    protected void proShowMsg() {

        System.out.println("This is protected ShowMsg() in common class.");
    }

    public void pubShowMsg() {

        System.out.println("This is public ShowMsg() in common class.");
    }

    static public void stShowMsg() {

        System.out.println("This is static ShowMsg() in common class.");
    }
}
