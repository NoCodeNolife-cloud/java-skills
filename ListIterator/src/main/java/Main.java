import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * ProjectName: ListIterator
 * Author: Administrator
 * Date: 2022/1/9 11:13
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 22; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        // get listIterator
        ListIterator<Integer> listIterator = list.listIterator();
        // hastNext
        while (listIterator.hasNext()) {
            // next
            Integer itm = listIterator.next();
            if (itm % 2 == 0) {
                // remove
                listIterator.remove();
                // add
                listIterator.add(0);
            }else{
                // set
                listIterator.set(1);
            }
        }
        // previousIndex
        System.out.println(listIterator.previousIndex());
        // previous
        System.out.println(listIterator.previous());
        // toString
        System.out.println(list);
    }
}
