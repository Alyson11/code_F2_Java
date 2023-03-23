package day11;

import java.util.LinkedHashMap;

/*

   LinkedHashMap: 底层是哈希表（保证了key的唯一性）和双链表

   Student类重写了equals和hashCode方法，所以保证key的唯一性，进行去重
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Student, String> map = new LinkedHashMap<>();

        Student s1 = new Student("Tom", 3);
        map.put(s1,"老鼠");
        map.put(new Student("Jerry",4),"猫");
        map.put(new Student("Alyson",3),"女生");
        map.put(new Student("Jackson",5),"男生");
        map.put(new Student("Tom",3),"老鼠二号");

        System.out.println(map);


    }
}
