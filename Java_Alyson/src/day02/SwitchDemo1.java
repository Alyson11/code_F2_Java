package day02;

import java.util.Scanner;

/*
    switch语句
        语句定义格式:
        switch(表达式){    // 这里的值可以是byte, short, int, char, 枚举, String
            case 值1:语句体1;
                   break;
            case 值2:语句体2;
                   break;
            case 值3:语句体3;
                   break;
            ...
            default: 语句体n;
                     break;
        }

    执行流程：先计算表达式的值，然后匹配对应的case，若匹配到则执行对应case中的语句体，若未匹配到，则执行default中的语句体
    按顺序执行语句，直到遇到break停止

    注意：case后面必须是一个常量值
*/

public class SwitchDemo1 {
    public static void main(String[] args) {
//        创建键盘录入对象
        Scanner sc = new Scanner(System.in);

//        购买饮料案例
        //    可乐 3，哇哈哈 4，红牛 5，椰子汁 6
        System.out.println("请输入你带的金额：");
        int money = sc.nextInt();
        switch(money){
            case 3:
                System.out.println("建议你购买可乐");
                break;
            case 4:
                System.out.println("建议你购买哇哈哈");
                break;
            case 5:
                System.out.println("建议你购买红牛");
                break;
            case 6:
                System.out.println("建议你购买椰子汁");
                break;
            default:
                System.out.println("不建议你购买饮料");
        }

    }
}
