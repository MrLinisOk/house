package com.hangchuang.house.pojo;

public class Version {
    private Integer id;

    private String oldversion;

    private String newversion;

    private String packagesize;

    private String content;

    private String downloadurl;

    private Boolean enforce;

    private Integer createtime;

    private Integer updatetime;

    private Integer weigh;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOldversion() {
        return oldversion;
    }

    public void setOldversion(String oldversion) {
        this.oldversion = oldversion == null ? null : oldversion.trim();
    }

    public String getNewversion() {
        return newversion;
    }

    public void setNewversion(String newversion) {
        this.newversion = newversion == null ? null : newversion.trim();
    }

    public String getPackagesize() {
        return packagesize;
    }

    public void setPackagesize(String packagesize) {
        this.packagesize = packagesize == null ? null : packagesize.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDownloadurl() {
        return downloadurl;
    }

    public void setDownloadurl(String downloadurl) {
        this.downloadurl = downloadurl == null ? null : downloadurl.trim();
    }

    public Boolean getEnforce() {
        return enforce;
    }

    public void setEnforce(Boolean enforce) {
        this.enforce = enforce;
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

    public Integer getWeigh() {
        return weigh;
    }

    public void setWeigh(Integer weigh) {
        this.weigh = weigh;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}