package org.interview.designpattern.creational.factory;

public class Main {
    public static void main(String[] args) {
        Phone phone = new PhoneFactory().getPhone("low");
        System.out.println(phone.getSpec());
    }
}