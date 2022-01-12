import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ProjectName: Thread UncaughtExceptionHandler
 * Author: Administrator
 * Date: 2022/1/11 10:59
 * Description:
 */

public class ThreadExceptionUncaughtExceptionHandler {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new HanlderThreadFactory());
        exec.execute(new ExceptionThread());
    }
}