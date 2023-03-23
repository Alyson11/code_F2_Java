package day11.Test2;

import java.util.HashSet;
import java.util.Set;

/*
    2. 使用HashSet和TreeSet存储多个商品信息，遍历并输出；
        其中商品属性：编号，名 称，单价，出版社；
        要求向其中添加多个相同的商品，验证集合中元素的唯一性。
        提示： 向HashSet中添加自定义类的对象信息，需要重写hashCode和equals( )
        向TreeSet中添加自定义类的对象信息，需要实现Comparable接口，指定比较规则
 */
public class TestHashSet {
    public static void main(String[] args) {
        Set<Book> set = new HashSet<>();

        Book b1 = new Book("1001","数学分析",54,"华东师范大学出版社");
        Book b2 = new Book("1002","高等代数",45,"复旦大学出版社");
        Book b3 = new Book("1003","解析几何",64,"高等教育出版社");
        Book b4 = new Book("1004","复变函数",46,"中国科学技术大学出版社");
        Book b5 = new Book("1004","复变函数",46,"中国科学技术大学出版社");

        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        set.add(b5);

        for (Book book : set) {
            System.out.println(book);
        }
    }
}
