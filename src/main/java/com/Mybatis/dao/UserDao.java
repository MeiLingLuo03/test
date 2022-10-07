package com.Mybatis.dao;

import com.Mybatis.pojo.User;

import java.io.IOException;
import java.util.List;

public interface UserDao {
    public List<User>findById(int id) throws IOException;

}
