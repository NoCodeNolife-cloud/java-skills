import java.util.concurrent.ThreadFactory;

/**
 * ProjectName: Thread UncaughtExceptionHandler
 * Author: Administrator
 * Date: 2022/1/11 10:53
 * Description:
 */

class HanlderThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        System.out.println(this + "creating new Thread");
        Thread t = new Thread(r);
        System.out.println("created " + t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());//设定线程工厂的异常处理器
        System.out.println("eh=" + t.getUncaughtExceptionHandler());
        return t;
    }
}