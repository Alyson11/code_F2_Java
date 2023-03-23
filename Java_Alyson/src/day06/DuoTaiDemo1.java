package day06;
/*
    多态：多种状态，某一种事物在不同时刻所表现的状态
    水-->汽态，液态，固态
    如何去用java去描述不同的状态呢？
    需要满足的三个条件：
        1、要有继承关系
        2、要有方法的重写
        3、要有父类的引用指向子类的对象

 */

class Person{
    String name;
    int age;

    public void Study(){
        System.out.println("学习");
    }

}

class Student extends Person{
    @Override
    public void Study() {
        System.out.println("学生最爱学习");
    }
}
public class DuoTaiDemo1 {
    public static void main(String[] args) {
        Person p = new Student();       // 类与类之间的 多态 表现
        p.Study();
    }
}
