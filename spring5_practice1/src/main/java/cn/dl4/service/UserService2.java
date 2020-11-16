package cn.dl4.service;

import cn.dl4.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class UserService2 {

    @Autowired
    @Qualifier(value = "userDaoImpl2")
    private UserDao userDao;

    public void addMoney(){
        userDao.addMoney();
    }

    public void reduceMoney(){
        userDao.reduceMoney();
    }
}
