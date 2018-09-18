package com.nemo.sj.spring.study.test;

import com.nemo.sj.spring.bean.MyBeanPostProcessor;
import com.nemo.sj.spring.bean.Persion;
import com.nemo.sj.spring.config.MainConfiLifeCycle;
import com.nemo.sj.spring.config.MainConfig2;
import com.nemo.sj.spring.config.MainConfigofPropertyvalues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * create by Nemo
 * 2018/9/18  15:11
 */
public class IOCPropertyvalues {
    AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfigofPropertyvalues.class);


    @Test
    public void test(){
        printBean();
        System.out.println("==========================");

        Persion persion = (Persion) applicationContext.getBean("persion");
        System.out.println(persion);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();

        String property = environment.getProperty("persion.nickName");
        System.out.println(property);
        System.out.println("创建完成");
    }

    private void  printBean(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }



    }

}
