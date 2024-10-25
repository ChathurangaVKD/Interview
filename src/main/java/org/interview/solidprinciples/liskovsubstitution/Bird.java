package org.interview.solidprinciples.liskovsubstitution;

/*
Violates LSP because not all birds can fly, creating unexpected behavior
 */
public class Bird {
    public void fly() {
        System.out.println("fly");
    }
}