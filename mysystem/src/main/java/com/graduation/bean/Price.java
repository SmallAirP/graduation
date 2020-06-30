package com.graduation.bean;

public class Price {
    private Integer id;
    private Float price;
    private Integer month;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", price=" + price +
                ", month=" + month +
                '}';
    }
}
