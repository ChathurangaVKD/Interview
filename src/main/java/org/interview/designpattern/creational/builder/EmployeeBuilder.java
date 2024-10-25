package org.interview.designpattern.creational.builder;

public class EmployeeBuilder {
    private String name;
    private int age;

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Employee getEmployee() {
        return new  Employee(name, age);
    }
}
