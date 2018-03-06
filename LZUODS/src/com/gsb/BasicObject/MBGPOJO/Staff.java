package com.gsb.BasicObject.MBGPOJO;

public class Staff {
    private Integer sysNo;

    private String name;

    private String gender;

    private String telephoneNum;

    private String sysLevel;

    private Float finalGoal;

    private String password;

    private String account;

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

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum == null ? null : telephoneNum.trim();
    }

    public String getSysLevel() {
        return sysLevel;
    }

    public void setSysLevel(String sysLevel) {
        this.sysLevel = sysLevel == null ? null : sysLevel.trim();
    }

    public Float getFinalGoal() {
        return finalGoal;
    }

    public void setFinalGoal(Float finalGoal) {
        this.finalGoal = finalGoal;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }
}