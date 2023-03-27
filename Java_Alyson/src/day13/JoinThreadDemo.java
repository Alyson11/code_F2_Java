package day13;

public class JoinThreadDemo {
    public static void main(String[] args) throws InterruptedException{
        //创建3个线程线程对象
        MyJoinThread t1 = new MyJoinThread();
        MyJoinThread t2 = new MyJoinThread();
        MyJoinThread t3 = new MyJoinThread();

        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");

        t1.start();
        t1.join();  //在启动后调用join方法，表示其他线程要等待该执行结束后再进行执行。
        t2.start();
        t3.start();


    }
}
