package com.spring.utils;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@Component
public class ThredUtis {

    @Autowired
    private DataSource dataSource;

    /*获取线程 如果没有则使用 dataSource连接存放在 threadLocal*/
    ThreadLocal<Connection> threadLocal = new ThreadLocal<>();
    public Connection getConnection(){
        /* 首先获取本地线程*/
        Connection connection = threadLocal.get();

        if(connection==null){
            try {
                connection = dataSource.getConnection();
                threadLocal.set(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    /*清除线程*/
    public void removeThread(){
        threadLocal.remove();
    }


}
