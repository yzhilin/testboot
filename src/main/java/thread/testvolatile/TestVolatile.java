package thread.testvolatile;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yangzhilin
 * @date 2018/5/7
 * @description
 */
public class TestVolatile {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        MyThread myThread = new MyThread();
        executorService.execute(myThread);
        executorService.execute(myThread);
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(myThread.addCount);
        executorService.shutdown();
    }


}
