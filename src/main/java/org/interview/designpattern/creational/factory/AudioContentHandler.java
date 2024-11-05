package org.interview.designpattern.creational.factory;

public class AudioContentHandler implements ContentHandler{
    @Override
    public String process() {
        return "Audio";
    }
}
