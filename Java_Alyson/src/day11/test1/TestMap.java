package day11.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        HashMap<Integer, Book> map = new HashMap<>();

        Book b1 = new Book("1001","数学分析",54,"华东师范大学出版社");
        Book b2 = new Book("1002","高等代数",45,"复旦大学出版社");
        Book b3 = new Book("1003","解析几何",64,"高等教育出版社");
        Book b4 = new Book("1004","复变函数",46,"中国科学技术大学出版社");

        map.put(1001,b1);
        map.put(1002,b2);
        map.put(1003,b3);
        map.put(1004,b4);

//        System.out.println(map);
        Set<Map.Entry<Integer, Book>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Book> bookEntry : entrySet) {
            Integer key = bookEntry.getKey();
            Book value = bookEntry.getValue();
            System.out.println(key+"---"+value);
        }
    }
}
