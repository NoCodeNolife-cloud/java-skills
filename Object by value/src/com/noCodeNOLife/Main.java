package com.noCodeNOLife;

public class Main {

    public static void tryChange(onlyTest form){

        int t=form.getX();
        form.setX(t*2);
    }

    public static void Change(){
        onlyTest actual=new onlyTest();
        actual.setX(100);
        System.out.println("调用tryChange方法之前，x="+actual.getX());
        tryChange(actual);
        System.out.println("调用tryChange方法之后，x="+actual.getX());
    }

    public static void main(String[] args) {

        Change();
    }
}
