package com.Mybatis.dao.Impl;

import com.Mybatis.dao.UserDao;
import com.Mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> findById(int id) throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlConfigMap.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession();
        List<User> users = sqlSession.selectList("User.findById",2);
        return users;
    }
}
