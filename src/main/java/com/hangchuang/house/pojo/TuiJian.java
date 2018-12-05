package com.hangchuang.house.pojo;

public class TuiJian {
    private Byte id;

    private Byte userId;

    private String shenfenId;

    private Integer mobile;

    private String region;

    private String city;

    private String lookTime;

    private String name;

    private Byte status;

    private String demand;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Byte getUserId() {
        return userId;
    }

    public void setUserId(Byte userId) {
        this.userId = userId;
    }

    public String getShenfenId() {
        return shenfenId;
    }

    public void setShenfenId(String shenfenId) {
        this.shenfenId = shenfenId == null ? null : shenfenId.trim();
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getLookTime() {
        return lookTime;
    }

    public void setLookTime(String lookTime) {
        this.lookTime = lookTime == null ? null : lookTime.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand == null ? null : demand.trim();
    }
}