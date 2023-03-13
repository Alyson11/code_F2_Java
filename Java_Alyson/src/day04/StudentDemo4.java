package day04;
/*
    一个标准类的2.0版本写法，加入private关键字,对成员变量分别提供公共的getXxx()和setXxx()

    private关键字可以修饰成员变量，成员方法，构造方法（后面说）
 */

class Student4{
    private String name;
    private int age;

    public void setName(String n){name = n;}
    public void setAge(int a){age=a;}
    public String getName(){return name;}
    public int getAge(){return age;}

    private void fun1(){
        System.out.println("阿智最好看");
    }
    public void fun2(){fun1();}
}
public class StudentDemo4 {
    public static void main(String[] args) {
        // 创建一个对象并对其成员变量进行赋值输出
        Student4 stu1 = new Student4();
        stu1.setName("Jackson");
        stu1.setAge(18);
        System.out.println(stu1.getName()+"的年龄是："+stu1.getAge());

//        stu1.fun1(); //private修饰的在此处不可用，可另写一个方法（fun2() 包含fun1())的方法进行调用
        stu1.fun2();
    }
}
