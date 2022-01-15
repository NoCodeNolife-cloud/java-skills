import java.util.concurrent.Exchanger;

/**
 * 项目名:  Exchanger
 * 开发者:  Administrator
 * 创建于:  2022 一月 14 星期五 20:13
 * 描述:
 */
public class ExchangerTester {

    // Exchanger实例.
    private static final Exchanger<String> exchanger = new Exchanger<String>();

    public static void main(String[] args) {
        // 模拟阻塞线程.
        new Thread(() -> {
            try {
                String wares = "红烧肉";
                System.out.println(Thread.currentThread().getName() + "商品方正在等待金钱方，使用货物兑换为金钱.");
                Thread.sleep(2000);
                // 交换红烧肉
                String money = exchanger.exchange(wares);// money获得人民币
                System.out.println(Thread.currentThread().getName() + "商品方使用商品兑换了" + money);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }).start();
        // 模拟阻塞线程.
        new Thread(() -> {
            try {
                String money = "人民币";
                System.out.println(Thread.currentThread().getName() + "金钱方正在等待商品方，使用金钱购买食物.");
                Thread.sleep(4000);
                // 交换人民币
                String wares = exchanger.exchange(money);// wares获得红烧肉
                System.out.println(Thread.currentThread().getName() + "金钱方使用金钱购买了" + wares);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }).start();
    }

}
