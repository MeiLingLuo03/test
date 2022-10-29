package com.spring.proxy;

import com.spring.domain.Account;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {

    @Test
    public  void test() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        // com.spring.domain.Account; 全限定名  包.子包.类
   // Account account = new Account();
        // 通过对象调用方法
//        account.show();


        /* 反过来*/
//        实例对象.getClass() -> 方法 属性 构造函数
    // Class aClass = account.getClass();
        // class 返回类型   com.spring.domain.Account 全限定名
        //  System.out.println(aClass);
        // Java.lang.class
//        ClassLoader classLoader = aClass.getClassLoader();
       // System.out.println(classLoader); // jdk.internal.loader.ClassLoaders$AppClassLoader@2c13da15

        // 获取公有属性
//        Field[] fields = aClass.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }

         /* 获取单个 可以是私有属性 也可以是公有属性*/
    //    Field name = aClass.getDeclaredField("sex");
      //  System.out.println(name);


        /*获取所有方法*/
//        Method[] methods = aClass.getMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }

//        Method show = aClass.getMethod("show");
//        System.out.println(show); // com.spring.domain.Account.show()

        // invoke() 调用包下的方法
       // show.invoke(account);


        // 获取包 全限定名
        // 3种
        // java.lang.Class
//        Class aClass = Class.forName("com.spring.domain.Account");
//        Account account = (Account) aClass.newInstance();
//        Method show = aClass.getMethod("show");
//        show.invoke(account);

//        System.out.println(aClass);

         System.out.println(Account.class);

        // Account.class.getClassLoader();

    }
}
