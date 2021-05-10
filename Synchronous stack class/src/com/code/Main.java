package com.code;

public class Main {

    public static void main(String[] args) {

        Stack stack=new Stack();

        Thread producer=new Thread(()->{

            char c;
            for(int i=0;i<10;++i){

                c=(char)(Math.random()*26+'A');
                stack.push(c);
                System.out.println("生产："+c);
                try{

                    Thread.sleep((int)(Math.random()*1000));
                }catch(InterruptedException e){

                    e.printStackTrace();
                }
            }
        });

        Thread consumer=new Thread(()->{

            char c;
            for(int i=0;i<10;++i){

                c=stack.pop();
                System.out.println("消费："+c);
                try{

                    Thread.sleep((int)(Math.random()*1000));
                }catch(InterruptedException e){

                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
