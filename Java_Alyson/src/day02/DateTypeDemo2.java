package day02;

/*
    要求定义两个变量进行加法运算
        1、变量参与运算，首先提升数据类型，再进行运算
            byte, short, char ---> int ---> long ---> float ---> double
        2、常量参与运算，先进行运算，再观察是否在目标范围内，若在则直接赋值

    强制数据类型转换：
        语句定义格式： 目标数据类型 变量名 = (目标数据类型)(要转换的值)
        强制转换可能会造成数据丢失

*/

public class DateTypeDemo2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        byte c = (byte) (a + b);
        System.out.println(c);

        long l = a + b;     // 默认转换
        System.out.println(l);

        byte d=3+4;
        System.out.println(d);

    }
}
