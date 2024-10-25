package org.interview.designpattern.behavioural.chainofresponsibility;

public class Level1SupportHandler extends Handler {
    @Override
    public void handleRequest(String issue, String level) {
        if ("L1".equalsIgnoreCase(level)) {
            System.out.println("Level 1 Support: Handling " + issue);
        } else {
            System.out.println("Level 1 Support: Escalating to Level 2...");
            if (nextHandler != null) {
                nextHandler.handleRequest(issue, level);
            }
        }
    }
}
