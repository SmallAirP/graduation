package com.graduation.bean;

import java.util.List;

public class Content {
    private ForumQuestion_u question_u;
    private List<ForumAnswer_u> answers_u;

    public ForumQuestion_u getQuestion_u() {
        return question_u;
    }

    public void setQuestion_u(ForumQuestion_u question_u) {
        this.question_u = question_u;
    }

    public List<ForumAnswer_u> getAnswers_u() {
        return answers_u;
    }

    public void setAnswers_u(List<ForumAnswer_u> answers_u) {
        this.answers_u = answers_u;
    }

    @Override
    public String toString() {
        return "Content{" +
                "question_u=" + question_u +
                ", answers_u=" + answers_u +
                '}';
    }
}
