package org.interview.designpattern.structural.decorator;

public abstract class ContentDecorator implements Content{
    protected Content content;

    public ContentDecorator(Content content) {
        this.content = content;
    }

    @Override
    public String process() {
        return content.process();
    }
}
