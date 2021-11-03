package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        String str = "hello";
        System.out.println(str);
        System.out.println("is prefix of hel? " + str.startsWith("hel"));
        System.out.println("is prefix of helo? " + str.startsWith("helo"));
        System.out.println("is prefix of ell in the index of 1? " + str.startsWith("ell", 1));
    }
}
