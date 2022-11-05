package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
public class HelloTest {
    //    @RequestMapping("/hello")
//    public String hello(){
////        默认渲染逻辑试图
//        return "/WEB-INF/pages/success.jsp";
//    }
//
//    /*/WEB-INF/pages/ xxx .jsp
//    * 默认渲染逻辑试图 当有 @ResponseBody 注解时 返回json 字符串
//    *  Resultfui 编程风格 /user_save/user_update/user_delete ......
//    /user GET /user  POST/ user  put/user delete
//    * {
//    * code:0,
//    * msg:"xxxx"
//    * data:{
//    *      }
//    * }
//    *
//    * *  */
//    /*
//    * error?name=张三
//    * */
//
//    @RequestMapping(value = "/error",method = RequestMethod.GET,params = {"name"})
//       @PostMapping("/error")
//
//    @DeleteMapping("/error")
//    @GetMapping("/error")
//  public String error(){
////            默认渲染逻辑试图
//            return "error";
//        }
//
//    @RequestMapping("/error")
//    public String Error(){
//        return "/WEB-INF/pages/error.jsp";
//    }
//
//     @RequestMapping(value = "/msg",params = {"name"})
//     @ResponseBody
//    public String msg(){
//        return "hello ,你好";
//    }
//


}
