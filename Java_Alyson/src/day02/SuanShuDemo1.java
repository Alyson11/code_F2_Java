package day02;
/*
        表达式：使用常量或者变量作为操作数使用运算符连起来的且符合java语法规范的式子
        操作数：参数运算的常量或者变量
        运算符：将操作数连起来的符号

        算术运算符：+，-，*，/，%，++，--
 */

public class SuanShuDemo1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println((double)a / b);

        int a2 = 10;
        int b2 = 20;
        //单独使用  ++就是简单自加1，--就是自减1
//        a2++;
//        b2++;
//        a2--;
//        b2--;
//        ++a2;
//        ++b2;
//        --a2;
//        --b2;


        //混合使用
        //当++在变量的后面的时候，先做取值赋值操作，赋值之后再做自加1操作
        //当++在变量的前面的时候，做自加1操作，然后再将结果进行赋值
        int c=2;
        System.out.println(c++); // 2
        System.out.println(++c); // 4


    }
}
