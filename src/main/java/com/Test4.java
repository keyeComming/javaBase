package com;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author YZK
 * @Date 2024/7/6
 * @Desc
 */
public class Test4 {

    public static void main(String[] args) {
        //解析成员变量
        Class clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Hello annotation = declaredField.getAnnotation(Hello.class);
            if (annotation != null) {
                System.out.println(annotation.value());
                System.out.println(annotation.name());
            }
        }

        System.out.println("------------------------------------");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            Hello annotation = declaredMethod.getAnnotation(Hello.class);
            if (annotation != null) {
                System.out.println(annotation.value());
            }
        }
    }
}
