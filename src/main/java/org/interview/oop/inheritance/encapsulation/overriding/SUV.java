package org.interview.oop.inheritance.encapsulation.overriding;

public class SUV extends Car{
    public SUV(String licenceId) {
        super(licenceId);
    }

    // Support Inheritance
    @Override
    public void displayInfo() {
        System.out.println("SUV: " + getLicenceId());
    }
}
