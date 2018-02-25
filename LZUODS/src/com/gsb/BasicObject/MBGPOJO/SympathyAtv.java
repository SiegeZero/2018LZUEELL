package com.gsb.BasicObject.MBGPOJO;

import java.util.Date;

public class SympathyAtv {
    private Integer activityNo;

    private Date sympathyTime;

    private String activityRemark;

    public Integer getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(Integer activityNo) {
        this.activityNo = activityNo;
    }

    public Date getSympathyTime() {
        return sympathyTime;
    }

    public void setSympathyTime(Date sympathyTime) {
        this.sympathyTime = sympathyTime;
    }

    public String getActivityRemark() {
        return activityRemark;
    }

    public void setActivityRemark(String activityRemark) {
        this.activityRemark = activityRemark == null ? null : activityRemark.trim();
    }
}