package com.nemo.sj.spring.config;

import com.nemo.sj.spring.bean.Persion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * create by Nemo
 * 2018/9/17  14:04
 */
@Configuration
public class MainConfig2 {

    /**
     * Specifies the name of the scope to use for the annotated component/bean.
     * <p>Defaults to an empty string ({@code ""}) which implies
     * {@link ConfigurableBeanFactory#SCOPE_SINGLETON SCOPE_SINGLETON}.
     * @since 4.2
     * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
     * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
     * @see #value
     *
     * prototype   多实例  ioc 容器启动时不会放到ioc  ,每次调用才去获取
     * singleton   单实例  ioc容器启动会调用方法创建对象放到ioc 容器中。
     *              以后每次获取就是从容器中拿。
     *
     *
     * request 同一次请求创建一个实例
     *
     *
     * session  同一个session 创建一个实例
     *
     */
    @Scope("prototype")//Scope注解调整作用域
    @Bean("person2")
    public Persion persion22(){
        System.out.println("给容器中添加persion22....");
        return new Persion("1234");
    }
}
