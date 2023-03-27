package day13.sellticket_test1;
/*
    某电影院目前正在上映贺岁大片，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
    继承Thread类

    问题1：我们按照第一种实现线程的方式实现，发现，第100张票三个窗口都进行售卖了。
        原因是因为每个窗口线程对象是单独创建的，我们将100张票的创建写在了run方法中，而实际上应该是三个窗口共享的。

    为了模拟更加真实的情况，我们加入判断和休眠

 */

public class Test1 {
    public static void main(String[] args) {
        //创建三个窗口线程对象
        Wicket w1 = new Wicket();
        Wicket w2 = new Wicket();
        Wicket w3 = new Wicket();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
