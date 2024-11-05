package org.interview.designpattern.creational.factory;

public class ClientCode {
    public static void main(String[] args) {
        ContentHandler videoContentHandler = new ContentHandlerFactory().getContentHandler("video");
        System.out.println(videoContentHandler.process());
    }
}