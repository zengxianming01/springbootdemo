package com.example.springbootdemo.mapper;

import com.example.springbootdemo.pojo.HrmsPersonnel;
import com.example.springbootdemo.util.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component(value = "hrmsPersonnelMapper")
public interface HrmsPersonnelMapper extends MyMapper<HrmsPersonnel> {
    public List<HrmsPersonnel> findByJobNum(@Param("jobnum") String jobnum);
//    public void getProcedure(Map<String,String> map);
    public void getFunction(Map<String,Object> map);
    public Integer  getCount();
}