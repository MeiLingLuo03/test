package com.spring.controller;

import com.spring.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@ResponseBody+//@Controller=//@RestController
@RestController
public class RestfulCountroller {
    @GetMapping(value = "/user/{id}")
// 相当于 @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
// @ResponseBody
    public String getuser(@PathVariable Integer id) {
        System.out.println("get"+id);
        return "get：" + id;

    }
    @PostMapping(value = "/user")
// @ResponseBody
    public List<User> postuser(@RequestBody List<User> list) {
        return list;
    }

    @DeleteMapping(value = "/user/{id}")
// @ResponseBody
    public String delete(@PathVariable int id) {
        return "delete："+ id;
    }
    @PutMapping (value = "/user/{id}")
// @ResponseBody
    public String putuser(@PathVariable int id) {
        return "update："+ id;
    }
}
