import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * 项目名:  Semaphore
 * 开发者:  Administrator
 * 创建于:  2022 一月 13 星期四 20:47
 * 描述:
 */
public class SemaphoreTester {

    public static void main(String[] args) throws InterruptedException {
        //饭店里只用两个洗手池，所以初始化许可证的总数为2。
        // Semaphore washbasin = new Semaphore(2);
        Semaphore washbasin = new Semaphore(1, true); // 只有一个洗手池, 公平锁 第二个参数fair设置为true


        List<Thread> threads = new ArrayList<>();
        threads.add(new Thread(new Customer(washbasin, "张三")));
        threads.add(new Thread(new Customer(washbasin, "李四")));
        threads.add(new Thread(new Customer(washbasin, "王五")));
        threads.add(new Thread(new Customer(washbasin, "赵六")));
        for (Thread thread : threads) {
            thread.start();
            Thread.sleep(50); // 排队时间
        }

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
