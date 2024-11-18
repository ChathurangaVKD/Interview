package org.interview.designpattern.structural.decorator;

public class VideoThumbnailsDecorator extends ContentDecorator{

    public VideoThumbnailsDecorator(Content content) {
        super(content);
    }

    @Override
    public String process() {
        return content.process() + addThumbnails();
    }

    public String addThumbnails() {
        return " + adding Thumbnails by VideoThumbnailsDecorator";
    }
}
