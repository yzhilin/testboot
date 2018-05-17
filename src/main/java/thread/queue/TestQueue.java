package thread.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author yangzhilin
 * @date 2018/5/5
 * @description
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue queue=new ArrayBlockingQueue(2);
        ((ArrayBlockingQueue) queue).offer("2");
        ((ArrayBlockingQueue) queue).offer("1");
        Object a=queue.element();
        System.out.println(a);
    }
}
