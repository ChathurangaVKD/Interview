package org.interview.designpattern.behavioural.chainofresponsibility;

public class Level2SupportHandler extends Handler {
    @Override
    public void handleRequest(String issue, String level) {
        if ("L2".equalsIgnoreCase(level)) {
            System.out.println("Level 2 Support: Handling " + issue);
        } else {
            System.out.println("Level 2 Support: Escalating to Level 3...");
            if (nextHandler != null) {
                nextHandler.handleRequest(issue, level);
            }
        }
    }
}
