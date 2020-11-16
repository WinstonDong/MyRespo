package cn.dl.daoImpl;

import cn.dl.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository(value = "userdaoImpl1") //和UserService的value对应
public class UserDaoImpl implements UserDao {

    @Override
    public void a() {
        System.out.println("I implement UserDao");
    }
}
