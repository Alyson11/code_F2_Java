package day04;

class Students2 {
    public void eat(){
        System.out.println("最爱干饭！");
    }
}

class StudentDemo {
    // 若一个类作为引用数据类型被当作形式参数时，意味着需要传入该类的对象
    public void fun1(Students2 s){ s.eat();}
}

public class CanShuDemo1 {
    public static void main(String[] args) {
        // 创建StudentDemo对象
//        StudentDemo s = new StudentDemo();
        // 数据类型 变量名 = 值
//        Student2 Student2 = new Students2();
        // 通过对象调用方法
        new StudentDemo().fun1(new Students2());
    }
}
