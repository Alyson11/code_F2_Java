package day06;
/*
    接口：表示一个类的扩展功能，将来哪些类需要实现该功能，实现该接口即可

    java提供了一个关键字：interface表示接口的意思
    可以将接口看作是一个特殊的类
 */
//需求：马戏团的猫会跳高
abstract class Animals5{
    public abstract void eat();
}
class Cat5 extends Animals5{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
interface Jump{
    public abstract void jumping();
}
class JumpCat extends Animals5 implements Jump{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jumping() {
        System.out.println("猫跳高");
    }
}
public class InterfaceDemo1 {
}
