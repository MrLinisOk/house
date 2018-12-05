package com.hangchuang.house.pojo;

public class RentalWithBLOBs extends Rental {
    private String paydescription;

    private String facilities;

    public String getPaydescription() {
        return paydescription;
    }

    public void setPaydescription(String paydescription) {
        this.paydescription = paydescription == null ? null : paydescription.trim();
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities == null ? null : facilities.trim();
    }
}