package com.example.springbootdemo;

import com.example.springbootdemo.mapper.HrmsPersonnelMapper;
import com.example.springbootdemo.mapper.WxuserinfoMapper;
import com.example.springbootdemo.pojo.HrmsPersonnel;
import com.example.springbootdemo.pojo.Wxuserinfo;
import com.example.springbootdemo.service.HrmsPersonnelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

    @Autowired
    private Sid sid;
    @Autowired
    private HrmsPersonnelMapper hrmsPersonnelMapper;
    @Autowired
    private HrmsPersonnelService hrmsPersonnelService;

    @Test
    public void contextLoads() {
        List<HrmsPersonnel> list = hrmsPersonnelMapper.findByJobNum("19643");
        for (HrmsPersonnel wx : list) {
            System.out.println(wx.getPersonnelName());
        }

    }

    @Test
    public void loadData() {
        HrmsPersonnel hrmsPersonnel = new HrmsPersonnel();
        List<HrmsPersonnel> list = hrmsPersonnelService.findAll(hrmsPersonnel, 1, 10);
        for (HrmsPersonnel hr : list) {
            System.out.println(hr);
        }
    }

    @Test
    public void two() {
        Map map = new HashMap<String, Object>();
        map.put("p_1", 2);
        map.put("p_2", 3);
        hrmsPersonnelMapper.getFunction(map);
        System.out.println("结果为：" + map.get("p_3"));
    }

    @Test
    public void three() {
        Map map = new HashMap<String, String>();
        map.put("val1", "Hello,");
//        hrmsPersonnelMapper.getProcedure(map);
        System.out.println(map.get("val2"));
    }

    @Test
    public void four() {
        int i = hrmsPersonnelMapper.getCount();
        System.out.println("结果为：" + i);

    }
}
