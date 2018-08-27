package com.example.springbootdemo.mapper;

import com.example.springbootdemo.pojo.Studentrinfo;
import com.example.springbootdemo.util.MyMapper;
import org.springframework.stereotype.Component;

@Component(value = "studentrinfoMapper")
public interface StudentrinfoMapper extends MyMapper<Studentrinfo> {

}