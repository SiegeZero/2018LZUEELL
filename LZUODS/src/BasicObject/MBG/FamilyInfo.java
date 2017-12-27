package BasicObject.MBG;

public class FamilyInfo {
    private Integer sysNo;

    private String memberRelate;

    private String memberName;

    private String phoneNumber;

    public Integer getSysNo() {
        return sysNo;
    }

    public void setSysNo(Integer sysNo) {
        this.sysNo = sysNo;
    }

    public String getMemberRelate() {
        return memberRelate;
    }

    public void setMemberRelate(String memberRelate) {
        this.memberRelate = memberRelate == null ? null : memberRelate.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }
}