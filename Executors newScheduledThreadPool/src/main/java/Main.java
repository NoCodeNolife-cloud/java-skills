import java.util.concurrent.*;

/**
 * 项目名:  Executors newScheduledThreadPool
 * 开发者:  Administrator
 * 创建于:  2022 一月 13 星期四 17:24
 * 描述:
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        ScheduledFuture<String> scheduledFuture = executorService.schedule(new MyCallableClass(), 3, TimeUnit.SECONDS);
        System.out.println(scheduledFuture.get());
        executorService.shutdown();
    }

    static class MyCallableClass implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "call";
        }
    }
}
