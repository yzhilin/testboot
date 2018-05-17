package testjava.exception;

/**
 * @author yangzhilin
 * @date 2018/5/9
 * @description
 */
public class TestException {
    public static void main(String[] args) {

        try {
            get();
        }catch (Exception e){

        }




    }
    public static  void get() throws Exception{
        System.out.println(1/0);
    }

}
