package com.hangchuang.house.pojo;

public class LouPanYiXiang {
    private Integer id;

    private String intentionTel;

    private Integer loupanId;

    private Integer createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntentionTel() {
        return intentionTel;
    }

    public void setIntentionTel(String intentionTel) {
        this.intentionTel = intentionTel == null ? null : intentionTel.trim();
    }

    public Integer getLoupanId() {
        return loupanId;
    }

    public void setLoupanId(Integer loupanId) {
        this.loupanId = loupanId;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }
}