package com.nemo.sj.spring.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * create by Nemo
 * 2018/9/17  17:57
 */
//创建Spring 定义的
public class ColorFactoryBean  implements FactoryBean<Color> {

    public Color getObject() throws Exception {
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }
    // true 单例
    // false  多实例 每次获取创建一个新的
    public boolean isSingleton() {
        return true;
    }
}
