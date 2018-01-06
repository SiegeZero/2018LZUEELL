package com.gsb.BasicObject.MBG;

import java.util.Date;

public class Person {
    private Integer sysNo;

    private String name;

    private String gender;

    private String nativePlace;

    private String nation;

    private String salaryNo;

    private Integer salaryLibNo;

    private Integer deptNo;

    private String func;

    private String telephoneNum;

    private String titleLv;

    private Date latestSympathyYear;

    private Date jobEndTime;

    private Date jobStartTime;

    private Date birthTime;

    private Integer sociatyNo;

    private String eduBg;

    private String politicalStatus;

    private String quitOfficeType;

    private Integer pensionModelNo;

    private String physicalSituation;

    private String conscriptionSituation;

    private Boolean isHelpNeeded;

    public Integer getSysNo() {
        return sysNo;
    }

    public void setSysNo(Integer sysNo) {
        this.sysNo = sysNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getSalaryNo() {
        return salaryNo;
    }

    public void setSalaryNo(String salaryNo) {
        this.salaryNo = salaryNo == null ? null : salaryNo.trim();
    }

    public Integer getSalaryLibNo() {
        return salaryLibNo;
    }

    public void setSalaryLibNo(Integer salaryLibNo) {
        this.salaryLibNo = salaryLibNo;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func == null ? null : func.trim();
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum == null ? null : telephoneNum.trim();
    }

    public String getTitleLv() {
        return titleLv;
    }

    public void setTitleLv(String titleLv) {
        this.titleLv = titleLv == null ? null : titleLv.trim();
    }

    public Date getLatestSympathyYear() {
        return latestSympathyYear;
    }

    public void setLatestSympathyYear(Date latestSympathyYear) {
        this.latestSympathyYear = latestSympathyYear;
    }

    public Date getJobEndTime() {
        return jobEndTime;
    }

    public void setJobEndTime(Date jobEndTime) {
        this.jobEndTime = jobEndTime;
    }

    public Date getJobStartTime() {
        return jobStartTime;
    }

    public void setJobStartTime(Date jobStartTime) {
        this.jobStartTime = jobStartTime;
    }

    public Date getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(Date birthTime) {
        this.birthTime = birthTime;
    }

    public Integer getSociatyNo() {
        return sociatyNo;
    }

    public void setSociatyNo(Integer sociatyNo) {
        this.sociatyNo = sociatyNo;
    }

    public String getEduBg() {
        return eduBg;
    }

    public void setEduBg(String eduBg) {
        this.eduBg = eduBg == null ? null : eduBg.trim();
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus == null ? null : politicalStatus.trim();
    }

    public String getQuitOfficeType() {
        return quitOfficeType;
    }

    public void setQuitOfficeType(String quitOfficeType) {
        this.quitOfficeType = quitOfficeType == null ? null : quitOfficeType.trim();
    }

    public Integer getPensionModelNo() {
        return pensionModelNo;
    }

    public void setPensionModelNo(Integer pensionModelNo) {
        this.pensionModelNo = pensionModelNo;
    }

    public String getPhysicalSituation() {
        return physicalSituation;
    }

    public void setPhysicalSituation(String physicalSituation) {
        this.physicalSituation = physicalSituation == null ? null : physicalSituation.trim();
    }

    public String getConscriptionSituation() {
        return conscriptionSituation;
    }

    public void setConscriptionSituation(String conscriptionSituation) {
        this.conscriptionSituation = conscriptionSituation == null ? null : conscriptionSituation.trim();
    }

    public Boolean getIsHelpNeeded() {
        return isHelpNeeded;
    }

    public void setIsHelpNeeded(Boolean isHelpNeeded) {
        this.isHelpNeeded = isHelpNeeded;
    }
}