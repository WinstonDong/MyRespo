package cn.dl.test;

import cn.dl.dao.AccountDao;
import cn.dl.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMyBatis {

    /**
     * 测试查询
     * @throws IOException
     */
    @Test
    public void run() throws IOException {

        //模拟要存储的数据
//        Account account = new Account();
//        account.setName("shadandan");
//        account.setMoney(1000d);

        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        //查询到所有数据
        List<Account> list = dao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }

//        //测试存储数据
//        dao.saveAccount(account);
//        //提交事务
//        session.commit();

        //关闭资源
        session.close();
        in.close();
    }
}
