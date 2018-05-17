package thread.testvolatile;

/**
 * @author yangzhilin
 * @date 2018/5/7
 * @description
 */
public class MyThread extends Thread{
    int addCount;
    private void addCount(){
      addCount++;
    }

    @Override
    public void run() {
        addCount();
    }
}
