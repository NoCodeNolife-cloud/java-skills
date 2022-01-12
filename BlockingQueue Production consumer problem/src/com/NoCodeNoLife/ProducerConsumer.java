package com.NoCodeNoLife;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Data: Created in 2021/11/28
 * Description:
 */
public class ProducerConsumer {

    // blockingQueue
    private static BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

    /**
     * producer thread
     */
    private static class Producer extends Thread {
        @Override
        public void run() {
            try {
                // put
                queue.put("product");// put into queue name as "product"
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("produce..");// already produce a product
        }
    }

    /**
     * consumer thread
     */
    private static class Consumer extends Thread {
        @Override
        public void run() {
            try {
                // take
                String product = queue.take();// take from queue
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("consume..");// already consume a product
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Producer producer = new Producer();
            producer.start();
        }
        for (int i = 0; i < 5; i++) {
            Consumer consumer = new Consumer();
            consumer.start();
        }
        for (int i = 0; i < 3; i++) {
            Producer producer = new Producer();
            producer.start();
        }
    }
}