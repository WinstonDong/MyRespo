package dl.cn.test;

import cn.dl4.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass4 {

    @Test
    public void testTransaction(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.testMoney();
    }
}
