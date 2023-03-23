package day10;
/*
    请用LinkedList模拟栈数据结构的集合，并测试
    栈：先进后出
 */

public class LinkedListTest1 {
    public static void main(String[] args) {
        //题目的要求是，自己自定义一个集合类，底层要是LinkedList，模拟栈的实现
        //创建自己的集合对象，底层是LinkedList
        MyCollection list = new MyCollection();
        // 添加元素
        list.myAdd("a");
        list.myAdd("b");
        list.myAdd("c");
        list.myAdd("d");
        list.myAdd("e");

        int length = list.getLength();
        for (int i = 0; i < length; i++) {
            System.out.println(list.myGet());
        }

    }
}
