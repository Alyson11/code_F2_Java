package day11;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
    TreeMap: 底层数据结构是红黑树，可以对key进行两种排序：1、自然排序 2、比较器排序
 */
public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<>(new Comparator<Student>() { // 匿名内部类
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getAge() - o2.getAge();
                int i2 = (i == 0) ? o1.getName().compareTo(o2.getName()) : i;
                return i2;
            }
        });

        map.put(new Student("Tom", 2), "老鼠一号");
        map.put(new Student("Jerry", 4), "猫");
        map.put(new Student("Alyson", 3), "女生");
        map.put(new Student("Jackson", 5), "男生");
        map.put(new Student("Tom", 2), "老鼠二号");

        //遍历集合
        Set<Map.Entry<Student, String>> entrySet = map.entrySet();
        for (Map.Entry<Student, String> keyValue : entrySet) {
            Student key = keyValue.getKey();
            String value = keyValue.getValue();
            System.out.println(key + ":" + value);
        }


    }
}
