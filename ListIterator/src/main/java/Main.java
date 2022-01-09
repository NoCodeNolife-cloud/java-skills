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
        ListIterator<Integer> listIterator = list.listIterator();
        while (!listIterator.hasNext()) {
            Integer itm = listIterator.next();
            
        }
    }
}
