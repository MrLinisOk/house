package com.hangchuang.house.pojo;

import java.math.BigDecimal;

public class LouPanHuXing {
    private Integer id;

    private String title;

    private String room;

    private String mianji;

    private BigDecimal price;

    private BigDecimal totalprice;

    private String introduce;

    private String houseimages;

    private Integer loupanId;

    private Integer tagId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    public String getMianji() {
        return mianji;
    }

    public void setMianji(String mianji) {
        this.mianji = mianji == null ? null : mianji.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getHouseimages() {
        return houseimages;
    }

    public void setHouseimages(String houseimages) {
        this.houseimages = houseimages == null ? null : houseimages.trim();
    }

    public Integer getLoupanId() {
        return loupanId;
    }

    public void setLoupanId(Integer loupanId) {
        this.loupanId = loupanId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}