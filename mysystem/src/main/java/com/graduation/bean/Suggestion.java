package com.graduation.bean;

public class Suggestion {
    private Integer id;
    private String sname;
    private String sphone;
    private String smail;
    private String scontent;
    private String  stime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getSmail() {
        return smail;
    }

    public void setSmail(String smail) {
        this.smail = smail;
    }

    public String getScontent() {
        return scontent;
    }

    public void setScontent(String scontent) {
        this.scontent = scontent;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }


    @Override
    public String toString() {
        return "Suggestion{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", sphone='" + sphone + '\'' +
                ", smail='" + smail + '\'' +
                ", scontent='" + scontent + '\'' +
                ", stime='" + stime + '\'' +
                '}';
    }
}
