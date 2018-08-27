package com.example.springbootdemo.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @ClassName: KaptchaConfig
 * @Description: TODO
 * @Author: ZXM
 * @Date:2018/5/16 8:24
 * @Version：
 **/
@Configuration
public class KaptchaConfig {
    @Bean(name = "captchaProducer")
    public DefaultKaptcha getKaptcha(){
        DefaultKaptcha kaptcha=new DefaultKaptcha();
        Properties properties=new Properties();
        properties.setProperty("kaptcha.border", "yes");
        properties.setProperty("kaptcha.border.color", "105,179,90");
        properties.setProperty("kaptcha.textproducer.font.color", "blue");
        properties.setProperty("kaptcha.image.width", "125");
        properties.setProperty("kaptcha.image.height", "45");
        properties.setProperty("kaptcha.session.key", "code");
        properties.setProperty("kaptcha.textproducer.char.length", "4");
        properties.setProperty("kaptcha.textproducer.font.names", "宋体,楷体,微软雅黑");
        properties.setProperty("kaptcha.noise.color","black");
        properties.setProperty("kaptcha.background.clear.from","185,56,213");
        properties.setProperty("kaptcha.background.clear.to","white");
        properties.setProperty("kaptcha.textproducer.char.space","3");
        Config config=new Config(properties);
        kaptcha.setConfig(config);
        return  kaptcha;
    }
}
