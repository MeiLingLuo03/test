package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Controller
//@RequestMapping("article")
public class UserCountroller {

    //@Controller
//@RequestMapping("article")
    public class UserController {

//    @GetMapping(value = "/login",produces = "text/html;charset=UTF-8")
//    @ResponseBody
//    public String str(){
//        return "获取文章";
//    }
//
//    @GetMapping("/convertParam")
//
//    public String getDate(String birthday){
//        System.out.println(birthday);
//        return "success";
//
//    }
//
//    @RequestMapping("/pages")
//
//    /*
//    * @RequestParam 当传递参数和实际参数不一致时   使用
//    * name  实际参数
//    * defaultValue    默认参数值
//    * required = true 必填  false
//    * */
//    public String pages(@RequestParam(name = "pageNo",defaultValue = "1",required = true) String pages, String size){
//        System.out.println(pages);
//        System.out.println(size);
//        return "success";
//    }
//
//
//    /*(@RequestHeader 获取请求参数
//    *
//    * */
//    @GetMapping("/cookie")
//    public String getCookie(@RequestHeader("Accept-Encoding") String str){
//        System.out.println(str);
//        return "success";
//    }
//
//    @GetMapping("/cookieval")
//    public String getCookieval(@CookieValue("data") String str, HttpServletRequest req, HttpServletResponse resp){
//        System.out.println(str);
//        System.out.println(req.getParameter("name"));
//        System.out.println(resp);
//        return "success";
//    }
//
////    @RequestMapping("/junpLink")
////    public String junpLink(HttpServletRequest req, HttpServletResponse resp) throws Exception {
////// 1.通过response直接响应数据
////        resp.setContentType("text/html;charset=utf-8");
////        resp.getWriter().write("你好");
//
////        req.setAttribute("text","haha~");
////        req.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(req,resp);
//        /*重定向*/
//
////        System.out.println(req.getContextPath());
////        resp.sendRedirect(req.getContextPath()+"/index.jsp");
////  }
//
//    @RequestMapping("/forward")
//    public String forward(Model model) {
//        model.addAttribute("username", "字幕" +
//                "");
//        return "forward:/WEB-INF/pages/success.jsp";
//    }
//
//    @RequestMapping("/redirect")
//    public String redirect ( HttpServletResponse resp,HttpServletRequest req) {
////            model.addAttribute("username", "拉勾招聘");
//        return"redirect:/index.jsp";
//    }
//    @RequestMapping("/modelView")
//    public ModelAndView modelAndView(){
//           ModelAndView modelAndView= new ModelAndView();
//
//           modelAndView.setViewName("success");
//           return modelAndView;
        // }




        /*利用SpringMvc 知定义转换器 2022-11-02  2022/11/02分*/


//    /*简单参数
//    * 1.基础类型 2.对象  3.数组  4.List*/
//    @RequestMapping("/login")
//    public String login(String name ,String pwd) {
//        System.out.println("用户名：" + name);
//        System.out.println("密码" + pwd);
//        return "success";
//    }
//    }
//
//    /* 对象类型的参数*/
//    @RequestMapping("/objParams")
//    public String objParams(User user){
//        System.out.println(user);
//        return  "success";
//    }
//    /*集合类型的参数 */
//    @RequestMapping("/qureyParam")
//
//    public String qureyParam(QueryVo queryVo){
//        System.out.println(queryVo);
//        return  "success";
//    }
//
//
//    /* 数组类型*/
//
//    @RequestMapping("/arrParam")
//
//    public String ArrParam(ArrVo arrVo){
//        System.out.println(arrVo);
//        return  "error";
//    }
//
//
//


    }
}
