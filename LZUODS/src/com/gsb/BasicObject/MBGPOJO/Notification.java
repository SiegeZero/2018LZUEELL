package com.gsb.BasicObject.MBGPOJO;

import java.util.Date;

public class Notification {
    private Integer notificationNo;

    private Integer publisherNo;

    private String title;

    private Date publishTime;

    private Integer societyNo;

    private byte[] notificationContent;

    public Integer getNotificationNo() {
        return notificationNo;
    }

    public void setNotificationNo(Integer notificationNo) {
        this.notificationNo = notificationNo;
    }

    public Integer getPublisherNo() {
        return publisherNo;
    }

    public void setPublisherNo(Integer publisherNo) {
        this.publisherNo = publisherNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getSocietyNo() {
        return societyNo;
    }

    public void setSocietyNo(Integer societyNo) {
        this.societyNo = societyNo;
    }

    public byte[] getNotificationContent() {
        return notificationContent;
    }

    public void setNotificationContent(byte[] notificationContent) {
        this.notificationContent = notificationContent;
    }
}