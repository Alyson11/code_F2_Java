package day09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
    Collection集合专有的遍历方式：迭代器遍历
    Iterator iterator()
 */

public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("hello");
        c.add("world");
        c.add("yes");
        c.add("kai");
        c.add("2");

        // Collection获取迭代器对象
        //hasNext()进行判断
        //对于Collection集合而言。同一个迭代器只能遍历一次
        Iterator iterator = c.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
