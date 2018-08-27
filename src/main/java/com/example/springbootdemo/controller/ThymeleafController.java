package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("th")
public class ThymeleafController {

    @RequestMapping("/getIndex")
    public String getIndex(Model map){
        User user=new User();
        user.setUsername("Today");
        user.setPassword("123");
        user.setBirthday(new Date());
        user.setId(2);
        user.setAge(20);
        user.setDesc("none");
        map.addAttribute("user",user);
        return  "index";
    }

}
