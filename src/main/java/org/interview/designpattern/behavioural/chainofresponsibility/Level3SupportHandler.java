package org.interview.designpattern.behavioural.chainofresponsibility;

public class Level3SupportHandler extends Handler {
    @Override
    public void handleRequest(String issue, String level) {
        if ("L3".equalsIgnoreCase(level)) {
            System.out.println("Level 3 Support: Handling " + issue);
        } else {
            System.out.println("Level 3 Support: Issue could not be handled.");
        }
    }
}
