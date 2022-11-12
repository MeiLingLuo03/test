package com.ssm.dao;

import com.ssm.pojo.Account;

import java.util.List;

public interface AccountDao {
     void save(Account account);
     void update(Account account);
     void delete(Integer id);
     List<Account> findAll();
     Account findById(Integer id);
     void deleteBatch(Integer[] ids);

}
