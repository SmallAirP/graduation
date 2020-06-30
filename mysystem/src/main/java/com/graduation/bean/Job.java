package com.graduation.bean;

public class Job {
    private Integer jobId;
    private String jobName;
    private String details;
    private Float salary;
    private Integer number;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                ", details='" + details + '\'' +
                ", salary=" + salary +
                ", number=" + number +
                '}';
    }
}
