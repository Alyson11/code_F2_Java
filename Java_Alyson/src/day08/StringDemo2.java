package day08;
/*
    String s = new String(“hello”)和String s = “hello”;的区别?

 */

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println(s1 == s2);   // false
    }
}
