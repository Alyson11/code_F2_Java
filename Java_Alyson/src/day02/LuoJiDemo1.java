package day02;
/*
    逻辑运算符：逻辑运算符两边操作数是boolean类型的
        & | ! ^

        && :短路与,左边只要为false，右边就不作计算，结果为false
        || :短路或,左边只要为true，右边就不作计算，结果为true
 */

public class LuoJiDemo1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(a++);
        System.out.println(a);
//        & 有false则false
        System.out.println((a++==4)&(b++==5)); // false & false = false
        System.out.println((a++==4)&(b++==4)); // false  & true = false
        System.out.println((a++==3)&(b++==5)); // true & false = false
        System.out.println((a++==3)&(b++==4)); // true & true = true
//|     有true则true
        //! 取反，将true变成false,将false变成true
        //^ 相同则false,不同则true

        // &&
        System.out.println((a++==5)&&(b++==6));


    }
}
