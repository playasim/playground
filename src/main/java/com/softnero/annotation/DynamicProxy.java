package com.softnero.annotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @Author Martin Ma
 * @Date 2018/12/21
 **/
public class DynamicProxy implements InvocationHandler {


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.isAnnotationPresent(TestAnnotation.class)) {
            String first = method.getAnnotation(TestAnnotation.class).value();
            String info = (String) args[0];
            System.out.println("----------------");
            System.out.println(first + info);
            System.out.println("----------------");
        }
        return null;
    }
}
