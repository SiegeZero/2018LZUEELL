package BasicObject.MBG;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDptNoIsNull() {
            addCriterion("dpt_no is null");
            return (Criteria) this;
        }

        public Criteria andDptNoIsNotNull() {
            addCriterion("dpt_no is not null");
            return (Criteria) this;
        }

        public Criteria andDptNoEqualTo(Integer value) {
            addCriterion("dpt_no =", value, "dptNo");
            return (Criteria) this;
        }

        public Criteria andDptNoNotEqualTo(Integer value) {
            addCriterion("dpt_no <>", value, "dptNo");
            return (Criteria) this;
        }

        public Criteria andDptNoGreaterThan(Integer value) {
            addCriterion("dpt_no >", value, "dptNo");
            return (Criteria) this;
        }

        public Criteria andDptNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dpt_no >=", value, "dptNo");
            return (Criteria) this;
        }

        public Criteria andDptNoLessThan(Integer value) {
            addCriterion("dpt_no <", value, "dptNo");
            return (Criteria) this;
        }

        public Criteria andDptNoLessThanOrEqualTo(Integer value) {
            addCriterion("dpt_no <=", value, "dptNo");
            return (Criteria) this;
        }

        public Criteria andDptNoIn(List<Integer> values) {
            addCriterion("dpt_no in", values, "dptNo");
            return (Criteria) this;
        }

        public Criteria andDptNoNotIn(List<Integer> values) {
            addCriterion("dpt_no not in", values, "dptNo");
            return (Criteria) this;
        }

        public Criteria andDptNoBetween(Integer value1, Integer value2) {
            addCriterion("dpt_no between", value1, value2, "dptNo");
            return (Criteria) this;
        }

        public Criteria andDptNoNotBetween(Integer value1, Integer value2) {
            addCriterion("dpt_no not between", value1, value2, "dptNo");
            return (Criteria) this;
        }

        public Criteria andDptNameIsNull() {
            addCriterion("dpt_name is null");
            return (Criteria) this;
        }

        public Criteria andDptNameIsNotNull() {
            addCriterion("dpt_name is not null");
            return (Criteria) this;
        }

        public Criteria andDptNameEqualTo(String value) {
            addCriterion("dpt_name =", value, "dptName");
            return (Criteria) this;
        }

        public Criteria andDptNameNotEqualTo(String value) {
            addCriterion("dpt_name <>", value, "dptName");
            return (Criteria) this;
        }

        public Criteria andDptNameGreaterThan(String value) {
            addCriterion("dpt_name >", value, "dptName");
            return (Criteria) this;
        }

        public Criteria andDptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dpt_name >=", value, "dptName");
            return (Criteria) this;
        }

        public Criteria andDptNameLessThan(String value) {
            addCriterion("dpt_name <", value, "dptName");
            return (Criteria) this;
        }

        public Criteria andDptNameLessThanOrEqualTo(String value) {
            addCriterion("dpt_name <=", value, "dptName");
            return (Criteria) this;
        }

        public Criteria andDptNameLike(String value) {
            addCriterion("dpt_name like", value, "dptName");
            return (Criteria) this;
        }

        public Criteria andDptNameNotLike(String value) {
            addCriterion("dpt_name not like", value, "dptName");
            return (Criteria) this;
        }

        public Criteria andDptNameIn(List<String> values) {
            addCriterion("dpt_name in", values, "dptName");
            return (Criteria) this;
        }

        public Criteria andDptNameNotIn(List<String> values) {
            addCriterion("dpt_name not in", values, "dptName");
            return (Criteria) this;
        }

        public Criteria andDptNameBetween(String value1, String value2) {
            addCriterion("dpt_name between", value1, value2, "dptName");
            return (Criteria) this;
        }

        public Criteria andDptNameNotBetween(String value1, String value2) {
            addCriterion("dpt_name not between", value1, value2, "dptName");
            return (Criteria) this;
        }

        public Criteria andDptLeaderIsNull() {
            addCriterion("dpt_leader is null");
            return (Criteria) this;
        }

        public Criteria andDptLeaderIsNotNull() {
            addCriterion("dpt_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDptLeaderEqualTo(String value) {
            addCriterion("dpt_leader =", value, "dptLeader");
            return (Criteria) this;
        }

        public Criteria andDptLeaderNotEqualTo(String value) {
            addCriterion("dpt_leader <>", value, "dptLeader");
            return (Criteria) this;
        }

        public Criteria andDptLeaderGreaterThan(String value) {
            addCriterion("dpt_leader >", value, "dptLeader");
            return (Criteria) this;
        }

        public Criteria andDptLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("dpt_leader >=", value, "dptLeader");
            return (Criteria) this;
        }

        public Criteria andDptLeaderLessThan(String value) {
            addCriterion("dpt_leader <", value, "dptLeader");
            return (Criteria) this;
        }

        public Criteria andDptLeaderLessThanOrEqualTo(String value) {
            addCriterion("dpt_leader <=", value, "dptLeader");
            return (Criteria) this;
        }

        public Criteria andDptLeaderLike(String value) {
            addCriterion("dpt_leader like", value, "dptLeader");
            return (Criteria) this;
        }

        public Criteria andDptLeaderNotLike(String value) {
            addCriterion("dpt_leader not like", value, "dptLeader");
            return (Criteria) this;
        }

        public Criteria andDptLeaderIn(List<String> values) {
            addCriterion("dpt_leader in", values, "dptLeader");
            return (Criteria) this;
        }

        public Criteria andDptLeaderNotIn(List<String> values) {
            addCriterion("dpt_leader not in", values, "dptLeader");
            return (Criteria) this;
        }

        public Criteria andDptLeaderBetween(String value1, String value2) {
            addCriterion("dpt_leader between", value1, value2, "dptLeader");
            return (Criteria) this;
        }

        public Criteria andDptLeaderNotBetween(String value1, String value2) {
            addCriterion("dpt_leader not between", value1, value2, "dptLeader");
            return (Criteria) this;
        }

        public Criteria andDptPhoneIsNull() {
            addCriterion("dpt_phone is null");
            return (Criteria) this;
        }

        public Criteria andDptPhoneIsNotNull() {
            addCriterion("dpt_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDptPhoneEqualTo(String value) {
            addCriterion("dpt_phone =", value, "dptPhone");
            return (Criteria) this;
        }

        public Criteria andDptPhoneNotEqualTo(String value) {
            addCriterion("dpt_phone <>", value, "dptPhone");
            return (Criteria) this;
        }

        public Criteria andDptPhoneGreaterThan(String value) {
            addCriterion("dpt_phone >", value, "dptPhone");
            return (Criteria) this;
        }

        public Criteria andDptPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("dpt_phone >=", value, "dptPhone");
            return (Criteria) this;
        }

        public Criteria andDptPhoneLessThan(String value) {
            addCriterion("dpt_phone <", value, "dptPhone");
            return (Criteria) this;
        }

        public Criteria andDptPhoneLessThanOrEqualTo(String value) {
            addCriterion("dpt_phone <=", value, "dptPhone");
            return (Criteria) this;
        }

        public Criteria andDptPhoneLike(String value) {
            addCriterion("dpt_phone like", value, "dptPhone");
            return (Criteria) this;
        }

        public Criteria andDptPhoneNotLike(String value) {
            addCriterion("dpt_phone not like", value, "dptPhone");
            return (Criteria) this;
        }

        public Criteria andDptPhoneIn(List<String> values) {
            addCriterion("dpt_phone in", values, "dptPhone");
            return (Criteria) this;
        }

        public Criteria andDptPhoneNotIn(List<String> values) {
            addCriterion("dpt_phone not in", values, "dptPhone");
            return (Criteria) this;
        }

        public Criteria andDptPhoneBetween(String value1, String value2) {
            addCriterion("dpt_phone between", value1, value2, "dptPhone");
            return (Criteria) this;
        }

        public Criteria andDptPhoneNotBetween(String value1, String value2) {
            addCriterion("dpt_phone not between", value1, value2, "dptPhone");
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