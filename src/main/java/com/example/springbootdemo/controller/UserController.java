package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.Resource;
import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.vo.ResJSONResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Resource resource;
    /*
    * 返回json对象
    * */
    @RequestMapping("/getUser")
    public ResJSONResult getUser(){
        User user=new User();
        user.setBirthday(new Date());
        user.setUsername("Tom1");
        user.setPassword("1234");
        user.setId(100);
        user.setAge(20);
        user.setDesc("这是Tom的个人信息");

        return  ResJSONResult.ok(user);
    }

    @RequestMapping("/getUserf")
    public User getUserf(){
        User user=new User();
        user.setBirthday(new Date());
        user.setUsername("Tom");
        user.setPassword("1234");
        user.setId(100);
        user.setAge(20);
//        user.setDesc("这是Tom的个人信息");
        return  user;
    }

    @RequestMapping("/getResource")
    public  ResJSONResult getResource(){
       Resource bean=new Resource();
        BeanUtils.copyProperties(resource,bean);//从注入rescource赋值数据
        return ResJSONResult.ok(bean);
    }

}
