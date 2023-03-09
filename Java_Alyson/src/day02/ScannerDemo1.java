package day02;

import java.util.Scanner;
/*
    需求：从键盘中输入两个数据，求和

    键盘录入的方式：今天只需要记住使用方式即可，可以不去理解为什么。
    1、导包
    2、创建键盘录入对象（用钱买了一支实实在在可以写字的笔）
    3、调用方法接收键盘输入的整数（用买的一支笔写了一个数字）

 */

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);

        System.out.println("请输入你的姓名：");
        String s = sc.next();
        System.out.println(s+"你好！");
    }
}
