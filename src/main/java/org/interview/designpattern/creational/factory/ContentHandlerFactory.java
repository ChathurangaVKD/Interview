package org.interview.designpattern.creational.factory;

public class ContentHandlerFactory {
    public ContentHandler getContentHandler(String phoneType) {
        if (phoneType.equals("video")) {
            return new VideoContentHandler();
        } else if (phoneType.equals("audio")) {
            return new AudioContentHandler();
        } else {
            return null;
        }
    }
}
