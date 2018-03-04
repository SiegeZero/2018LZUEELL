package com.gsb.BasicObject.MBGPOJO;

import java.util.Date;

public class MeetingRoom {
    private String place;

    private Date beginTime;

    private Date endTime;

    private Integer societyNo;

    private byte[] remark;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getSocietyNo() {
        return societyNo;
    }

    public void setSocietyNo(Integer societyNo) {
        this.societyNo = societyNo;
    }

    public byte[] getRemark() {
        return remark;
    }

    public void setRemark(byte[] remark) {
        this.remark = remark;
    }
}