package org.interview.designpattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder()
                .setName("Dasun")
                .setAge(35)
                .getEmployee();

        System.out.println(employee);
    }
}