import java.util.BitSet;


/**
 * ProjectName: BitSet
 * Author: Administrator
 * Date: 2022/1/9 23:01
 * Description:
 */
public class TestBitSet {

    public static void main(String[] args) {
        byte[] bytes = {100};
        // BitSet.valueOf
        BitSet bits = BitSet.valueOf(bytes);
        // print
        for (int i = 0; i < bits.size(); i++) {
            System.out.print(bits.get(i) + " ");
        }
        System.out.println();
        // set
        bits.set(3, true);
        for (int i = 0; i < bits.size(); i++) {
            System.out.print(bits.get(i) + " ");
        }
        System.out.println();
        // flip
        bits.flip(3);
        for (int i = 0; i < bits.size(); i++) {
            System.out.print(bits.get(i) + " ");
        }
        // size
        System.out.println();
        System.out.println(bits.size());
    }
}
