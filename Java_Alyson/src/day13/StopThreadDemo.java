package day13;
/*
    中断线程
    public final void stop()
    public void interrupt()
 */

public class StopThreadDemo {
    public static void main(String[] args) {
        MyStopThread myStopThread = new MyStopThread();
        myStopThread.start();

        try {
            Thread.sleep(5000);
//            myStopThread.stop(); //stop()这种方式打断线程休眠已经被弃用了。
            myStopThread.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Hi");
    }
}
