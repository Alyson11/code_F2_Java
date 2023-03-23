package day11;
/*
    Map集合，元素是由key-value键值对构成

    举例：
        <1001,"吴涛">
        <1002,"陈涛">
        <1003,"王硕">
        <1004,"张梦云">
        <1005,"王硕">

    注意事项：
        1、key的值是唯一，不能重复
        2、value是可以允许重复的

    Map集合成员方法：
        V put(K key,V value)
        V remove(Object key)
        void clear()
        boolean containsKey(Object key)
        boolean containsValue(Object value)
        boolean isEmpty()
        int size()
 */

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        // map是一个接口，无法创建对象，需要借助子类创建对象
        Map<Integer, String> map = new HashMap<>();
        map.put(1001,"Jackson");
        map.put(1002,"Alyson");
        map.put(1003,"Tom");
        map.put(1004,"Jerry");
        map.put(1005,"Tom");
        System.out.println(map); // {1001=Jackson, 1002=Alyson, 1003=Tom, 1004=Jerry, 1005=Tom}

        // V put(K key,V value) 添加 (覆盖)
        System.out.println(map.put(1005, "Kai")); // Tom 返回的是更改前的value值
        System.out.println(map); // {1001=Jackson, 1002=Alyson, 1003=Tom, 1004=Jerry, 1005=Kai}

        // V remove(Object key) 移除
        System.out.println(map.remove(1005));
        System.out.println(map);

        // void clear() 清空
//        map.clear();
//        System.out.println(map); // {}

//        boolean containsKey(Object key) 根据key判断是否存在
        System.out.println(map.containsKey(1001));

//        boolean containsValue(Object value) 根据value判断是否存在
        System.out.println(map.containsValue("Jackson"));

//        boolean isEmpty() 判断是否为空
        System.out.println(map.isEmpty());

//        int size()  获取大小
        System.out.println(map.size()); // 4

    }
}
