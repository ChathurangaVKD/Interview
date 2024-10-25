package org.interview.designpattern.creational.factory;

public class PhoneFactory {
    public Phone getPhone(String phoneType) {
        if (phoneType.equals("low")) {
            return new SamsungPhone();
        } else if (phoneType.equals("high")) {
            return new IPhone();
        } else {
            return null;
        }
    }
}
