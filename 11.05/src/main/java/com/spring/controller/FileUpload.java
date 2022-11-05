package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FileUpload {
    @RequestMapping("/filesUpload")
    public String upload(String user, MultipartFile fileload) throws IOException {
        System.out.println(user);

//        文件上传处理
// 获取文件名
        String originalFilename = fileload.getOriginalFilename();
// 保存到服务器
        fileload.transferTo(new File("C:\\Program Files\\apache-tomcat-8.5.78/upload" + originalFilename));

        return "success";
    }

    @RequestMapping("/morefilesUpload")
    public String Moreupload(String user, MultipartFile[] fileload) throws IOException {
        System.out.println(user);
//        文件上传处理
        for (MultipartFile multipartFile : fileload) {
            String originalFilename = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("C:\\Program Files\\apache-tomcat-8.5.78/upload" + originalFilename));

        }


// 获取文件名
//        String originalFilename = fileload.getOriginalFilename();
//// 保存到服务器
//        fileload.transferTo(new File("C:\\Program Files\\apache-tomcat-8.5.78/upload" + originalFilename));

        return "success";
    }
}
