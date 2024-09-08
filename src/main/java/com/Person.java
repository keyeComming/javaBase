package com;

public class Person {
    @Hello(value = "name", name = "123")
    private String name;

    @Hello(value = "show", name = "321")
    public void show() {
        System.out.println("方法调用");
    }
}
