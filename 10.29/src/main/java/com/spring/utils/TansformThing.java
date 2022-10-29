package com.spring.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;

@Component
public class TansformThing {


     @Autowired
     private ThredUtis thredUtis;

     /*手动事务 自动事务*/


    /*开启事务*/
        public void BeginThing(){

            try {
                /* true 自动提交事务 false 手动提交事务 */
                thredUtis.getConnection().setAutoCommit(false);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    /*
    *  回滚事务
    * */
    public void rollBack(){
        try {
            thredUtis.getConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*提交事务*/

    public void commit(){
        try {
            thredUtis.getConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
    *  清除事务
    * */
    public void releas(){
        thredUtis.removeThread();
    }

}
