package org.interview.designpattern.behavioural.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        // Create the support handlers
        Handler l1Support = new Level1SupportHandler();
        Handler l2Support = new Level2SupportHandler();
        Handler l3Support = new Level3SupportHandler();

        // Set the chain of responsibility
        l1Support.setNextHandler(l2Support);
        l2Support.setNextHandler(l3Support);

        // Test different cases
        System.out.println("---- Handling L1 Issue ----");
        l1Support.handleRequest("Password Reset", "L1");

        System.out.println("\n---- Handling L2 Issue ----");
        l1Support.handleRequest("System Crash", "L2");

        System.out.println("\n---- Handling L3 Issue ----");
        l1Support.handleRequest("Database Failure", "L3");

        System.out.println("\n---- Handling Unknown Level Issue ----");
        l1Support.handleRequest("Unknown Issue", "L4");
    }
}