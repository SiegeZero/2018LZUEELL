package com.gsb.BasicObject.MBGPOJO;

public class Society {
    private Integer societyNo;

    private String societyName;

    private String societyLeader;

    private String societyRemark;

    public Integer getSocietyNo() {
        return societyNo;
    }

    public void setSocietyNo(Integer societyNo) {
        this.societyNo = societyNo;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName == null ? null : societyName.trim();
    }

    public String getSocietyLeader() {
        return societyLeader;
    }

    public void setSocietyLeader(String societyLeader) {
        this.societyLeader = societyLeader == null ? null : societyLeader.trim();
    }

    public String getSocietyRemark() {
        return societyRemark;
    }

    public void setSocietyRemark(String societyRemark) {
        this.societyRemark = societyRemark == null ? null : societyRemark.trim();
    }
}