package com.spring.dao.Impl;

import com.spring.dao.AccountDao;
import com.spring.domain.Account;
import com.spring.utils.ThredUtis;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

/* dbutils 工具类进行引入
*   dao  ->
* */

/*
*  @Repository  dao
*  @Service    service
*  @Controller Controller
*  @Componet
* <bean id="accountDaoImpl"></bean>
* */

@Repository
public class AccountDaoImpl extends Account implements AccountDao {



    @Autowired
    private QueryRunner queryRunner;


    @Autowired
    private ThredUtis thredUtis;


    @Override
    public void out(String name, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        try {
            queryRunner.update(thredUtis.getConnection(),sql,money,name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void in(String name, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        try {
            queryRunner.update(thredUtis.getConnection(),sql,money,name);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
