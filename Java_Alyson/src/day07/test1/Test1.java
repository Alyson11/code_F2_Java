package day07.test1;

import java.util.Scanner;

/*
    1.  编写程序实现比萨制作。需求说明编写程序，接收用户输入的信息，选择需要制作 的比萨。可供选择的比萨有：培根比萨和海鲜比萨。
        实现思路及关键代码
        1)     分析培根比萨和海鲜比萨
        2)     定义比萨类
        3)     属性：名称、价格、大小
        4)     方法：展示
        5)     定义培根比萨和海鲜比萨继承自比萨类
        6)     定义测试类，根据输入信息产生具体的比萨对象
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择想要制作的披萨（1.培根披萨 2.海鲜披萨）：");
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("请输入培根克数：");
                int baconGram = sc.nextInt();
                System.out.println("请输入披萨大小：");
                int pizzaSize = sc.nextInt();
                System.out.println("请输入披萨价格：");
                int pizzaPrice = sc.nextInt();

                BaconPizza p1 = new BaconPizza("培根披萨", pizzaPrice, pizzaSize, baconGram);
                p1.show();
                break;
            } else if (num == 2) {
                System.out.println("请输入配料信息：");
                String info = sc.next();
                System.out.println("请输入披萨大小：");
                int pizzaSize = sc.nextInt();
                System.out.println("请输入披萨价格：");
                int pizzaPrice = sc.nextInt();

                SeafoodPizza p2 = new SeafoodPizza("海鲜披萨", pizzaPrice, pizzaSize, info);
                p2.show();
                break;

            } else {
                System.out.println("输入不正确！请重新选择");
            }

        }

    }
}
