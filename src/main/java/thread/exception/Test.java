package thread.exception;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author yangzhilin
 * @date 2018/5/7
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Thread thread=new Thread(new ExceptionThread());
        Future<?> submit = executorService.submit(thread);
        executorService.shutdown();
        try {
            submit.get();
        }catch (InterruptedException | ExecutionException e){
            System.out.println(e.getMessage());
        }
    }
}
