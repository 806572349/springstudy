package com.nemo.sj.spring;

import com.nemo.sj.spring.bean.Persion;
import com.nemo.sj.spring.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by Nemo
 * 2018/9/17  9:58
 */
public class Maintest {
    @SuppressWarnings("resources")
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        Persion person = (Persion) applicationContext.getBean("person");
//        System.out.println(person.getName());

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);


        Persion persion = applicationContext.getBean(Persion.class);
        System.out.println(persion.getName());

        String[] names = applicationContext.getBeanNamesForType(Persion.class);

        for (String name : names) {
            System.out.println(name);
        }

    }
}
