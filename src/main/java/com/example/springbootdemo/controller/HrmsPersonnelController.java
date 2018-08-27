package com.example.springbootdemo.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.example.springbootdemo.pojo.HrmsPersonnel;
import com.example.springbootdemo.service.HrmsPersonnelService;
import com.example.springbootdemo.util.RedisOperator;
import com.example.springbootdemo.vo.ResJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class HrmsPersonnelController {

    @Autowired
    HrmsPersonnelService hrmsPersonnelServiceImpl;
    @Autowired
    RedisOperator redisOperator;

    @RequestMapping(value = "/getHrmsPerson")
    public ResJSONResult getHrmsPerson(String jobnum){
        ResJSONResult resJSONResult=new ResJSONResult();
        HrmsPersonnel hrmsPersonnel=hrmsPersonnelServiceImpl.findByJobNum(jobnum);
        resJSONResult.setData(hrmsPersonnel);
        resJSONResult.setStatus(200);
        resJSONResult.setMessage("success");
        return resJSONResult;
    }


    @RequestMapping("/getRedisValue")
    public ResJSONResult getRedisValue(){
        List<HrmsPersonnel> list =hrmsPersonnelServiceImpl.findAll(new HrmsPersonnel(),1,3);
        redisOperator.set("persons",JSON.toJSONString(list),2000);
        String  jsonlist=redisOperator.get("persons");
        List<HrmsPersonnel> plist=JSON.parseArray(jsonlist,HrmsPersonnel.class);
        return  ResJSONResult.ok(plist);
    }
}
