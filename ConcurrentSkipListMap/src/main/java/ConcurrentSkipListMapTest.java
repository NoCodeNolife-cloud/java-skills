import java.util.Map;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * 项目名:  ConcurrentSkipListMap
 * 开发者:  Administrator
 * 创建于:  2022 一月 12 星期三 15:45
 * 描述:
 */
public class ConcurrentSkipListMapTest {

    public static void main(String[] args) {

        ConcurrentSkipListMap<String, Integer> cslMap = new ConcurrentSkipListMap<String, Integer>();
        cslMap.put("2017-05-22 16:18:10_key1", 1);
        cslMap.put("2017-05-22 16:18:08_key2", 2);
        cslMap.put("2017-05-22 16:18:20_key3", 1);
        cslMap.put("2017-05-22 16:18:18_key4", 2);
        cslMap.put("2017-05-22 16:18:30_key5", 1);
        cslMap.put("2017-05-22 16:18:28_key2", 2);
        cslMap.put("2017-05-22 16:18:40_key2", 1);
        cslMap.put("2017-05-22 16:18:38_key1", 2);
        cslMap.put("2017-05-22 16:18:59_key1", 2);
        cslMap.put("2017-05-22 17:18:10_key1", 2);
        cslMap.put("2017-05-22 17:18:08_key1", 2);
        cslMap.put("2017-05-23 17:18:08_key1", 2);

        String startKey = "2017-05-22 16:18:08";
        String endKey = "2017-05-22 16:18:60";

        ConcurrentNavigableMap<String, Integer> subMap = cslMap.subMap(startKey, endKey); //前闭后开
        for (Map.Entry<String, Integer> entry : subMap.entrySet()) { //取一定范围的集合
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        }
        System.out.println("----------------------------------------------");
        String firstKey = cslMap.firstKey(); //第一个键值（最小）
        String lastKey = cslMap.lastKey();//最后一个键值（最大）
        System.out.println("firstKey:" + firstKey + "=" + cslMap.get(firstKey) + "  lastKey:" + lastKey + "=" + cslMap.get(lastKey));
        System.out.println("----------------------------------------------");
        ConcurrentNavigableMap<String, Integer> headMap = cslMap.headMap("2017-05-23");//截止到指定key的集合（toKey 开区间）
//		ConcurrentNavigableMap<String, Integer> headMap = cslMap.headMap("2017-05-22",true);//截止到指定key的集合（toKey 闭区间）
        for (Map.Entry<String, Integer> entry : headMap.entrySet()) {
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        }
        System.out.println("----------------------------------------------");
		/*Iterator<Entry<String, Integer>> it = cslMap.entrySet().iterator();
		Set<String> deleteKeySet = headMap.keySet(); //要删除的key
		while (it.hasNext()) {
		      Entry<String, Integer> entry = it.next();
		      if (deleteKeySet.contains(entry.getKey()))
		      it.remove();
		}*/
        for (String key : headMap.keySet()) {
            cslMap.remove(key);
        }
        for (Map.Entry<String, Integer> entry : cslMap.entrySet()) { //删除后的集合
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        }
    }
}
