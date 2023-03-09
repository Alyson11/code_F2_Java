package day02;

import java.util.Scanner;
/*
    键盘录入三个数据，获取这三个数据中的最大值
*/

public class ScannerDemo2 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        int res1 = (num1 > num2) ? num1 : num2;
        System.out.println("请输入第三个数字：");
        int num3 = sc.nextInt();
        int res2 = (res1 > num3) ? res1 : num3;
        System.out.println(res2);

    }
}
