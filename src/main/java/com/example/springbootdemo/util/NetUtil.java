package com.example.springbootdemo.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @ClassName: NetUtil
 * @Description: TODO
 * @Author: ZXM
 * @Date:2018/6/7 8:47
 * @Version：
 **/
public class NetUtil {

    /*
    * @MethodName：get
    * @Description：
    * @Date：8:51 2018/6/7
    * @Param:[url]
    * @Return:java.lang.String 
    **/
    public  static String get(String url){
        HttpClient client=HttpClients.createDefault();
        RequestConfig config=RequestConfig.custom()
                .setConnectTimeout(5000) //设置超时时间
                .setConnectionRequestTimeout(5000) // 设置请求超时时间
                .setSocketTimeout(5000)
                .setRedirectsEnabled(true)
                .build();
        HttpGet get=new HttpGet(url);
        get.setConfig(config);
        HttpResponse response=null;
        try {
            response=client.execute(get);
            HttpEntity entity=response.getEntity();
            return EntityUtils.toString(entity,"utf-8");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
    /*
    * @MethodName：post
    * @Description：
    * @Date：10:54 2018/6/7
    * @Param:[url, jsonstr]
    * @Return:java.lang.String 
    **/
    public static  String post(String url,String jsonstr){
        HttpClient ie=HttpClients.createDefault();
        HttpPost post=new HttpPost(url);
        post.addHeader("content-Type","application/json;charset=utf-8");
        post.setEntity(new StringEntity(jsonstr,"utf-8"));
        HttpResponse response=null;
        HttpEntity entity=null;
        try {
            response=ie.execute(post);
            entity=response.getEntity();
            return  EntityUtils.toString(entity);
        } catch (IOException e) {
            e.printStackTrace();
            return  null;
        }
    }
}
