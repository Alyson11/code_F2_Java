package day02;

/*
    循环结构：
        1、for循环
        2、while循环

     for循环的语句定义格式：
        for(初始化条件语句;判断条件语句;控制条件语句){
            循环体语句;
        }

*/

public class ForDemo1 {
    public static void main(String[] args) {
//        需求：在控制台中打印10行HelloWorld
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloWorld!");
        }
    }
}
