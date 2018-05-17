package configure;


import filter.Myfilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.util.Collections;
import java.util.HashMap;

/**
 * @author yangzhilin
 * @date 2018/5/2
 * @description
 */
@Configuration
public class FilterConfigure {

    @Bean
    public FilterRegistrationBean getFilter(){
        FilterRegistrationBean<Myfilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new Myfilter());
        filterRegistrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE+10);
        filterRegistrationBean.setUrlPatterns(Collections.singletonList("/**"));
        return  filterRegistrationBean;
    }


}
