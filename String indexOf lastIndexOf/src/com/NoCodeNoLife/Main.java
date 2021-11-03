package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String string = new String(chars);

        System.out.println("this string first index of \"l\" is " + string.indexOf('l'));
        System.out.println("this string last index of \"l\" is " + string.lastIndexOf('l'));
    }
}
