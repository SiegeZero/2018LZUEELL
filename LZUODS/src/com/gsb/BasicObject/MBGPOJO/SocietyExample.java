package com.gsb.BasicObject.MBGPOJO;

import java.util.ArrayList;
import java.util.List;

public class SocietyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SocietyExample() {
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

        public Criteria andSocietyNoIsNull() {
            addCriterion("society_no is null");
            return (Criteria) this;
        }

        public Criteria andSocietyNoIsNotNull() {
            addCriterion("society_no is not null");
            return (Criteria) this;
        }

        public Criteria andSocietyNoEqualTo(Integer value) {
            addCriterion("society_no =", value, "societyNo");
            return (Criteria) this;
        }

        public Criteria andSocietyNoNotEqualTo(Integer value) {
            addCriterion("society_no <>", value, "societyNo");
            return (Criteria) this;
        }

        public Criteria andSocietyNoGreaterThan(Integer value) {
            addCriterion("society_no >", value, "societyNo");
            return (Criteria) this;
        }

        public Criteria andSocietyNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("society_no >=", value, "societyNo");
            return (Criteria) this;
        }

        public Criteria andSocietyNoLessThan(Integer value) {
            addCriterion("society_no <", value, "societyNo");
            return (Criteria) this;
        }

        public Criteria andSocietyNoLessThanOrEqualTo(Integer value) {
            addCriterion("society_no <=", value, "societyNo");
            return (Criteria) this;
        }

        public Criteria andSocietyNoIn(List<Integer> values) {
            addCriterion("society_no in", values, "societyNo");
            return (Criteria) this;
        }

        public Criteria andSocietyNoNotIn(List<Integer> values) {
            addCriterion("society_no not in", values, "societyNo");
            return (Criteria) this;
        }

        public Criteria andSocietyNoBetween(Integer value1, Integer value2) {
            addCriterion("society_no between", value1, value2, "societyNo");
            return (Criteria) this;
        }

        public Criteria andSocietyNoNotBetween(Integer value1, Integer value2) {
            addCriterion("society_no not between", value1, value2, "societyNo");
            return (Criteria) this;
        }

        public Criteria andSocietyNameIsNull() {
            addCriterion("society_name is null");
            return (Criteria) this;
        }

        public Criteria andSocietyNameIsNotNull() {
            addCriterion("society_name is not null");
            return (Criteria) this;
        }

        public Criteria andSocietyNameEqualTo(String value) {
            addCriterion("society_name =", value, "societyName");
            return (Criteria) this;
        }

        public Criteria andSocietyNameNotEqualTo(String value) {
            addCriterion("society_name <>", value, "societyName");
            return (Criteria) this;
        }

        public Criteria andSocietyNameGreaterThan(String value) {
            addCriterion("society_name >", value, "societyName");
            return (Criteria) this;
        }

        public Criteria andSocietyNameGreaterThanOrEqualTo(String value) {
            addCriterion("society_name >=", value, "societyName");
            return (Criteria) this;
        }

        public Criteria andSocietyNameLessThan(String value) {
            addCriterion("society_name <", value, "societyName");
            return (Criteria) this;
        }

        public Criteria andSocietyNameLessThanOrEqualTo(String value) {
            addCriterion("society_name <=", value, "societyName");
            return (Criteria) this;
        }

        public Criteria andSocietyNameLike(String value) {
            addCriterion("society_name like", value, "societyName");
            return (Criteria) this;
        }

        public Criteria andSocietyNameNotLike(String value) {
            addCriterion("society_name not like", value, "societyName");
            return (Criteria) this;
        }

        public Criteria andSocietyNameIn(List<String> values) {
            addCriterion("society_name in", values, "societyName");
            return (Criteria) this;
        }

        public Criteria andSocietyNameNotIn(List<String> values) {
            addCriterion("society_name not in", values, "societyName");
            return (Criteria) this;
        }

        public Criteria andSocietyNameBetween(String value1, String value2) {
            addCriterion("society_name between", value1, value2, "societyName");
            return (Criteria) this;
        }

        public Criteria andSocietyNameNotBetween(String value1, String value2) {
            addCriterion("society_name not between", value1, value2, "societyName");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderIsNull() {
            addCriterion("society_leader is null");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderIsNotNull() {
            addCriterion("society_leader is not null");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderEqualTo(String value) {
            addCriterion("society_leader =", value, "societyLeader");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderNotEqualTo(String value) {
            addCriterion("society_leader <>", value, "societyLeader");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderGreaterThan(String value) {
            addCriterion("society_leader >", value, "societyLeader");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("society_leader >=", value, "societyLeader");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderLessThan(String value) {
            addCriterion("society_leader <", value, "societyLeader");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderLessThanOrEqualTo(String value) {
            addCriterion("society_leader <=", value, "societyLeader");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderLike(String value) {
            addCriterion("society_leader like", value, "societyLeader");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderNotLike(String value) {
            addCriterion("society_leader not like", value, "societyLeader");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderIn(List<String> values) {
            addCriterion("society_leader in", values, "societyLeader");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderNotIn(List<String> values) {
            addCriterion("society_leader not in", values, "societyLeader");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderBetween(String value1, String value2) {
            addCriterion("society_leader between", value1, value2, "societyLeader");
            return (Criteria) this;
        }

        public Criteria andSocietyLeaderNotBetween(String value1, String value2) {
            addCriterion("society_leader not between", value1, value2, "societyLeader");
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