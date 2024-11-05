package org.interview.solidprinciples.openandclosed;


import org.interview.solidprinciples.openandclosed.packages.EdPub;
import org.interview.solidprinciples.openandclosed.packages.Wiley;

public class ViolateOC {
    public void handlePackage(String type) {
//       type if ("1".equals(type)) {
//            new EdPub().getPackage();
//        } else if ("2".equals(type)) {
//            new Wiley().getPackage();
//        } else {
//            System.out.println("Empty Package");
//        }
        // need to modify this class for extending with new types
    }
}
