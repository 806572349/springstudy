package com.nemo.sj.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 自动装配：
 * Spring   利用依赖注入（DI ） ,完成对IOC 容器中各个组件的依赖拐西赋值
 *
 *
 * @Autowired 自动注入
 *  service{
 *       1 默认优先按照类型去容器找对应的组件
 *       2 如果找到多个相同类型的组件，再将属性的名称作为组件的id去容器中查找
 *       3 @Qualifier  指定组件id
 *        4  自动装配默认一定要将属性赋值好，没有就会报错
 *        @Autowired(required = false)非必需
 *
 *        5 @Primary  让Spring  自动装配的时候，默认使用
 *
 *
 *
 *      @Autowired
 *      Dao dao
 *  }
 * create by Nemo
 * 2018/9/18  15:58
 */
@ComponentScan({"com.nemo.sj.spring.dao","com.nemo.sj.spring.service"})
@Configuration
public class AutowiredConfig {


}
