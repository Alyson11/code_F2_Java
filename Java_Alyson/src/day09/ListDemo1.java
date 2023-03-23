package day09;

import java.util.ArrayList;
import java.util.List;

/*
    List接口：是继承自Collection接口
    List的相关集合具备元素是 有序 的，且元素允许发生 重复
    这里的有序不是指排序，指的是存储和取出的顺序一致

    List相关集合具备 索引 ，且索引是从 0 开始的

    List接口中特有的方法：
        void add(int index,E element)
        E remove(int index)
        E get(int index)
        E set(int index,E element)
        ListIterator listIterator()

 */
public class ListDemo1 {
    public static void main(String[] args) {
        // 1、创建集合对象
        List list = new ArrayList();
        // 2、创建集合元素并添加到集合
        list.add("java");
        list.add("python");
        list.add("spark");
        list.add("python");
        System.out.println(list);

        // void add(int index,E element) 通过索引添加元素到集合
        list.add(2, "jackson");
        System.out.println(list);

        //E remove(int index)  通过索引移除元素
        Object tmp = list.remove(2);
        System.out.println(tmp);  // 返回被移除的元素
        System.out.println(list);

        // E get(int index)  通过索引获取元素
        Object temp1 = list.get(1);
        System.out.println(temp1);

        // E set(int index,E element) 通过索引修改对应位置的元素
        Object temp2 = list.set(1, "jackson");
        System.out.println(temp2);
        System.out.println(list);

        // 获取Collection集合元素个数的方法
        int num= list.size();
        System.out.println(num);
    }
}
