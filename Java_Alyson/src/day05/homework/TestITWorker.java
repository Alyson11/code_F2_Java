package day05.homework;

/*
    2.以面向对象的思想，编写自定义类描述 IT 从业者。
    设定属性包括：姓名，年龄， 技术方向，工作年限, 工作单位和职务； 方法包括：工作
        要求：
        1)设置属性的私有访问权限，通过公有的 get,set 方法实现对属性的访问
        2)限定 IT 从业人员必须年满 15 岁，无效信息需提示，并设置默认年龄为 15。
        3)限定“技术方向”是只读属性(只提供 get 方法)
        4)工作方法通过输入参数，接收工作单位和职务，输出个人工作信息
        编写测试类，测试 IT 从业者类的对象及相关方法（测试数据信息自定义）
*/
class Worker {
    // 设定属性
    private String name;
    private int age;
    private String tend;
    private int workAge;
    private String workPlace;
    private String position;

    // 构造方法
//    public Worker() {
//
//    }

    public Worker(String name, int age, String tend, int workAge) {
        this.name = name;
        this.setAge(age);
        this.tend = tend;
        this.workAge = workAge;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 15) {
            System.out.println("年龄信息无效!已修改默认年龄为15");
            this.age = 15;
        } else {
            this.age = age;
        }
    }

    public String getTend() {
        return tend;
    }

//    public void setTend(String tend) {
//        this.tend = tend;
//    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // 方法：工作
    public void work(String workPlace, String position) {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("技术方向：" + tend);
        System.out.println("工作年限：" + workAge);
        System.out.println("目前就职于：" + workPlace);
        System.out.println("职务是：" + position);

    }
}

public class TestITWorker {
    public static void main(String[] args) {
        // 创建对象并赋值
        Worker worker1 = new Worker("马未龙",35,"数据库维护",10);
        worker1.work("腾讯实业","数据库维护工程师");
        System.out.println("===========================================");
        Worker worker2 = new Worker("张凯",5,"Java开发",1);
        worker2.work("鼎盛科技","Java开发工程师");

    }
}
