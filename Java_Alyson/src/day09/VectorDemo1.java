package day09;
/*
    List接口实现子类2：Vector
    底层数据结构依旧是数组，查询快，增删慢，线程是安全的，效率低。
    即使这个是线程安全的，我们今后也不用，后面会学习如何将ArrayList变成线程安全的。

    Vector特有的功能：
        public void addElement(Object obj)
        public Object elementAt(int index)
        public Enumeration elements()

 */

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {
    public static void main(String[] args) {
        // 创建集合对象
        Vector vector=new Vector();
        //创建元素添加到集合
        vector.add("hello");
        vector.add("hello");
        vector.add("hadoop");
        vector.add("hive");
        vector.add("hello");

        // 3、遍历集合
//        Iterator iterator = vector.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        // public void addElement(Object obj)
//        vector.addElement("beauty");
//        System.out.println(vector);

//        public Object elementAt(int index)
        System.out.println(vector.elementAt(0));

//        public Enumeration elements() 获取所有元素的一个组合，就把它看成一个迭代器
        Enumeration elements = vector.elements();   // 使用迭代器代替
        while(elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }
}
