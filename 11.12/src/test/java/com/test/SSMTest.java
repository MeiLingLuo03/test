package com.test;

import com.ssm.dao.AccountDao;
import com.ssm.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SSMTest {

    @Test
    public void accountTest() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlConfig.xml");
        SqlSessionFactory sqlsession = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlsession.openSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        List<Account> all = mapper.findAll();
        for (Account account : all) {
            System.out.println(account);
        }

        /*释放资源*/
        sqlSession.close();

    }
}
