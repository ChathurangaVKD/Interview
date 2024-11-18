package org.interview.designpattern.structural.decorator;

public class ClientCode {
    public static void main(String[] args) {
        // create video content
        Content content = new VideoContent();

        // add thumbnails using decorator
        Content thumbnailContent = new VideoThumbnailsDecorator(content);

        System.out.println(thumbnailContent.process());
    }
}
