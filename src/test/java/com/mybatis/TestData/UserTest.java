package com.mybatis.TestData;

import com.Mybatis.dao.Impl.UserDaoImpl;
import com.Mybatis.dao.UserDao;
import com.Mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class UserTest {
    @Test
    public void testUser() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlConfigMap.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("User.findAll");
        for (User i : list) {
            System.out.println(i);
        }
        sqlSession.close();
    }

    @Test
    public void InsertTest() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlConfigMap.xml");
        SqlSessionFactory sqlsession = new SqlSessionFactoryBuilder().build(is);
        SqlSession so = sqlsession.openSession(true);
        User user = new User();
        user.setSex("男");
        user.setAddress("北京海淀");
        user.setBirthday(new Date());
        user.setUsername("齐得胜");

        int row = so.insert("User.insert", user);
        System.out.println(row);

        so.commit();

        so.close();
    }

    @Test
    public void Updatetest() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlConfigMap.xml");
        SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(is);
        SqlSession so = sqlSession.openSession(true);
        User user = new User();
        user.setSex("男");
        user.setAddress("上海");
        user.setBirthday(new Date());
        user.setUsername("张飞");
        user.setId(2);
        int row = so.update("User.update", user);
        System.out.println(row);
        so.commit();
        so.close();
    }

    @Test
    public void DeleteTest() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlConfigMap.xml");
        SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(is);
        SqlSession so = sqlSession.openSession(true);
        int row = so.delete("User.delete", 4);
        System.out.println(row);
        so.commit();
        so.close();

    }

    @Test
    public void TestDao() {
        UserDaoImpl userDao = new UserDaoImpl();
        try {
            List<User> users = userDao.findById(2);
            System.out.println(users);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}