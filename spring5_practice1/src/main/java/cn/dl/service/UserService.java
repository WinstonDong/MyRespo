package cn.dl.service;

import cn.dl.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired //根据类型注入
    @Qualifier(value = "userdaoImpl1")//和UserDaoImpl的value对应
    private UserDao userDao;

    @Value(value = "Winston")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service has add...");
        userDao.a();
    }

    public void add2(){
        System.out.println("service has add...");
    }
}
