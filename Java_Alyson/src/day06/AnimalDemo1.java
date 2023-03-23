package day06;
/*
    多态访问成员特点：
        1、访问成员方法：编译看左，运行看右
        2、访问成员变量：编译看左，运行看左
        3、访问静态成员方法：编译看左，运行看左
 */

class Animal {
    int num = 10;
    String name;
    int age;

    public void eat() {
        System.out.println("吃");
    }

    public void sleep() {
        System.out.println("睡");
    }

    public static void fun1() {
        System.out.println("这里是父类fun1方法");
    }
}

class Cat1 extends Animal {
    int num = 100;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("🐱蜷着睡");
    }

    public void zhuoLaoShu() {
        System.out.println("🐱捉🐀");
    }

    public static void fun1() {
        System.out.println("这里是子类fun1方法");
    }
}

public class AnimalDemo1 {
    public static void main(String[] args) {
        Animal c = new Cat1();
        c.eat();        // 访问成员方法：编译看左，运行看右
        System.out.println(c.num);      // 10   访问成员变量：编译看左，运行看左
        c.fun1();    // 访问静态成员方法 编译运行均看左
    }
}
