package com.spring.pojo.vo;
import com.spring.pojo.User;

import java.util.List;
import java.util.Map;
public class QueryVo {
    /* 基础类型*/
    private String keyValue;
    /*对象类型*/
    private User user;
    /*集合类型*/
    private List<User> list;   //[{name:'',sex:'',age:''},{name:'',sex:'',age:''},{name:'',sex:'',age:''}]
    /*map类型*/
    private Map<String,User> map; //[{u1=>{name:'',sex:'',age:''}},{u2=>{name:'',sex:'',age:''}}]

    @Override
    public String toString() {
        return "QueryVo{" +
                "keyValue='" + keyValue + '\'' +
                ", user=" + user +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }
}
