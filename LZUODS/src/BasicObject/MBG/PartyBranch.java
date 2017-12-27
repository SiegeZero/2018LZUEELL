package BasicObject.MBG;

public class PartyBranch {
    private Integer partyBranchNo;

    private String partyBranchName;

    private String leaderName;

    private String leaderPhone;

    private String partyBranchRemark;

    public Integer getPartyBranchNo() {
        return partyBranchNo;
    }

    public void setPartyBranchNo(Integer partyBranchNo) {
        this.partyBranchNo = partyBranchNo;
    }

    public String getPartyBranchName() {
        return partyBranchName;
    }

    public void setPartyBranchName(String partyBranchName) {
        this.partyBranchName = partyBranchName == null ? null : partyBranchName.trim();
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName == null ? null : leaderName.trim();
    }

    public String getLeaderPhone() {
        return leaderPhone;
    }

    public void setLeaderPhone(String leaderPhone) {
        this.leaderPhone = leaderPhone == null ? null : leaderPhone.trim();
    }

    public String getPartyBranchRemark() {
        return partyBranchRemark;
    }

    public void setPartyBranchRemark(String partyBranchRemark) {
        this.partyBranchRemark = partyBranchRemark == null ? null : partyBranchRemark.trim();
    }
}