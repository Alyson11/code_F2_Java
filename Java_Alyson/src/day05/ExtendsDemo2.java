package day05;

/*
    继承：多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中，那么多个类无需再定义这些属性和行为，只要继承那个类即可。
    语句定义格式：class 子类 extends 父类{}

    使用继承的注意事项：
        1、类与类之间的继承关系中，只能单继承，不能多继承，但是可以多层继承
        2、子类无法继承父类中私有方法
 */

class GrandFather{
    public void fun1(){
        System.out.println("这里是祖父的fun1方法");
    }
    private void show(){
        System.out.println("这里是祖父私有的show方法");
    }
}

class Father extends GrandFather{}
class Son extends Father{}

public class ExtendsDemo2 {
    public static void main(String[] args) {
        // 创建一个Son对象
        Son s1=new Son();
        s1.fun1();
//        s1.show();      // 私有方法不可继承
    }
}
