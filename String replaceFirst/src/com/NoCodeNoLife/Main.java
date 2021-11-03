package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        char[] chars = {'a', 'b', 'c', 'a', 'b'};
        String str = new String(chars);
        System.out.println("the string is " + str);
        String temp = str.replaceFirst("ab", "xx");
        System.out.println("replace the \"ab\" to \"xx\"");
        System.out.println("result: " + temp);
    }
}
