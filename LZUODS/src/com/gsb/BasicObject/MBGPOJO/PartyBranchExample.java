package com.gsb.BasicObject.MBGPOJO;

import java.util.ArrayList;
import java.util.List;

public class PartyBranchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartyBranchExample() {
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

        public Criteria andPartyBranchNoIsNull() {
            addCriterion("party_branch_no is null");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNoIsNotNull() {
            addCriterion("party_branch_no is not null");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNoEqualTo(Integer value) {
            addCriterion("party_branch_no =", value, "partyBranchNo");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNoNotEqualTo(Integer value) {
            addCriterion("party_branch_no <>", value, "partyBranchNo");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNoGreaterThan(Integer value) {
            addCriterion("party_branch_no >", value, "partyBranchNo");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("party_branch_no >=", value, "partyBranchNo");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNoLessThan(Integer value) {
            addCriterion("party_branch_no <", value, "partyBranchNo");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNoLessThanOrEqualTo(Integer value) {
            addCriterion("party_branch_no <=", value, "partyBranchNo");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNoIn(List<Integer> values) {
            addCriterion("party_branch_no in", values, "partyBranchNo");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNoNotIn(List<Integer> values) {
            addCriterion("party_branch_no not in", values, "partyBranchNo");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNoBetween(Integer value1, Integer value2) {
            addCriterion("party_branch_no between", value1, value2, "partyBranchNo");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNoNotBetween(Integer value1, Integer value2) {
            addCriterion("party_branch_no not between", value1, value2, "partyBranchNo");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameIsNull() {
            addCriterion("party_branch_name is null");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameIsNotNull() {
            addCriterion("party_branch_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameEqualTo(String value) {
            addCriterion("party_branch_name =", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameNotEqualTo(String value) {
            addCriterion("party_branch_name <>", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameGreaterThan(String value) {
            addCriterion("party_branch_name >", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("party_branch_name >=", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameLessThan(String value) {
            addCriterion("party_branch_name <", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameLessThanOrEqualTo(String value) {
            addCriterion("party_branch_name <=", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameLike(String value) {
            addCriterion("party_branch_name like", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameNotLike(String value) {
            addCriterion("party_branch_name not like", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameIn(List<String> values) {
            addCriterion("party_branch_name in", values, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameNotIn(List<String> values) {
            addCriterion("party_branch_name not in", values, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameBetween(String value1, String value2) {
            addCriterion("party_branch_name between", value1, value2, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameNotBetween(String value1, String value2) {
            addCriterion("party_branch_name not between", value1, value2, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameIsNull() {
            addCriterion("leader_name is null");
            return (Criteria) this;
        }

        public Criteria andLeaderNameIsNotNull() {
            addCriterion("leader_name is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderNameEqualTo(String value) {
            addCriterion("leader_name =", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameNotEqualTo(String value) {
            addCriterion("leader_name <>", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameGreaterThan(String value) {
            addCriterion("leader_name >", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("leader_name >=", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameLessThan(String value) {
            addCriterion("leader_name <", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameLessThanOrEqualTo(String value) {
            addCriterion("leader_name <=", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameLike(String value) {
            addCriterion("leader_name like", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameNotLike(String value) {
            addCriterion("leader_name not like", value, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameIn(List<String> values) {
            addCriterion("leader_name in", values, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameNotIn(List<String> values) {
            addCriterion("leader_name not in", values, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameBetween(String value1, String value2) {
            addCriterion("leader_name between", value1, value2, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderNameNotBetween(String value1, String value2) {
            addCriterion("leader_name not between", value1, value2, "leaderName");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneIsNull() {
            addCriterion("leader_phone is null");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneIsNotNull() {
            addCriterion("leader_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneEqualTo(String value) {
            addCriterion("leader_phone =", value, "leaderPhone");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneNotEqualTo(String value) {
            addCriterion("leader_phone <>", value, "leaderPhone");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneGreaterThan(String value) {
            addCriterion("leader_phone >", value, "leaderPhone");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("leader_phone >=", value, "leaderPhone");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneLessThan(String value) {
            addCriterion("leader_phone <", value, "leaderPhone");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneLessThanOrEqualTo(String value) {
            addCriterion("leader_phone <=", value, "leaderPhone");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneLike(String value) {
            addCriterion("leader_phone like", value, "leaderPhone");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneNotLike(String value) {
            addCriterion("leader_phone not like", value, "leaderPhone");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneIn(List<String> values) {
            addCriterion("leader_phone in", values, "leaderPhone");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneNotIn(List<String> values) {
            addCriterion("leader_phone not in", values, "leaderPhone");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneBetween(String value1, String value2) {
            addCriterion("leader_phone between", value1, value2, "leaderPhone");
            return (Criteria) this;
        }

        public Criteria andLeaderPhoneNotBetween(String value1, String value2) {
            addCriterion("leader_phone not between", value1, value2, "leaderPhone");
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