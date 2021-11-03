package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {

        char[] chars = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', ' ', 'y', 'o', 'u', ' ', 'a', 'r', 'e', ' ', 'm', 'y', ' ', 's', 'u', 'n', 's', 'h', 'i', 'n', 'e'};
        String str = new String(chars);
        System.out.println("the origin str is " + str);
        String[] res = str.split(" ");
        for (String item : res) {
            System.out.println(item + " " + item.length());
        }
    }
}
