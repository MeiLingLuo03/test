package com.springAop;


import com.spring.config.SpringConfig;

import com.spring.proxy.CglibProxyFactory;
import com.spring.proxy.JDkProxyFactory;
import com.spring.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class AccountTest {
    @Autowired
    private AccountService accountService;

//    @Autowired
//    private CglibFactory cglibFactory;

//    @Autowired
//    private JDkProxyFactory jDkProxyFactory;

    @Autowired
    private CglibProxyFactory  cglibProxyFactory;

    @Test
    public void TestAccount(){

//        AccountService accountService = jdkFactory.ProxyAccountServiceJDKProxy();
//        System.out.println(accountService); //代理对象
//        //proxy在调用接口时都会执行底层的invoke 方法
//        accountService.transformMoney("司马懿","刘备",100d);
////        accountService.transformMoney("司马懿","刘备",100d);


//        AccountService accountService = proxyJDkFactory.createProxyJDkFactory();
//        accountService.transformMoney("司马懿","刘备",100d);

//
//        AccountService accountService = cglibFactory.careteCglibFactory();
//        accountService.transformMoney("司马懿","刘备",100d);


//        AccountService jdkFactory = jDkProxyFactory.createJdkFactory();
//        jdkFactory.transformMoney("司马懿","刘备",100d);

        AccountService cglibFactory = cglibProxyFactory.createCglibFactory();
        cglibFactory.transformMoney("司马懿","刘备",100d);


    }
}
