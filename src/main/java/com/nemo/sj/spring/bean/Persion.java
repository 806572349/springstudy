package com.nemo.sj.spring.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * create by Nemo
 * 2018/9/17  9:54
 */
public class Persion {


    public Persion(String name) {
        this.name = name;
    }

    //使用@Value赋值
    // 1基本数值
    // SPEL
    // ${}
    @Value("pppppppppppppppppp")
    String name;

    @Value("${persion.nickName}")
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                '}';
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Value("#{2-9}")
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
