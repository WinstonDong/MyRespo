package cn.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/userController")
public class UserController {

    @RequestMapping(value = "/testInterceptor")
    public String testInterceptor(){
        System.out.println("testInterceptor执行了。。。");
        return "success";
    }
}
