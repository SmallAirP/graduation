package com.graduation.bean;

public class JobAU {
    private Job job;
    private User user;

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "JobAU{" +
                "job=" + job +
                ", user=" + user +
                '}';
    }
}
