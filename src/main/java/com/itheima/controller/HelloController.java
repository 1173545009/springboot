package com.itheima.controller;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

//相当于@Controller和@ResposeBody两个注解，方法返回的的json/xml数据，
// 不需要加@RespomseBody注解就可以在页面显示
//但是使用了这个注解，就不能返回jsp,html页面了
public class HelloController {
    @Autowired(required = false)
    private UserService userService;


    @GetMapping("hello")
    @ResponseBody
    public String  sayhello(){
        System.out.println("heloo world");
        return "大家晚上好，祝各位身体健康";
    }
    @GetMapping("user/{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Integer id){
        System.out.println(userService.findUserById(1));
        System.out.println("aa");
     return userService.findUserById(id);

    }
}
