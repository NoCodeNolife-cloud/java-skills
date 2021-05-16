package com.noCodeNOLife;

public class OverrideMemberThree extends Common{

    public final int getX(){

        return x;
    }

//    try to override father class final method, error
//    public final void setX(int ix){
//
//        x=ix*2;
//    }
}
