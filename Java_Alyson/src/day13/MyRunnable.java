package day13;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=200;i++){
            //先获取当前执行的线程对象,借助Thread类间接的获取线程对象的名字
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
