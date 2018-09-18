package com.nemo.sj.spring.config;

import com.nemo.sj.spring.bean.Persion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * create by Nemo
 * 2018/9/18  15:11
 */
//加载外部@PropertySource 配置文件 kv 形式
    // 取值@Value("${persion.nickName}")
@PropertySource(value = {"classpath:/persion.properties"})
@Configuration
public class MainConfigofPropertyvalues {

    @Bean
    public Persion persion(){
        return new Persion("asd");
    }

}
