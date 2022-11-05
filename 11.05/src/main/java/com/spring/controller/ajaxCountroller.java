package com.spring.controller;
import com.spring.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ajaxCountroller {
    @RequestMapping("/ajax")
    @ResponseBody
    /*@RequestBody接收参数是一个json  @ResponseBody 响应数据json*/
    public  List<User> ajaxLocal( @RequestBody List<User> list){
        return list;

    }


    @RequestMapping("/data")
    @ResponseBody
    /*@RequestBody接收参数是一个json  @ResponseBody 响应数据json*/
    public List<String> data(){
        List<String> users=new ArrayList<>();
        users.add("张三");
        users.add("李四");
        users.add("张三");
        return users;
    }
}
