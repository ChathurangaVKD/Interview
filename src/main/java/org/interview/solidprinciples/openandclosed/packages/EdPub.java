package org.interview.solidprinciples.openandclosed.packages;

import org.solidprinciples.openandclosed.Package;

public class EdPub implements Package {
    @Override
    public String getPackage() {
        System.out.println("EdPub");
        return "EPub";
    }
}
