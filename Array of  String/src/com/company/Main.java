package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // use array of String
        String[] str = {"one", "two", "three", "four"};

        for (String s : str) {

            System.out.println(s);
        }

        // declare array of String
        String[] save = new String[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < save.length; ++i) {

            save[i] = input.next();
        }

        for(String s:save){

            System.out.println(s);
        }
    }
}
