package day04;

/*
            我们按照正常的做法创建对象为对象成员变量进行赋值，但是呢，我们却可以赋值一些不合理的值
            如果我们可以在赋值之前判断一下是否合理就好了。但是判断语句肯定不是一条语句，而是一段代码。
            我们可以自己提供一个方法对成员变量age进行赋值，在方法中可以写我们的判断逻辑，将来我们给age赋值的时候，就可以调用该方法对年龄进行赋值
            虽然我们提供了公共的方法对年龄进行赋值，但是呢谁规定了提供了方法就一定要使用呢？所以问题还是没有得到解决。
            目的：就必须只能使用提供的方法对成员变量进行赋值
            java提供了一个关键字给我们使用：private私有的
            private关键字可以修饰成员变量，成员方法，构造方法
            被private修饰的成员只能在当前类中被访问
            其实说到现在，就传输一个思想：面向对象的三大特称之一：封装的思想
*/
class Student3 {
    // 定义成员变量
    String name;
    private int age;

    // 定义成员方法
    public void setAge(int a) {
        if (a < 0 | a > 120) {
            System.out.println("年龄输入不正确");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }
}

public class StudentDemo3 {
    public static void main(String[] args) {
        // 创建一个学生对象并对其成员变量进行赋值输出
        Student3 stu1 = new Student3();
        stu1.name="Jackson";
        stu1.setAge(12);
        System.out.println(stu1.name+"的年龄是："+stu1.getAge());
    }
}
