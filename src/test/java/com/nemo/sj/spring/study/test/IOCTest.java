package com.nemo.sj.spring.study.test;

import com.nemo.sj.spring.bean.Persion;
import com.nemo.sj.spring.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * create by Nemo
 * 2018/9/17  10:13
 */

public class IOCTest {

    @SuppressWarnings("resource")
    @Test
    public  void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }


    }
}
