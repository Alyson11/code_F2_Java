package day10;
/*
        TreeSet：底层数据结构是红黑树，可以进行可预测的排序。
        有两种对数据排序方式：
            1、自然排序
            2、比较器排序
 */

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("world");
        treeSet.add("apple");
        treeSet.add("watermelon");
        treeSet.add("pitaya");
        treeSet.add("banana");
        treeSet.add("coconut");
        treeSet.add("watermelon");
        treeSet.add("durian");

        System.out.println(treeSet); // [apple, banana, coconut, durian, pitaya, watermelon, world]
    }
}
