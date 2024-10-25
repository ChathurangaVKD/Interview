package org.interview.designpattern.creational.builder;

public class Employee {
    private final String name;
    private final int age;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [ name = " + name + ", age = " + age + "]" ;
    }
}
