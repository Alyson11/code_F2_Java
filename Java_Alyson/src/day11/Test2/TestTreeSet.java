package day11.Test2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet{
    public static void main(String[] args) {
        Set<Book> set = new TreeSet<>();

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
