package org.interview.solidprinciples.liskovsubstitution.supportLSP;

public class NewParrot extends NewBird{
    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
