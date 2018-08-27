package com.example.springbootdemo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

public class User {
    private  String username;
    //忽略不显示
    @JsonIgnore
    private  String password;
    private  Integer id;
    private  Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a",timezone = "GMT+8",locale = "zh")
    private  Date birthday;
    //维护控制没有就不显示出这个数据，有就展示
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private  String desc;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
