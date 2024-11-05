package org.interview.designpattern.creational.factory;

public class VideoContentHandler implements ContentHandler {

    @Override
    public String process() {
        return "Video";
    }
}
