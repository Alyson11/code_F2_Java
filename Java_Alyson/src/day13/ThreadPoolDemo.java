package day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.submit(new MyCallable());
        pool.submit(new MyCallable());
        pool.submit(new MyCallable());

        pool.shutdown();  // 关闭线程池，一般来说是不关的
    }
}
