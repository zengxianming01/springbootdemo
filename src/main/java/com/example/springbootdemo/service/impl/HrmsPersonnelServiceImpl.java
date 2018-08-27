package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.mapper.HrmsPersonnelMapper;
import com.example.springbootdemo.pojo.HrmsPersonnel;
import com.example.springbootdemo.service.HrmsPersonnelService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class HrmsPersonnelServiceImpl implements HrmsPersonnelService {
    @Autowired
    HrmsPersonnelMapper hrmsPersonnelMapper;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public HrmsPersonnel findByJobNum(String personnelJobNum) {

        return hrmsPersonnelMapper.findByJobNum(personnelJobNum).get(0);
    }

    @Override
    @Transactional(propagation =Propagation.REQUIRED)
    public void deleteByid(Integer id) {
        hrmsPersonnelMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<HrmsPersonnel> findAll(HrmsPersonnel hrmsPersonnel, Integer page, Integer pageSize) {
        //开始分页
        PageHelper.startPage(page,pageSize);
        Example example=new Example(hrmsPersonnel.getClass());
        Example.Criteria criteria=example.createCriteria();
        //根据名称模糊查询
        if (!StringUtils.isEmptyOrWhitespace(hrmsPersonnel.getPersonnelName()))
        {
            criteria.andLike("personnelName","%"+hrmsPersonnel.getPersonnelName()+"%");
        }
        //按某项属性排序
        example.orderBy("personnelJobNum").desc();


        return hrmsPersonnelMapper.selectByExample(example);
    }
}
