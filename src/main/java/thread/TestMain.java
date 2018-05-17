package thread;

import dto.Person;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author yangzhilin
 * @date 2018/5/5
 * @description
 */
public class TestMain {
    public static void main(String[] args) {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newCachedThreadPool();
         executorService.execute(()-> System.out.println("hello"));
    }

}
