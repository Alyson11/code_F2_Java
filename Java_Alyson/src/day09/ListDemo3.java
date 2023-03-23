package day09;

/*
    List集合特有的遍历方式2：ListIterator listIterator()
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListDemo3 {
    public static void main(String[] args) {
        // 1、创建集合对象
        List list=new ArrayList();
        // 2、创建元素添加到集合
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");
        list.add("world");
        // 3、遍历
        ListIterator listIterator=list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        //要想倒着遍历，必须先正着遍历一次
        //所以这个不常用
        while (listIterator.hasPrevious()){     //判断前一个位置是否有元素
            System.out.println(listIterator.previous());  //获取前一个位置上的元素
        }

    }
}
