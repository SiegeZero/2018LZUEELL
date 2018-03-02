package com.gsb.BasicObject.MBGPOJO;

public class PersonWithBLOBs extends Person {
    private String address;

    private String livingSituation;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLivingSituation() {
        return livingSituation;
    }

    public void setLivingSituation(String livingSituation) {
        this.livingSituation = livingSituation == null ? null : livingSituation.trim();
    }
}