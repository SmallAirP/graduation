package com.graduation.bean;

public class House {
    private Integer id;
    private Integer unit;
    private Integer floor;
    private Integer number;
    private Integer area;
    private Integer uid;

    public House(Integer unit, Integer floor, Integer number, Integer area, Integer uid) {
        this.unit = unit;
        this.floor = floor;
        this.number = number;
        this.area = area;
        this.uid = uid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", unit=" + unit +
                ", floor=" + floor +
                ", number=" + number +
                ", area=" + area +
                ", uid=" + uid +
                '}';
    }
}
