package controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServlet;

/**
 * @author yangzhilin
 * @date 2018/5/8
 * @description
 */
@ControllerAdvice(basePackages = {"controller.*"})
public class ExceptionAdvice {

    @ExceptionHandler(RuntimeException.class)
    public String rooroPage(HttpServlet httpServlet,Throwable throwable){

        return "redirect:/error/page";
    }



}
