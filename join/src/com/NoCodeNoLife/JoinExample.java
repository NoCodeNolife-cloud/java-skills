package com.NoCodeNoLife;

/**
 * Data: Created in 2021/11/27
 * Description:
 */
public class JoinExample {

    private class A extends Thread {
        @Override
        public void run() {
            System.out.println("A");
        }
    }

    private class B extends Thread {

        private A a;

        B(A a) {
            this.a = a;
        }

        @Override
        public void run() {
            try {
                a.join();// 将b线程挂起，直到a进程结束运行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }

    public void test() {
        A a = new A();
        B b = new B(a);

        // 先b后a运行
        b.start();
        a.start();
    }
}
