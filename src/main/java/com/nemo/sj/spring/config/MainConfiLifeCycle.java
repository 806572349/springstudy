package com.nemo.sj.spring.config;

import com.nemo.sj.spring.bean.Car;
import com.nemo.sj.spring.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 *BeanPostProcessor原理
 * 遍历得到容器中所有的BeanPostProcessor，挨个执行 BeforeInitialization，
 * 一旦返回null 跳出for 循环，不会执行后面的BeanPostProcessor  applyBeanPostProcessorsBeforeInitialization
 * populateBean(beanName, mbd, instanceWrapper)
 * initializeBean
 * {
 * applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
 * invokeInitMethods(beanName, wrappedBean, mbd);//自定义初始化方法
 *
 * applyBeanPostProcessorsAfterInitialization(wrappedBean, beanName);
 *}
 *
 * bean 的生命周期：
 *          bean创建---初始化--- 销毁过程
 *          容器管理bean 的生命周期
 *          我们可以自定义初始化和销毁方法；容器在bean进行到当前生命周期的时候来调用我们自定义的初始化和摧毁方法
 *   构造（对象创建）
 *          单实例 在容器启动的时候创建对象
 *          多实例 获取时创建对象
 *  初始化：
 *          对象创建完成，并赋值好，调用初始化方法
 *
 *    销毁：
 *          单实例 :容器关闭的时候
 *          多实例：容器不会管理这个bean  容器不会调用销毁方法
 *
 *   1 指定初始化和销毁方法：
 *          @Bean注解指定init-method="" destroy-method=""
 *   2 通过Bean实现InitalizingBean（定义初始化逻辑），
 *   DisposableBean(定义销毁的)
 *
 *   3 可以使用JSR250
 * @PostConstruct 在bean 创建完成并且属性赋值完成，来执行初始化方法
 * @PreDstroy 在容器销毁bean 之前通知我们进行清理工作
 *
 * 4 @BeanPostProcessor  bean的后置处理器：
 * 在bean初始化前后进行一些工作
 *
 * postProcessBeforeInitialization :在初始化之前
 *
 * postProcessAfterInitialization : 在初始化之后
 *
 *
 * spring底层对BeanPostProcessor的使用
 *      bean 赋值，注入其他组件，@Authowired  生命周期注解功能，
 *
 * create by Nemo
 * 2018/9/18  13:38
 */
@Configuration
public class MainConfiLifeCycle {

//    @Bean(initMethod = "init",destroyMethod = "d")
    public Car car(){
        return  new Car();
    }

    @Bean
    public Dog Dog(){
        return  new Dog();
    }
}
