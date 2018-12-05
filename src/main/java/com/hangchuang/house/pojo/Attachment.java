package com.hangchuang.house.pojo;

public class Attachment {
    private Integer id;

    private Integer adminId;

    private Integer userId;

    private String url;

    private String imagewidth;

    private String imageheight;

    private String imagetype;

    private Integer imageframes;

    private Integer filesize;

    private String mimetype;

    private String extparam;

    private Integer createtime;

    private Integer updatetime;

    private Integer uploadtime;

    private String storage;

    private String sha1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getImagewidth() {
        return imagewidth;
    }

    public void setImagewidth(String imagewidth) {
        this.imagewidth = imagewidth == null ? null : imagewidth.trim();
    }

    public String getImageheight() {
        return imageheight;
    }

    public void setImageheight(String imageheight) {
        this.imageheight = imageheight == null ? null : imageheight.trim();
    }

    public String getImagetype() {
        return imagetype;
    }

    public void setImagetype(String imagetype) {
        this.imagetype = imagetype == null ? null : imagetype.trim();
    }

    public Integer getImageframes() {
        return imageframes;
    }

    public void setImageframes(Integer imageframes) {
        this.imageframes = imageframes;
    }

    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype == null ? null : mimetype.trim();
    }

    public String getExtparam() {
        return extparam;
    }

    public void setExtparam(String extparam) {
        this.extparam = extparam == null ? null : extparam.trim();
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Integer uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1 == null ? null : sha1.trim();
    }
}