package com.gsb.BasicObject.MBGPOJO;

public class PensionModel {
    private Integer pensionModelNo;

    private String pensionModel;

    private String pensionRemark;

    public Integer getPensionModelNo() {
        return pensionModelNo;
    }

    public void setPensionModelNo(Integer pensionModelNo) {
        this.pensionModelNo = pensionModelNo;
    }

    public String getPensionModel() {
        return pensionModel;
    }

    public void setPensionModel(String pensionModel) {
        this.pensionModel = pensionModel == null ? null : pensionModel.trim();
    }

    public String getPensionRemark() {
        return pensionRemark;
    }

    public void setPensionRemark(String pensionRemark) {
        this.pensionRemark = pensionRemark == null ? null : pensionRemark.trim();
    }
}