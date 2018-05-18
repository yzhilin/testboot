package configure;

import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangzhilin
 * @date 2018/5/18
 * @description
 */
@Configuration
public class MySpringConfiguration {
    @Bean
    public ServletWebServerFactory servletWebServerFactory(){

        return  new ServletWebServerFactory() {
            @Override
            public WebServer getWebServer(ServletContextInitializer... initializers) {

                return null;
            }
        };
    }

}
