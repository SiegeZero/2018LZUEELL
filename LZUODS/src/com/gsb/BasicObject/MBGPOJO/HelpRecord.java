package com.gsb.BasicObject.MBGPOJO;

import java.util.Date;

public class HelpRecord {
    private Integer sysNo;

    private Date helpTime;

    private String helpContent;

    public Integer getSysNo() {
        return sysNo;
    }

    public void setSysNo(Integer sysNo) {
        this.sysNo = sysNo;
    }

    public Date getHelpTime() {
        return helpTime;
    }

    public void setHelpTime(Date helpTime) {
        this.helpTime = helpTime;
    }

    public String getHelpContent() {
        return helpContent;
    }

    public void setHelpContent(String helpContent) {
        this.helpContent = helpContent == null ? null : helpContent.trim();
    }
}