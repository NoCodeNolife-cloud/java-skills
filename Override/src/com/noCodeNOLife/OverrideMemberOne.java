package com.noCodeNOLife;

public class OverrideMemberOne extends Common {

    public void pubShowMsg() {

        System.out.println("This is public ShowMsg() in derive class");
    }

    static public void stShowMsg() {

        System.out.println("This is static ShowMsg() in derive class.");
    }

    public static void main(String[] args) {

        OverrideMemberOne oa = new OverrideMemberOne();
        oa.pubShowMsg();
        stShowMsg();
    }
}
