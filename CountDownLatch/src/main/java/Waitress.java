import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * 项目名:  CountDownLatch
 * 开发者:  Administrator
 * 创建于:  2022 一月 13 星期四 22:51
 * 描述:
 */
public class Waitress implements Runnable {
    private CountDownLatch latch;
    private String name;

    public Waitress(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
            System.out.println(sdf.format(new Date()) + " " + name + "等待顾客");
            latch.await();
            System.out.println(sdf.format(new Date()) + " " + name + "开始上菜");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
