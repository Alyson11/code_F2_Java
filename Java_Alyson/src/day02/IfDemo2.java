package day02;
/*
    思考：if语句的第二种格式能否和三目运算符进行转换？
    如果if语句体中是一个输出语句，那么就不能够转化成三目运算符
    但是if语句中不是输出语句，就可以
 */

public class IfDemo2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);

        int res = (a>b)?a:b;
        System.out.println(res);
    }
}
