package org.interview.oop.inheritance.encapsulation.overriding;

public class Car {
    //  hiding data by encapsulation
    private String licenceId;

    public Car(String licenceId) {
        this.licenceId = licenceId;
    }
    //  provide getters and setters for accessing
    public void setLicenceId(String licenceId) {
        this.licenceId = licenceId;
    }

    public String getLicenceId() {
        return this.licenceId;
    }

    public void displayInfo() {
        System.out.println("Car Info");
    }
}
