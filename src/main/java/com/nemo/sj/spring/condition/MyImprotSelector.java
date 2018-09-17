package com.nemo.sj.spring.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * create by Nemo
 * 2018/9/17  16:08
 */
//自定义
public class MyImprotSelector implements ImportSelector {
    /**
     *
     * @param importingClassMetadata  @Import注解类的所有注解信息
     * @return 容器中组件全类名
     *
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {


        return new String[]{"com.nemo.sj.spring.bean.Bule"};
    }
}
