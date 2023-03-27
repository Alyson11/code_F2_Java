package day13;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 1; i <= 200; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
        return new Object();
    }
}
