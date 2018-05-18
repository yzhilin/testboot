import configure.yaml.YamlProperties;
import hello.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yangzhilin
 * @date 2018/5/18
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes =Application.class)
public class YamlTest {
    @Autowired
    YamlProperties yamlProperties;
    @Test
    public void test(){
        System.out.println(yamlProperties.getServerProperty());
    }
}
