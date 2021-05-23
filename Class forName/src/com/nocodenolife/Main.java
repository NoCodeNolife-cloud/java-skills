package com.nocodenolife;

public class Main {

    public static void main(String[] args) {

        System.out.println("Before loding Candy.");
        try {

            Class.forName("com.nocodenolife.Candy");// new 是静态加载，forName 是动态加载
        } catch (ClassNotFoundException ignored) {

        }
    }
}
