package day04;
/*
    学生：
        属性：学号，姓名，年龄
        行为：学习，吃饭，打游戏

    Student:
        成员变量: id,name,age
        成员方法: study(),eat(),playGame(String n)

    如何定义一个成员变量：在类中方法外定义，必须有数据类型，可以不给值
    如何定义成员方法：现在将static去掉定义。

    定义一个类的1.0版本
 */

public class Student {
    // 成员变量
    String id; // null
    String name; // null
    int age; // 0

    // 成员方法
    public void Study() {
        System.out.println("沉迷学习");
    }

    public void eat() {
        System.out.println("吃饭不积极，思想有问题。");
    }

    public void playGame(String n) {
        System.out.println("学生会打游戏:" + n);
    }
}
