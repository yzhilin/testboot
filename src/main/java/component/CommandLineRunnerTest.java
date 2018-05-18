package component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author yangzhilin
 * @date 2018/5/18
 * @description
 */
@Component
public class CommandLineRunnerTest implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner-=-=-=-=-=-=-=-=-");
    }
}
