package day06;

/*
    Person
    eat()
    SouthPerson
    eat()
    NorthPerson
    eat()

 */
class Person1 {
    public void eat() {
        System.out.println("吃饭");
    }
}

class SouthPerson extends Person1 {
    @Override
    public void eat() {
        System.out.println("南方人爱吃大米");
    }

    public void maJiang() {
        System.out.println("南方人喜欢搓麻将");
    }
}

class NorthPerson extends Person1 {
    @Override
    public void eat() {
        System.out.println("北方人爱吃面食");
    }

    public void cuoZao() {
        System.out.println("北方人喜欢搓澡");
    }
}

public class DuoTaiTest1 {
    public static void main(String[] args) {
        // 创建一个南方人对象
        Person1 southPerson = new SouthPerson();
        southPerson.eat();
        // 向下转型
        SouthPerson southPerson1 = (SouthPerson) southPerson;
        southPerson1.eat();
        southPerson1.maJiang();

        // 创建一个北方人对象
        Person1 northPerson = new NorthPerson();
        northPerson.eat();
        // 向下转型
        NorthPerson northPerson1 = (NorthPerson)northPerson;
        northPerson1.eat();
        northPerson1.cuoZao();
    }
}
