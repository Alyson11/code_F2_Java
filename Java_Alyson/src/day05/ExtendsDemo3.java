package day05;
/*
    继承的特点：
        1、要想初始化子类，必须先初始化父类
        2、子类方法中访问成员的顺序：首先会先在本方法中找，再去本类中去找，最后去父类中找
        3、java提供了一个类似于this一样的关键字，只不过是指代父类的引用，这个关键字叫做：super
        super可以在子类访问直接父类中的成员，可以访问直接父类中的非私有的成员变量，构造方法，成员方法
        4、子类的构造方法的第一行话默认会有一个super()
            问题：如果说父类中不提供无参构造方法咋办？
            我们子类中要使用父类的构造方法的目的不就是为了初始化父类的吗，只不过系统默认的调用是父类中无参构造方法
            但实际上只要调用了父类构造方法，就完成了父类初始化的目的。
            于是，我们可以在子类的构造方法中使用父类的其他构造方法就ok了。借助super关键字
 */

class Person {
    int a = 1;

    Person() {
        System.out.println("这里是父类无参构造方法");
    }

    Person(String s) {
        System.out.println("这里是父类带参构造方法" + s);
    }

    public void show() {
        System.out.println("这里是父类非私有方法");
    }
}

class Student extends Person {
    Student() {
        super("hello");
    }
    Student(String s){
        super(s);
    }

    public void fun1(){
        int a = 10;
        System.out.println(a);
        System.out.println(super.a);
        super.show();
    }
}

public class ExtendsDemo3 {
    public static void main(String[] args) {
        Student s=new Student();
        s.fun1();

    }
}
