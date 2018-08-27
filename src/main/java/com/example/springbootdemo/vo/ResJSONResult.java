package com.example.springbootdemo.vo;

import com.fasterxml.jackson.databind.ObjectMapper;
/**
 *
 * @Title: .java
 * @Package
 * @Description: 自定义响应数据结构
 * 				这个类是提供给门户，ios，安卓，微信商城用的
 * 				门户接受此类数据后需要使用本类的方法转换成对于的数据类型格式（类，或者list）
 * 				其他自行处理
 * 				200：表示成功
 * 				500：表示错误，错误信息在message字段中
 * 				501：bean验证错误，不管多少个错误都以map形式返回
 * 				502：拦截器拦截到用户token出错
 * 				555：异常抛出信息
 * Copyright: Copyright (c) 2016
 * Company:Nathan.Lee.Salvatore
 *
 */
public class ResJSONResult {
    //定义jackson对象
    private  static final ObjectMapper MAPPER=new ObjectMapper();
    //响应业务状态
    private Integer status;
    // 响应消息
    private String  message;
    //响应数据
    private Object  data;
    private  String ok;
    public static ResJSONResult build(Integer status, String msg, Object data) {
        return new ResJSONResult(status, msg, data);
    }

    public static ResJSONResult ok(Object data) {
        return new ResJSONResult(data);
    }

    public static ResJSONResult ok() {
        return new ResJSONResult(null);
    }

    public static ResJSONResult errorMsg(String msg) {
        return new ResJSONResult(500, msg, null);
    }

    public static ResJSONResult errorMap(Object data) {
        return new ResJSONResult(501, "error", data);
    }

    public static ResJSONResult errorTokenMsg(String msg) {
        return new ResJSONResult(502, msg, null);
    }

    public static ResJSONResult errorException(String msg) {
        return new ResJSONResult(555, msg, null);
    }

    public ResJSONResult() {

    }

//    public static LeeJSONResult build(Integer status, String message) {
//        return new LeeJSONResult(status, message, null);
//    }

    public ResJSONResult(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResJSONResult(Object data) {
        this.status = 200;
        this.message = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }


    public static ObjectMapper getMAPPER() {
        return MAPPER;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }
}
