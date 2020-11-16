package cn.dl.controller;

import cn.dl.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/userConroller")
public class UserConroller {

    @RequestMapping(value = "/testException")
    public String testException() throws Exception {

        System.out.println("testException执行了。。。");

        try {
            int a = 10/0;
        } catch (Exception e) {
            e.printStackTrace();
            //抛出自定义异常信息
            throw new SysException("查询所有用户出现错误。。。");
        }

        return "success";
    }
}
