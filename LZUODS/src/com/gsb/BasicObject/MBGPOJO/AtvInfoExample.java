package com.gsb.BasicObject.MBGPOJO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AtvInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AtvInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAtvNoIsNull() {
            addCriterion("atv_no is null");
            return (Criteria) this;
        }

        public Criteria andAtvNoIsNotNull() {
            addCriterion("atv_no is not null");
            return (Criteria) this;
        }

        public Criteria andAtvNoEqualTo(Integer value) {
            addCriterion("atv_no =", value, "atvNo");
            return (Criteria) this;
        }

        public Criteria andAtvNoNotEqualTo(Integer value) {
            addCriterion("atv_no <>", value, "atvNo");
            return (Criteria) this;
        }

        public Criteria andAtvNoGreaterThan(Integer value) {
            addCriterion("atv_no >", value, "atvNo");
            return (Criteria) this;
        }

        public Criteria andAtvNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("atv_no >=", value, "atvNo");
            return (Criteria) this;
        }

        public Criteria andAtvNoLessThan(Integer value) {
            addCriterion("atv_no <", value, "atvNo");
            return (Criteria) this;
        }

        public Criteria andAtvNoLessThanOrEqualTo(Integer value) {
            addCriterion("atv_no <=", value, "atvNo");
            return (Criteria) this;
        }

        public Criteria andAtvNoIn(List<Integer> values) {
            addCriterion("atv_no in", values, "atvNo");
            return (Criteria) this;
        }

        public Criteria andAtvNoNotIn(List<Integer> values) {
            addCriterion("atv_no not in", values, "atvNo");
            return (Criteria) this;
        }

        public Criteria andAtvNoBetween(Integer value1, Integer value2) {
            addCriterion("atv_no between", value1, value2, "atvNo");
            return (Criteria) this;
        }

        public Criteria andAtvNoNotBetween(Integer value1, Integer value2) {
            addCriterion("atv_no not between", value1, value2, "atvNo");
            return (Criteria) this;
        }

        public Criteria andAtvTopicIsNull() {
            addCriterion("atv_topic is null");
            return (Criteria) this;
        }

        public Criteria andAtvTopicIsNotNull() {
            addCriterion("atv_topic is not null");
            return (Criteria) this;
        }

        public Criteria andAtvTopicEqualTo(String value) {
            addCriterion("atv_topic =", value, "atvTopic");
            return (Criteria) this;
        }

        public Criteria andAtvTopicNotEqualTo(String value) {
            addCriterion("atv_topic <>", value, "atvTopic");
            return (Criteria) this;
        }

        public Criteria andAtvTopicGreaterThan(String value) {
            addCriterion("atv_topic >", value, "atvTopic");
            return (Criteria) this;
        }

        public Criteria andAtvTopicGreaterThanOrEqualTo(String value) {
            addCriterion("atv_topic >=", value, "atvTopic");
            return (Criteria) this;
        }

        public Criteria andAtvTopicLessThan(String value) {
            addCriterion("atv_topic <", value, "atvTopic");
            return (Criteria) this;
        }

        public Criteria andAtvTopicLessThanOrEqualTo(String value) {
            addCriterion("atv_topic <=", value, "atvTopic");
            return (Criteria) this;
        }

        public Criteria andAtvTopicLike(String value) {
            addCriterion("atv_topic like", value, "atvTopic");
            return (Criteria) this;
        }

        public Criteria andAtvTopicNotLike(String value) {
            addCriterion("atv_topic not like", value, "atvTopic");
            return (Criteria) this;
        }

        public Criteria andAtvTopicIn(List<String> values) {
            addCriterion("atv_topic in", values, "atvTopic");
            return (Criteria) this;
        }

        public Criteria andAtvTopicNotIn(List<String> values) {
            addCriterion("atv_topic not in", values, "atvTopic");
            return (Criteria) this;
        }

        public Criteria andAtvTopicBetween(String value1, String value2) {
            addCriterion("atv_topic between", value1, value2, "atvTopic");
            return (Criteria) this;
        }

        public Criteria andAtvTopicNotBetween(String value1, String value2) {
            addCriterion("atv_topic not between", value1, value2, "atvTopic");
            return (Criteria) this;
        }

        public Criteria andAtvStartDateIsNull() {
            addCriterion("atv_start_date is null");
            return (Criteria) this;
        }

        public Criteria andAtvStartDateIsNotNull() {
            addCriterion("atv_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andAtvStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("atv_start_date =", value, "atvStartDate");
            return (Criteria) this;
        }

        public Criteria andAtvStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("atv_start_date <>", value, "atvStartDate");
            return (Criteria) this;
        }

        public Criteria andAtvStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("atv_start_date >", value, "atvStartDate");
            return (Criteria) this;
        }

        public Criteria andAtvStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("atv_start_date >=", value, "atvStartDate");
            return (Criteria) this;
        }

        public Criteria andAtvStartDateLessThan(Date value) {
            addCriterionForJDBCDate("atv_start_date <", value, "atvStartDate");
            return (Criteria) this;
        }

        public Criteria andAtvStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("atv_start_date <=", value, "atvStartDate");
            return (Criteria) this;
        }

        public Criteria andAtvStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("atv_start_date in", values, "atvStartDate");
            return (Criteria) this;
        }

        public Criteria andAtvStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("atv_start_date not in", values, "atvStartDate");
            return (Criteria) this;
        }

        public Criteria andAtvStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("atv_start_date between", value1, value2, "atvStartDate");
            return (Criteria) this;
        }

        public Criteria andAtvStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("atv_start_date not between", value1, value2, "atvStartDate");
            return (Criteria) this;
        }

        public Criteria andAtvEndDateIsNull() {
            addCriterion("atv_end_date is null");
            return (Criteria) this;
        }

        public Criteria andAtvEndDateIsNotNull() {
            addCriterion("atv_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andAtvEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("atv_end_date =", value, "atvEndDate");
            return (Criteria) this;
        }

        public Criteria andAtvEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("atv_end_date <>", value, "atvEndDate");
            return (Criteria) this;
        }

        public Criteria andAtvEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("atv_end_date >", value, "atvEndDate");
            return (Criteria) this;
        }

        public Criteria andAtvEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("atv_end_date >=", value, "atvEndDate");
            return (Criteria) this;
        }

        public Criteria andAtvEndDateLessThan(Date value) {
            addCriterionForJDBCDate("atv_end_date <", value, "atvEndDate");
            return (Criteria) this;
        }

        public Criteria andAtvEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("atv_end_date <=", value, "atvEndDate");
            return (Criteria) this;
        }

        public Criteria andAtvEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("atv_end_date in", values, "atvEndDate");
            return (Criteria) this;
        }

        public Criteria andAtvEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("atv_end_date not in", values, "atvEndDate");
            return (Criteria) this;
        }

        public Criteria andAtvEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("atv_end_date between", value1, value2, "atvEndDate");
            return (Criteria) this;
        }

        public Criteria andAtvEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("atv_end_date not between", value1, value2, "atvEndDate");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceIsNull() {
            addCriterion("atv_place is null");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceIsNotNull() {
            addCriterion("atv_place is not null");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceEqualTo(String value) {
            addCriterion("atv_place =", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceNotEqualTo(String value) {
            addCriterion("atv_place <>", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceGreaterThan(String value) {
            addCriterion("atv_place >", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("atv_place >=", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceLessThan(String value) {
            addCriterion("atv_place <", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceLessThanOrEqualTo(String value) {
            addCriterion("atv_place <=", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceLike(String value) {
            addCriterion("atv_place like", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceNotLike(String value) {
            addCriterion("atv_place not like", value, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceIn(List<String> values) {
            addCriterion("atv_place in", values, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceNotIn(List<String> values) {
            addCriterion("atv_place not in", values, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceBetween(String value1, String value2) {
            addCriterion("atv_place between", value1, value2, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andAtvPlaceNotBetween(String value1, String value2) {
            addCriterion("atv_place not between", value1, value2, "atvPlace");
            return (Criteria) this;
        }

        public Criteria andLeadSocietyNoIsNull() {
            addCriterion("lead_society_no is null");
            return (Criteria) this;
        }

        public Criteria andLeadSocietyNoIsNotNull() {
            addCriterion("lead_society_no is not null");
            return (Criteria) this;
        }

        public Criteria andLeadSocietyNoEqualTo(Integer value) {
            addCriterion("lead_society_no =", value, "leadSocietyNo");
            return (Criteria) this;
        }

        public Criteria andLeadSocietyNoNotEqualTo(Integer value) {
            addCriterion("lead_society_no <>", value, "leadSocietyNo");
            return (Criteria) this;
        }

        public Criteria andLeadSocietyNoGreaterThan(Integer value) {
            addCriterion("lead_society_no >", value, "leadSocietyNo");
            return (Criteria) this;
        }

        public Criteria andLeadSocietyNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("lead_society_no >=", value, "leadSocietyNo");
            return (Criteria) this;
        }

        public Criteria andLeadSocietyNoLessThan(Integer value) {
            addCriterion("lead_society_no <", value, "leadSocietyNo");
            return (Criteria) this;
        }

        public Criteria andLeadSocietyNoLessThanOrEqualTo(Integer value) {
            addCriterion("lead_society_no <=", value, "leadSocietyNo");
            return (Criteria) this;
        }

        public Criteria andLeadSocietyNoIn(List<Integer> values) {
            addCriterion("lead_society_no in", values, "leadSocietyNo");
            return (Criteria) this;
        }

        public Criteria andLeadSocietyNoNotIn(List<Integer> values) {
            addCriterion("lead_society_no not in", values, "leadSocietyNo");
            return (Criteria) this;
        }

        public Criteria andLeadSocietyNoBetween(Integer value1, Integer value2) {
            addCriterion("lead_society_no between", value1, value2, "leadSocietyNo");
            return (Criteria) this;
        }

        public Criteria andLeadSocietyNoNotBetween(Integer value1, Integer value2) {
            addCriterion("lead_society_no not between", value1, value2, "leadSocietyNo");
            return (Criteria) this;
        }

        public Criteria andHasRewardIsNull() {
            addCriterion("has_reward is null");
            return (Criteria) this;
        }

        public Criteria andHasRewardIsNotNull() {
            addCriterion("has_reward is not null");
            return (Criteria) this;
        }

        public Criteria andHasRewardEqualTo(Boolean value) {
            addCriterion("has_reward =", value, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardNotEqualTo(Boolean value) {
            addCriterion("has_reward <>", value, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardGreaterThan(Boolean value) {
            addCriterion("has_reward >", value, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_reward >=", value, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardLessThan(Boolean value) {
            addCriterion("has_reward <", value, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardLessThanOrEqualTo(Boolean value) {
            addCriterion("has_reward <=", value, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardIn(List<Boolean> values) {
            addCriterion("has_reward in", values, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardNotIn(List<Boolean> values) {
            addCriterion("has_reward not in", values, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardBetween(Boolean value1, Boolean value2) {
            addCriterion("has_reward between", value1, value2, "hasReward");
            return (Criteria) this;
        }

        public Criteria andHasRewardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_reward not between", value1, value2, "hasReward");
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