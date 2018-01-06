package com.gsb.BasicObject.MBG;

import java.util.ArrayList;
import java.util.List;

public class SociatyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SociatyExample() {
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

        public Criteria andSociatyNoIsNull() {
            addCriterion("sociaty_no is null");
            return (Criteria) this;
        }

        public Criteria andSociatyNoIsNotNull() {
            addCriterion("sociaty_no is not null");
            return (Criteria) this;
        }

        public Criteria andSociatyNoEqualTo(Integer value) {
            addCriterion("sociaty_no =", value, "sociatyNo");
            return (Criteria) this;
        }

        public Criteria andSociatyNoNotEqualTo(Integer value) {
            addCriterion("sociaty_no <>", value, "sociatyNo");
            return (Criteria) this;
        }

        public Criteria andSociatyNoGreaterThan(Integer value) {
            addCriterion("sociaty_no >", value, "sociatyNo");
            return (Criteria) this;
        }

        public Criteria andSociatyNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sociaty_no >=", value, "sociatyNo");
            return (Criteria) this;
        }

        public Criteria andSociatyNoLessThan(Integer value) {
            addCriterion("sociaty_no <", value, "sociatyNo");
            return (Criteria) this;
        }

        public Criteria andSociatyNoLessThanOrEqualTo(Integer value) {
            addCriterion("sociaty_no <=", value, "sociatyNo");
            return (Criteria) this;
        }

        public Criteria andSociatyNoIn(List<Integer> values) {
            addCriterion("sociaty_no in", values, "sociatyNo");
            return (Criteria) this;
        }

        public Criteria andSociatyNoNotIn(List<Integer> values) {
            addCriterion("sociaty_no not in", values, "sociatyNo");
            return (Criteria) this;
        }

        public Criteria andSociatyNoBetween(Integer value1, Integer value2) {
            addCriterion("sociaty_no between", value1, value2, "sociatyNo");
            return (Criteria) this;
        }

        public Criteria andSociatyNoNotBetween(Integer value1, Integer value2) {
            addCriterion("sociaty_no not between", value1, value2, "sociatyNo");
            return (Criteria) this;
        }

        public Criteria andSociatyNameIsNull() {
            addCriterion("sociaty_name is null");
            return (Criteria) this;
        }

        public Criteria andSociatyNameIsNotNull() {
            addCriterion("sociaty_name is not null");
            return (Criteria) this;
        }

        public Criteria andSociatyNameEqualTo(String value) {
            addCriterion("sociaty_name =", value, "sociatyName");
            return (Criteria) this;
        }

        public Criteria andSociatyNameNotEqualTo(String value) {
            addCriterion("sociaty_name <>", value, "sociatyName");
            return (Criteria) this;
        }

        public Criteria andSociatyNameGreaterThan(String value) {
            addCriterion("sociaty_name >", value, "sociatyName");
            return (Criteria) this;
        }

        public Criteria andSociatyNameGreaterThanOrEqualTo(String value) {
            addCriterion("sociaty_name >=", value, "sociatyName");
            return (Criteria) this;
        }

        public Criteria andSociatyNameLessThan(String value) {
            addCriterion("sociaty_name <", value, "sociatyName");
            return (Criteria) this;
        }

        public Criteria andSociatyNameLessThanOrEqualTo(String value) {
            addCriterion("sociaty_name <=", value, "sociatyName");
            return (Criteria) this;
        }

        public Criteria andSociatyNameLike(String value) {
            addCriterion("sociaty_name like", value, "sociatyName");
            return (Criteria) this;
        }

        public Criteria andSociatyNameNotLike(String value) {
            addCriterion("sociaty_name not like", value, "sociatyName");
            return (Criteria) this;
        }

        public Criteria andSociatyNameIn(List<String> values) {
            addCriterion("sociaty_name in", values, "sociatyName");
            return (Criteria) this;
        }

        public Criteria andSociatyNameNotIn(List<String> values) {
            addCriterion("sociaty_name not in", values, "sociatyName");
            return (Criteria) this;
        }

        public Criteria andSociatyNameBetween(String value1, String value2) {
            addCriterion("sociaty_name between", value1, value2, "sociatyName");
            return (Criteria) this;
        }

        public Criteria andSociatyNameNotBetween(String value1, String value2) {
            addCriterion("sociaty_name not between", value1, value2, "sociatyName");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderIsNull() {
            addCriterion("sociaty_leader is null");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderIsNotNull() {
            addCriterion("sociaty_leader is not null");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderEqualTo(String value) {
            addCriterion("sociaty_leader =", value, "sociatyLeader");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderNotEqualTo(String value) {
            addCriterion("sociaty_leader <>", value, "sociatyLeader");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderGreaterThan(String value) {
            addCriterion("sociaty_leader >", value, "sociatyLeader");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("sociaty_leader >=", value, "sociatyLeader");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderLessThan(String value) {
            addCriterion("sociaty_leader <", value, "sociatyLeader");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderLessThanOrEqualTo(String value) {
            addCriterion("sociaty_leader <=", value, "sociatyLeader");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderLike(String value) {
            addCriterion("sociaty_leader like", value, "sociatyLeader");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderNotLike(String value) {
            addCriterion("sociaty_leader not like", value, "sociatyLeader");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderIn(List<String> values) {
            addCriterion("sociaty_leader in", values, "sociatyLeader");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderNotIn(List<String> values) {
            addCriterion("sociaty_leader not in", values, "sociatyLeader");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderBetween(String value1, String value2) {
            addCriterion("sociaty_leader between", value1, value2, "sociatyLeader");
            return (Criteria) this;
        }

        public Criteria andSociatyLeaderNotBetween(String value1, String value2) {
            addCriterion("sociaty_leader not between", value1, value2, "sociatyLeader");
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