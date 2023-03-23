package day09;
/*
    ArrayList：底层数据结构是数组，查询快，增删慢的场景使用，线程不安全的一个类，效率高，是List接口的实现子类
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("hello");

        Iterator iterator=arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
