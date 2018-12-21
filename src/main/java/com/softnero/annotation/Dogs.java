package com.softnero.annotation;

/**
 * @Author Martin Ma
 * @Date 2018/12/21
 **/
public class Dogs implements Animal {

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
