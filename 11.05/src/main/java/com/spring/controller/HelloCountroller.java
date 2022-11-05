package com.spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloCountroller {
    @RequestMapping("/hello")
    public String hello(){
        /* 默认渲染逻辑视图*/
        return "success";
    }

    /* /WEB-INF/pages/  xxx  .jsp
     *   默认渲染逻辑视图  当有 @ResponseBody 注解时 返回json 字符串
     *   Resultful 编程风格   /user_save /user_update /user_delete ..
     *                 /user  GET   /user  POST  /user  put   /user delete
     *    {
     *      code:0,
     *      msg:"xxxx",
     *      data:{
     *
     *         }
     *    }
     *
     * *  */

    /*
     * /error?name=张三
     * */

    //    @RequestMapping(value = "/error",method = RequestMethod.GET,params = {"name"})
    // @PostMapping("/error")
    // @GetMapping
    @GetMapping(value = "/error",params = {"name"})
    public String error(){
        /* 默认渲染逻辑视图*/
        return "error";
    }


    @ResponseBody
    @RequestMapping("/msg")
    /* mac*/
    public String msg(){
        return "hello你好";
    }
}
