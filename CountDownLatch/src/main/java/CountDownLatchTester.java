import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * 项目名:  CountDownLatch
 * 开发者:  Administrator
 * 创建于:  2022 一月 13 星期四 22:52
 * 描述:
 */
public class CountDownLatchTester {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        List<Thread> threads = new ArrayList<>(3);
        threads.add(new Thread(new Customer(latch, "张三")));
        threads.add(new Thread(new Customer(latch, "李四")));
        threads.add(new Thread(new Customer(latch, "王五")));
        for (Thread thread : threads) {
            thread.start();
        }

        Thread.sleep(100);
        new Thread(new Waitress(latch, "♥小芳♥")).start();
    }
}
