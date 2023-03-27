package day13;

public class MyThread2 extends Thread{
    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=1;i<=200;i++){
            System.out.println(getName()+"---"+i);
        }
    }
}
