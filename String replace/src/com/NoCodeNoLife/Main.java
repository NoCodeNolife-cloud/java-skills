package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String str = new String(chars);
        System.out.println("origin str is " + str);
        System.out.println("replace the \'l\' to \'x\'");
        String res = str.replace('l', 'x');
        System.out.println("result is " + res);
    }
}
