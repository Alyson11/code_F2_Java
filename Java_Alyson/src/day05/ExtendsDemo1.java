package day05;

/*
    定义一个教师类：Teacher
        今后我们还需要定义医生，警察，学生等类，都拥有相同的属性和行为
        我们可以将相同的属性和行为提取出来，提取到一个新的类中，然后让这些与新的产生一个关系，这些类就拥有了相同的属性和行为
        这个关系，java提供了一个关键字给我们使用：extends 继承
*/

class Person2{
    String name;
    int age;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
// Teacher看作是子类，或者派生类
// Person2看作是父类，或者超类，基类
class Teacher extends Person2{
    public void teach(){
        System.out.println("教学");
    }
}
//public class ExendsDemo1 {
//    public static void main(String[] args) {
        // 创建一个Teacher对象
//        Teacher t1=new Teacher();
//        // 调用父类中的方法
//        t1.eat();
//        // 调用自己的方法
//        t1.sleep();
//        t1.teach();

//    }
//}
