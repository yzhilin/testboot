package testjava;

import javax.annotation.PostConstruct;

/**
 * @author yangzhilin
 * @date 2018/5/5
 * @description
 */
public class TestPostConstruct {
    private String d;
    @PostConstruct
    public void dd(){
        System.out.println("hello TestPostConstruct");
    }

    public static void main(String[] args) {
        TestPostConstruct testPostConstruct = new TestPostConstruct();
    }
}
