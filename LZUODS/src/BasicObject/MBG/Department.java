package BasicObject.MBG;

public class Department {
    private Integer dptNo;

    private String dptName;

    private String dptLeader;

    private String dptPhone;

    private String dptRemark;

    public Integer getDptNo() {
        return dptNo;
    }

    public void setDptNo(Integer dptNo) {
        this.dptNo = dptNo;
    }

    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName == null ? null : dptName.trim();
    }

    public String getDptLeader() {
        return dptLeader;
    }

    public void setDptLeader(String dptLeader) {
        this.dptLeader = dptLeader == null ? null : dptLeader.trim();
    }

    public String getDptPhone() {
        return dptPhone;
    }

    public void setDptPhone(String dptPhone) {
        this.dptPhone = dptPhone == null ? null : dptPhone.trim();
    }

    public String getDptRemark() {
        return dptRemark;
    }

    public void setDptRemark(String dptRemark) {
        this.dptRemark = dptRemark == null ? null : dptRemark.trim();
    }
}