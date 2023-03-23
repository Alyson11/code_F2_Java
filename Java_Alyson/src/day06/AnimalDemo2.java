package day06;
class Animals1{
    public void eat(){
        System.out.println("吃");
    }
}
class Cat2 extends Animals1{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void zhuoLaoShu(){
        System.out.println("猫捉老鼠");
    }
}
class Dog2 extends Animals1{
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }
    public void lookDoor(){
        System.out.println("狗看门");
    }
}
public class AnimalDemo2 {
    public static void main(String[] args) {
        Animals1 cat2 = new Cat2();
        cat2.eat();
        // 向下转型
        Cat2 cat = (Cat2)cat2;
        cat.eat();
        cat.zhuoLaoShu();

        Animals1 dog = new Dog2();
        dog.eat();
        Dog2 dog2=(Dog2) dog;
        dog2.eat();
        dog2.lookDoor();

    }
}
