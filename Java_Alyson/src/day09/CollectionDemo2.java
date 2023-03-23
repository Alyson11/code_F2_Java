package day09;

/*
        boolean addAll(Collection c)
        boolean removeAll(Collection c)
        boolean containsAll(Collection c)
        boolean retainAll(Collection c)

 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        // 创建c1集合
        Collection c1 = new ArrayList();
        c1.add("hello");
        c1.add("world");
        c1.add("java");
        c1.add("mysql");

        // 创建c2集合
        Collection c2 = new ArrayList();
        c2.add("jackson");
        c2.add("Yee");
        c2.add("Kai");
        c2.add("java");

//        boolean addAll(Collection c)
//        c1.addAll(c2);
//        System.out.println(c1);

//        boolean removeAll(Collection c)
//        c1.removeAll(c2);
//        System.out.println(c1);

//        boolean containsAll(Collection c)
//        System.out.println(c1.containsAll(c2));

        System.out.println("=======");
//        boolean retainAll(Collection c)
//        System.out.println(c1);
//        System.out.println(c2);
        System.out.println(c1.retainAll(c2));   // c1交上c2，将交集保存在c1中，c2不动
        System.out.println(c1);
        System.out.println(c2);

    }
}
