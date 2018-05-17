package filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @author yangzhilin
 * @date 2018/5/2
 * @description
 */

public class Myfilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("hello filter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("destory==========");
    }


}
