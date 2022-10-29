package com.spring.proxy;

public class WeiXin implements MeiTuan{
    @Override
    public void payOnline() {
        System.out.println("微信正在支付中..");
    }
}
