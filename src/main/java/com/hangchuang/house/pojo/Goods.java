package com.hangchuang.house.pojo;

public class Goods {
    private Integer id;

    private String good;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good == null ? null : good.trim();
    }
}