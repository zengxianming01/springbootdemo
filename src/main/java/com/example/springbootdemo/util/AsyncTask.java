package com.example.springbootdemo.util;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @ClassName: AsyncTask
 * @Description: 异步任务
 * @Author: ZXM
 * @Date:2018/5/21 14:47
 * @Version：
 **/
@Component
public class AsyncTask {
    @Async
    public Future<Boolean> dotask1() throws InterruptedException {
        long start=System.currentTimeMillis();
        Thread.sleep(1000);
        long end=System.currentTimeMillis();
        System.out.println("任务1耗时："+(end-start)+"毫秒");
        return  new AsyncResult<>(true);

    }
    @Async
    public Future<Boolean> dotask2() throws InterruptedException {
        long start=System.currentTimeMillis();
        Thread.sleep(600);
        long end=System.currentTimeMillis();
        System.out.println("任务2耗时："+(end-start)+"毫秒");
        return  new AsyncResult<>(true);

    }
    @Async
    public Future<Boolean> dotask3() throws InterruptedException {
        long start=System.currentTimeMillis();
        Thread.sleep(700);
        long end=System.currentTimeMillis();
        System.out.println("任务3耗时："+(end-start)+"毫秒");
        return  new AsyncResult<>(true);

    }
}
