package com.hangchuang.house.pojo;

public class FindCate {
    private Integer id;

    private String name;

    private Integer pid;

    private String isPinglun;

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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getIsPinglun() {
        return isPinglun;
    }

    public void setIsPinglun(String isPinglun) {
        this.isPinglun = isPinglun == null ? null : isPinglun.trim();
    }
}