package com.hangchuang.house.pojo;

public class Agent {
    private Integer id;

    private String name;

    private String tel;

    private String touimage;

    private String erweimaimage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getTouimage() {
        return touimage;
    }

    public void setTouimage(String touimage) {
        this.touimage = touimage == null ? null : touimage.trim();
    }

    public String getErweimaimage() {
        return erweimaimage;
    }

    public void setErweimaimage(String erweimaimage) {
        this.erweimaimage = erweimaimage == null ? null : erweimaimage.trim();
    }
}