package org.interview.solidprinciples.openandclosed.packages;

import org.solidprinciples.openandclosed.Package;

public class Wiley implements Package {
    @Override
    public String getPackage() {
        System.out.println("Wiley");
        return "Wiley";
    }
}
