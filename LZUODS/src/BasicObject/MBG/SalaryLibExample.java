package BasicObject.MBG;

import java.util.ArrayList;
import java.util.List;

public class SalaryLibExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryLibExample() {
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

        public Criteria andSalaryLibNoIsNull() {
            addCriterion("salary_lib_no is null");
            return (Criteria) this;
        }

        public Criteria andSalaryLibNoIsNotNull() {
            addCriterion("salary_lib_no is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryLibNoEqualTo(Integer value) {
            addCriterion("salary_lib_no =", value, "salaryLibNo");
            return (Criteria) this;
        }

        public Criteria andSalaryLibNoNotEqualTo(Integer value) {
            addCriterion("salary_lib_no <>", value, "salaryLibNo");
            return (Criteria) this;
        }

        public Criteria andSalaryLibNoGreaterThan(Integer value) {
            addCriterion("salary_lib_no >", value, "salaryLibNo");
            return (Criteria) this;
        }

        public Criteria andSalaryLibNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary_lib_no >=", value, "salaryLibNo");
            return (Criteria) this;
        }

        public Criteria andSalaryLibNoLessThan(Integer value) {
            addCriterion("salary_lib_no <", value, "salaryLibNo");
            return (Criteria) this;
        }

        public Criteria andSalaryLibNoLessThanOrEqualTo(Integer value) {
            addCriterion("salary_lib_no <=", value, "salaryLibNo");
            return (Criteria) this;
        }

        public Criteria andSalaryLibNoIn(List<Integer> values) {
            addCriterion("salary_lib_no in", values, "salaryLibNo");
            return (Criteria) this;
        }

        public Criteria andSalaryLibNoNotIn(List<Integer> values) {
            addCriterion("salary_lib_no not in", values, "salaryLibNo");
            return (Criteria) this;
        }

        public Criteria andSalaryLibNoBetween(Integer value1, Integer value2) {
            addCriterion("salary_lib_no between", value1, value2, "salaryLibNo");
            return (Criteria) this;
        }

        public Criteria andSalaryLibNoNotBetween(Integer value1, Integer value2) {
            addCriterion("salary_lib_no not between", value1, value2, "salaryLibNo");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionIsNull() {
            addCriterion("salary_version is null");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionIsNotNull() {
            addCriterion("salary_version is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionEqualTo(String value) {
            addCriterion("salary_version =", value, "salaryVersion");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionNotEqualTo(String value) {
            addCriterion("salary_version <>", value, "salaryVersion");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionGreaterThan(String value) {
            addCriterion("salary_version >", value, "salaryVersion");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionGreaterThanOrEqualTo(String value) {
            addCriterion("salary_version >=", value, "salaryVersion");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionLessThan(String value) {
            addCriterion("salary_version <", value, "salaryVersion");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionLessThanOrEqualTo(String value) {
            addCriterion("salary_version <=", value, "salaryVersion");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionLike(String value) {
            addCriterion("salary_version like", value, "salaryVersion");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionNotLike(String value) {
            addCriterion("salary_version not like", value, "salaryVersion");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionIn(List<String> values) {
            addCriterion("salary_version in", values, "salaryVersion");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionNotIn(List<String> values) {
            addCriterion("salary_version not in", values, "salaryVersion");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionBetween(String value1, String value2) {
            addCriterion("salary_version between", value1, value2, "salaryVersion");
            return (Criteria) this;
        }

        public Criteria andSalaryVersionNotBetween(String value1, String value2) {
            addCriterion("salary_version not between", value1, value2, "salaryVersion");
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