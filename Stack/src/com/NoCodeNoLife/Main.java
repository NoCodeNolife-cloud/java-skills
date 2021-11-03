package com.NoCodeNoLife;

import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        for (Iterator<Integer> iter = stack.iterator(); iter.hasNext(); ) {
            Integer str = iter.next();
            System.out.println(str);
        }

        System.out.println("after pop():");
        stack.pop();
        stack.pop();
        for (Iterator<Integer> iter = stack.iterator(); iter.hasNext(); ) {
            Integer str = iter.next();
            System.out.println(str);
        }
    }
}
