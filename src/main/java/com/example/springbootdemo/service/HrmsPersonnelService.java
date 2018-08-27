package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.HrmsPersonnel;

import java.util.List;

public interface HrmsPersonnelService {
    HrmsPersonnel findByJobNum(String personnelJobNum);
    void  deleteByid(Integer id);
    List<HrmsPersonnel> findAll(HrmsPersonnel hrmsPersonnel,Integer page,Integer pageSize);

}
