package day13.sellticket_test3;
/*
    synchronized关键字的使用：
        1、同步代码块
            synchronized(多个线程对象共享且唯一的对象){
                操作着共享变量的代码块
            }

            这里的对象是什么呢？我们先随便创建一个对象试一试,如果单纯地使用同步代码块将操作共享数据的代码包起来的行为，
            锁对象只需要保证多个线程对象中唯一的那个对象就可以了。
        2、同步方法
            将synchronized加在方法的定义上
            1）普通的同步方法
                锁对象是this
            2）静态的同步方法
                锁对象是当前线程类的Class文件对象
 */

public class WicketRunnable implements Runnable {
    private static int ticket = 100;
    private Object obj = new Object();
    private int i = 1;

    @Override
    public void run() {
        while (true) {
            if (i % 2 == 0) {
                synchronized (WicketRunnable.class) {
                    if (ticket > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("当前" + Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
                    }

                }
            } else {
                sellTickets();
            }
            i++;
        }
    }

    public static void sellTickets() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前" + Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
        }
    }
}
