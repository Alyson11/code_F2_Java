package day04;
/*
    给变量起名字，首先要遵循标识符的命名规则，其次要做到见名知意
    变量的调用遵循就近原则。
    我们一旦做到了见名知意，就出现了赋值不了的现象，原因是因为变量的调用遵循就近原则。
    我们的本意是将传进来值赋值给成员变量，成员变量属于当前调用该方法的对象
    java提供了一个关键字：this
    this在一个类中代表的是当前调用该方法的对象
    this可以调用成员变量，成员方法，构造方法（后面说）
 */
class Student5{
    private String name;
    private int age;
    public void setName(String name){ this.name=name;}
    public void setAge(int age){ this.age = age;}
    public String getName(){ return name;}
    public int getAge(){ return age;}

}
public class StudentDemo5 {
    public static void main(String[] args) {
        // 创建一个对象并对其进行赋值输出
        Student5 stu= new Student5();
        stu.setName("Jackson");
        stu.setAge(19);
        System.out.println(stu.getName() + "的年龄是：" + stu.getAge());
    }
}
