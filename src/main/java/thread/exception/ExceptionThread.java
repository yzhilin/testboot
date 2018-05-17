package thread.exception;

/**
 * @author yangzhilin
 * @date 2018/5/7
 * @description
 */
public class ExceptionThread implements Runnable{
    @Override
    public void run(){
        Thread.currentThread().setUncaughtExceptionHandler(new MyExceptionHandler());
        throw new RuntimeException("Exception Handler");
    }
}
