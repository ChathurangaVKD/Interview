package org.interview.designpattern.behavioural.chainofresponsibility;

public abstract class Handler {
    public Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String issue, String level);
}
