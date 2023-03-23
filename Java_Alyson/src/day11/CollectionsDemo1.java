package day11;
/*
        Collections工具类的静态方法：
//            public static <T> void sort(List<T> list)
//            public static <T> int binarySearch(List<?> list,T key)
//            public static <T> T max(Collection<?> coll)
//            public static void reverse(List<?> list)
//            public static void shuffle(List<?> list)

 */

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(4);
        list.add(17);
        list.add(3);
        list.add(534);
        list.add(12);
        System.out.println(list);

//            public static <T> void sort(List<T> list)     只能对list相关集合做排序
        Collections.sort(list);     //  底层调用的是Arrays工具类中的快速排序方法
        System.out.println(list);

//            public static <T> int binarySearch(List<?> list,T key)
        System.out.println(Collections.binarySearch(list, 12));     //二分查找

//            public static <T> T max(Collection<?> coll)
        System.out.println(Collections.max(list));

//            public static void reverse(List<?> list)
        Collections.reverse(list);
        System.out.println(list);

//            public static void shuffle(List<?> list) 使用默认的随机源随机排列指定的列表
        Collections.shuffle(list);
        System.out.println(list);   // [12, 17, 4, 12, 3, 534]  [3, 4, 12, 17, 12, 534]

    }
}
