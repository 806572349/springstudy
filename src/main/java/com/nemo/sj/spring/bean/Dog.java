package com.nemo.sj.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * create by Nemo
 * 2018/9/18  13:44
 */
@Component
public class Dog implements ApplicationContextAware {

    private ApplicationContext applicationContext;


    public Dog() {
        System.out.println("Dog constructor");
    }

    @PostConstruct
    private void init(){
        System.out.println(" Dog init");
    }

    @PreDestroy
    private void d(){
        System.out.println("  Dog d");
    }

    public void destroy() throws Exception {
        System.out.println(" Dog destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Dog afterPropertiesSet");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}
