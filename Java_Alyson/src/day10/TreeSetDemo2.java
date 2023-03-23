package day10;
/*
    使用TreeSet集合存储自定义对象并遍历
    当成员变量值一样的时候，我们认为是同一个对象

    需求：将存储的元素进行去重，且以年龄从小到大排序

 */

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Dog> set = new TreeSet<>();

        Dog d1 = new Dog("小白", 2);
        Dog d2 = new Dog("小黑", 6);
        Dog d3 = new Dog("小红", 1);
        Dog d4 = new Dog("小白", 5);
        Dog d5 = new Dog("小花", 3);
        Dog d6 = new Dog("小兰", 7);
        Dog d7 = new Dog("小白", 2);

        set.add(d1);
        set.add(d2);
        set.add(d3);
        set.add(d4);
        set.add(d5);
        set.add(d6);
        set.add(d7);

        System.out.println(set);
    }
}
