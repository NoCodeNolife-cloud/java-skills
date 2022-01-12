import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * 项目名:  ConcurrentHashMap
 * 开发者:  Administrator
 * 创建于:  2022 一月 12 星期三 14:57
 * 描述:
 */

public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        final Map<String, Integer> count = new ConcurrentHashMap<>();
        final CountDownLatch endLatch = new CountDownLatch(2);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    Integer value = count.get("a");
                    if (null == value) {
                        count.put("a", 1);
                    } else {
                        count.put("a", value + 1);
                    }
                }
                endLatch.countDown();
            }
        };
        new Thread(task).start();
        new Thread(task).start();

        try {
            endLatch.await();
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
