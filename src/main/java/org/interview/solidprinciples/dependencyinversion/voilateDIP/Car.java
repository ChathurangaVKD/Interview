package org.interview.solidprinciples.dependencyinversion.voilateDIP;
import org.interview.solidprinciples.dependencyinversion.GasEngine;

public class Car {
    private final GasEngine gasEngine = new GasEngine(); // toughly couple

    public void start() {
        gasEngine.getEngine();
    }
}
