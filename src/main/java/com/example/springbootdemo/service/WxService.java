package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.Wxuserinfo;

import java.util.List;

public interface WxService {
    public List<Wxuserinfo> findAll();
}
