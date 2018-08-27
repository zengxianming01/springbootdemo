package com.example.springbootdemo.controller;

import com.example.springbootdemo.vo.ResJSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class AjaxExceptionHandler {

       @ExceptionHandler(value = Exception.class)
       public ResJSONResult handlerException(HttpServletRequest request,Exception e) throws Exception{
              e.printStackTrace();
           return  ResJSONResult.errorException(e.getMessage());
       }


}
