package org.interview.designpattern.creational.builder;

public class ClientCode {
    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder()
                .setName("Dasun")
                .setAge(35)
                .getEmployee();

        System.out.println(employee);
    }
}