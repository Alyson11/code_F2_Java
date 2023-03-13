package day03;

import java.util.Scanner;
/*
        方法：
            语句定义格式：
            修饰符 返回值类型 方法名(数据类型1 参数名1,数据类型2 参数名2){
            方法体;
            return 返回值;
            }

            修饰符：今天不细说，目前只需要记住固定格式：public static
        返回值类型：调用完方法返回给调用者的数据的类型
                方法名：只要符合标识符的命名规则即可
                参数：
                实参：实际调用方法时传入的值
                形参：定义方法时规定的名字，用于接收实际参数的值
                方法体：实际方法功能的逻辑代码
                return: 结束整个方法，也可以返回一个值给调用者
                返回值：return要返回的具体的值， 要和返回值类型对应上


                方法使用的注意事项：
                1、方法和方法是一个平级关系，不能嵌套定义
                2、方法不调用不执行
                3、如果一个方法有返回值，需要使用一个变量进行接收方法的结果值或者直接使用
*/

public class FunctionDemo1 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 键盘输入两个数，求和
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();



    }
}
