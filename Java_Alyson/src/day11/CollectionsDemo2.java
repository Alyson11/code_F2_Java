package day11;
/*
    填坑：之前我们说过Vector即使是线程安全的类，我们也不用它
    我们可以将不安全的集合变成安全的。
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(4);
        list.add(17);
        list.add(3);
        list.add(534);
        list.add(12);
        System.out.println(list);


        List<Integer> list1 = Collections.synchronizedList(list);  //将list集合变成线程安全的集合
    }
}
