package com.hangchuang.house.pojo;

public class HouseWithBLOBs extends House {
    private String paydescription;

    private String mentality;

    private String facilities;

    public String getPaydescription() {
        return paydescription;
    }

    public void setPaydescription(String paydescription) {
        this.paydescription = paydescription == null ? null : paydescription.trim();
    }

    public String getMentality() {
        return mentality;
    }

    public void setMentality(String mentality) {
        this.mentality = mentality == null ? null : mentality.trim();
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities == null ? null : facilities.trim();
    }
}