package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/hello")
public class HelloController {
    
    @RequestMapping("/index")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @RequestMapping("/error")
    public void getError(HttpServletRequest httpRequest, HttpServletResponse httpServletResponse) throws IOException {
        System.out.println("encordingfffffffffffffff"+httpRequest.getCharacterEncoding());
        httpServletResponse.sendError(404,"9999999");
    }
}
