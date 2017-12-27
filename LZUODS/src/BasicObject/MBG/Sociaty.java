package BasicObject.MBG;

public class Sociaty {
    private Integer sociatyNo;

    private String sociatyName;

    private String sociatyLeader;

    private String sociatyRemark;

    public Integer getSociatyNo() {
        return sociatyNo;
    }

    public void setSociatyNo(Integer sociatyNo) {
        this.sociatyNo = sociatyNo;
    }

    public String getSociatyName() {
        return sociatyName;
    }

    public void setSociatyName(String sociatyName) {
        this.sociatyName = sociatyName == null ? null : sociatyName.trim();
    }

    public String getSociatyLeader() {
        return sociatyLeader;
    }

    public void setSociatyLeader(String sociatyLeader) {
        this.sociatyLeader = sociatyLeader == null ? null : sociatyLeader.trim();
    }

    public String getSociatyRemark() {
        return sociatyRemark;
    }

    public void setSociatyRemark(String sociatyRemark) {
        this.sociatyRemark = sociatyRemark == null ? null : sociatyRemark.trim();
    }
}