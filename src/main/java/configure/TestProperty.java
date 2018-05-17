package configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yangzhilin
 * @date 2018/5/11
 * @description
 */
@Configuration
@ImportResource("classpath:/test.properties")
public class TestProperty{

    @Value("${hello}")
    static String a;

    public static void main(String[] args) {
        System.out.println("hello"+a);


    }



}
