package day01;

/*
java针对整数常量提供了4种表现形式：
        二进制  由 0，1组成  逢2进1  以0b开头    0b11001010
        八进制  由 0，1，2，3，4，5，6，7组成  逢8进1  以0开头
        十进制  由 0，1，2，3，4，5，6，7，8，9组成  逢10进1  java种整数默认写出来的表现形式就是10进制  100
        十六进制  由0，1，2，3，4，5，6，7，8，9，a，b,c,d,e,f组成  逢16进1  以0x开头

求：-7+2
        计算机中不仅可以表示正的整数还可以用二进制表示负的整数，计算机中所有的整数运算都是采用二进制补码的形式，控制台看到的结果是原码转成10进制后的结果
        符号位              数值位
        7：    0                0000111
        -7：   1                0000111

        符号位              数值位
        原码： 1                0000111
        反码：正数的反码与原码一致，负数反码符号位不变，数值位按位取反
        1                1111000
        补码：正数的补码和原码一样，负数的补码在反码的基础之上末位+1
        1                1111001

        -7的补码：11111001
        2的补码： 00000010
        ------------------
        补码：   1      1111011
        反码：   1      1111010
        原码：   1      0000101  --->将数值位转10进制：-5
*/

public class ConstantDemo2 {
    public static void main(String[] args) {
        System.out.println(0b100);
        System.out.println(0100);
        System.out.println(100);
        System.out.println(0x100);
    }
}
