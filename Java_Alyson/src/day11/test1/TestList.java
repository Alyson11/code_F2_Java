package day11.test1;

import java.util.ArrayList;

/*
    1.使用List和Map存放多个图书信息，遍历并输出。
        其中商品属性：编号，名称，单价，出版社；
        使用商品编号作为Map中的key。
 */
public class TestList {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();

        Book b1 = new Book("1001","数学分析",54,"华东师范大学出版社");
        Book b2 = new Book("1002","高等代数",45,"复旦大学出版社");
        Book b3 = new Book("1003","解析几何",64,"高等教育出版社");
        Book b4 = new Book("1004","复变函数",46,"中国科学技术大学出版社");

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

//        System.out.println(list);
        for (Book book : list) {
            System.out.println(book);
        }

    }
}
