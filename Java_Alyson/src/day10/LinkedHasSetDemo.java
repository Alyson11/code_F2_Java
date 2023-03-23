package day10;
/*
    LinkedHashSet：继承自HashSet,底层是哈希表和双链表构成
    哈希表保证了数据的唯一性，双链表保证的是数据存储的顺序,线程不安全的，效率高
 */

import java.util.LinkedHashSet;

public class LinkedHasSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("a");
        lhs.add("s");
        lhs.add("f");
        lhs.add("a");
        lhs.add("s");
        lhs.add("e");

        System.out.println(lhs);
    }
}
