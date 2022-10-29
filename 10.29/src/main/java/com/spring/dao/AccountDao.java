package com.spring.dao;

public interface AccountDao {
    /* 出账*/
    public void out(String name , Double money);
    /*入账*/
    public void in(String name, Double money);
}
