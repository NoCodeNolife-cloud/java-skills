import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * ProjectName: Random Character
 * Author: Administrator
 * Date: 2022/1/9 16:01
 * Description:
 */
public class CharacterRandom {

    public static void main(String[] args) {

        String cnt = "qwertyuiopasdfghjklzxcvbnm";
        Map<Character, Integer> map = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 5000; i++) {
            Character character = cnt.charAt(random.nextInt(cnt.length()));
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        System.out.println(map);
    }
}
