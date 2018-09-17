package com.nemo.sj.spring.bean;

/**
 * create by Nemo
 * 2018/9/17  9:54
 */
public class Persion {


    public Persion(String name) {
        this.name = name;
    }

    String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
