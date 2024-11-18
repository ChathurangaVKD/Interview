package org.interview.oop.overloading;

public class Calculator {
    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));        // Calls method with two integers
        System.out.println(calc.add(5, 10, 15));   // Calls method with three integers
        System.out.println(calc.add(5.5, 10.5));   // Calls method with two doubles
    }
}