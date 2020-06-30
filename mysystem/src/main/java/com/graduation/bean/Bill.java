package com.graduation.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class Bill {
    private Integer id;
    private Integer hid;
    private Integer charge;
    private String time;
    private Integer month;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", hid=" + hid +
                ", charge=" + charge +
                ", time='" + time + '\'' +
                ", month=" + month +
                '}';
    }
}
