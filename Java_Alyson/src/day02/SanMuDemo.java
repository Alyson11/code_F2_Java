package day02;
/*
    三目运算符（三元运算符）：语句定义格式：(比较运算表达式)?表达式1:表达式2;
    注意事项：
        1、三目运算符一定要有一个结果值
        2、三目运算符返回的数据类型是由参与运算的最大数据类型决定的
 */

public class SanMuDemo {
    public static void main(String[] args) {
        int a = 12;
        double b = 12.34;
        double c = (a > b) ? a : b;
        System.out.println(c);
    }
}
