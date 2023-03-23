package day09;
import java.util.Collection;
import java.util.ArrayList;
/*
    Collection集合的遍历方式：
        1、Object[] toArray()
        把集合转成数组，可以实现集合的遍历

 */

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("java");
        c.add("hello");
        c.add("python");
        c.add("hi");

        // 遍历集合
        Object[] array = c.toArray();
        for(int i=0;i< array.length;i++){
            Object o=array[i];
            String s=(String) o;
            System.out.println(s+",该元素的长度为："+s.length());
        }

    }
}
