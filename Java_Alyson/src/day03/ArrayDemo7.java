package day03;

import java.util.Scanner;
//    数组查表法(根据键盘录入索引,查找对应星期（作业）)

public class ArrayDemo7 {
    public static void main(String[] args) {
        // 录入键盘输入对象
        Scanner sc = new Scanner(System.in);
        // 定义一个字符串类型的数组
        String[] arr = {"周一", "周二", "周三", "周四", "周五", "周六", "周日"};
        boolean flag = true;

        while (flag) {
            System.out.println("请输入1-7之间的任意一个数字：");
            int num = sc.nextInt();
            if (num >= 1 & num <= 7) {
                System.out.println(arr[num - 1]);
                flag = false;
            } else {
                System.out.println("输入有误，请重新输入！");
            }

        }
    }
}
