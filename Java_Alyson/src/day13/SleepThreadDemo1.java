package day13;
/*
    注意事项：当一个线程处于休眠状态的时候，它就丢失了CPU执行权，其他线程会抢到CPU执行权进行执行，
    当休眠线程时间到的时候，还是会先抢CPU执行权然后再执行，一个线程要想执行，必须要经过抢的过程。
 */

public class SleepThreadDemo1 {
    public static void main(String[] args) {
        MySleepThread mst = new MySleepThread();
        mst.start();
    }
}
