package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yangzhilin
 * @date 2018/5/8
 * @description
 */
@Controller
@RequestMapping("/error")
public class ErrorPageController {

    @RequestMapping("/page")
    public String errorPage(){
        return "redirect:index.jsp";
    }
}
