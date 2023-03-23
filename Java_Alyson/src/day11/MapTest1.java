package day11;
/*
    HashMap<Student,String>

    唯一性是针对于key来说的，如果在重写了hashCode()方法和equals()的同时，将Student类型作为value值存在，是不会去重的
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();

        Student s1 = new Student("Jackson", 18);
        Student s2 = new Student("Alyson", 3);
        Student s3 = new Student("Tom", 28);
        Student s4 = new Student("Jerry", 8);
        Student s5 = new Student("Tom", 28);

        map.put(s1,"男生");
        map.put(s2,"女生");
        map.put(s3,"老鼠一号");
        map.put(s4,"猫");
        System.out.println(map);
        map.put(s5,"老鼠二号");
        System.out.println(map);

        Set<Map.Entry<Student, String>> entrySet = map.entrySet();
        for (Map.Entry<Student, String> keyValue : entrySet) {
            Student key = keyValue.getKey();
            String value = keyValue.getValue();
            System.out.println(key+":"+value);
        }

    }
}
