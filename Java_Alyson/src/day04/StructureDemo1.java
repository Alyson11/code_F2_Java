package day04;
/*
    构造方法：在创建对象的时候会被调用
    语句定义格式：
        修饰符 类名(..){
            ...
        }
    注意：构造方法没有返回值，连void都不能有

    问题：我们之前的案例并没有写过构造方法，那么我们之前的构造方法从哪里来的呢？
    使用注意事项：
        1、如果我们自己不提供构造方法，那么系统在编译的时候会提供一个默认的无参无方法体的构造方法给我们使用
        2、如果我们提供了构造方法，无论是不是有参或者有方法体，只要我们自己写了构造方法，系统就永远不会提供了
        3、构造方法可以发生重载

     构造方法的用处？
        1、创建对象
        2、可以对对象的成员变量进行赋值


     对象的成员变量赋值：
        1、可以使用setXxx()进行赋值
        2、可以在创建的使用调用带参数的构造方法进行赋值

     单独使用永远要比组合使用的灵活度更高

 */
class Teacher{
    // 定义成员变量
    private String name;
    private int age;

    // 构造方法
    public Teacher(){
        System.out.println("你好，这里是不带参数的构造方法");
    }
    public Teacher(String n){
        System.out.println(n);
    }
    public Teacher(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 定义成员方法
    public void setName(String name){ this.name = name;}
    public void setAge(int age){ this.age = age;}
    public String getName(){ return name;}
    public int getAge(){return age;}
    public void show(){
        System.out.println(name + "的年龄是："+ age);
    }
}
public class StructureDemo1 {
    public static void main(String[] args) {
        // 调用带参数的构造方法
        Teacher t1 = new Teacher("易烊千玺");

        // 调用带参数的构造方法并对其赋值输出
        Teacher t2=new Teacher("Alyson", 3);
        t2.show();
    }
}
