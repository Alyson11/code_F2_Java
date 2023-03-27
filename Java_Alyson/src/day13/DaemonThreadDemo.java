package day13;
/*
    后台线程：
        public final void setDaemon(boolean on)

    java中线程分为两类：用户线程，后台线程（守护线程）
    用户线程：之前创建的线程都叫用户线程
    后台线程：为用户线程提供保障的线程
    一个进程中如果没有了用户线程，就不会存在后台线程，换句话说，没有了用户线程，后台线程就会停止。
 */

public class DaemonThreadDemo {
    public static void main(String[] args) {
        // 创建三个线程对象
        MyDaemonThread t1 = new MyDaemonThread();
        MyDaemonThread t2 = new MyDaemonThread();
        MyDaemonThread t3 = new MyDaemonThread();

        t1.setName("用户线程1");
        t2.setName("后台线程1");
        t3.setName("后台线程2");

        //将t2,t3设置为守护线程
        t2.setDaemon(true);
        t3.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

    }
}
