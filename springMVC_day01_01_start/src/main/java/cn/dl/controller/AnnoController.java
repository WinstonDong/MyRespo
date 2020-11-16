package cn.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;

@Controller
@RequestMapping(value = "/annoController")
@SessionAttributes(value = "msg")//把request中的"msg=?"在session域中也存一份
public class AnnoController {

    //RequestParam展示
    @RequestMapping(value = "/testParam")
    //@RequestParam的value和name可以替换。value后的属性 决定了url的属性必须是uname
    public String testParam(@RequestParam(value = "uname") String name){

        System.out.println("testParam");
        System.out.println(name);
        return "success";
    }

    //RequestBody展示
    @RequestMapping(value = "/testRequestBody")
    //@RequestBody,获取得到全部的请求体（get方法不适用）
    public String testRequestBody(@RequestBody String body){

        System.out.println("test @RequestBody");
        System.out.println(body);
        return "success";
    }

    //@PathVariable, Restful编程风格展示
    @RequestMapping(value = "/testPathVariable/{id}")
    //@RequestMapping和@PathVariable的value必须对应上
    public String testPathVariable(@PathVariable(value = "id") String id){

        System.out.println("test @PathVariable");
        System.out.println(id);
        return "success";
    }

    @RequestMapping(value = "/testRequestHeader")
    //@RequestHeader: 可以获取到Request请求的头信息
    //value: 获取Accept请求头的值
    public String testRequestHeader(@RequestHeader(value = "Accept") String header){

        System.out.println("test @testRequestHeader");
        System.out.println(header);
        return "success";
    }

    @RequestMapping(value = "/testCookieValue")
    //@RequestHeader: 可以获取到Request请求的头信息
    //value: 获取Accept请求头的值
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){

        System.out.println("test @testCookieValue");
        System.out.println(cookieValue);
        return "success";
    }

    @RequestMapping(value = "/testModelAttribute")
    public String testModelAttribute(User user){

        System.out.println("@testModelAttribute执行了");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    //在@RequestMapping注释执行之前执行，可以有数据校验的功能
    public User showUser(String uname){

        //System.out.println("showUser方法执行了");
        //模拟数据库查询User
        User user = new User();
        user.setUname(uname);
        user.setAge(20);
        user.setDate(new Date());
        return user;
    }

    /**
     *
     * @Session Attributes注解(只能注释在类上，不能在方法上)
     * 作用：多次执行控制器方法之间的参数共享
     * @return
     */
    @RequestMapping(value = "testSessionAttribues")
    public String testSessionAttribues(ModelMap modelMap){

        System.out.println("testSessionAttribues方法执行了");
        //底层会存储到request域对象中
        modelMap.addAttribute("msg", "蛋蛋傻乎乎");
        return "success";
    }

    /**
     *
     * @Session 从Session域中取值
     * @return
     */
    @RequestMapping(value = "getSessionAttribues")
    public String getSessionAttribues(ModelMap modelMap){

        System.out.println("getSessionAttribues方法执行了");
        //底层会存储到request域对象中
        String string = (String) modelMap.get("msg");
        System.out.println(string);
        return "success";
    }

    /**
     *
     * @param status
     * 删除session域对象里面的值
     * @return
     */
    @RequestMapping(value = "delSessionAttribues")
    public String delSessionAttribues(SessionStatus status){

        System.out.println("delSessionAttribues方法执行了");
        //session已完成，将session清空
        status.setComplete();
        return "success";
    }

}
