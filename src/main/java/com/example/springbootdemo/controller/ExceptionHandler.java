package com.example.springbootdemo.controller;

import com.example.springbootdemo.vo.ResJSONResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常捕获
 */
@ControllerAdvice
public class ExceptionHandler {
    public  static  final String errorPage="error";
    @org.springframework.web.bind.annotation.ExceptionHandler(value = RuntimeException.class)//此注解的作用是当出现其定义的异常时进行处理的方法
    public  Object HandlerException(HttpServletResponse response, HttpServletRequest request, Exception e) throws  Exception{
        e.printStackTrace();
        if (isAjax(request)){
            return  ResJSONResult.errorException(e.getMessage());
        }else {
            ModelAndView modelAndView=new ModelAndView();
            modelAndView.addObject("exception",e);
            modelAndView.addObject("url",request.getRequestURL());
            modelAndView.setViewName(errorPage);
            return  modelAndView;
        }
    }

    public Boolean isAjax(HttpServletRequest request){
        return request.getHeader("X-Requested-With")!=null
                &&"XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString());
    }
}
