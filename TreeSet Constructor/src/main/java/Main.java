import java.util.*;

/**
 * ProjectName: untitled
 * Author: Administrator
 * Date: 2022/1/6 22:45
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        TreeSet<MyClass> treeSet = new TreeSet<>();
        for (int i = 0; i < 500; i++) {
            treeSet.add(new MyClass(random.nextInt(100)));
        }
        System.out.println(treeSet);
    }
}

class MyClass implements Comparable {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        if (this.value == ((MyClass) o).getValue()) {
            return 0;
        } else if (this.value > ((MyClass) o).getValue()) {
            return -1;
        } else {
            return 1;
        }
    }

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nMyClass{" +
                "value=" + value +
                '}';
    }
}
