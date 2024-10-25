package org.interview.solidprinciples.dependencyinversion;

public class Car {
    private final Engine engine; // loosely couple

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.getEngine();
    }
}
