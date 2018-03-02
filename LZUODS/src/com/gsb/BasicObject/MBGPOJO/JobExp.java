package com.gsb.BasicObject.MBGPOJO;

import java.util.Date;

public class JobExp {
    private Integer sysNo;

    private Date jobStartTime;

    private Date jobEndTime;

    private String jobExpDept;

    private String jobExpRemark;

    public Integer getSysNo() {
        return sysNo;
    }

    public void setSysNo(Integer sysNo) {
        this.sysNo = sysNo;
    }

    public Date getJobStartTime() {
        return jobStartTime;
    }

    public void setJobStartTime(Date jobStartTime) {
        this.jobStartTime = jobStartTime;
    }

    public Date getJobEndTime() {
        return jobEndTime;
    }

    public void setJobEndTime(Date jobEndTime) {
        this.jobEndTime = jobEndTime;
    }

    public String getJobExpDept() {
        return jobExpDept;
    }

    public void setJobExpDept(String jobExpDept) {
        this.jobExpDept = jobExpDept == null ? null : jobExpDept.trim();
    }

    public String getJobExpRemark() {
        return jobExpRemark;
    }

    public void setJobExpRemark(String jobExpRemark) {
        this.jobExpRemark = jobExpRemark == null ? null : jobExpRemark.trim();
    }
}