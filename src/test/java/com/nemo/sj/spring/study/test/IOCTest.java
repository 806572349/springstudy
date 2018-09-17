package com.nemo.sj.spring.study.test;

import com.nemo.sj.spring.bean.Persion;
import com.nemo.sj.spring.config.MainConfig;
import com.nemo.sj.spring.config.MainConfig2;
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

    @Test
    public  void test2(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        Object person2 = applicationContext.getBean("person2");
//        Object person3 = applicationContext.getBean("person2");


    }
}
