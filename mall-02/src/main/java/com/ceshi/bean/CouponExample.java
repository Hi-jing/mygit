package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class CouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponExample() {
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

        public Criteria andCoIdIsNull() {
            addCriterion("co_id is null");
            return (Criteria) this;
        }

        public Criteria andCoIdIsNotNull() {
            addCriterion("co_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoIdEqualTo(Integer value) {
            addCriterion("co_id =", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotEqualTo(Integer value) {
            addCriterion("co_id <>", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThan(Integer value) {
            addCriterion("co_id >", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_id >=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThan(Integer value) {
            addCriterion("co_id <", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThanOrEqualTo(Integer value) {
            addCriterion("co_id <=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdIn(List<Integer> values) {
            addCriterion("co_id in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotIn(List<Integer> values) {
            addCriterion("co_id not in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdBetween(Integer value1, Integer value2) {
            addCriterion("co_id between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("co_id not between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoTypeIsNull() {
            addCriterion("co_type is null");
            return (Criteria) this;
        }

        public Criteria andCoTypeIsNotNull() {
            addCriterion("co_type is not null");
            return (Criteria) this;
        }

        public Criteria andCoTypeEqualTo(Integer value) {
            addCriterion("co_type =", value, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeNotEqualTo(Integer value) {
            addCriterion("co_type <>", value, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeGreaterThan(Integer value) {
            addCriterion("co_type >", value, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_type >=", value, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeLessThan(Integer value) {
            addCriterion("co_type <", value, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeLessThanOrEqualTo(Integer value) {
            addCriterion("co_type <=", value, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeIn(List<Integer> values) {
            addCriterion("co_type in", values, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeNotIn(List<Integer> values) {
            addCriterion("co_type not in", values, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeBetween(Integer value1, Integer value2) {
            addCriterion("co_type between", value1, value2, "coType");
            return (Criteria) this;
        }

        public Criteria andCoTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("co_type not between", value1, value2, "coType");
            return (Criteria) this;
        }

        public Criteria andCoNeedmoneyIsNull() {
            addCriterion("co_needmoney is null");
            return (Criteria) this;
        }

        public Criteria andCoNeedmoneyIsNotNull() {
            addCriterion("co_needmoney is not null");
            return (Criteria) this;
        }

        public Criteria andCoNeedmoneyEqualTo(Double value) {
            addCriterion("co_needmoney =", value, "coNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCoNeedmoneyNotEqualTo(Double value) {
            addCriterion("co_needmoney <>", value, "coNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCoNeedmoneyGreaterThan(Double value) {
            addCriterion("co_needmoney >", value, "coNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCoNeedmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("co_needmoney >=", value, "coNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCoNeedmoneyLessThan(Double value) {
            addCriterion("co_needmoney <", value, "coNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCoNeedmoneyLessThanOrEqualTo(Double value) {
            addCriterion("co_needmoney <=", value, "coNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCoNeedmoneyIn(List<Double> values) {
            addCriterion("co_needmoney in", values, "coNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCoNeedmoneyNotIn(List<Double> values) {
            addCriterion("co_needmoney not in", values, "coNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCoNeedmoneyBetween(Double value1, Double value2) {
            addCriterion("co_needmoney between", value1, value2, "coNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCoNeedmoneyNotBetween(Double value1, Double value2) {
            addCriterion("co_needmoney not between", value1, value2, "coNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCoReductmoneyIsNull() {
            addCriterion("co_reductmoney is null");
            return (Criteria) this;
        }

        public Criteria andCoReductmoneyIsNotNull() {
            addCriterion("co_reductmoney is not null");
            return (Criteria) this;
        }

        public Criteria andCoReductmoneyEqualTo(Double value) {
            addCriterion("co_reductmoney =", value, "coReductmoney");
            return (Criteria) this;
        }

        public Criteria andCoReductmoneyNotEqualTo(Double value) {
            addCriterion("co_reductmoney <>", value, "coReductmoney");
            return (Criteria) this;
        }

        public Criteria andCoReductmoneyGreaterThan(Double value) {
            addCriterion("co_reductmoney >", value, "coReductmoney");
            return (Criteria) this;
        }

        public Criteria andCoReductmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("co_reductmoney >=", value, "coReductmoney");
            return (Criteria) this;
        }

        public Criteria andCoReductmoneyLessThan(Double value) {
            addCriterion("co_reductmoney <", value, "coReductmoney");
            return (Criteria) this;
        }

        public Criteria andCoReductmoneyLessThanOrEqualTo(Double value) {
            addCriterion("co_reductmoney <=", value, "coReductmoney");
            return (Criteria) this;
        }

        public Criteria andCoReductmoneyIn(List<Double> values) {
            addCriterion("co_reductmoney in", values, "coReductmoney");
            return (Criteria) this;
        }

        public Criteria andCoReductmoneyNotIn(List<Double> values) {
            addCriterion("co_reductmoney not in", values, "coReductmoney");
            return (Criteria) this;
        }

        public Criteria andCoReductmoneyBetween(Double value1, Double value2) {
            addCriterion("co_reductmoney between", value1, value2, "coReductmoney");
            return (Criteria) this;
        }

        public Criteria andCoReductmoneyNotBetween(Double value1, Double value2) {
            addCriterion("co_reductmoney not between", value1, value2, "coReductmoney");
            return (Criteria) this;
        }

        public Criteria andCoUsetypeIsNull() {
            addCriterion("co_usetype is null");
            return (Criteria) this;
        }

        public Criteria andCoUsetypeIsNotNull() {
            addCriterion("co_usetype is not null");
            return (Criteria) this;
        }

        public Criteria andCoUsetypeEqualTo(Integer value) {
            addCriterion("co_usetype =", value, "coUsetype");
            return (Criteria) this;
        }

        public Criteria andCoUsetypeNotEqualTo(Integer value) {
            addCriterion("co_usetype <>", value, "coUsetype");
            return (Criteria) this;
        }

        public Criteria andCoUsetypeGreaterThan(Integer value) {
            addCriterion("co_usetype >", value, "coUsetype");
            return (Criteria) this;
        }

        public Criteria andCoUsetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_usetype >=", value, "coUsetype");
            return (Criteria) this;
        }

        public Criteria andCoUsetypeLessThan(Integer value) {
            addCriterion("co_usetype <", value, "coUsetype");
            return (Criteria) this;
        }

        public Criteria andCoUsetypeLessThanOrEqualTo(Integer value) {
            addCriterion("co_usetype <=", value, "coUsetype");
            return (Criteria) this;
        }

        public Criteria andCoUsetypeIn(List<Integer> values) {
            addCriterion("co_usetype in", values, "coUsetype");
            return (Criteria) this;
        }

        public Criteria andCoUsetypeNotIn(List<Integer> values) {
            addCriterion("co_usetype not in", values, "coUsetype");
            return (Criteria) this;
        }

        public Criteria andCoUsetypeBetween(Integer value1, Integer value2) {
            addCriterion("co_usetype between", value1, value2, "coUsetype");
            return (Criteria) this;
        }

        public Criteria andCoUsetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("co_usetype not between", value1, value2, "coUsetype");
            return (Criteria) this;
        }

        public Criteria andCoTotalIsNull() {
            addCriterion("co_total is null");
            return (Criteria) this;
        }

        public Criteria andCoTotalIsNotNull() {
            addCriterion("co_total is not null");
            return (Criteria) this;
        }

        public Criteria andCoTotalEqualTo(Integer value) {
            addCriterion("co_total =", value, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalNotEqualTo(Integer value) {
            addCriterion("co_total <>", value, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalGreaterThan(Integer value) {
            addCriterion("co_total >", value, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_total >=", value, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalLessThan(Integer value) {
            addCriterion("co_total <", value, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalLessThanOrEqualTo(Integer value) {
            addCriterion("co_total <=", value, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalIn(List<Integer> values) {
            addCriterion("co_total in", values, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalNotIn(List<Integer> values) {
            addCriterion("co_total not in", values, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalBetween(Integer value1, Integer value2) {
            addCriterion("co_total between", value1, value2, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("co_total not between", value1, value2, "coTotal");
            return (Criteria) this;
        }

        public Criteria andCoStartdateIsNull() {
            addCriterion("co_startdate is null");
            return (Criteria) this;
        }

        public Criteria andCoStartdateIsNotNull() {
            addCriterion("co_startdate is not null");
            return (Criteria) this;
        }

        public Criteria andCoStartdateEqualTo(String value) {
            addCriterion("co_startdate =", value, "coStartdate");
            return (Criteria) this;
        }

        public Criteria andCoStartdateNotEqualTo(String value) {
            addCriterion("co_startdate <>", value, "coStartdate");
            return (Criteria) this;
        }

        public Criteria andCoStartdateGreaterThan(String value) {
            addCriterion("co_startdate >", value, "coStartdate");
            return (Criteria) this;
        }

        public Criteria andCoStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("co_startdate >=", value, "coStartdate");
            return (Criteria) this;
        }

        public Criteria andCoStartdateLessThan(String value) {
            addCriterion("co_startdate <", value, "coStartdate");
            return (Criteria) this;
        }

        public Criteria andCoStartdateLessThanOrEqualTo(String value) {
            addCriterion("co_startdate <=", value, "coStartdate");
            return (Criteria) this;
        }

        public Criteria andCoStartdateLike(String value) {
            addCriterion("co_startdate like", value, "coStartdate");
            return (Criteria) this;
        }

        public Criteria andCoStartdateNotLike(String value) {
            addCriterion("co_startdate not like", value, "coStartdate");
            return (Criteria) this;
        }

        public Criteria andCoStartdateIn(List<String> values) {
            addCriterion("co_startdate in", values, "coStartdate");
            return (Criteria) this;
        }

        public Criteria andCoStartdateNotIn(List<String> values) {
            addCriterion("co_startdate not in", values, "coStartdate");
            return (Criteria) this;
        }

        public Criteria andCoStartdateBetween(String value1, String value2) {
            addCriterion("co_startdate between", value1, value2, "coStartdate");
            return (Criteria) this;
        }

        public Criteria andCoStartdateNotBetween(String value1, String value2) {
            addCriterion("co_startdate not between", value1, value2, "coStartdate");
            return (Criteria) this;
        }

        public Criteria andCoEnddateIsNull() {
            addCriterion("co_enddate is null");
            return (Criteria) this;
        }

        public Criteria andCoEnddateIsNotNull() {
            addCriterion("co_enddate is not null");
            return (Criteria) this;
        }

        public Criteria andCoEnddateEqualTo(String value) {
            addCriterion("co_enddate =", value, "coEnddate");
            return (Criteria) this;
        }

        public Criteria andCoEnddateNotEqualTo(String value) {
            addCriterion("co_enddate <>", value, "coEnddate");
            return (Criteria) this;
        }

        public Criteria andCoEnddateGreaterThan(String value) {
            addCriterion("co_enddate >", value, "coEnddate");
            return (Criteria) this;
        }

        public Criteria andCoEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("co_enddate >=", value, "coEnddate");
            return (Criteria) this;
        }

        public Criteria andCoEnddateLessThan(String value) {
            addCriterion("co_enddate <", value, "coEnddate");
            return (Criteria) this;
        }

        public Criteria andCoEnddateLessThanOrEqualTo(String value) {
            addCriterion("co_enddate <=", value, "coEnddate");
            return (Criteria) this;
        }

        public Criteria andCoEnddateLike(String value) {
            addCriterion("co_enddate like", value, "coEnddate");
            return (Criteria) this;
        }

        public Criteria andCoEnddateNotLike(String value) {
            addCriterion("co_enddate not like", value, "coEnddate");
            return (Criteria) this;
        }

        public Criteria andCoEnddateIn(List<String> values) {
            addCriterion("co_enddate in", values, "coEnddate");
            return (Criteria) this;
        }

        public Criteria andCoEnddateNotIn(List<String> values) {
            addCriterion("co_enddate not in", values, "coEnddate");
            return (Criteria) this;
        }

        public Criteria andCoEnddateBetween(String value1, String value2) {
            addCriterion("co_enddate between", value1, value2, "coEnddate");
            return (Criteria) this;
        }

        public Criteria andCoEnddateNotBetween(String value1, String value2) {
            addCriterion("co_enddate not between", value1, value2, "coEnddate");
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