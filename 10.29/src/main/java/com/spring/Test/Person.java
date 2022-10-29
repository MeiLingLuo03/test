package com.spring.Test;

public class Person {

    private String name;
    private String age;

    Person(){
        System.out.println("21312");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void cat(){
        System.out.println("hello");
    }
}
