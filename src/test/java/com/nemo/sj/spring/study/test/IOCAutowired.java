package com.nemo.sj.spring.study.test;

import com.nemo.sj.spring.bean.Persion;
import com.nemo.sj.spring.config.AutowiredConfig;
import com.nemo.sj.spring.config.MainConfigofPropertyvalues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * create by Nemo
 * 2018/9/18  16:30
 */
public class IOCAutowired {

    AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(AutowiredConfig.class);

    @Test
    public  void  test(){
        printBean();
        System.out.println("==========================");

        System.out.println("创建完成");

    }
    private void  printBean(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }



    }

}
