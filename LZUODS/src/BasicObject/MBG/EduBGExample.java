package BasicObject.MBG;

import java.util.ArrayList;
import java.util.List;

public class EduBGExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduBGExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEduBgLvIsNull() {
            addCriterion("edu_bg_lv is null");
            return (Criteria) this;
        }

        public Criteria andEduBgLvIsNotNull() {
            addCriterion("edu_bg_lv is not null");
            return (Criteria) this;
        }

        public Criteria andEduBgLvEqualTo(Integer value) {
            addCriterion("edu_bg_lv =", value, "eduBgLv");
            return (Criteria) this;
        }

        public Criteria andEduBgLvNotEqualTo(Integer value) {
            addCriterion("edu_bg_lv <>", value, "eduBgLv");
            return (Criteria) this;
        }

        public Criteria andEduBgLvGreaterThan(Integer value) {
            addCriterion("edu_bg_lv >", value, "eduBgLv");
            return (Criteria) this;
        }

        public Criteria andEduBgLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("edu_bg_lv >=", value, "eduBgLv");
            return (Criteria) this;
        }

        public Criteria andEduBgLvLessThan(Integer value) {
            addCriterion("edu_bg_lv <", value, "eduBgLv");
            return (Criteria) this;
        }

        public Criteria andEduBgLvLessThanOrEqualTo(Integer value) {
            addCriterion("edu_bg_lv <=", value, "eduBgLv");
            return (Criteria) this;
        }

        public Criteria andEduBgLvIn(List<Integer> values) {
            addCriterion("edu_bg_lv in", values, "eduBgLv");
            return (Criteria) this;
        }

        public Criteria andEduBgLvNotIn(List<Integer> values) {
            addCriterion("edu_bg_lv not in", values, "eduBgLv");
            return (Criteria) this;
        }

        public Criteria andEduBgLvBetween(Integer value1, Integer value2) {
            addCriterion("edu_bg_lv between", value1, value2, "eduBgLv");
            return (Criteria) this;
        }

        public Criteria andEduBgLvNotBetween(Integer value1, Integer value2) {
            addCriterion("edu_bg_lv not between", value1, value2, "eduBgLv");
            return (Criteria) this;
        }

        public Criteria andEduBgIsNull() {
            addCriterion("edu_bg is null");
            return (Criteria) this;
        }

        public Criteria andEduBgIsNotNull() {
            addCriterion("edu_bg is not null");
            return (Criteria) this;
        }

        public Criteria andEduBgEqualTo(String value) {
            addCriterion("edu_bg =", value, "eduBg");
            return (Criteria) this;
        }

        public Criteria andEduBgNotEqualTo(String value) {
            addCriterion("edu_bg <>", value, "eduBg");
            return (Criteria) this;
        }

        public Criteria andEduBgGreaterThan(String value) {
            addCriterion("edu_bg >", value, "eduBg");
            return (Criteria) this;
        }

        public Criteria andEduBgGreaterThanOrEqualTo(String value) {
            addCriterion("edu_bg >=", value, "eduBg");
            return (Criteria) this;
        }

        public Criteria andEduBgLessThan(String value) {
            addCriterion("edu_bg <", value, "eduBg");
            return (Criteria) this;
        }

        public Criteria andEduBgLessThanOrEqualTo(String value) {
            addCriterion("edu_bg <=", value, "eduBg");
            return (Criteria) this;
        }

        public Criteria andEduBgLike(String value) {
            addCriterion("edu_bg like", value, "eduBg");
            return (Criteria) this;
        }

        public Criteria andEduBgNotLike(String value) {
            addCriterion("edu_bg not like", value, "eduBg");
            return (Criteria) this;
        }

        public Criteria andEduBgIn(List<String> values) {
            addCriterion("edu_bg in", values, "eduBg");
            return (Criteria) this;
        }

        public Criteria andEduBgNotIn(List<String> values) {
            addCriterion("edu_bg not in", values, "eduBg");
            return (Criteria) this;
        }

        public Criteria andEduBgBetween(String value1, String value2) {
            addCriterion("edu_bg between", value1, value2, "eduBg");
            return (Criteria) this;
        }

        public Criteria andEduBgNotBetween(String value1, String value2) {
            addCriterion("edu_bg not between", value1, value2, "eduBg");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}