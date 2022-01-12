/**
 * ProjectName: Thread UncaughtExceptionHandler
 * Author: Administrator
 * Date: 2022/1/11 10:46
 * Description:
 */

class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    /*
     * Thread.UncaughtExceptionHandler.uncaughtException()会在线程因未捕获的异常而临近死亡时被调用
     */
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught  " + e);
    }
}
