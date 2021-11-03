package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String string = new String(chars);
        String res = string.replaceAll("he", "negix");
        System.out.println("the result is " + res);
    }
}
