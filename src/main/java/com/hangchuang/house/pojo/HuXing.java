package com.hangchuang.house.pojo;

public class HuXing {
    private Integer id;

    private String huxing;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHuxing() {
        return huxing;
    }

    public void setHuxing(String huxing) {
        this.huxing = huxing == null ? null : huxing.trim();
    }
}