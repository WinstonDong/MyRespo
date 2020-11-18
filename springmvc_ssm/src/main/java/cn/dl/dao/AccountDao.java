package cn.dl.dao;

import cn.dl.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from account")
    //I made some changessssss
    //some thing interest
    //last time
    public List<Account> findAll();

    @Insert("insert into account(name,money) values (#{name},#{money})")
    public void saveAccount(Account account);

    public void branchMethod();

    public void sampleMethod();


    //aaaaaaaaaaaaaabbbbbbbbbb
    public void a();
}
