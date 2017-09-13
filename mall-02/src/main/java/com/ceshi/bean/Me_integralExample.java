package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class Me_integralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Me_integralExample() {
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

        public Criteria andInIdIsNull() {
            addCriterion("in_id is null");
            return (Criteria) this;
        }

        public Criteria andInIdIsNotNull() {
            addCriterion("in_id is not null");
            return (Criteria) this;
        }

        public Criteria andInIdEqualTo(Integer value) {
            addCriterion("in_id =", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotEqualTo(Integer value) {
            addCriterion("in_id <>", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdGreaterThan(Integer value) {
            addCriterion("in_id >", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_id >=", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdLessThan(Integer value) {
            addCriterion("in_id <", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdLessThanOrEqualTo(Integer value) {
            addCriterion("in_id <=", value, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdIn(List<Integer> values) {
            addCriterion("in_id in", values, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotIn(List<Integer> values) {
            addCriterion("in_id not in", values, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdBetween(Integer value1, Integer value2) {
            addCriterion("in_id between", value1, value2, "inId");
            return (Criteria) this;
        }

        public Criteria andInIdNotBetween(Integer value1, Integer value2) {
            addCriterion("in_id not between", value1, value2, "inId");
            return (Criteria) this;
        }

        public Criteria andInLevelidIsNull() {
            addCriterion("in_levelid is null");
            return (Criteria) this;
        }

        public Criteria andInLevelidIsNotNull() {
            addCriterion("in_levelid is not null");
            return (Criteria) this;
        }

        public Criteria andInLevelidEqualTo(Integer value) {
            addCriterion("in_levelid =", value, "inLevelid");
            return (Criteria) this;
        }

        public Criteria andInLevelidNotEqualTo(Integer value) {
            addCriterion("in_levelid <>", value, "inLevelid");
            return (Criteria) this;
        }

        public Criteria andInLevelidGreaterThan(Integer value) {
            addCriterion("in_levelid >", value, "inLevelid");
            return (Criteria) this;
        }

        public Criteria andInLevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_levelid >=", value, "inLevelid");
            return (Criteria) this;
        }

        public Criteria andInLevelidLessThan(Integer value) {
            addCriterion("in_levelid <", value, "inLevelid");
            return (Criteria) this;
        }

        public Criteria andInLevelidLessThanOrEqualTo(Integer value) {
            addCriterion("in_levelid <=", value, "inLevelid");
            return (Criteria) this;
        }

        public Criteria andInLevelidIn(List<Integer> values) {
            addCriterion("in_levelid in", values, "inLevelid");
            return (Criteria) this;
        }

        public Criteria andInLevelidNotIn(List<Integer> values) {
            addCriterion("in_levelid not in", values, "inLevelid");
            return (Criteria) this;
        }

        public Criteria andInLevelidBetween(Integer value1, Integer value2) {
            addCriterion("in_levelid between", value1, value2, "inLevelid");
            return (Criteria) this;
        }

        public Criteria andInLevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("in_levelid not between", value1, value2, "inLevelid");
            return (Criteria) this;
        }

        public Criteria andInMemberidIsNull() {
            addCriterion("in_memberid is null");
            return (Criteria) this;
        }

        public Criteria andInMemberidIsNotNull() {
            addCriterion("in_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andInMemberidEqualTo(Integer value) {
            addCriterion("in_memberid =", value, "inMemberid");
            return (Criteria) this;
        }

        public Criteria andInMemberidNotEqualTo(Integer value) {
            addCriterion("in_memberid <>", value, "inMemberid");
            return (Criteria) this;
        }

        public Criteria andInMemberidGreaterThan(Integer value) {
            addCriterion("in_memberid >", value, "inMemberid");
            return (Criteria) this;
        }

        public Criteria andInMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_memberid >=", value, "inMemberid");
            return (Criteria) this;
        }

        public Criteria andInMemberidLessThan(Integer value) {
            addCriterion("in_memberid <", value, "inMemberid");
            return (Criteria) this;
        }

        public Criteria andInMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("in_memberid <=", value, "inMemberid");
            return (Criteria) this;
        }

        public Criteria andInMemberidIn(List<Integer> values) {
            addCriterion("in_memberid in", values, "inMemberid");
            return (Criteria) this;
        }

        public Criteria andInMemberidNotIn(List<Integer> values) {
            addCriterion("in_memberid not in", values, "inMemberid");
            return (Criteria) this;
        }

        public Criteria andInMemberidBetween(Integer value1, Integer value2) {
            addCriterion("in_memberid between", value1, value2, "inMemberid");
            return (Criteria) this;
        }

        public Criteria andInMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("in_memberid not between", value1, value2, "inMemberid");
            return (Criteria) this;
        }

        public Criteria andInValueIsNull() {
            addCriterion("in_value is null");
            return (Criteria) this;
        }

        public Criteria andInValueIsNotNull() {
            addCriterion("in_value is not null");
            return (Criteria) this;
        }

        public Criteria andInValueEqualTo(Integer value) {
            addCriterion("in_value =", value, "inValue");
            return (Criteria) this;
        }

        public Criteria andInValueNotEqualTo(Integer value) {
            addCriterion("in_value <>", value, "inValue");
            return (Criteria) this;
        }

        public Criteria andInValueGreaterThan(Integer value) {
            addCriterion("in_value >", value, "inValue");
            return (Criteria) this;
        }

        public Criteria andInValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_value >=", value, "inValue");
            return (Criteria) this;
        }

        public Criteria andInValueLessThan(Integer value) {
            addCriterion("in_value <", value, "inValue");
            return (Criteria) this;
        }

        public Criteria andInValueLessThanOrEqualTo(Integer value) {
            addCriterion("in_value <=", value, "inValue");
            return (Criteria) this;
        }

        public Criteria andInValueIn(List<Integer> values) {
            addCriterion("in_value in", values, "inValue");
            return (Criteria) this;
        }

        public Criteria andInValueNotIn(List<Integer> values) {
            addCriterion("in_value not in", values, "inValue");
            return (Criteria) this;
        }

        public Criteria andInValueBetween(Integer value1, Integer value2) {
            addCriterion("in_value between", value1, value2, "inValue");
            return (Criteria) this;
        }

        public Criteria andInValueNotBetween(Integer value1, Integer value2) {
            addCriterion("in_value not between", value1, value2, "inValue");
            return (Criteria) this;
        }

        public Criteria andInIntegraldrawIsNull() {
            addCriterion("in_integraldraw is null");
            return (Criteria) this;
        }

        public Criteria andInIntegraldrawIsNotNull() {
            addCriterion("in_integraldraw is not null");
            return (Criteria) this;
        }

        public Criteria andInIntegraldrawEqualTo(Integer value) {
            addCriterion("in_integraldraw =", value, "inIntegraldraw");
            return (Criteria) this;
        }

        public Criteria andInIntegraldrawNotEqualTo(Integer value) {
            addCriterion("in_integraldraw <>", value, "inIntegraldraw");
            return (Criteria) this;
        }

        public Criteria andInIntegraldrawGreaterThan(Integer value) {
            addCriterion("in_integraldraw >", value, "inIntegraldraw");
            return (Criteria) this;
        }

        public Criteria andInIntegraldrawGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_integraldraw >=", value, "inIntegraldraw");
            return (Criteria) this;
        }

        public Criteria andInIntegraldrawLessThan(Integer value) {
            addCriterion("in_integraldraw <", value, "inIntegraldraw");
            return (Criteria) this;
        }

        public Criteria andInIntegraldrawLessThanOrEqualTo(Integer value) {
            addCriterion("in_integraldraw <=", value, "inIntegraldraw");
            return (Criteria) this;
        }

        public Criteria andInIntegraldrawIn(List<Integer> values) {
            addCriterion("in_integraldraw in", values, "inIntegraldraw");
            return (Criteria) this;
        }

        public Criteria andInIntegraldrawNotIn(List<Integer> values) {
            addCriterion("in_integraldraw not in", values, "inIntegraldraw");
            return (Criteria) this;
        }

        public Criteria andInIntegraldrawBetween(Integer value1, Integer value2) {
            addCriterion("in_integraldraw between", value1, value2, "inIntegraldraw");
            return (Criteria) this;
        }

        public Criteria andInIntegraldrawNotBetween(Integer value1, Integer value2) {
            addCriterion("in_integraldraw not between", value1, value2, "inIntegraldraw");
            return (Criteria) this;
        }

        public Criteria andInExchangegoodIsNull() {
            addCriterion("in_exchangegood is null");
            return (Criteria) this;
        }

        public Criteria andInExchangegoodIsNotNull() {
            addCriterion("in_exchangegood is not null");
            return (Criteria) this;
        }

        public Criteria andInExchangegoodEqualTo(Integer value) {
            addCriterion("in_exchangegood =", value, "inExchangegood");
            return (Criteria) this;
        }

        public Criteria andInExchangegoodNotEqualTo(Integer value) {
            addCriterion("in_exchangegood <>", value, "inExchangegood");
            return (Criteria) this;
        }

        public Criteria andInExchangegoodGreaterThan(Integer value) {
            addCriterion("in_exchangegood >", value, "inExchangegood");
            return (Criteria) this;
        }

        public Criteria andInExchangegoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_exchangegood >=", value, "inExchangegood");
            return (Criteria) this;
        }

        public Criteria andInExchangegoodLessThan(Integer value) {
            addCriterion("in_exchangegood <", value, "inExchangegood");
            return (Criteria) this;
        }

        public Criteria andInExchangegoodLessThanOrEqualTo(Integer value) {
            addCriterion("in_exchangegood <=", value, "inExchangegood");
            return (Criteria) this;
        }

        public Criteria andInExchangegoodIn(List<Integer> values) {
            addCriterion("in_exchangegood in", values, "inExchangegood");
            return (Criteria) this;
        }

        public Criteria andInExchangegoodNotIn(List<Integer> values) {
            addCriterion("in_exchangegood not in", values, "inExchangegood");
            return (Criteria) this;
        }

        public Criteria andInExchangegoodBetween(Integer value1, Integer value2) {
            addCriterion("in_exchangegood between", value1, value2, "inExchangegood");
            return (Criteria) this;
        }

        public Criteria andInExchangegoodNotBetween(Integer value1, Integer value2) {
            addCriterion("in_exchangegood not between", value1, value2, "inExchangegood");
            return (Criteria) this;
        }

        public Criteria andInExchangecouponIsNull() {
            addCriterion("in_exchangecoupon is null");
            return (Criteria) this;
        }

        public Criteria andInExchangecouponIsNotNull() {
            addCriterion("in_exchangecoupon is not null");
            return (Criteria) this;
        }

        public Criteria andInExchangecouponEqualTo(Integer value) {
            addCriterion("in_exchangecoupon =", value, "inExchangecoupon");
            return (Criteria) this;
        }

        public Criteria andInExchangecouponNotEqualTo(Integer value) {
            addCriterion("in_exchangecoupon <>", value, "inExchangecoupon");
            return (Criteria) this;
        }

        public Criteria andInExchangecouponGreaterThan(Integer value) {
            addCriterion("in_exchangecoupon >", value, "inExchangecoupon");
            return (Criteria) this;
        }

        public Criteria andInExchangecouponGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_exchangecoupon >=", value, "inExchangecoupon");
            return (Criteria) this;
        }

        public Criteria andInExchangecouponLessThan(Integer value) {
            addCriterion("in_exchangecoupon <", value, "inExchangecoupon");
            return (Criteria) this;
        }

        public Criteria andInExchangecouponLessThanOrEqualTo(Integer value) {
            addCriterion("in_exchangecoupon <=", value, "inExchangecoupon");
            return (Criteria) this;
        }

        public Criteria andInExchangecouponIn(List<Integer> values) {
            addCriterion("in_exchangecoupon in", values, "inExchangecoupon");
            return (Criteria) this;
        }

        public Criteria andInExchangecouponNotIn(List<Integer> values) {
            addCriterion("in_exchangecoupon not in", values, "inExchangecoupon");
            return (Criteria) this;
        }

        public Criteria andInExchangecouponBetween(Integer value1, Integer value2) {
            addCriterion("in_exchangecoupon between", value1, value2, "inExchangecoupon");
            return (Criteria) this;
        }

        public Criteria andInExchangecouponNotBetween(Integer value1, Integer value2) {
            addCriterion("in_exchangecoupon not between", value1, value2, "inExchangecoupon");
            return (Criteria) this;
        }

        public Criteria andInBuchamoneyIsNull() {
            addCriterion("in_buchamoney is null");
            return (Criteria) this;
        }

        public Criteria andInBuchamoneyIsNotNull() {
            addCriterion("in_buchamoney is not null");
            return (Criteria) this;
        }

        public Criteria andInBuchamoneyEqualTo(Integer value) {
            addCriterion("in_buchamoney =", value, "inBuchamoney");
            return (Criteria) this;
        }

        public Criteria andInBuchamoneyNotEqualTo(Integer value) {
            addCriterion("in_buchamoney <>", value, "inBuchamoney");
            return (Criteria) this;
        }

        public Criteria andInBuchamoneyGreaterThan(Integer value) {
            addCriterion("in_buchamoney >", value, "inBuchamoney");
            return (Criteria) this;
        }

        public Criteria andInBuchamoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_buchamoney >=", value, "inBuchamoney");
            return (Criteria) this;
        }

        public Criteria andInBuchamoneyLessThan(Integer value) {
            addCriterion("in_buchamoney <", value, "inBuchamoney");
            return (Criteria) this;
        }

        public Criteria andInBuchamoneyLessThanOrEqualTo(Integer value) {
            addCriterion("in_buchamoney <=", value, "inBuchamoney");
            return (Criteria) this;
        }

        public Criteria andInBuchamoneyIn(List<Integer> values) {
            addCriterion("in_buchamoney in", values, "inBuchamoney");
            return (Criteria) this;
        }

        public Criteria andInBuchamoneyNotIn(List<Integer> values) {
            addCriterion("in_buchamoney not in", values, "inBuchamoney");
            return (Criteria) this;
        }

        public Criteria andInBuchamoneyBetween(Integer value1, Integer value2) {
            addCriterion("in_buchamoney between", value1, value2, "inBuchamoney");
            return (Criteria) this;
        }

        public Criteria andInBuchamoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("in_buchamoney not between", value1, value2, "inBuchamoney");
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