package cn.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/paramsController")
public class ParamsController {

    @RequestMapping(value = "/testParam")
    public String testParam(String username, String password){

        System.out.println("执行了testParam方法");
        System.out.println("username=" + username + " password=" + password);
        return "success";
    }

    @RequestMapping(value = "/saveAccount")
    public String saveAccount(Account account){

        System.out.println("saveAccount");
        System.out.println(account);
        return "success";
    }

    //自定义类型转换器演示
    @RequestMapping(value = "/saveUser")
    public String saveUser(User user){

        System.out.println("saveUser");
        System.out.println(user);
        return "success";
    }

    //servelet原生API获取
    @RequestMapping(value = "/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){

        System.out.println("原生API获取 ");
        System.out.println(request);

        HttpSession session = request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        System.out.println(response);
        return "success";
    }
}
