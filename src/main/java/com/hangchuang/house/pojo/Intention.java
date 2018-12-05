package com.hangchuang.house.pojo;

public class Intention {
    private Integer id;

    private String intentionTel;

    private Integer houseId;

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

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }
}