package org.interview.solidprinciples.interfacesegregation;

public class ThreeDPrinter implements Printer{
    @Override
    public void scan() {
        // Violate ISP due to ThreeDPrinter not support to do scan
    }

    @Override
    public void print() {

    }

    @Override
    public void fax() {
        // Violate ISP due to ThreeDPrinter not support to do fax
    }
}
