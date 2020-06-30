package com.graduation.bean;

public class ForumQuestion_u {
    private ForumQuestion question;
    private User user;

    public ForumQuestion_u() {
    }

    public ForumQuestion_u(ForumQuestion question, User user) {
        this.question = question;
        this.user = user;
    }

    public ForumQuestion getQuestion() {
        return question;
    }

    public void setQuestion(ForumQuestion question) {
        this.question = question;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ForumQuestion_u{" +
                "question=" + question +
                ", user=" + user +
                '}';
    }
}
