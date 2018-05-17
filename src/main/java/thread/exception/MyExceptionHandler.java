package thread.exception;

/**
 * @author yangzhilin
 * @date 2018/5/7
 * @description
 */
public class MyExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("hello ddddddddddddd");
        System.out.println(e.getMessage());
    }
}
