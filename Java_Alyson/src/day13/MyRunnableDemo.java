package day13;
/*
    多线程的第二种实现方案：实现Runnable接口，实现run方法
 */

public class MyRunnableDemo {
    public static void main(String[] args) {
        //1、创建Runnable接口实现类的对象
        MyRunnable mr = new MyRunnable();

        //2、借助Thread创建多个线程对象,并给线程起名字
        Thread t1 = new Thread(mr,"线程1");
        Thread t2 = new Thread(mr, "线程2");
        Thread t3 = new Thread(mr, "线程3");

        // 启动
        t1.start();
        t2.start();
        t3.start();


    }
}
