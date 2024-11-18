package org.interview.oop.inheritance.encapsulation.overriding;

public class Sedan extends Car {
    public Sedan(String licenceId) {
        super(licenceId);
    }

    // Support Inheritance + polymorphism
    @Override
    public void displayInfo() {
        System.out.println("Sedan: " + getLicenceId());
    }
}
