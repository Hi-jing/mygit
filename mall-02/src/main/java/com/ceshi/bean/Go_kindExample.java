package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class Go_kindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Go_kindExample() {
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

        public Criteria andKiIdIsNull() {
            addCriterion("ki_id is null");
            return (Criteria) this;
        }

        public Criteria andKiIdIsNotNull() {
            addCriterion("ki_id is not null");
            return (Criteria) this;
        }

        public Criteria andKiIdEqualTo(Integer value) {
            addCriterion("ki_id =", value, "kiId");
            return (Criteria) this;
        }

        public Criteria andKiIdNotEqualTo(Integer value) {
            addCriterion("ki_id <>", value, "kiId");
            return (Criteria) this;
        }

        public Criteria andKiIdGreaterThan(Integer value) {
            addCriterion("ki_id >", value, "kiId");
            return (Criteria) this;
        }

        public Criteria andKiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ki_id >=", value, "kiId");
            return (Criteria) this;
        }

        public Criteria andKiIdLessThan(Integer value) {
            addCriterion("ki_id <", value, "kiId");
            return (Criteria) this;
        }

        public Criteria andKiIdLessThanOrEqualTo(Integer value) {
            addCriterion("ki_id <=", value, "kiId");
            return (Criteria) this;
        }

        public Criteria andKiIdIn(List<Integer> values) {
            addCriterion("ki_id in", values, "kiId");
            return (Criteria) this;
        }

        public Criteria andKiIdNotIn(List<Integer> values) {
            addCriterion("ki_id not in", values, "kiId");
            return (Criteria) this;
        }

        public Criteria andKiIdBetween(Integer value1, Integer value2) {
            addCriterion("ki_id between", value1, value2, "kiId");
            return (Criteria) this;
        }

        public Criteria andKiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ki_id not between", value1, value2, "kiId");
            return (Criteria) this;
        }

        public Criteria andKiGoodidIsNull() {
            addCriterion("ki_goodid is null");
            return (Criteria) this;
        }

        public Criteria andKiGoodidIsNotNull() {
            addCriterion("ki_goodid is not null");
            return (Criteria) this;
        }

        public Criteria andKiGoodidEqualTo(Integer value) {
            addCriterion("ki_goodid =", value, "kiGoodid");
            return (Criteria) this;
        }

        public Criteria andKiGoodidNotEqualTo(Integer value) {
            addCriterion("ki_goodid <>", value, "kiGoodid");
            return (Criteria) this;
        }

        public Criteria andKiGoodidGreaterThan(Integer value) {
            addCriterion("ki_goodid >", value, "kiGoodid");
            return (Criteria) this;
        }

        public Criteria andKiGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ki_goodid >=", value, "kiGoodid");
            return (Criteria) this;
        }

        public Criteria andKiGoodidLessThan(Integer value) {
            addCriterion("ki_goodid <", value, "kiGoodid");
            return (Criteria) this;
        }

        public Criteria andKiGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("ki_goodid <=", value, "kiGoodid");
            return (Criteria) this;
        }

        public Criteria andKiGoodidIn(List<Integer> values) {
            addCriterion("ki_goodid in", values, "kiGoodid");
            return (Criteria) this;
        }

        public Criteria andKiGoodidNotIn(List<Integer> values) {
            addCriterion("ki_goodid not in", values, "kiGoodid");
            return (Criteria) this;
        }

        public Criteria andKiGoodidBetween(Integer value1, Integer value2) {
            addCriterion("ki_goodid between", value1, value2, "kiGoodid");
            return (Criteria) this;
        }

        public Criteria andKiGoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("ki_goodid not between", value1, value2, "kiGoodid");
            return (Criteria) this;
        }

        public Criteria andKiNameIsNull() {
            addCriterion("ki_name is null");
            return (Criteria) this;
        }

        public Criteria andKiNameIsNotNull() {
            addCriterion("ki_name is not null");
            return (Criteria) this;
        }

        public Criteria andKiNameEqualTo(String value) {
            addCriterion("ki_name =", value, "kiName");
            return (Criteria) this;
        }

        public Criteria andKiNameNotEqualTo(String value) {
            addCriterion("ki_name <>", value, "kiName");
            return (Criteria) this;
        }

        public Criteria andKiNameGreaterThan(String value) {
            addCriterion("ki_name >", value, "kiName");
            return (Criteria) this;
        }

        public Criteria andKiNameGreaterThanOrEqualTo(String value) {
            addCriterion("ki_name >=", value, "kiName");
            return (Criteria) this;
        }

        public Criteria andKiNameLessThan(String value) {
            addCriterion("ki_name <", value, "kiName");
            return (Criteria) this;
        }

        public Criteria andKiNameLessThanOrEqualTo(String value) {
            addCriterion("ki_name <=", value, "kiName");
            return (Criteria) this;
        }

        public Criteria andKiNameLike(String value) {
            addCriterion("ki_name like", value, "kiName");
            return (Criteria) this;
        }

        public Criteria andKiNameNotLike(String value) {
            addCriterion("ki_name not like", value, "kiName");
            return (Criteria) this;
        }

        public Criteria andKiNameIn(List<String> values) {
            addCriterion("ki_name in", values, "kiName");
            return (Criteria) this;
        }

        public Criteria andKiNameNotIn(List<String> values) {
            addCriterion("ki_name not in", values, "kiName");
            return (Criteria) this;
        }

        public Criteria andKiNameBetween(String value1, String value2) {
            addCriterion("ki_name between", value1, value2, "kiName");
            return (Criteria) this;
        }

        public Criteria andKiNameNotBetween(String value1, String value2) {
            addCriterion("ki_name not between", value1, value2, "kiName");
            return (Criteria) this;
        }

        public Criteria andKiNowpriceIsNull() {
            addCriterion("ki_nowprice is null");
            return (Criteria) this;
        }

        public Criteria andKiNowpriceIsNotNull() {
            addCriterion("ki_nowprice is not null");
            return (Criteria) this;
        }

        public Criteria andKiNowpriceEqualTo(Double value) {
            addCriterion("ki_nowprice =", value, "kiNowprice");
            return (Criteria) this;
        }

        public Criteria andKiNowpriceNotEqualTo(Double value) {
            addCriterion("ki_nowprice <>", value, "kiNowprice");
            return (Criteria) this;
        }

        public Criteria andKiNowpriceGreaterThan(Double value) {
            addCriterion("ki_nowprice >", value, "kiNowprice");
            return (Criteria) this;
        }

        public Criteria andKiNowpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ki_nowprice >=", value, "kiNowprice");
            return (Criteria) this;
        }

        public Criteria andKiNowpriceLessThan(Double value) {
            addCriterion("ki_nowprice <", value, "kiNowprice");
            return (Criteria) this;
        }

        public Criteria andKiNowpriceLessThanOrEqualTo(Double value) {
            addCriterion("ki_nowprice <=", value, "kiNowprice");
            return (Criteria) this;
        }

        public Criteria andKiNowpriceIn(List<Double> values) {
            addCriterion("ki_nowprice in", values, "kiNowprice");
            return (Criteria) this;
        }

        public Criteria andKiNowpriceNotIn(List<Double> values) {
            addCriterion("ki_nowprice not in", values, "kiNowprice");
            return (Criteria) this;
        }

        public Criteria andKiNowpriceBetween(Double value1, Double value2) {
            addCriterion("ki_nowprice between", value1, value2, "kiNowprice");
            return (Criteria) this;
        }

        public Criteria andKiNowpriceNotBetween(Double value1, Double value2) {
            addCriterion("ki_nowprice not between", value1, value2, "kiNowprice");
            return (Criteria) this;
        }

        public Criteria andKiPrepriceIsNull() {
            addCriterion("ki_preprice is null");
            return (Criteria) this;
        }

        public Criteria andKiPrepriceIsNotNull() {
            addCriterion("ki_preprice is not null");
            return (Criteria) this;
        }

        public Criteria andKiPrepriceEqualTo(Double value) {
            addCriterion("ki_preprice =", value, "kiPreprice");
            return (Criteria) this;
        }

        public Criteria andKiPrepriceNotEqualTo(Double value) {
            addCriterion("ki_preprice <>", value, "kiPreprice");
            return (Criteria) this;
        }

        public Criteria andKiPrepriceGreaterThan(Double value) {
            addCriterion("ki_preprice >", value, "kiPreprice");
            return (Criteria) this;
        }

        public Criteria andKiPrepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ki_preprice >=", value, "kiPreprice");
            return (Criteria) this;
        }

        public Criteria andKiPrepriceLessThan(Double value) {
            addCriterion("ki_preprice <", value, "kiPreprice");
            return (Criteria) this;
        }

        public Criteria andKiPrepriceLessThanOrEqualTo(Double value) {
            addCriterion("ki_preprice <=", value, "kiPreprice");
            return (Criteria) this;
        }

        public Criteria andKiPrepriceIn(List<Double> values) {
            addCriterion("ki_preprice in", values, "kiPreprice");
            return (Criteria) this;
        }

        public Criteria andKiPrepriceNotIn(List<Double> values) {
            addCriterion("ki_preprice not in", values, "kiPreprice");
            return (Criteria) this;
        }

        public Criteria andKiPrepriceBetween(Double value1, Double value2) {
            addCriterion("ki_preprice between", value1, value2, "kiPreprice");
            return (Criteria) this;
        }

        public Criteria andKiPrepriceNotBetween(Double value1, Double value2) {
            addCriterion("ki_preprice not between", value1, value2, "kiPreprice");
            return (Criteria) this;
        }

        public Criteria andKiStateIsNull() {
            addCriterion("ki_state is null");
            return (Criteria) this;
        }

        public Criteria andKiStateIsNotNull() {
            addCriterion("ki_state is not null");
            return (Criteria) this;
        }

        public Criteria andKiStateEqualTo(Integer value) {
            addCriterion("ki_state =", value, "kiState");
            return (Criteria) this;
        }

        public Criteria andKiStateNotEqualTo(Integer value) {
            addCriterion("ki_state <>", value, "kiState");
            return (Criteria) this;
        }

        public Criteria andKiStateGreaterThan(Integer value) {
            addCriterion("ki_state >", value, "kiState");
            return (Criteria) this;
        }

        public Criteria andKiStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ki_state >=", value, "kiState");
            return (Criteria) this;
        }

        public Criteria andKiStateLessThan(Integer value) {
            addCriterion("ki_state <", value, "kiState");
            return (Criteria) this;
        }

        public Criteria andKiStateLessThanOrEqualTo(Integer value) {
            addCriterion("ki_state <=", value, "kiState");
            return (Criteria) this;
        }

        public Criteria andKiStateIn(List<Integer> values) {
            addCriterion("ki_state in", values, "kiState");
            return (Criteria) this;
        }

        public Criteria andKiStateNotIn(List<Integer> values) {
            addCriterion("ki_state not in", values, "kiState");
            return (Criteria) this;
        }

        public Criteria andKiStateBetween(Integer value1, Integer value2) {
            addCriterion("ki_state between", value1, value2, "kiState");
            return (Criteria) this;
        }

        public Criteria andKiStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ki_state not between", value1, value2, "kiState");
            return (Criteria) this;
        }

        public Criteria andKiAddmoneyIsNull() {
            addCriterion("ki_addmoney is null");
            return (Criteria) this;
        }

        public Criteria andKiAddmoneyIsNotNull() {
            addCriterion("ki_addmoney is not null");
            return (Criteria) this;
        }

        public Criteria andKiAddmoneyEqualTo(Double value) {
            addCriterion("ki_addmoney =", value, "kiAddmoney");
            return (Criteria) this;
        }

        public Criteria andKiAddmoneyNotEqualTo(Double value) {
            addCriterion("ki_addmoney <>", value, "kiAddmoney");
            return (Criteria) this;
        }

        public Criteria andKiAddmoneyGreaterThan(Double value) {
            addCriterion("ki_addmoney >", value, "kiAddmoney");
            return (Criteria) this;
        }

        public Criteria andKiAddmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ki_addmoney >=", value, "kiAddmoney");
            return (Criteria) this;
        }

        public Criteria andKiAddmoneyLessThan(Double value) {
            addCriterion("ki_addmoney <", value, "kiAddmoney");
            return (Criteria) this;
        }

        public Criteria andKiAddmoneyLessThanOrEqualTo(Double value) {
            addCriterion("ki_addmoney <=", value, "kiAddmoney");
            return (Criteria) this;
        }

        public Criteria andKiAddmoneyIn(List<Double> values) {
            addCriterion("ki_addmoney in", values, "kiAddmoney");
            return (Criteria) this;
        }

        public Criteria andKiAddmoneyNotIn(List<Double> values) {
            addCriterion("ki_addmoney not in", values, "kiAddmoney");
            return (Criteria) this;
        }

        public Criteria andKiAddmoneyBetween(Double value1, Double value2) {
            addCriterion("ki_addmoney between", value1, value2, "kiAddmoney");
            return (Criteria) this;
        }

        public Criteria andKiAddmoneyNotBetween(Double value1, Double value2) {
            addCriterion("ki_addmoney not between", value1, value2, "kiAddmoney");
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