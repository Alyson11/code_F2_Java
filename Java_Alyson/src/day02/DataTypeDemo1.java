package day02;

/*
1PB = 1024TB
1TB = 1024GB
1GB = 1024MB
1MB = 1024KB
1KB = 1024byte
1byte = 8bit

    数据类型：
        1、基本数据类型 8种
        整数型
        byte, short, int, long
        浮点型
        float, double
        布尔型
        boolean
        字符类型
        char

    注意事项：
        1、整数默认int类型
        2、定义一个long类型的数据，值的末尾加L(l)
        3、小数默认是double类型
        4、定义一个float类型的数据，值的末尾加F(f)
        5、在同一个大括号中，不能定义重复的变量名
        6、大小写不同的变量是不同的变量
        7、变量未初始化不能使用，使用前需赋值
        8、一个分号代表一个语句结束
*/

public class DataTypeDemo1 {
    public static void main(String[] args) {
        byte b1 = 10;
        System.out.println(b1);
        short s1 = 200;
        System.out.println(s1);
        int i1 = 1000;
        System.out.println(i1);
        long l1 = 10000000000000L;
        System.out.println(l1);

        float f1 = 12.23F;
        System.out.println(f1);
        double d1 = 1234.56;
        System.out.println(d1);

        boolean b2 = true;
        System.out.println(b2);

        char c1 = 'a';
        System.out.println(c1);

        int i2;
        i2 = 2332;
        System.out.println(i2);

//        int a = 1, b = 2, c = 3; 不推荐一行定义多个变量 建议一行定义一个变量
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
