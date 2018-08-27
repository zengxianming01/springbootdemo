package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.mapper.WxuserinfoMapper;
import com.example.springbootdemo.pojo.Wxuserinfo;
import com.example.springbootdemo.service.WxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WxServiceImpl  implements WxService {

    @Autowired
    private WxuserinfoMapper wxuserinfoMapper;

    @Override
    public List<Wxuserinfo> findAll() {
        return null;
    }
}
