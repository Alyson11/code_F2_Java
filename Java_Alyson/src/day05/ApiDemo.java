package day05;

import java.util.Scanner;
/*
    如何使用API
    1、看包：只要不在java.lang包下的类，今后使用的时候都需要进行导包
 */

public class ApiDemo {
    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//        System.out.println(Math.PI);
        // 求绝对值
//        System.out.println(Math.abs(-2));

        // 返回的是一个double类型的值
        // public static double random()
        // 0-1 之间的随机数
//        System.out.println(Math.random());
        //需求：使用Math类随机获取1-100之间的整数(需要转换数据类型)
        // [0,1)  ---> 乘100 [0,100) ---> 加1 [1,101)
//        int num = (int)(Math.random() * 100 + 1);
//        System.out.println(num);

        //需求：猜数字小游戏
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 随机生成一个数字
        int num0 = (int) (Math.random() * 100 + 1);
//        boolean flag = true;
        while (true){
            System.out.println("请输入一个0-100之间的整数：");
            int num1 = sc.nextInt();
            if (num1 > num0) {
                System.out.println("猜的数字偏大，请继续：");
            } else if (num1 < num0) {
                System.out.println("猜的数字偏小，请继续：");
            } else {
                System.out.println("恭喜您，猜中了，数字是：" + num0);
                break;
            }
        }

    }
}
