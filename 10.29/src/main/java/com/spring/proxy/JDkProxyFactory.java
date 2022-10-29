package com.spring.proxy;

import com.spring.service.AccountService;
import com.spring.utils.TansformThing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component
public class JDkProxyFactory {
    @Autowired
    private AccountService accountService;

    @Autowired
    private TansformThing tansformThing;

    public AccountService createJdkFactory(){
        //1. 获取类加载器的引用地址
        // 2. 获取所有的接口方法
        AccountService accountServiceProxy = (AccountService) Proxy.newProxyInstance(accountService.getClass().getClassLoader(), accountService.getClass().getInterfaces(), new InvocationHandler() {
            /*
             * 1. proxy 代理对象
             * 2. 方法的引用
             * 3. 方法参数的引用
             * */

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                try {
                    tansformThing.BeginThing(); // 开启事务
                    // 主方法
                    method.invoke(accountService, args);

                    tansformThing.commit(); // 手动提交
                } catch (Exception e) {
                    e.printStackTrace();
                    tansformThing.rollBack();
                }finally {
                    tansformThing.releas();
                }

                return null;
            }
        });

        return  accountServiceProxy;
    }

}
