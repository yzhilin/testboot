package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
//        SpringApplication springApplication = new SpringApplication(MySpringConfiguration.class);
//        springApplication.setWebApplicationType(WebApplicationType.SERVLET);
//        springApplication.run(args);
        SpringApplication.run(Application.class,args);

    }

}
