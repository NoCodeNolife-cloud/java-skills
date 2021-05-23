package com.nocodenolife;

public class Main {

    public static void main(String[] args) {

        MyTread myTread1 = new MyTread("First Thread");
        MyTread myTread2 = new MyTread("Second thread");

        myTread1.start();
        myTread2.start();
    }
}
