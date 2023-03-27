package day13;
/*
    线程具有优先级。
    问题：
        线程的默认优先级是多少？ 5
        如何设置优先级？setPriority
        优先级高的线程一定会先执行吗？不是，只是代表着一个可能性，实际上还是需要多个线程之间进行抢CPU执行权

    面试题：
        1、java程序启动是单线程还是多线程？
            多线程，至少会启动两个线程：主线程，垃圾回收线程
        2、启动线程的时候为什么不是调用run方法，而是调用start方法。
            如果只是调用run方法，和普通对象调用方法没有任何区别，会有先后顺序，而调用start方法，JVM内部会先额外启动一个新的线程，
            然后线程的内部会调用对应的run方法的逻辑，而线程之间会进行抢占式调度。
 */

public class ThreadDemo2 {
    public static void main(String[] args) {
        // 创建两个线程对象
        MyThread2 mt1 = new MyThread2("线程1");
        MyThread2 mt2 = new MyThread2("线程2");

        System.out.println(Thread.currentThread().getName());  //main方法属于主线程调用的逻辑，主线程名字也叫main

        // 设置优先级
        mt1.setPriority(1);
        mt2.setPriority(10);

        // 获取优先级
        System.out.println(mt1.getPriority());
        System.out.println(mt2.getPriority());

        // 启动线程
//        mt1.start();
//        mt2.start();

    }
}
