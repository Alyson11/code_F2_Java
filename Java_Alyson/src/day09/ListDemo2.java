package day09;

import java.util.List;
import java.util.ArrayList;
/*
    List集合特有的遍历方式1：get()和size()结合
 */

public class ListDemo2 {
    public static void main(String[] args) {
        // 1、创建集合对象
        List list = new ArrayList();
        // 2、创建元素添加到集合
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");
        list.add("world");
        // 3、遍历
        for (int i = 0; i < list.size(); i++) {
            Object tmp = list.get(i);
            System.out.println(tmp);
        }
    }
}
