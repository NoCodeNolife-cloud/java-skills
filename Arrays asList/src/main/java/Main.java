import java.util.Arrays;
import java.util.List;

/**
 * ProjectName: Arrays asList
 * Author: Administrator
 * Date: 2022/1/9 21:23
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("hello", "the", "world");
        for (String str : stringList) {
            System.out.print(str + " ");
        }
        System.out.println();

        List<Integer> integerList = Arrays.asList(4, 5, 6, 2, 4);
        for (Integer integer : integerList) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
