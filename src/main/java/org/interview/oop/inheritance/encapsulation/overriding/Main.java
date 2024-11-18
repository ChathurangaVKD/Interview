package org.interview.oop.inheritance.encapsulation.overriding;

public class Main {
    public static void main(String[] args) {
        Car suv = new SUV("11111");
        Car sedan = new Sedan("2345");
        suv.displayInfo();
        sedan.displayInfo();
    }
}
