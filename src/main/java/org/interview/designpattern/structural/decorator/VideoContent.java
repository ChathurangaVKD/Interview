package org.interview.designpattern.structural.decorator;

public class VideoContent implements Content{

    @Override
    public String process() {
        return "Process Video Content";
    }
}
