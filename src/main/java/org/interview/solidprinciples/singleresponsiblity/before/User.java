package org.interview.solidprinciples.singleresponsiblity.before;

/* Violate SRP */
public abstract class User {
    public abstract void userCreate();
    public abstract void emailNotification();
}
