package com.graduation.bean;

public class ForumAnswer {
    private Integer id;
    private String content;
    private String time;
    private Integer userid;
    private Integer qid;


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

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    @Override
    public String toString() {
        return "ForumAnswer{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                ", userid=" + userid +
                ", qid=" + qid +
                '}';
    }
}
