package dl.cn.test;

import cn.dl2.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass2 {

    @Test
    public void testUserProxy(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
