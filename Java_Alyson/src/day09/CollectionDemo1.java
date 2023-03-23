package day09;
import java.util.Collection;
import java.util.ArrayList;
/*
    我们之前学过哪些容器？
        数组，StringBuffer
        对于数组而言虽然可以存储基本数据类型，也可以存储引用数据类型，但是呢长度是固定，增删元素比较麻烦
        对于StringBuffer而言，虽然可以进行长度的扩大，可以对数据进行增删改查，但是呢StringBuffer只能存字符数据类型的数据

    我们今后处理数据的情况，太复杂，针对不同的情况，数据的类型不同，所需要存储的介质取决于我们的需求，比如说数据是否需要去重？是否要排序？
    存储之后我们是查询的次数多？还是增删改的次数多？
    但是，尽管我们不知道将来存储和取出的特点，但是我们清楚都需要使用一个介质进行存储，无非就是这个存储介质的特点不同罢了。
    java提供了很多不同的特点的容器给我们使用，这些容器我们统称为集合
    这么多类型的集合，肯定存在某些集合具备相同的特性，我们将这些特性不断地向上提取，最终我们会得到一个继承体系。

    我们通过观察API发现，Collection是一个接口，而接口是不允许创建对象的
    要想调用Collection接口中的方法，需要借助一个实现类去创建对象调用接口中的方法
    ArrayList

    学习集合的4大步骤：
        1、创建集合对象
        2、创建集合元素
        3、向集合中添加元素
        4、遍历集合

   Collection接口中的成员方法：
        boolean add(Object obj)
        boolean remove(Object o)
        void clear()
        boolean contains(Object o)
        boolean isEmpty()
        int size()


   使用集合的注意事项：
    1、集合中只允许存储引用数据类型
    2、同一个集合可以存储不同的引用数据类型的元素，但是尽管可以存储，我们在今后开发也不这么做，今后开发中一个集合就存一种数据类型


   总结目前几种获取长度的方式：
    数组获取长度：length属性
    String获取长度：length()
    StringBuffer获取容器大小：capacity()
    StringBuffer获取字符个数：length()
    Collection集合获取元素个数：size()

 */

import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // 1、创建集合
        Collection list = new ArrayList();
        //2、创建集合元素并添加到集合
        list.add(100);
        list.add("python");
        list.add(12.23);
        list.add(true);

        System.out.println(list);

        // boolean add(Object obj)
        list.add("jackson");
        System.out.println(list);
        // boolean remove(Object o)
        list.remove("jackson");
        System.out.println(list);
//        void clear()
//        list.clear();
//        System.out.println(list);
//        boolean contains(Object o)
        System.out.println(list.contains(100));
//        boolean isEmpty()
        System.out.println(list.isEmpty());
//        int size()
        System.out.println(list.size());

    }
}
