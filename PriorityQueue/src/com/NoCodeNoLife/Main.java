package com.NoCodeNoLife;

import java.util.PriorityQueue;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Random random = new Random();

        // 构造函数
        PriorityQueue<Point> points = new PriorityQueue<>();

        // add
        for (int i = 0; i < 25; i++) {
            points.add(new Point(random.nextInt(1, 100), random.nextInt(1, 100)));
        }

        System.out.println("peek");

        // peek
        System.out.println(points.peek());

        System.out.println("poll");

        // poll
        for (int i = 0; i < 25; i++) {
            System.out.println(points.poll());
        }

        System.out.println("offer");

        // offer
        Point point = new Point(4, 5);
        points.offer(point);

        // contains
        System.out.println("contains (4,5)? " + points.contains(point));

        // add
        System.out.println("add");
        points.add(new Point(3, 6));

        // size
        System.out.println("size = " + points.size());

        // remove
        points.remove(points.peek());

        // size
        System.out.println("size = " + points.size());

        // clear
        points.clear();

        // size
        System.out.println("size = " + points.size());
    }
}