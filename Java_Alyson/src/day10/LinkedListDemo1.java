package day10;
/*
    LinkedList：底层是双链表的数据结构，查询慢，增删快，线程不安全，效率高

    特有方法：
        public void addFirst(E e)及addLast(E e)
        public E getFirst()及getLast()
        public E removeFirst()及public E removeLast()

 */

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        //1、创建集合对象
        LinkedList linkedList = new LinkedList<>();
        //2、创建集合元素并添加到集合
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        System.out.println(linkedList);
        //3、遍历
//        Iterator iterator=linkedList.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        public void addFirst(E e)及addLast(E e)
        linkedList.addFirst("first");
        System.out.println(linkedList);
        linkedList.addLast("final");
        System.out.println(linkedList);

//        public E getFirst()及getLast()
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);     // [first, a, b, c, d, e, final] 并非取出

//        public E removeFirst()及public E removeLast()
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);     // [a, b, c, d, e]

    }
}
