package com.gsb.BasicObject.MBGPOJO;

public class RewardRecord {
    private Integer atvNo;

    private String owner;

    private String reward;

    public Integer getAtvNo() {
        return atvNo;
    }

    public void setAtvNo(Integer atvNo) {
        this.atvNo = atvNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward == null ? null : reward.trim();
    }
}