package cn.dl.controller;

import cn.dl.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequestMapping(value = "/userController")
@Controller
public class UserController {

    /**
     * response返回字符串
     * @param model
     * @return
     */
    @RequestMapping(value = "/testString")
    public String testString(Model model){
        System.out.println("testString方法执行了");
        //模拟从数据可查询出来的User
        User user = new User();
        user.setUsername("蛋蛋");
        user.setPassword("123");
        user.setAge(24);
        model.addAttribute("user", user);
        return "success";
    }

    /**
     * response没有返回值
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping(value = "/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testVoid方法执行了");
//        方法一：编写请求转发
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);

//        方法二：重定向
//        response.sendRedirect(request.getContextPath() + "/index.jsp");

        //设置乱码
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//
        //方法三：直接进行响应（需要提前设置中文乱码）
        response.getWriter().println("hello");
    }

    /**
     * 返回ModelAndView对象
     * @param
     * @return
     */
    @RequestMapping(value = "/testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testModelAndView");

        ModelAndView mv = new ModelAndView();

        //模拟从数据可查询出来的User
        User user = new User();
        user.setUsername("蛋蛋");
        user.setPassword("123");
        user.setAge(24);

        //添加User对象到mv对象中，底层还是调用了ModelMap
        mv.addObject("user", user);

        //底层会调用解析器，进行页面跳转
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping(value = "/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax方法执行了");
        //客户端发送的ajax请求，传的是json数据，后端把json封装到user中
        System.out.println(user);

        //做相应的事儿，模拟查询数据库
        user.setUsername("sdd");
        user.setAge(60);
        return user;
    }


}
