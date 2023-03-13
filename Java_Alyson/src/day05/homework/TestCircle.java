package day05.homework;

/*
1.编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，计算并分别显示  圆半径、圆面积、圆周长，圆柱体的体积。（7 分）
   提示:（1）编写一个圆类 Circle，该类拥有：
        1)一个成员变量，radius（私有，浮点型）;//存放圆的半径；
        2)两个构造方法
        Circle（）	//将半径设为 0
        Circle（double	r  ）	//创建 Circle 对象时将半径初始化为 r
        3)三个成员方法
        double getArea（）	//获取圆的面积double
        getPerimeter（）		//获取圆的周长
        void show（）	//将圆的关径、周长、面积输出到屏幕

       （2）编写一个圆柱体类 Cylinder，它继承于上面的 Circle 类。还拥有：
        // 1)一个成员变量，double hight	（私有，浮点型）;	//圆柱体的高；
        //2)构造方法
        //创建 Cylinder 对象时将半径初始化为 r,高度初始化为 h Cylinder（double r,double h）
        3)成员方法
        double getVolume（）	//获取圆柱体的体积
        void showVolume（）	//将圆柱体的体积输出到屏幕
*/

import javafx.scene.shape.Cylinder;

class Circle {
    //一个成员变量，radius（私有，浮点型）;//存放圆的半径
    private double radius;

    // //将半径设为 0
    Circle() {
        this.radius = 0;
    }

    //创建 Circle 对象时将半径初始化为 r
    Circle(double r) {
        this.radius = r;
    }

    //3)三个成员方法
    public double getArea() {    //获取圆的面积double
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {       //获取圆的周长
        return Math.PI * this.radius * 2;
    }

    public void show() {        //将圆的半径、周长、面积输出到屏幕
        System.out.println("圆的半径:" + this.radius);
        System.out.println("圆的周长:" + this.getPerimeter());
        System.out.println("圆的面积:" + this.getArea());
    }
}

class Cylinder1 extends Circle {
    // 1)一个成员变量，double hight	（私有，浮点型）;	//圆柱体的高；
    private double hight;

    //2)构造方法
    //创建 Cylinder 对象时将半径初始化为 r,高度初始化为 h Cylinder（double r,double h）
    Cylinder1(double r, double h) {
        super(r);
        this.hight = h;
    }

    // 3)成员方法
    public double getVolume() {     //获取圆柱体的体积
        double ares = super.getArea();
        return ares * hight;
    }

    public void showVolume() {       //将圆柱体的体积输出到屏幕
        super.show();
        System.out.println("圆柱体的体积为：" + this.getVolume());
    }
}


public class TestCircle {
    public static void main(String[] args) {
        Cylinder1 c1 = new Cylinder1(2, 3);
        c1.showVolume();
//        Circle c2 = new Circle(5);
//        c2.show();


    }
}
