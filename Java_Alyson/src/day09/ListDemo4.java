package day09;
/*
    需求：遍历集合，如果遇到了"java"，就添加一个元素"flink"
    针对这个需求而言，如果想用迭代实现，必须使用List特有的迭代器

    我们正常去编写程序运行后报错：ConcurrentModificationException  并发修改异常

    解决方案：迭代器遍历迭代器修改，集合遍历集合修改

 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo4 {
    public static void main(String[] args) {
        // 1、创建集合
        List list = new ArrayList();
        // 2、创建元素添加到集合
        list.add("java");
        list.add("sql");
        list.add("java");
        list.add("redis");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if(s.equals("java")){
                list.add("666");
            }
        }

    }
}
