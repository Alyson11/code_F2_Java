package day06;
/*
    Abstract : 抽象  修饰类，修饰成员方法

    abstract关键字的用法：
        1、修饰类，类变成了抽象类
        2、修饰方法，方法变成了抽象方法，没有具体的实现，没有方法体，连大括号都没有

    使用注意事项：
        1、当类被abstract关键字修饰的时候，该类无法创建对象
            既然不能创建对象，有构造方法意义是什么？这里构造方法是为了初始化父类的提供作用的
        2、抽象类中既可以存在具体实现的方法，也可以存在抽象方法
        3、当一个类中存在抽象方法的时候，这个类一定是抽象类
        4、当一个具体的类继承抽象类的时候，必须要重写抽象类所有抽象方法
        5、当抽象类继承抽象类的时候，可以不去实现抽象方法
        6、抽象类中既可以存在变量也可以存在常量

 */

abstract class Animals4 {
    int a = 10;
    final int b = 20;
    public abstract void eat();
    public abstract void sleep();

}
abstract class Demo extends Animals4{}

class Cat4 extends Animals4{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("🐱蜷着睡");
    }
}


public class AbstractDemo1 {
    public static void main(String[] args) {
        Animals4 a = new Cat4();    //  抽象多态
        a.eat();
        a.sleep();
    }
}
