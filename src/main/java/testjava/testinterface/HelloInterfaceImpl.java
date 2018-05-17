package testjava.testinterface;

/**
 * @author yangzhilin
 * @date 2018/5/10
 * @description
 */
public class HelloInterfaceImpl implements HelloInterface{
    @Override
    public void hello() {
        System.out.println("hello interface");
    }

    public static void main(String[] args) {
        HelloInterface helloInterface=new HelloInterfaceImpl();
        helloInterface.hello();
    }

}
