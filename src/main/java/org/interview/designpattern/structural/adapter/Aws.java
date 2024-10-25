package org.interview.designpattern.structural.adapter;

public class Aws implements fileStorage{
    @Override
    public void writeFile() {
        System.out.println("write");
    }

    @Override
    public void readFile() {
        System.out.println("read");
    }
}
