package com.gsb.BasicObject.MBGPOJO;

import java.util.Date;

public class AtvInfo {
    private Integer atvNo;

    private String atvTopic;

    private Date atvStartDate;

    private Date atvEndDate;

    private String atvPlace;

    private Integer leadSocietyNo;

    private Boolean hasReward;

    public Integer getAtvNo() {
        return atvNo;
    }

    public void setAtvNo(Integer atvNo) {
        this.atvNo = atvNo;
    }

    public String getAtvTopic() {
        return atvTopic;
    }

    public void setAtvTopic(String atvTopic) {
        this.atvTopic = atvTopic == null ? null : atvTopic.trim();
    }

    public Date getAtvStartDate() {
        return atvStartDate;
    }

    public void setAtvStartDate(Date atvStartDate) {
        this.atvStartDate = atvStartDate;
    }

    public Date getAtvEndDate() {
        return atvEndDate;
    }

    public void setAtvEndDate(Date atvEndDate) {
        this.atvEndDate = atvEndDate;
    }

    public String getAtvPlace() {
        return atvPlace;
    }

    public void setAtvPlace(String atvPlace) {
        this.atvPlace = atvPlace == null ? null : atvPlace.trim();
    }

    public Integer getLeadSocietyNo() {
        return leadSocietyNo;
    }

    public void setLeadSocietyNo(Integer leadSocietyNo) {
        this.leadSocietyNo = leadSocietyNo;
    }

    public Boolean getHasReward() {
        return hasReward;
    }

    public void setHasReward(Boolean hasReward) {
        this.hasReward = hasReward;
    }
}