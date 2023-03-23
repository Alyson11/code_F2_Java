package day06;
/*
    多态的好处：
        1、提高了程序的维护性(由继承保证)
        2、提高了程序的扩展性(由多态保证)

    多态的弊端：
        1、类与类之间的耦合性太强
        2、不能访问子类特有功能

    我们今后的开发原则：低耦合，高内聚
 */
class Animals{
    String name;
    int age;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}

class Cat extends Animals{
    @Override
    public void eat() {
        System.out.println("🐱爱吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("🐱蜷着睡");
    }
}

class Dog extends Animals{
    @Override
    public void eat() {
        System.out.println("🐕啃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("🐕缩着睡");
    }
}

class Tiger extends Animals{
    @Override
    public void eat() {
        System.out.println("🐅吃肉");
    }

    @Override
    public void sleep() {
        System.out.println("🐅趴着睡");
    }
}

class Pig extends Animals{
    @Override
    public void eat() {
        System.out.println("🐖减肥");
    }

    @Override
    public void sleep() {
        System.out.println("猪躺着睡");
    }
}

class AnimalsTool{
    // 构造方法私有化
    private AnimalsTool(){}

//    public static void useCat(Cat Cat){
//        Cat.eat();
//        Cat.sleep();
//    }
//    public static void useDog(Dog Dog){
//        Dog.eat();
//        Dog.sleep();
//    }
//    public static void useTiger(Tiger Tiger){
//        Tiger.eat();
//        Tiger.sleep();
//    }

    public static void useAnimals(Animals Animals){     //Animals Animals = new Cat() 多态 编译看左，运行看右
        Animals.eat();
        Animals.sleep();
    }

}
public class DuoTaiDemo2 {
    public static void main(String[] args) {
        // 创建Cat对象1
        Cat c1 = new Cat();
//        c1.eat();
//        c1.sleep();
//        useCat(c1);
//        AnimalsTool.useCat(c1);
        AnimalsTool.useAnimals(c1);
        // 创建Cat对象2
        Cat c2 = new Cat();
//        c2.eat();
//        c2.sleep();
//        useCat(c2);
//        AnimalsTool.useCat(c2);
        AnimalsTool.useAnimals(c2);

        // 创建Dog对象
        Dog d1 = new Dog();
//        d1.eat();
//        d1.sleep();
//        useDog(d1);
//        AnimalsTool.useDog(d1);
        AnimalsTool.useAnimals(d1);
        // 创建Tiger对象
        Tiger t1 = new Tiger();
//        t1.eat();
//        t1.sleep();
//        useTiger(t1);
//        AnimalsTool.useTiger(t1);
        AnimalsTool.useAnimals(t1);

        // 创建一个🐖对象
        Pig p = new Pig();
        AnimalsTool.useAnimals(p);
    }

    // 封装对方法的调用
//    public static void useCat(Cat Cat){
//        Cat.eat();
//        Cat.sleep();
//    }
//    public static void useDog(Dog Dog){
//        Dog.eat();
//        Dog.sleep();
//    }
//    public static void useTiger(Tiger Tiger){
//        Tiger.eat();
//        Tiger.sleep();
//    }
}
