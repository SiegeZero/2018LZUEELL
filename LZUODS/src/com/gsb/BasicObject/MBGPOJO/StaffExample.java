package com.gsb.BasicObject.MBGPOJO;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andSysNoIsNull() {
            addCriterion("sys_no is null");
            return (Criteria) this;
        }

        public Criteria andSysNoIsNotNull() {
            addCriterion("sys_no is not null");
            return (Criteria) this;
        }

        public Criteria andSysNoEqualTo(Integer value) {
            addCriterion("sys_no =", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotEqualTo(Integer value) {
            addCriterion("sys_no <>", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoGreaterThan(Integer value) {
            addCriterion("sys_no >", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_no >=", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoLessThan(Integer value) {
            addCriterion("sys_no <", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoLessThanOrEqualTo(Integer value) {
            addCriterion("sys_no <=", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoIn(List<Integer> values) {
            addCriterion("sys_no in", values, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotIn(List<Integer> values) {
            addCriterion("sys_no not in", values, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoBetween(Integer value1, Integer value2) {
            addCriterion("sys_no between", value1, value2, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_no not between", value1, value2, "sysNo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumIsNull() {
            addCriterion("telephone_num is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumIsNotNull() {
            addCriterion("telephone_num is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumEqualTo(String value) {
            addCriterion("telephone_num =", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumNotEqualTo(String value) {
            addCriterion("telephone_num <>", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumGreaterThan(String value) {
            addCriterion("telephone_num >", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("telephone_num >=", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumLessThan(String value) {
            addCriterion("telephone_num <", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumLessThanOrEqualTo(String value) {
            addCriterion("telephone_num <=", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumLike(String value) {
            addCriterion("telephone_num like", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumNotLike(String value) {
            addCriterion("telephone_num not like", value, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumIn(List<String> values) {
            addCriterion("telephone_num in", values, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumNotIn(List<String> values) {
            addCriterion("telephone_num not in", values, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumBetween(String value1, String value2) {
            addCriterion("telephone_num between", value1, value2, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andTelephoneNumNotBetween(String value1, String value2) {
            addCriterion("telephone_num not between", value1, value2, "telephoneNum");
            return (Criteria) this;
        }

        public Criteria andSysLevelIsNull() {
            addCriterion("sys_level is null");
            return (Criteria) this;
        }

        public Criteria andSysLevelIsNotNull() {
            addCriterion("sys_level is not null");
            return (Criteria) this;
        }

        public Criteria andSysLevelEqualTo(String value) {
            addCriterion("sys_level =", value, "sysLevel");
            return (Criteria) this;
        }

        public Criteria andSysLevelNotEqualTo(String value) {
            addCriterion("sys_level <>", value, "sysLevel");
            return (Criteria) this;
        }

        public Criteria andSysLevelGreaterThan(String value) {
            addCriterion("sys_level >", value, "sysLevel");
            return (Criteria) this;
        }

        public Criteria andSysLevelGreaterThanOrEqualTo(String value) {
            addCriterion("sys_level >=", value, "sysLevel");
            return (Criteria) this;
        }

        public Criteria andSysLevelLessThan(String value) {
            addCriterion("sys_level <", value, "sysLevel");
            return (Criteria) this;
        }

        public Criteria andSysLevelLessThanOrEqualTo(String value) {
            addCriterion("sys_level <=", value, "sysLevel");
            return (Criteria) this;
        }

        public Criteria andSysLevelLike(String value) {
            addCriterion("sys_level like", value, "sysLevel");
            return (Criteria) this;
        }

        public Criteria andSysLevelNotLike(String value) {
            addCriterion("sys_level not like", value, "sysLevel");
            return (Criteria) this;
        }

        public Criteria andSysLevelIn(List<String> values) {
            addCriterion("sys_level in", values, "sysLevel");
            return (Criteria) this;
        }

        public Criteria andSysLevelNotIn(List<String> values) {
            addCriterion("sys_level not in", values, "sysLevel");
            return (Criteria) this;
        }

        public Criteria andSysLevelBetween(String value1, String value2) {
            addCriterion("sys_level between", value1, value2, "sysLevel");
            return (Criteria) this;
        }

        public Criteria andSysLevelNotBetween(String value1, String value2) {
            addCriterion("sys_level not between", value1, value2, "sysLevel");
            return (Criteria) this;
        }

        public Criteria andFinalGoalIsNull() {
            addCriterion("final_goal is null");
            return (Criteria) this;
        }

        public Criteria andFinalGoalIsNotNull() {
            addCriterion("final_goal is not null");
            return (Criteria) this;
        }

        public Criteria andFinalGoalEqualTo(Float value) {
            addCriterion("final_goal =", value, "finalGoal");
            return (Criteria) this;
        }

        public Criteria andFinalGoalNotEqualTo(Float value) {
            addCriterion("final_goal <>", value, "finalGoal");
            return (Criteria) this;
        }

        public Criteria andFinalGoalGreaterThan(Float value) {
            addCriterion("final_goal >", value, "finalGoal");
            return (Criteria) this;
        }

        public Criteria andFinalGoalGreaterThanOrEqualTo(Float value) {
            addCriterion("final_goal >=", value, "finalGoal");
            return (Criteria) this;
        }

        public Criteria andFinalGoalLessThan(Float value) {
            addCriterion("final_goal <", value, "finalGoal");
            return (Criteria) this;
        }

        public Criteria andFinalGoalLessThanOrEqualTo(Float value) {
            addCriterion("final_goal <=", value, "finalGoal");
            return (Criteria) this;
        }

        public Criteria andFinalGoalIn(List<Float> values) {
            addCriterion("final_goal in", values, "finalGoal");
            return (Criteria) this;
        }

        public Criteria andFinalGoalNotIn(List<Float> values) {
            addCriterion("final_goal not in", values, "finalGoal");
            return (Criteria) this;
        }

        public Criteria andFinalGoalBetween(Float value1, Float value2) {
            addCriterion("final_goal between", value1, value2, "finalGoal");
            return (Criteria) this;
        }

        public Criteria andFinalGoalNotBetween(Float value1, Float value2) {
            addCriterion("final_goal not between", value1, value2, "finalGoal");
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