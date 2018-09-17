package com.nemo.sj.spring.config;

import com.nemo.sj.spring.bean.Persion;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**配置类
 * create by Nemo
 * 2018/9/17  10:01
 */
@Configuration

@ComponentScans(value = {
        @ComponentScan(value = "com.nemo.sj",
                includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class,Repository.class})
                ,useDefaultFilters = false
        )
})
//value c指定扫描包
//excludeFilters  Filter[]排除 某些
//includeFilters  Filter[]扫描的时候只需要包含哪些组件
public class MainConfig {
    //  默认id是用方法名作为id
    @Bean("person")
    public Persion persion22(){
        return new Persion("1234");
    }
}
