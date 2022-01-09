import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * ProjectName: ListIterator
 * Author: Administrator
 * Date: 2022/1/9 11:13
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 22; i++) {
            list.add(i);
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
                listIterator.add(100);
            }
        }
        System.out.println(list);
    }
}
