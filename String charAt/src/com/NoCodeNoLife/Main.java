package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        char[] chars = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String str = new String(chars);
        System.out.println("the string is " + str);
        System.out.println("the string of index 3 is " + str.charAt(3));
        System.out.println("the string of index 1 is" + str.charAt(1));
    }
}
