package day13.sellticket_test2;

public class WicketRunnable implements Runnable{
    private int ticket=100;
    @Override
    public void run() {
        while(true){
            if (ticket>0){
                try {
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("当前" + Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
            }
        }
    }
}
