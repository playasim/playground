package com.softnero.annotation;

import java.lang.reflect.Proxy;

/**
 * @Author Martin Ma
 * @Date 2018/12/21
 **/
public class DynamicProxyFactory {


    public static<T> T getBean(Class<T> clazz) {
        DynamicProxy dynamicProxy = new DynamicProxy();
        T t = (T) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class[] {clazz},
                dynamicProxy);
        return t;
    }

}
