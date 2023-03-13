package day05.homework;
/*
    2.请使用面向对象的思想，设计自定义类，描述出租车和家用轿车的信息。  设定
        1)出租车类:
        属性包括：车型，车牌，所属出租公司；方法包括：启动，停止
        2)家用轿车类：
        属性包括：车型，车牌，车主姓名；方法包括：启动，停止
        要求
        1)分析出租车和家用轿车的公共成员，提取出父类—汽车类
        2)利用继承机制，实现出租车类和家用轿车类
        3)编写测试类，分别测试汽车类，出租车类和家用轿车类对象的相关方法
        定义名为 car 的包存放汽车类，出租车类，家用轿车类和测试类
*/

class Car {      //父类
    // 定义私有属性
    private String vehicleType;     //车型
    private String licencePlate;        // 车牌

    // 通过公有的set、get方法实现对属性的访问
    public String getvehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    // 构造方法
    Car() {
        super();
    }

    Car(String vehicleType, String licencePlate) {
        super();
        this.licencePlate = licencePlate;
        this.vehicleType = vehicleType;
    }

    // 定义方法
    public void start() {        // 启动
        System.out.println("我是车，我启动");
    }

    public void stop() {     // 停止
        System.out.println("我是车，我停止");
    }
}

class Taxi extends Car {     //子类：出租车类
    // 定义私有属性
    private String rentalYard;  //出租公司

    public String getRentalYard() {
        return rentalYard;
    }

    public void setRentalYard(String rentalYard) {
        this.rentalYard = rentalYard;
    }

    Taxi() {
        super();
    }

    Taxi(String vehicleType, String licencePlate, String rentalYard) {
        super(vehicleType, licencePlate);
        this.rentalYard = rentalYard;
    }

    // 启动方法重写
    @Override
    public void start() {
        System.out.println("乘客您好\n我是" + rentalYard + "的,我的车牌是" + super.getLicencePlate());
    }

    // 停止方法重写
    @Override
    public void stop() {
        System.out.println("目的地已经到了,请您付费下车,欢迎再次乘坐");
    }

}

class FamilyCar extends Car {        //子类：家用轿车类
    // 定义私有属性
    private String ownerName;      //车主姓名

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    FamilyCar() {
        super();
    }

    FamilyCar(String vehicleType, String licencePlate, String ownerName) {
        super(vehicleType, licencePlate);
        this.ownerName = ownerName;
    }

    // 启动、停止方法重写
    public void start() {        // 启动
        System.out.println("我是" + ownerName + ",我的汽车我做主");
    }

    public void stop() {     // 停止
        System.out.println("目的地到了,我们去玩吧");
    }
}


public class TestCar {
    public static void main(String[] args) {
        // 创建父类对象
        Car c = new Car();
        c.start();
        c.stop();
        System.out.println("==========================================");
        // 创建子类对象
        Taxi t1 = new Taxi();
        t1.start();
        t1.stop();
        System.out.println("==========================================");
        FamilyCar f1 = new FamilyCar();
        f1.start();
        f1.stop();

    }
}
