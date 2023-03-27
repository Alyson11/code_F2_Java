package day10;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
/*
    键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台
 */

public class TreeSetTest1 {
    public static void main(String[] args) {
        //1、创建集合对象
        TreeSet<Student2> set = new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                //主要条件：按照总分从高到低输出到控制台
                int i = o2.getSumScore()-o1.getSumScore();
                //总分一样，语文成绩不一定一样
                int i2 = (i==0)?(o2.getChinese()-o1.getChinese()):i;
                //总分一样，语文成绩一样，数学成绩不一定一样
                int i3 = (i2==0)?(o2.getMath()-o1.getMath()):i2;
                //各科成绩一样，姓名不一定一样
                int i4 = (i3==0)?(o2.getName().compareTo(o1.getName())):i3;
                return i4;
            }
        });

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);


        //2、创建学生对象
        Student2 student2 = null;

        System.out.println("欢迎使用学生信息录入系统！！");
        System.out.println("开始录入！");
        for (int i = 1; i <= 5; i++) {
            System.out.println("======================请输入第"+i+"个学生的信息======================");
            System.out.print("请输入学生的姓名：");
            String name = sc.next();
            System.out.print("请输入"+name+"的语文成绩：");
            int chinese = sc.nextInt();
            System.out.print("请输入"+name+"的数学成绩：");
            int math = sc.nextInt();
            System.out.print("请输入"+name+"的英语成绩：");
            int english = sc.nextInt();

            student2 = new Student2(name,chinese,math,english);
            //将学生对象添加到集合中
            set.add(student2);
            System.out.println("学生："+name+"信息录入完毕！");
        }

        System.out.println("==========================学生信息总览====================================");
        for (Student2 student : set) {
            System.out.println("姓名："+student.getName()+", 语文成绩："+student.getChinese()
                    +", 数学成绩："+student.getMath()+", 英语成绩："+student.getEnglish()
                    +", 总分："+student.getSumScore());
        }


    }
}
