package com.softnero.annotation;

/**
 * @Author Martin Ma
 * @Date 2018/12/21
 **/
public class AnnotationTest {

    public static void main(String[] args) {
        Animal dog = DynamicProxyFactory.getBean(Animal.class);
        dog.setName("Camron");
    }


}
