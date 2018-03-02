package com.gsb.BasicObject.MBGPOJO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonExample() {
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

        public Criteria andNativePlaceIsNull() {
            addCriterion("native_place is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("native_place is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("native_place =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("native_place <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("native_place >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("native_place >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("native_place <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("native_place <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("native_place like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("native_place not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("native_place in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("native_place not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("native_place between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("native_place not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andSalaryNoIsNull() {
            addCriterion("salary_no is null");
            return (Criteria) this;
        }

        public Criteria andSalaryNoIsNotNull() {
            addCriterion("salary_no is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryNoEqualTo(String value) {
            addCriterion("salary_no =", value, "salaryNo");
            return (Criteria) this;
        }

        public Criteria andSalaryNoNotEqualTo(String value) {
            addCriterion("salary_no <>", value, "salaryNo");
            return (Criteria) this;
        }

        public Criteria andSalaryNoGreaterThan(String value) {
            addCriterion("salary_no >", value, "salaryNo");
            return (Criteria) this;
        }

        public Criteria andSalaryNoGreaterThanOrEqualTo(String value) {
            addCriterion("salary_no >=", value, "salaryNo");
            return (Criteria) this;
        }

        public Criteria andSalaryNoLessThan(String value) {
            addCriterion("salary_no <", value, "salaryNo");
            return (Criteria) this;
        }

        public Criteria andSalaryNoLessThanOrEqualTo(String value) {
            addCriterion("salary_no <=", value, "salaryNo");
            return (Criteria) this;
        }

        public Criteria andSalaryNoLike(String value) {
            addCriterion("salary_no like", value, "salaryNo");
            return (Criteria) this;
        }

        public Criteria andSalaryNoNotLike(String value) {
            addCriterion("salary_no not like", value, "salaryNo");
            return (Criteria) this;
        }

        public Criteria andSalaryNoIn(List<String> values) {
            addCriterion("salary_no in", values, "salaryNo");
            return (Criteria) this;
        }

        public Criteria andSalaryNoNotIn(List<String> values) {
            addCriterion("salary_no not in", values, "salaryNo");
            return (Criteria) this;
        }

        public Criteria andSalaryNoBetween(String value1, String value2) {
            addCriterion("salary_no between", value1, value2, "salaryNo");
            return (Criteria) this;
        }

        public Criteria andSalaryNoNotBetween(String value1, String value2) {
            addCriterion("salary_no not between", value1, value2, "salaryNo");
            return (Criteria) this;
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

        public Criteria andDeptNoIsNull() {
            addCriterion("dept_no is null");
            return (Criteria) this;
        }

        public Criteria andDeptNoIsNotNull() {
            addCriterion("dept_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNoEqualTo(Integer value) {
            addCriterion("dept_no =", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotEqualTo(Integer value) {
            addCriterion("dept_no <>", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoGreaterThan(Integer value) {
            addCriterion("dept_no >", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_no >=", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLessThan(Integer value) {
            addCriterion("dept_no <", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoLessThanOrEqualTo(Integer value) {
            addCriterion("dept_no <=", value, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoIn(List<Integer> values) {
            addCriterion("dept_no in", values, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotIn(List<Integer> values) {
            addCriterion("dept_no not in", values, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoBetween(Integer value1, Integer value2) {
            addCriterion("dept_no between", value1, value2, "deptNo");
            return (Criteria) this;
        }

        public Criteria andDeptNoNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_no not between", value1, value2, "deptNo");
            return (Criteria) this;
        }

        public Criteria andFuncIsNull() {
            addCriterion("func is null");
            return (Criteria) this;
        }

        public Criteria andFuncIsNotNull() {
            addCriterion("func is not null");
            return (Criteria) this;
        }

        public Criteria andFuncEqualTo(String value) {
            addCriterion("func =", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncNotEqualTo(String value) {
            addCriterion("func <>", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncGreaterThan(String value) {
            addCriterion("func >", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncGreaterThanOrEqualTo(String value) {
            addCriterion("func >=", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncLessThan(String value) {
            addCriterion("func <", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncLessThanOrEqualTo(String value) {
            addCriterion("func <=", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncLike(String value) {
            addCriterion("func like", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncNotLike(String value) {
            addCriterion("func not like", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncIn(List<String> values) {
            addCriterion("func in", values, "func");
            return (Criteria) this;
        }

        public Criteria andFuncNotIn(List<String> values) {
            addCriterion("func not in", values, "func");
            return (Criteria) this;
        }

        public Criteria andFuncBetween(String value1, String value2) {
            addCriterion("func between", value1, value2, "func");
            return (Criteria) this;
        }

        public Criteria andFuncNotBetween(String value1, String value2) {
            addCriterion("func not between", value1, value2, "func");
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

        public Criteria andTitleLvIsNull() {
            addCriterion("title_lv is null");
            return (Criteria) this;
        }

        public Criteria andTitleLvIsNotNull() {
            addCriterion("title_lv is not null");
            return (Criteria) this;
        }

        public Criteria andTitleLvEqualTo(String value) {
            addCriterion("title_lv =", value, "titleLv");
            return (Criteria) this;
        }

        public Criteria andTitleLvNotEqualTo(String value) {
            addCriterion("title_lv <>", value, "titleLv");
            return (Criteria) this;
        }

        public Criteria andTitleLvGreaterThan(String value) {
            addCriterion("title_lv >", value, "titleLv");
            return (Criteria) this;
        }

        public Criteria andTitleLvGreaterThanOrEqualTo(String value) {
            addCriterion("title_lv >=", value, "titleLv");
            return (Criteria) this;
        }

        public Criteria andTitleLvLessThan(String value) {
            addCriterion("title_lv <", value, "titleLv");
            return (Criteria) this;
        }

        public Criteria andTitleLvLessThanOrEqualTo(String value) {
            addCriterion("title_lv <=", value, "titleLv");
            return (Criteria) this;
        }

        public Criteria andTitleLvLike(String value) {
            addCriterion("title_lv like", value, "titleLv");
            return (Criteria) this;
        }

        public Criteria andTitleLvNotLike(String value) {
            addCriterion("title_lv not like", value, "titleLv");
            return (Criteria) this;
        }

        public Criteria andTitleLvIn(List<String> values) {
            addCriterion("title_lv in", values, "titleLv");
            return (Criteria) this;
        }

        public Criteria andTitleLvNotIn(List<String> values) {
            addCriterion("title_lv not in", values, "titleLv");
            return (Criteria) this;
        }

        public Criteria andTitleLvBetween(String value1, String value2) {
            addCriterion("title_lv between", value1, value2, "titleLv");
            return (Criteria) this;
        }

        public Criteria andTitleLvNotBetween(String value1, String value2) {
            addCriterion("title_lv not between", value1, value2, "titleLv");
            return (Criteria) this;
        }

        public Criteria andLatestSympathyYearIsNull() {
            addCriterion("latest_sympathy_year is null");
            return (Criteria) this;
        }

        public Criteria andLatestSympathyYearIsNotNull() {
            addCriterion("latest_sympathy_year is not null");
            return (Criteria) this;
        }

        public Criteria andLatestSympathyYearEqualTo(Date value) {
            addCriterionForJDBCDate("latest_sympathy_year =", value, "latestSympathyYear");
            return (Criteria) this;
        }

        public Criteria andLatestSympathyYearNotEqualTo(Date value) {
            addCriterionForJDBCDate("latest_sympathy_year <>", value, "latestSympathyYear");
            return (Criteria) this;
        }

        public Criteria andLatestSympathyYearGreaterThan(Date value) {
            addCriterionForJDBCDate("latest_sympathy_year >", value, "latestSympathyYear");
            return (Criteria) this;
        }

        public Criteria andLatestSympathyYearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("latest_sympathy_year >=", value, "latestSympathyYear");
            return (Criteria) this;
        }

        public Criteria andLatestSympathyYearLessThan(Date value) {
            addCriterionForJDBCDate("latest_sympathy_year <", value, "latestSympathyYear");
            return (Criteria) this;
        }

        public Criteria andLatestSympathyYearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("latest_sympathy_year <=", value, "latestSympathyYear");
            return (Criteria) this;
        }

        public Criteria andLatestSympathyYearIn(List<Date> values) {
            addCriterionForJDBCDate("latest_sympathy_year in", values, "latestSympathyYear");
            return (Criteria) this;
        }

        public Criteria andLatestSympathyYearNotIn(List<Date> values) {
            addCriterionForJDBCDate("latest_sympathy_year not in", values, "latestSympathyYear");
            return (Criteria) this;
        }

        public Criteria andLatestSympathyYearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("latest_sympathy_year between", value1, value2, "latestSympathyYear");
            return (Criteria) this;
        }

        public Criteria andLatestSympathyYearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("latest_sympathy_year not between", value1, value2, "latestSympathyYear");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeIsNull() {
            addCriterion("job_end_time is null");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeIsNotNull() {
            addCriterion("job_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("job_end_time =", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("job_end_time <>", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("job_end_time >", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("job_end_time >=", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("job_end_time <", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("job_end_time <=", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("job_end_time in", values, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("job_end_time not in", values, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("job_end_time between", value1, value2, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("job_end_time not between", value1, value2, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeIsNull() {
            addCriterion("job_start_time is null");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeIsNotNull() {
            addCriterion("job_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("job_start_time =", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("job_start_time <>", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("job_start_time >", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("job_start_time >=", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("job_start_time <", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("job_start_time <=", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("job_start_time in", values, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("job_start_time not in", values, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("job_start_time between", value1, value2, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("job_start_time not between", value1, value2, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeIsNull() {
            addCriterion("birth_time is null");
            return (Criteria) this;
        }

        public Criteria andBirthTimeIsNotNull() {
            addCriterion("birth_time is not null");
            return (Criteria) this;
        }

        public Criteria andBirthTimeEqualTo(Date value) {
            addCriterionForJDBCDate("birth_time =", value, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("birth_time <>", value, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("birth_time >", value, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth_time >=", value, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeLessThan(Date value) {
            addCriterionForJDBCDate("birth_time <", value, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth_time <=", value, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeIn(List<Date> values) {
            addCriterionForJDBCDate("birth_time in", values, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("birth_time not in", values, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth_time between", value1, value2, "birthTime");
            return (Criteria) this;
        }

        public Criteria andBirthTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth_time not between", value1, value2, "birthTime");
            return (Criteria) this;
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

        public Criteria andPoliticalStatusIsNull() {
            addCriterion("political_status is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNotNull() {
            addCriterion("political_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusEqualTo(String value) {
            addCriterion("political_status =", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotEqualTo(String value) {
            addCriterion("political_status <>", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThan(String value) {
            addCriterion("political_status >", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("political_status >=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThan(String value) {
            addCriterion("political_status <", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThanOrEqualTo(String value) {
            addCriterion("political_status <=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLike(String value) {
            addCriterion("political_status like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotLike(String value) {
            addCriterion("political_status not like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIn(List<String> values) {
            addCriterion("political_status in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotIn(List<String> values) {
            addCriterion("political_status not in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusBetween(String value1, String value2) {
            addCriterion("political_status between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotBetween(String value1, String value2) {
            addCriterion("political_status not between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeIsNull() {
            addCriterion("quit_office_type is null");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeIsNotNull() {
            addCriterion("quit_office_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeEqualTo(String value) {
            addCriterion("quit_office_type =", value, "quitOfficeType");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeNotEqualTo(String value) {
            addCriterion("quit_office_type <>", value, "quitOfficeType");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeGreaterThan(String value) {
            addCriterion("quit_office_type >", value, "quitOfficeType");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("quit_office_type >=", value, "quitOfficeType");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeLessThan(String value) {
            addCriterion("quit_office_type <", value, "quitOfficeType");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeLessThanOrEqualTo(String value) {
            addCriterion("quit_office_type <=", value, "quitOfficeType");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeLike(String value) {
            addCriterion("quit_office_type like", value, "quitOfficeType");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeNotLike(String value) {
            addCriterion("quit_office_type not like", value, "quitOfficeType");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeIn(List<String> values) {
            addCriterion("quit_office_type in", values, "quitOfficeType");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeNotIn(List<String> values) {
            addCriterion("quit_office_type not in", values, "quitOfficeType");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeBetween(String value1, String value2) {
            addCriterion("quit_office_type between", value1, value2, "quitOfficeType");
            return (Criteria) this;
        }

        public Criteria andQuitOfficeTypeNotBetween(String value1, String value2) {
            addCriterion("quit_office_type not between", value1, value2, "quitOfficeType");
            return (Criteria) this;
        }

        public Criteria andPensionModelNoIsNull() {
            addCriterion("pension_model_no is null");
            return (Criteria) this;
        }

        public Criteria andPensionModelNoIsNotNull() {
            addCriterion("pension_model_no is not null");
            return (Criteria) this;
        }

        public Criteria andPensionModelNoEqualTo(Integer value) {
            addCriterion("pension_model_no =", value, "pensionModelNo");
            return (Criteria) this;
        }

        public Criteria andPensionModelNoNotEqualTo(Integer value) {
            addCriterion("pension_model_no <>", value, "pensionModelNo");
            return (Criteria) this;
        }

        public Criteria andPensionModelNoGreaterThan(Integer value) {
            addCriterion("pension_model_no >", value, "pensionModelNo");
            return (Criteria) this;
        }

        public Criteria andPensionModelNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("pension_model_no >=", value, "pensionModelNo");
            return (Criteria) this;
        }

        public Criteria andPensionModelNoLessThan(Integer value) {
            addCriterion("pension_model_no <", value, "pensionModelNo");
            return (Criteria) this;
        }

        public Criteria andPensionModelNoLessThanOrEqualTo(Integer value) {
            addCriterion("pension_model_no <=", value, "pensionModelNo");
            return (Criteria) this;
        }

        public Criteria andPensionModelNoIn(List<Integer> values) {
            addCriterion("pension_model_no in", values, "pensionModelNo");
            return (Criteria) this;
        }

        public Criteria andPensionModelNoNotIn(List<Integer> values) {
            addCriterion("pension_model_no not in", values, "pensionModelNo");
            return (Criteria) this;
        }

        public Criteria andPensionModelNoBetween(Integer value1, Integer value2) {
            addCriterion("pension_model_no between", value1, value2, "pensionModelNo");
            return (Criteria) this;
        }

        public Criteria andPensionModelNoNotBetween(Integer value1, Integer value2) {
            addCriterion("pension_model_no not between", value1, value2, "pensionModelNo");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationIsNull() {
            addCriterion("physical_situation is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationIsNotNull() {
            addCriterion("physical_situation is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationEqualTo(String value) {
            addCriterion("physical_situation =", value, "physicalSituation");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationNotEqualTo(String value) {
            addCriterion("physical_situation <>", value, "physicalSituation");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationGreaterThan(String value) {
            addCriterion("physical_situation >", value, "physicalSituation");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationGreaterThanOrEqualTo(String value) {
            addCriterion("physical_situation >=", value, "physicalSituation");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationLessThan(String value) {
            addCriterion("physical_situation <", value, "physicalSituation");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationLessThanOrEqualTo(String value) {
            addCriterion("physical_situation <=", value, "physicalSituation");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationLike(String value) {
            addCriterion("physical_situation like", value, "physicalSituation");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationNotLike(String value) {
            addCriterion("physical_situation not like", value, "physicalSituation");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationIn(List<String> values) {
            addCriterion("physical_situation in", values, "physicalSituation");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationNotIn(List<String> values) {
            addCriterion("physical_situation not in", values, "physicalSituation");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationBetween(String value1, String value2) {
            addCriterion("physical_situation between", value1, value2, "physicalSituation");
            return (Criteria) this;
        }

        public Criteria andPhysicalSituationNotBetween(String value1, String value2) {
            addCriterion("physical_situation not between", value1, value2, "physicalSituation");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationIsNull() {
            addCriterion("conscription_situation is null");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationIsNotNull() {
            addCriterion("conscription_situation is not null");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationEqualTo(String value) {
            addCriterion("conscription_situation =", value, "conscriptionSituation");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationNotEqualTo(String value) {
            addCriterion("conscription_situation <>", value, "conscriptionSituation");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationGreaterThan(String value) {
            addCriterion("conscription_situation >", value, "conscriptionSituation");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationGreaterThanOrEqualTo(String value) {
            addCriterion("conscription_situation >=", value, "conscriptionSituation");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationLessThan(String value) {
            addCriterion("conscription_situation <", value, "conscriptionSituation");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationLessThanOrEqualTo(String value) {
            addCriterion("conscription_situation <=", value, "conscriptionSituation");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationLike(String value) {
            addCriterion("conscription_situation like", value, "conscriptionSituation");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationNotLike(String value) {
            addCriterion("conscription_situation not like", value, "conscriptionSituation");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationIn(List<String> values) {
            addCriterion("conscription_situation in", values, "conscriptionSituation");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationNotIn(List<String> values) {
            addCriterion("conscription_situation not in", values, "conscriptionSituation");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationBetween(String value1, String value2) {
            addCriterion("conscription_situation between", value1, value2, "conscriptionSituation");
            return (Criteria) this;
        }

        public Criteria andConscriptionSituationNotBetween(String value1, String value2) {
            addCriterion("conscription_situation not between", value1, value2, "conscriptionSituation");
            return (Criteria) this;
        }

        public Criteria andIsHelpNeededIsNull() {
            addCriterion("is_help_needed is null");
            return (Criteria) this;
        }

        public Criteria andIsHelpNeededIsNotNull() {
            addCriterion("is_help_needed is not null");
            return (Criteria) this;
        }

        public Criteria andIsHelpNeededEqualTo(Boolean value) {
            addCriterion("is_help_needed =", value, "isHelpNeeded");
            return (Criteria) this;
        }

        public Criteria andIsHelpNeededNotEqualTo(Boolean value) {
            addCriterion("is_help_needed <>", value, "isHelpNeeded");
            return (Criteria) this;
        }

        public Criteria andIsHelpNeededGreaterThan(Boolean value) {
            addCriterion("is_help_needed >", value, "isHelpNeeded");
            return (Criteria) this;
        }

        public Criteria andIsHelpNeededGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_help_needed >=", value, "isHelpNeeded");
            return (Criteria) this;
        }

        public Criteria andIsHelpNeededLessThan(Boolean value) {
            addCriterion("is_help_needed <", value, "isHelpNeeded");
            return (Criteria) this;
        }

        public Criteria andIsHelpNeededLessThanOrEqualTo(Boolean value) {
            addCriterion("is_help_needed <=", value, "isHelpNeeded");
            return (Criteria) this;
        }

        public Criteria andIsHelpNeededIn(List<Boolean> values) {
            addCriterion("is_help_needed in", values, "isHelpNeeded");
            return (Criteria) this;
        }

        public Criteria andIsHelpNeededNotIn(List<Boolean> values) {
            addCriterion("is_help_needed not in", values, "isHelpNeeded");
            return (Criteria) this;
        }

        public Criteria andIsHelpNeededBetween(Boolean value1, Boolean value2) {
            addCriterion("is_help_needed between", value1, value2, "isHelpNeeded");
            return (Criteria) this;
        }

        public Criteria andIsHelpNeededNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_help_needed not between", value1, value2, "isHelpNeeded");
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