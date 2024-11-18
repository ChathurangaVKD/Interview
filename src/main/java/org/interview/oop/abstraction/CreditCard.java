package org.interview.oop.abstraction;

public class CreditCard implements Payment {
    @Override
    public void process() {
        System.out.println("CC");
    }
}
