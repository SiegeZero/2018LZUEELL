package com.gsb.BasicObject.MBGPOJO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NotificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotificationExample() {
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

        public Criteria andNotificationNoIsNull() {
            addCriterion("notification_no is null");
            return (Criteria) this;
        }

        public Criteria andNotificationNoIsNotNull() {
            addCriterion("notification_no is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationNoEqualTo(Integer value) {
            addCriterion("notification_no =", value, "notificationNo");
            return (Criteria) this;
        }

        public Criteria andNotificationNoNotEqualTo(Integer value) {
            addCriterion("notification_no <>", value, "notificationNo");
            return (Criteria) this;
        }

        public Criteria andNotificationNoGreaterThan(Integer value) {
            addCriterion("notification_no >", value, "notificationNo");
            return (Criteria) this;
        }

        public Criteria andNotificationNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("notification_no >=", value, "notificationNo");
            return (Criteria) this;
        }

        public Criteria andNotificationNoLessThan(Integer value) {
            addCriterion("notification_no <", value, "notificationNo");
            return (Criteria) this;
        }

        public Criteria andNotificationNoLessThanOrEqualTo(Integer value) {
            addCriterion("notification_no <=", value, "notificationNo");
            return (Criteria) this;
        }

        public Criteria andNotificationNoIn(List<Integer> values) {
            addCriterion("notification_no in", values, "notificationNo");
            return (Criteria) this;
        }

        public Criteria andNotificationNoNotIn(List<Integer> values) {
            addCriterion("notification_no not in", values, "notificationNo");
            return (Criteria) this;
        }

        public Criteria andNotificationNoBetween(Integer value1, Integer value2) {
            addCriterion("notification_no between", value1, value2, "notificationNo");
            return (Criteria) this;
        }

        public Criteria andNotificationNoNotBetween(Integer value1, Integer value2) {
            addCriterion("notification_no not between", value1, value2, "notificationNo");
            return (Criteria) this;
        }

        public Criteria andPublisherNoIsNull() {
            addCriterion("publisher_no is null");
            return (Criteria) this;
        }

        public Criteria andPublisherNoIsNotNull() {
            addCriterion("publisher_no is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherNoEqualTo(Integer value) {
            addCriterion("publisher_no =", value, "publisherNo");
            return (Criteria) this;
        }

        public Criteria andPublisherNoNotEqualTo(Integer value) {
            addCriterion("publisher_no <>", value, "publisherNo");
            return (Criteria) this;
        }

        public Criteria andPublisherNoGreaterThan(Integer value) {
            addCriterion("publisher_no >", value, "publisherNo");
            return (Criteria) this;
        }

        public Criteria andPublisherNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("publisher_no >=", value, "publisherNo");
            return (Criteria) this;
        }

        public Criteria andPublisherNoLessThan(Integer value) {
            addCriterion("publisher_no <", value, "publisherNo");
            return (Criteria) this;
        }

        public Criteria andPublisherNoLessThanOrEqualTo(Integer value) {
            addCriterion("publisher_no <=", value, "publisherNo");
            return (Criteria) this;
        }

        public Criteria andPublisherNoIn(List<Integer> values) {
            addCriterion("publisher_no in", values, "publisherNo");
            return (Criteria) this;
        }

        public Criteria andPublisherNoNotIn(List<Integer> values) {
            addCriterion("publisher_no not in", values, "publisherNo");
            return (Criteria) this;
        }

        public Criteria andPublisherNoBetween(Integer value1, Integer value2) {
            addCriterion("publisher_no between", value1, value2, "publisherNo");
            return (Criteria) this;
        }

        public Criteria andPublisherNoNotBetween(Integer value1, Integer value2) {
            addCriterion("publisher_no not between", value1, value2, "publisherNo");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterionForJDBCDate("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterionForJDBCDate("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterionForJDBCDate("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
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