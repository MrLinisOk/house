package com.hangchuang.house.pojo;

public class UserYiXiang {
    private Integer id;

    private String username;

    private String tel;

    private String yixiang;

    private String housetype;

    private Double budget;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getYixiang() {
        return yixiang;
    }

    public void setYixiang(String yixiang) {
        this.yixiang = yixiang == null ? null : yixiang.trim();
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype == null ? null : housetype.trim();
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }
}