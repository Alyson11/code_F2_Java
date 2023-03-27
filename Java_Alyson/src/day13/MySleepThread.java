package day13;

public class MySleepThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName()+"---"+"休眠中");
        //调用Thread类中的静态方法进行休眠，单位是毫秒
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("休眠结束");
    }

}
