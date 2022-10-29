package com.spring.service;

public interface AccountService {
     /* 转账*/
    public void transformMoney(String outUser,String inUser,Double money);
    public void save();
    public void update();
    public void delete();
}
