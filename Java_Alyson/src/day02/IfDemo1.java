package day02;
import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
//        创建键盘录入对象
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = sc.next();
        if ("Jackson".equals(name)){
            System.out.println("hello," + name);
        }else {
            System.out.println("Sorry");
        }

        //需求：
        //60>score>=0 不及格
        //80>score>=60  良好
        //100>=score>=80  优秀
        System.out.println("请输入你的分数：");
        int score = sc.nextInt();
        if (score >= 0 & score < 60) {
            System.out.println("不及格");
        } else if (score >= 60 & score <80) {
            System.out.println("良好");
        } else if (score >=80 & score <= 100) {
            System.out.println("优秀");
        }else {
            System.out.println("输入有误！");
        }


    }
}
