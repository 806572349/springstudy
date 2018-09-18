package com.nemo.sj.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * create by Nemo
 * 2018/9/18  13:44
 */
public class Car implements InitializingBean,DisposableBean {

    public Car() {
        System.out.println("car constructor");
    }

    private void init(){
        System.out.println("init");
    }

    private void d(){
        System.out.println("d");
    }

    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
