package day09;

import java.util.Iterator;

import java.util.Collection;
import java.util.ArrayList;

public class CollectionDemo5 {
    public static void main(String[] args) {
        // 1、创建集合
        Collection c = new ArrayList();
        // 2、创建元素
        Student s1 = new Student("悟空", 300);
        Student s2 = new Student("悟净", 400);
        Student s3 = new Student("悟能", 500);
        Student s4 = new Student("唐僧", 600);
        // 3、添加元素到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        // 4、遍历集合
        // 方法一:先转数组再遍历
//        Object[] array = c.toArray();
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        // 方法二：迭代器遍历
        Iterator iterator = c.iterator();   // 获取迭代器
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
