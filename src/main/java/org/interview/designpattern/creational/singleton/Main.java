package org.interview.designpattern.creational.singleton;

import org.designpattern.creational.factory.Phone;
import org.designpattern.creational.factory.PhoneFactory;

public class Main {
    public static void main(String[] args) {
        Phone phone = new PhoneFactory().getPhone("low");
        System.out.println(phone.getSpec());
    }
}