package com.gsb.BasicObject.MBG;

public class SalaryLib {
    private Integer salaryLibNo;

    private String salaryVersion;

    private String salaryLibRemark;

    public Integer getSalaryLibNo() {
        return salaryLibNo;
    }

    public void setSalaryLibNo(Integer salaryLibNo) {
        this.salaryLibNo = salaryLibNo;
    }

    public String getSalaryVersion() {
        return salaryVersion;
    }

    public void setSalaryVersion(String salaryVersion) {
        this.salaryVersion = salaryVersion == null ? null : salaryVersion.trim();
    }

    public String getSalaryLibRemark() {
        return salaryLibRemark;
    }

    public void setSalaryLibRemark(String salaryLibRemark) {
        this.salaryLibRemark = salaryLibRemark == null ? null : salaryLibRemark.trim();
    }
}