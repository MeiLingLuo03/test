package com.spring.service.Impl;

import com.spring.dao.AccountDao;
import com.spring.service.AccountService;
import com.spring.utils.TansformThing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public void save() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Autowired
    private AccountDao accountDao;


    @Autowired
    private TansformThing tansformThing;

    @Override
    public void transformMoney(String outUser, String inUser, Double money) {
        // 业务代码 Aop
        accountDao.out(outUser, money);
        accountDao.in(inUser, money);
    }
}



/*AOP */
