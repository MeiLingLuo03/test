package com.spring.proxy;

import com.spring.service.AccountService;
import com.spring.utils.TansformThing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@Component
public class CglibProxyFactory {

    @Autowired
    private AccountService accountService;

    @Autowired
    private TansformThing tansformThing;

    public AccountService createCglibFactory(){
        /*
           获取代理对象的全限定名
           获取所有接口方法
           重写方法
        * */
        AccountService accountServiceCglib = (AccountService) Enhancer.create(accountService.getClass(), accountService.getClass().getInterfaces(), new MethodInterceptor() {
            /*
             *  1. o 代理对象
             *  2. 方法的引用
             *   3. 参数的引用
             * 4. 方法的代理
             * */

            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {



                try {

                    if(method.getName().equals("transformMoney")){
                        // 前置通知
                        tansformThing.BeginThing();
                        method.invoke(accountService, objects);
                        // 后置通知
                        tansformThing.commit();
                    }else {
                        method.invoke(accountService, objects);
                    }


                } catch (Exception e) {
                    e.printStackTrace();
                    // 异常通知
                    tansformThing.rollBack();
                } finally {
                    // 最终通知
                    tansformThing.releas();
                }
                return null;
            }
        });
        return  accountServiceCglib;
    }
}
