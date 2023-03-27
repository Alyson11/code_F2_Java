package day13;
/*
    进程和线程：
        进程：是计算机独立分配资源和CPU的程序，单独占用一个端口号
        线程：线程是包含在进程的内部的，一个进程可以包含多个线程

    并行和并发：
        并行是逻辑上的概念
        并发是物理上的概念

    java提供了一个类：Thread类表示线程的意思。线程是程序中执行的线程。 Java虚拟机允许应用程序同时执行多个执行线程。
    每个线程都有优先权。 具有较高优先级的线程优先于优先级较低的线程执行

   线程的实现方式：
        1、继承Thread类，实现run方法
        2、实现Runnable接口，实现run方法
        3、实现Callable接口，结合线程池使用
 */

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("线程1"); //一个线程对象，启动后会执行内部自己的run方法逻辑
        MyThread mt2 = new MyThread("线程2"); //创建两个及两个以上的线程对象，就是多线程环境了

        //java多线程之间的调度是抢占式调度
        mt1.start();
        mt2.start();


    }
}
