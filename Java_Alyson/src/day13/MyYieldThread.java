package day13;
/*
    线程调用礼让的方法，会让线程执行之间看起来更加有序和谐，但并非真正意义上的你一次我一次。
 */

public class MyYieldThread extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=200;i++){
            System.out.println(getName()+"---"+i);
            Thread.yield();
        }
    }
}
