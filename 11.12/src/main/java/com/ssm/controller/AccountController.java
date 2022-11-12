package com.ssm.controller;


import com.ssm.pojo.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class AccountController {


    @Autowired
    private AccountService accountService;

//    @RequestMapping("/test")
//    @ResponseBody
//    public String test(){
//        return "hello";
//    }

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public String save(Account account) {
        accountService.save(account);
        return "redirect:/findAll";
    }

    @RequestMapping("/delete")
    public String delete(Integer id) {
        accountService.delete(id);
        return "redirect:/findAll";
    }

    @RequestMapping("/findById")
    public String findById(Integer id,Model model) {
        Account account = accountService.findById(id);
        model.addAttribute("account",account);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Account account) {
        accountService.update(account);
        return "redirect:/findAll";
    }

    @RequestMapping("/deleteBatch")
    public String deleteBatch(Integer[] ids) {
        System.out.println(Arrays.toString(ids));
        accountService.deleteBatch(ids);
        return "redirect:/findAll";
    }
}
