package day13;

public class MyStopThread extends Thread{
    @Override
    public void run() {
        System.out.println("休眠中");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("休眠结束");
    }
}
