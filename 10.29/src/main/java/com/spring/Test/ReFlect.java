package com.spring.Test;

import java.lang.reflect.Method;

public class ReFlect {


    public static void test() throws ClassNotFoundException {
        Class aClass = Person.class.getClassLoader().loadClass("Person");
    }
    public static void main(String[] args) throws ClassNotFoundException {

        test();

    }
}
