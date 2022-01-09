import java.util.concurrent.atomic.AtomicReference;

/**
 * ProjectName: AtomicReference
 * Author: Administrator
 * Date: 2022/1/8 17:41
 * Description:
 */
public class Main {

    public static void main(String[] args) {

        AtomicReference<Integer> atomicReference = new AtomicReference<>();
        // set
        atomicReference.set(5);
        // get
        System.out.println(atomicReference.get());
        // compareAndSet
        atomicReference.compareAndSet(5, 15);
        System.out.println(atomicReference.get());
        // compareAndExchange
        atomicReference.compareAndExchange(15, 35);
        System.out.println(atomicReference.get());
        // getAndSet
        System.out.println(atomicReference.getAndSet(80));
        System.out.println(atomicReference.get());
    }
}
