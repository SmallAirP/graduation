package com.graduation.bean;

public class ForumAnswer_u {
    private ForumAnswer answer;
    private User user;

    public ForumAnswer_u() {
    }

    public ForumAnswer_u(ForumAnswer answer, User user) {
        this.answer = answer;
        this.user = user;
    }

    public ForumAnswer getAnswer() {
        return answer;
    }

    public void setAnswer(ForumAnswer answer) {
        this.answer = answer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ForumAnswer_u{" +
                "answer=" + answer +
                ", user=" + user +
                '}';
    }
}
