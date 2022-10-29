package com.spring.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestPay {


    public void pay(MeiTuan meiTuan){
        // MeiTuan meiTuan = new WeiXin();  //new Zhi())
        meiTuan.payOnline();
    }

    @Test
    public void payTest() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // q全路径  权限定名
        String str = "com.spring.proxy.WeiXin";

//        if(str.equals("微信")){
//            pay(new WeiXin());
//        }else if(str.equals("支付宝")) {
//            pay(new Zhi());
//        }else if(str.equals("中信")){
//
//        }

        // 动态生成
        Class aClass = Class.forName(str);
        Method payOnline = aClass.getMethod("payOnline");
        Object o = aClass.newInstance();
        payOnline.invoke(o);

    }
}
