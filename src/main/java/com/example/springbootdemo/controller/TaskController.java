package com.example.springbootdemo.controller;

import com.example.springbootdemo.util.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @ClassName: TaskController
 * @Description: TODO
 * @Author: ZXM
 * @Date:2018/5/21 14:56
 * @Version：
 **/
@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    AsyncTask asyncTask;

    @RequestMapping("/task")
    public String doasync() throws InterruptedException {
        long start=System.currentTimeMillis();
        Future<Boolean> a=asyncTask.dotask1();
        Future<Boolean> b=asyncTask.dotask2();
        Future<Boolean> c=asyncTask.dotask3();
        while (!a.isDone() || !b.isDone()||!c.isDone()){
            if (a.isDone()&&b.isDone()&&c.isDone()){
                break;
            }
        }
        long end=System.currentTimeMillis();
        String times="耗时："+(end-start)+"毫秒";
        System.out.println(times);
        return  times;
    }
}
