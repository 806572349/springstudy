package com.nemo.sj.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * create by Nemo
 * 2018/9/17  10:11
 */
@Repository
public class BookDao {

    private String label="1";


    @Override
    public String toString() {
        return "BookDao{" +
                "label='" + label + '\'' +
                '}';
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
