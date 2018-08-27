package com.example.springbootdemo.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: TimeTask
 * @Description: 定时任务
 * @Author: ZXM
 * @Date:2018/5/21 14:15
 * @Version：
 **/
@Component
public class TimeTask {
    private static  final SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
    /*
    * @MethodName：reportCurrentTime
    * @Description：每三秒执行一次
    * @Date：14:18 2018/5/21
    * @Param:[]
    * @Return:void
    **/
    @Scheduled(cron = "0/10 * * * * ? ")//每隔10秒执行一次
    public void reportCurrentTime(){
        System.out.println("现在时间是："+sdf.format(new Date()));
    }

}
