package configure.yaml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author yangzhilin
 * @date 2018/5/18
 * @description
 */
@ConfigurationProperties(prefix = "my")
@Configuration
public class YamlProperties {
    private List<String> serverProperty;

    public List<String> getServerProperty() {
        return serverProperty;
    }

    public void setServerProperty(List<String> serverProperty) {
        this.serverProperty = serverProperty;
    }
    public YamlProperties(){}
    public YamlProperties(List<String>serverProperty){
        this.serverProperty=serverProperty;
    }

}
