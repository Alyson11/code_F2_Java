package day10;
/*
    Set接口相关集合：元素唯一，且无序(存储和取出的顺序不一致)

    接口不允许实例化，借助子类： HashSet进行创建对象
 */

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("a");
        set.add("b");
        set.add("a");
        set.add("d");
        set.add("f");
        set.add("e");
        set.add("f");

        System.out.println(set);

    }
}
