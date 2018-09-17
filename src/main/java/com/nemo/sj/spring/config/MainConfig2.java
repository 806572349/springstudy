package com.nemo.sj.spring.config;

import com.nemo.sj.spring.bean.Color;
import com.nemo.sj.spring.bean.ColorFactoryBean;
import com.nemo.sj.spring.bean.Persion;
import com.nemo.sj.spring.condition.Linuxcondition;
import com.nemo.sj.spring.condition.MyImportBeanDefinitionRegistrar;
import com.nemo.sj.spring.condition.MyImprotSelector;
import com.nemo.sj.spring.condition.Windowscondition;
import org.springframework.context.annotation.*;

/**
 * create by Nemo
 * 2018/9/17  14:04
 */
// 满足当前条件，这个类中配置的所有bean 注册才能生效
//@Conditional({Linuxcondition.class})
@Configuration
@Import({Color.class,MyImprotSelector.class,MyImportBeanDefinitionRegistrar.class})
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
//    @Scope("prototype")//Scope注解调整作用域
    @Lazy
    @Bean("person2")
    public Persion persion22(){
        System.out.println("给容器中添加persion22....");
        return new Persion("1234");
    }


    /**
     *   单实例bean  默认在容器启动的时候创建对象
     *
     *     懒加载： 容器启动不创建对象，第一次使用（获取）bean 创建对象，并初始化
     *
     *     */


    /**
     * @Conditional  按照一定的条件进行判断，满足条件给容器中注册bean
     *
     *  如果时windows 给容器中注册（“bill”）
     *  如果时linux 给容器中注册（“linus”）
     *
     */
    @Conditional({Windowscondition.class})
    @Bean("bill")
    public  Persion person3(){
        System.out.println("bill....");
        return new Persion("4234");

    }

    @Conditional({Linuxcondition.class})
    @Bean("linus")
    public  Persion person4(){
        System.out.println("linus....");
        return new Persion("asd");

    }
    /**
     *
     * 给容器中注册组件
     * 1.扫描包 和组件注解
     * 2. @Bean
     * 3.@Import{快速给容器中导入一个组件}
     *      1@Import(要导入的类型)
     *      2ImportSelector:返回需要导入的组件的全类名数组
     *      3 ImportBeanDefinitionRegistrar  手动注册bean
     * 4. 使用Spring 提供的FactortyBean （工厂Bean）
     *      1. 默认获取到的是工厂bean 调用getobject创建的对象
     *      2.要获取工厂bean本身，需要加上&+名称 就可以获取工厂bean本身  BeanFactory有介绍
     *
     */
    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return  new ColorFactoryBean();
    }


}
