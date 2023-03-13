package day05.homework;
/*
1.使用面向对象的思想，编写自定义描述狗的信息。
        设定属性包括：品种，年龄，心情，名字；
        方法包括：叫，跑。
        要求：
        1)设置属性的私有访问权限，通过公有的 get,set 方法实现对属性的访问
        2)限定心情只能有“心情好”和“心情不好”两种情况，如果无效输入进行提示，  默认设置“心情好”。
        3)设置构造函数实现对属性赋值
        4)叫和跑的方法，需要根据心情好坏，描述不同的行为方式。
        编写测试类，测试狗类的对象及相关方法（测试数据信息自定义）
*/

class Dog{
    // 设定属性
    private String strain;
    private int age;
    private String mood;
    private String name;

    //无参构造方法
    Dog(){
        super();
    }
    // 带参构造方法
    Dog(String strain, int age, String mood, String name){
        super();
        this.strain = strain;
        this.age = age;
        this.setMood(mood);
        this.name = name;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        if ("心情好".equals(mood) || "心情不好".equals(mood)) {
            this.mood = mood;
        } else {
            System.out.println("输入信息有误，这只狗狗今天心情很好");
            this.mood = "心情好";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 设定方法
    // 跑
    public void run() {
        if ("心情好".equals(mood)) {
            System.out.println("名字叫" + name + "的" + strain + mood + "，开心的围着主人身边转");
        } else {
            System.out.println("名字叫" + name + "的" + strain + mood + "，伤心的一动不动");
        }
    }

    // 叫
    public void bark() {
        if ("心情好".equals(mood)) {
            System.out.println("名字叫" + name + "的" + strain + mood + "，开心的汪汪叫");
        } else {
            System.out.println("名字叫" + name + "的" + strain + mood + "，伤心的呜呜叫");
        }
    }
}

public class TestDog {
    public static void main(String[] args) {
        // 创建对象
        Dog d1 = new Dog("贵宾犬", 3, "心情未知", "甜心");
        Dog d2 = new Dog("德国牧羊犬",2,"心情不好","太子");

        d1.run();
        d1.bark();
        System.out.println("=========================================");
        d2.run();
        d2.bark();

    }
}
