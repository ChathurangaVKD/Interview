package org.interview.solidprinciples.openandclosed;

public class PackageManager {
    private final Package aPackage;

    public PackageManager(Package aPackage) {
        this.aPackage = aPackage;
    }

    public void handlePackage() {
        aPackage.getPackage();
    }
}
