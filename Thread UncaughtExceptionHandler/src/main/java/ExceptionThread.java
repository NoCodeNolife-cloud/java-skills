/**
 * ProjectName: Thread UncaughtExceptionHandler
 * Author: Administrator
 * Date: 2022/1/11 10:59
 * Description:
 */

class ExceptionThread implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run() by " + t);
        System.out.println("eh = " + t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}
