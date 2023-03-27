package day13;

public class YieldThreadDemo {
    public static void main(String[] args) {
        MyYieldThread t1 = new MyYieldThread();
        MyYieldThread t2 = new MyYieldThread();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
