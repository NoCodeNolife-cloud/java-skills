package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String str = new String(chars);
        System.out.println("whether the str is empty? " + str.isEmpty());
        str = new String();
        System.out.println("whether the str is empty? " + str.isEmpty());
    }
}
