package com.nemo.sj.spring.condition;

import com.nemo.sj.spring.bean.Color;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * create by Nemo
 * 2018/9/17  17:29
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *
     * @param importingClassMetadata 当前类的注解信息
     * @param registry  注册类，把所有需要添加到容器中的bean   registerBeanDefinition
     *
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {


        boolean color = registry.containsBeanDefinition("color");
        if (color){

        }
        //指定bean定义信息  bean 的类型
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Color.class);
        //指定bean 名
        registry.registerBeanDefinition("asd",rootBeanDefinition);
    }
}
