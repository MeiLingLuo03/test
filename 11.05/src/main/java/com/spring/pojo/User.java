package com.spring.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/*view object 视图对象*/
public class User {
    private String user;
    private String age;



    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", age='" + age + '\'' +
                '}';
    }



    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    //    private String name;
//    private String age;
//    private String sex;
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age='" + age + '\'' +
//                ", sex='" + sex + '\'' +
//                '}';
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//    public void setAge(String age) {
//        this.age = age;
//    }
//
//    public String getSex() {
//        return sex;
//    }
//
//    public void setSex(String sex) {
//        this.sex = sex;
//    }
}
