package org.interview.solidprinciples.liskovsubstitution.supportLSP;

public class NewPenguin extends NewBird{
    @Override
    public void fly() {
        System.out.println("Can't Fly");
    }
}
