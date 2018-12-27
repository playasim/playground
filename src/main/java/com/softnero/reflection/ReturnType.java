package com.softnero.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Martin Ma
 * @Date 2018/12/27
 **/
public class ReturnType {

    public static void main(String[] args) {
        Class clazz = SampleClass.class;
        for (Method method : clazz.getMethods()) {
            Class methodClass = method.getReturnType();
            System.out.println("method name:   " + method.getName());
            System.out.println("return type:   " + method.getReturnType());
            System.out.println("generic return type:   " + method.getGenericReturnType());
            System.out.println("generic return type name:   " + method.getGenericReturnType().getTypeName());
            if (List.class.isAssignableFrom(methodClass)) {
                Type[] types = ((ParameterizedType)method.getGenericReturnType()).getActualTypeArguments();
                System.out.println("--------------------types-----------------------");
                for (Type type : types) {
                    System.out.println(type);
                }
            }
            System.out.println("----------------------------------");
        }


    }

}
