package day13.sellticket_test1;

public class Wicket extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("当前" + getName() + "正在出售第" + (ticket--) + "张票");
            }
        }
    }
}
