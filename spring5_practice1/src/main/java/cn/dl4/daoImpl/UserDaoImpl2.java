package cn.dl4.daoImpl;

import cn.dl4.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl2")
public class UserDaoImpl2 implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update account set money=? where name=?";
        jdbcTemplate.update(sql, 300, "dandan");
        System.out.println("add money。。。");
    }

    @Override
    public void reduceMoney() {
        String sql = "update account set money=? where name=?";
        jdbcTemplate.update(sql, 422, "dd");
        System.out.println("reduce money。。。");
    }
}
