package com.code;

public class Main {

    public static void main(String[] args) {

        Queue<String> genericQueue = new Queue<>();

        genericQueue.queue("A");
        genericQueue.queue("C");
        genericQueue.queue("B");
        genericQueue.queue("D");

        System.out.println(genericQueue);
        genericQueue.dequeue();

        System.out.println(genericQueue);
    }
}
