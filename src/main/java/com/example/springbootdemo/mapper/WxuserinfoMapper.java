package com.example.springbootdemo.mapper;

import com.example.springbootdemo.pojo.Wxuserinfo;
import com.example.springbootdemo.util.MyMapper;
import org.springframework.stereotype.Component;

@Component(value = "wxuserinfoMapper")
public interface WxuserinfoMapper extends MyMapper<Wxuserinfo> {
}