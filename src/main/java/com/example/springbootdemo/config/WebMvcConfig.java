package com.example.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName: WebMvcConfig
 * @Description: TODO
 * @Author: ZXM
 * @Date:2018/5/21 15:16
 * @Version：
 **/
@Configuration //表明这是一个配置类
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
        *按顺序执行
        **/
        registry.addInterceptor(new OneIntercepter()).addPathPatterns("/tasks/task").excludePathPatterns("/path_login");
        super.addInterceptors(registry);
    }
}
