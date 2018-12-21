package com.softnero.annotation;

public interface Animal {
    @TestAnnotation("input yourinfo:")
    void setName(String name);

    String getName();
}
