package day13;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            System.out.println(getName()+"---"+i);  //getName()获取线程的名字
        }
    }
}
