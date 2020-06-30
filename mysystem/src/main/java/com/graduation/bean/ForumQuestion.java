package com.graduation.bean;

public class ForumQuestion {
    private Integer id;
    private String content;
    private String time;
    private Integer userid;

    public ForumQuestion() {
        super();
    }

    public ForumQuestion(Integer id, String content, String time, Integer userid) {
        this.id = id;
        this.content = content;
        this.time = time;
        this.userid = userid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "ForumQuestion{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                ", userid=" + userid +
                '}';
    }
}
