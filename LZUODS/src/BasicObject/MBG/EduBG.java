package BasicObject.MBG;

public class EduBG {
    private Integer eduBgLv;

    private String eduBg;

    private String eduBgEmark;

    public Integer getEduBgLv() {
        return eduBgLv;
    }

    public void setEduBgLv(Integer eduBgLv) {
        this.eduBgLv = eduBgLv;
    }

    public String getEduBg() {
        return eduBg;
    }

    public void setEduBg(String eduBg) {
        this.eduBg = eduBg == null ? null : eduBg.trim();
    }

    public String getEduBgEmark() {
        return eduBgEmark;
    }

    public void setEduBgEmark(String eduBgEmark) {
        this.eduBgEmark = eduBgEmark == null ? null : eduBgEmark.trim();
    }
}