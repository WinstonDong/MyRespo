package cn.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//控制器
@Controller
//method:指明了请求的方法, params:指明了要传哪些参数
@RequestMapping(path = "/helloController", method = RequestMethod.GET, params = {"username=heiheihei"}, headers = "accept")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello springMVC");
        return "success";
    }
}
