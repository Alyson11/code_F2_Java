package day10;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Teacher> set = new HashSet<>();

        Teacher t1 = new Teacher("笑", 18);
        Teacher t2 = new Teacher("虎", 19);
        Teacher t3 = new Teacher("童", 13);
        Teacher t4 = new Teacher("凯", 10);
        Teacher t5 = new Teacher("凯", 10);

        set.add(t1);
        set.add(t2);
        set.add(t3);
        set.add(t4);
        set.add(t5);

        System.out.println(set);

    }
}
