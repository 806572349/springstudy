package com.nemo.sj.spring.study.test;

import com.nemo.sj.spring.config.MainConfiLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * create by Nemo
 * 2018/9/18  13:45
 */

public class IOCLifeCycle {

    @Test
    public  void test(){
        AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext(MainConfiLifeCycle.class);
        System.out.println("创建完成");

        configApplicationContext.close();

    }


}
