package org.interview.solidprinciples.dependencyinversion;

public class GasEngine implements Engine{
    @Override
    public String getEngine() {
        return "GasEngine";
    }
}
