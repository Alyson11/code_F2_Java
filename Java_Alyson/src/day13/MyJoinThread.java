package day13;

public class MyJoinThread extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=200;i++){
            System.out.println(getName()+"---"+i);
        }
    }
}
