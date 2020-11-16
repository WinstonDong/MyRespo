package cn.dl4.service;

import cn.dl4.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, timeout = 5, propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
public class UserService {

    @Autowired
    @Qualifier(value = "userDaoImpl1")
    private UserDao userdao;

    public void testMoney(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService2 userService2 = context.getBean("userService2", UserService2.class);
        userService2.reduceMoney();
        userdao.addMoney();
    }

    public void reduceMoney(){
        userdao.reduceMoney();
    }
}
