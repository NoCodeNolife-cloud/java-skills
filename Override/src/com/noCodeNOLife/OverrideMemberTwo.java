package com.noCodeNOLife;

public class OverrideMemberTwo extends Common {

    public void proShowMsg() {

        System.out.println("This is public ShowMsg() in derive class.");
    }

//    try to override the parent class, error
//    protected void pubShowMsg() {
//
//        System.out.println("This is protected ShowMsg() in derive class.");
//    }
}
