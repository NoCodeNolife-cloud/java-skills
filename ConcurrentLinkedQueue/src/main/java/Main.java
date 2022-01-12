import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 项目名:  ConcurrentLinkedQueue PACKAGE_NAME
 * 开发者:  Administrator
 * 创建于:  2022/1/12 14:31
 * 描述:
 */
public class Main {

    public static void main(String[] args) {
        //安全队列（先进先出）
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();
        System.out.println("===================");
        queue.offer("e1");//插入元素
        System.out.println("peek: "+queue.peek());//取数据不删除
        System.out.println("isEmpty: "+queue.isEmpty());
        System.out.println("===================");
        System.out.println("poll: "+queue.poll());//取数据并删除
        System.out.println("isEmpty: "+queue.isEmpty());
        System.out.println("===================");
        queue.offer("e1");
        queue.offer("e2");
        System.out.println("poll e1: "+queue.poll());//先进先出
        System.out.println("poll e2: "+queue.poll());//先进先出
        System.out.println("isEmpty: "+queue.isEmpty());
        System.out.println("===================");
        queue.offer("e1");
        System.out.println("contains: "+queue.contains("e1"));
        System.out.println("remove: "+queue.remove("e1"));
        System.out.println("isEmpty: "+queue.isEmpty());
        System.out.println("===================");
        queue.offer("a1");
        queue.offer("a2");
        Object[] sArray = queue.toArray();
        System.out.println("toArray: "+sArray[0]+","+sArray[1]);
        System.out.println("isEmpty: "+queue.isEmpty());
        System.out.println("===================");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("isEmpty: "+queue.isEmpty());
    }
}
