package org.interview.oop.abstraction;

public class Cash implements Payment {
    @Override
    public void process() {
        System.out.println("CASH");
    }
}
