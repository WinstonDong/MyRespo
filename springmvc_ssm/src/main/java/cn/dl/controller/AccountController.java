package cn.dl.controller;

import cn.dl.domain.Account;
import cn.dl.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/accountController")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/findAll")
    public String findAll(Model model){
        System.out.println("表现层，展现查询讯息");
        //需要调用业务层
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping(value = "/save")
    public String save(Account account){
        System.out.println("表现层，展现查询讯息");
        accountService.saveAccount(account);
        return "list";
    }
}
