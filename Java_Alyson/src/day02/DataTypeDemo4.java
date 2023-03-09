package day02;

/*
    需要记住的ASCI码值：
        'a' : 97
        'A' : 65
        '0' : 48

    1、加号两边只要有一边是字符串，就进行字符串的拼接运算，拼接后的结果依旧是字符串
    2、如果要想改变运算的顺序，可以添加小括号
*/

public class DataTypeDemo4 {
    public static void main(String[] args) {
        System.out.println("hello" + 'a' + 1);  // helloa1
        System.out.println('a' + 1 + "hello");  // 98hello
        System.out.println("5+5=" + (5 + 5));   // 5+5=10
        System.out.println(5 + 5 + "=5+5");     // 10=5+5
    }
}
