package day13.sellticket_test2;
/*
    某电影院目前正在上映贺岁大片，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
    实现Runnable接口的方式

    问题1：我们按照第一种实现线程的方式实现，发现，第100张票三个窗口都进行售卖了。
        原因是因为每个窗口线程对象是单独创建的，我们将100张票的创建写在了run方法中，而实际上应该是三个窗口共享的。

    为了模拟更加真实的情况，我们加入判断和休眠
    问题2：当我们加入了休眠判断后，出现了售卖重复的票，第0张票，第-1张票的情况。
        原因：
            出现了售卖重复的票：CPU小小的时间片就会运行很多次
            第0张票，第-1张票的情况：线程的执行具有随机性和原子性。
        线程安全的问题：同时满足以下三种情况
            1）一个程序是否存在多线程环境？是
            2）是否存在共享数据/共享变量？是
            3）是否有多条语句操作着共享变量？是
        解决方案：如何解决线程安全的问题：
            1、synchronized关键字
            2、Lock锁
 */
public class Test2 {
    public static void main(String[] args) {
        // 1、创建Runnable接口实现类对象
        WicketRunnable wicketRunnable = new WicketRunnable();

        // 2、借助Thread类创建三个售票窗口对象
        Thread w1 = new Thread(wicketRunnable, "窗口1");
        Thread w2 = new Thread(wicketRunnable, "窗口2");
        Thread w3 = new Thread(wicketRunnable, "窗口3");

        //3、启动线程
        w1.start();
        w2.start();
        w3.start();

    }
}
