package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {
        function("you", " got", " coin: ", 4156);
    }

    /**
     * Generic variable length parameters
     * @param args
     * @param <T>
     */
    public static <T> void function(T... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
    }
}
