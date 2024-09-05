package org.myproject.ObjectCreation.UsingBeanAnno;

import org.springframework.context.annotation.Bean;

public class Person {
    private String name;
    private int age;
    public Person() {
        System.out.println("Person Constructor called.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
