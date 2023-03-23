package day11;
/*
    Map集合的遍历方式：
        1、获取所有key，根据key获取value值
        2、获取所有key-value键值对，分别获取key,value

   所使用到的方法：
        int size()
        V get(Object key)  根据key获取对应的value值
        Set<K> keySet()
        Collection<V> values()
        Set<Map.Entry<K,V>> entrySet()

 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1001, "Jackson");
        map.put(1002, "Alyson");
        map.put(1003, "Tom");
        map.put(1004, "Jerry");
        map.put(1005, "Tom");
//        System.out.println(map); // {1001=Jackson, 1002=Alyson, 1003=Tom, 1004=Jerry, 1005=Tom}

//    Map集合的遍历方式：
//        1、获取所有key，根据key获取value值
//        Set<Integer> keys = map.keySet();
//        for (Integer key : keys) {
////            System.out.println(map.get(key));
//            // 根据key获取对应的value值
//            String value = map.get(key);
//            System.out.println(key + "---" + value);
//        }

//        Set<Integer> keys = map.keySet(); //返回此地图中包含的键的Set视图。
//        Set<Map.Entry<Integer, String>> kesy2 = map.entrySet(); //返回此地图中包含的映射的Set视图。
//        Collection<String> values = map.values(); //返回此地图中包含的值的Collection视图。
//        System.out.println(keys); //[1001, 1002, 1003, 1004, 1005]
//        System.out.println(kesy2);//[1001=Jackson, 1002=Alyson, 1003=Tom, 1004=Jerry, 1005=Tom]
//        System.out.println(values); //[1001=Jackson, 1002=Alyson, 1003=Tom, 1004=Jerry, 1005=Tom]

//        2、获取所有的键值对
        Set<Map.Entry<Integer, String>> keyValuesSet = map.entrySet();
        for (Map.Entry<Integer, String> keyValue : keyValuesSet) {
            // 获取key
            Integer key = keyValue.getKey();
            // 获取value
            String value = keyValue.getValue();
            System.out.println(key + "---" + value);
        }


    }
}
