package day04;
/*
    在一个java文件中可以写多个class类，将来编译的时候有多少个class类就会编译出多少个class文件，
    但是只能有一个类是被public所修饰,并且这个类是与java文件同名的类
 */
class Phone{
    // 定义成员变量
    String color;
    String brand;
    int price;
    // 定义成员方法
    public void call(){
        System.out.println("联系我吧");
    }
    public void sendMessage(String name){
        System.out.println("发送短信给"+ name);
    }
}
public class PhoneDemo {
    public static void main(String[] args) {
        // 创建一个对象
        Phone huaWei1 = new Phone();
        // 再创建一个对象，将第一个对象的值赋给第二个对象
        Phone huaWei2 = huaWei1;
        huaWei1.color = "暗夜紫";
        huaWei1.brand = "mate30";
        huaWei1.price = 4399;
        System.out.println(huaWei1.color);
        System.out.println(huaWei1.brand);
        System.out.println(huaWei1.price);

        huaWei1.call();
        huaWei1.sendMessage("Jackson");

        huaWei2.price = 8099;
        System.out.println(huaWei1.color);
        System.out.println(huaWei1.brand);
        System.out.println(huaWei1.price);

    }
}
