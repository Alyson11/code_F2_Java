package day06;
/*
    多态的弊端：
        不能够访问子类特有的方法
 */

class Fu{
    public void fun1(){
        System.out.println("这里是父类fun1方法");
    }
}

class Zi extends Fu{
    @Override
    public void fun1() {
        System.out.println("这里是子类重写父类fun1方法");
    }
    public void fun2(){
        System.out.println("这里是子类特有fun2方法");
    }
}
public class DuoTaiDemo3 {
    public static void main(String[] args) {
        Fu a = new Zi();
        a.fun1();
//        a.fun2();
        // 向下转型
        Zi b = (Zi)a;
        b.fun2();
        b.fun1();

    }
}
