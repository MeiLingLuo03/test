package com.spring.proxy;

public class Zhi implements MeiTuan {
    @Override
    public void payOnline() {
        System.out.println("支付宝真正支付中..");
    }
}
