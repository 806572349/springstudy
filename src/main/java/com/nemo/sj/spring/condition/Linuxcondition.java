package com.nemo.sj.spring.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * create by Nemo
 * 2018/9/17  14:56
 */
public class Linuxcondition implements Condition {
    /**
     *
     * @param context 判断条件能使用的上下文
     * @param metadata 注释信息
     * @return
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //1.能获取ioc 使用的beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //2 获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        //3 获取环境
        Environment environment = context.getEnvironment();

        //4 获取到bean 定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();


        String property = environment.getProperty("os.name");
        if (property.contains("linux")){
            return true;
        }


        return false;
    }
}
