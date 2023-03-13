package day04;
/*
    一个类的标准写法3.0版本
    成员变量：使用private关键字进行修饰
    构造方法：提供两个构造方法，一个是无参构造方法，一个带参数的构造方法
    成员方法：提供公共的setXxx()和getXxx()
    show():展示对象的成员变量值（后期我们学习常用类，会用另外一个方法替代该方法）
 */
class Student6{
    // 定义成员变量
    private String name;
    private int age;

    // 无参构造方法
    Student6(){

    }
    // 带参数构造方法
    Student6(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 定义成员方法
    public void setName(String name){ this.name = name;}
    public void setAge(int age){ this.age = age;}
    public String getName(){ return name;}
    public int getAge(){ return age;}

    public void show(){
        System.out.println(name + "的年龄是：" + age);
    }

}
public class StudentDemo6 {
    public static void main(String[] args) {
        // 创建一个对象使用构造方法对其赋值
        Student6 stu1 = new Student6("alyson", 18);
//        stu1.show();


        // 创建一个对象并用set方法对其进行赋值输出
        Student6 stu2 = new Student6();
        stu2.setName("Jackson");
        stu2.setAge(19);
        stu2.show();
    }
}
