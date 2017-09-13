package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class Me_couponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Me_couponExample() {
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

        public Criteria andCouMycouidIsNull() {
            addCriterion("cou_mycouid is null");
            return (Criteria) this;
        }

        public Criteria andCouMycouidIsNotNull() {
            addCriterion("cou_mycouid is not null");
            return (Criteria) this;
        }

        public Criteria andCouMycouidEqualTo(Integer value) {
            addCriterion("cou_mycouid =", value, "couMycouid");
            return (Criteria) this;
        }

        public Criteria andCouMycouidNotEqualTo(Integer value) {
            addCriterion("cou_mycouid <>", value, "couMycouid");
            return (Criteria) this;
        }

        public Criteria andCouMycouidGreaterThan(Integer value) {
            addCriterion("cou_mycouid >", value, "couMycouid");
            return (Criteria) this;
        }

        public Criteria andCouMycouidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cou_mycouid >=", value, "couMycouid");
            return (Criteria) this;
        }

        public Criteria andCouMycouidLessThan(Integer value) {
            addCriterion("cou_mycouid <", value, "couMycouid");
            return (Criteria) this;
        }

        public Criteria andCouMycouidLessThanOrEqualTo(Integer value) {
            addCriterion("cou_mycouid <=", value, "couMycouid");
            return (Criteria) this;
        }

        public Criteria andCouMycouidIn(List<Integer> values) {
            addCriterion("cou_mycouid in", values, "couMycouid");
            return (Criteria) this;
        }

        public Criteria andCouMycouidNotIn(List<Integer> values) {
            addCriterion("cou_mycouid not in", values, "couMycouid");
            return (Criteria) this;
        }

        public Criteria andCouMycouidBetween(Integer value1, Integer value2) {
            addCriterion("cou_mycouid between", value1, value2, "couMycouid");
            return (Criteria) this;
        }

        public Criteria andCouMycouidNotBetween(Integer value1, Integer value2) {
            addCriterion("cou_mycouid not between", value1, value2, "couMycouid");
            return (Criteria) this;
        }

        public Criteria andCouIdIsNull() {
            addCriterion("cou_id is null");
            return (Criteria) this;
        }

        public Criteria andCouIdIsNotNull() {
            addCriterion("cou_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouIdEqualTo(Integer value) {
            addCriterion("cou_id =", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdNotEqualTo(Integer value) {
            addCriterion("cou_id <>", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdGreaterThan(Integer value) {
            addCriterion("cou_id >", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cou_id >=", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdLessThan(Integer value) {
            addCriterion("cou_id <", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdLessThanOrEqualTo(Integer value) {
            addCriterion("cou_id <=", value, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdIn(List<Integer> values) {
            addCriterion("cou_id in", values, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdNotIn(List<Integer> values) {
            addCriterion("cou_id not in", values, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdBetween(Integer value1, Integer value2) {
            addCriterion("cou_id between", value1, value2, "couId");
            return (Criteria) this;
        }

        public Criteria andCouIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cou_id not between", value1, value2, "couId");
            return (Criteria) this;
        }

        public Criteria andCouMemberidIsNull() {
            addCriterion("cou_memberid is null");
            return (Criteria) this;
        }

        public Criteria andCouMemberidIsNotNull() {
            addCriterion("cou_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andCouMemberidEqualTo(Integer value) {
            addCriterion("cou_memberid =", value, "couMemberid");
            return (Criteria) this;
        }

        public Criteria andCouMemberidNotEqualTo(Integer value) {
            addCriterion("cou_memberid <>", value, "couMemberid");
            return (Criteria) this;
        }

        public Criteria andCouMemberidGreaterThan(Integer value) {
            addCriterion("cou_memberid >", value, "couMemberid");
            return (Criteria) this;
        }

        public Criteria andCouMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cou_memberid >=", value, "couMemberid");
            return (Criteria) this;
        }

        public Criteria andCouMemberidLessThan(Integer value) {
            addCriterion("cou_memberid <", value, "couMemberid");
            return (Criteria) this;
        }

        public Criteria andCouMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("cou_memberid <=", value, "couMemberid");
            return (Criteria) this;
        }

        public Criteria andCouMemberidIn(List<Integer> values) {
            addCriterion("cou_memberid in", values, "couMemberid");
            return (Criteria) this;
        }

        public Criteria andCouMemberidNotIn(List<Integer> values) {
            addCriterion("cou_memberid not in", values, "couMemberid");
            return (Criteria) this;
        }

        public Criteria andCouMemberidBetween(Integer value1, Integer value2) {
            addCriterion("cou_memberid between", value1, value2, "couMemberid");
            return (Criteria) this;
        }

        public Criteria andCouMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("cou_memberid not between", value1, value2, "couMemberid");
            return (Criteria) this;
        }

        public Criteria andCouNeedmoneyIsNull() {
            addCriterion("cou_needmoney is null");
            return (Criteria) this;
        }

        public Criteria andCouNeedmoneyIsNotNull() {
            addCriterion("cou_needmoney is not null");
            return (Criteria) this;
        }

        public Criteria andCouNeedmoneyEqualTo(Double value) {
            addCriterion("cou_needmoney =", value, "couNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCouNeedmoneyNotEqualTo(Double value) {
            addCriterion("cou_needmoney <>", value, "couNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCouNeedmoneyGreaterThan(Double value) {
            addCriterion("cou_needmoney >", value, "couNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCouNeedmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cou_needmoney >=", value, "couNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCouNeedmoneyLessThan(Double value) {
            addCriterion("cou_needmoney <", value, "couNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCouNeedmoneyLessThanOrEqualTo(Double value) {
            addCriterion("cou_needmoney <=", value, "couNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCouNeedmoneyIn(List<Double> values) {
            addCriterion("cou_needmoney in", values, "couNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCouNeedmoneyNotIn(List<Double> values) {
            addCriterion("cou_needmoney not in", values, "couNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCouNeedmoneyBetween(Double value1, Double value2) {
            addCriterion("cou_needmoney between", value1, value2, "couNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCouNeedmoneyNotBetween(Double value1, Double value2) {
            addCriterion("cou_needmoney not between", value1, value2, "couNeedmoney");
            return (Criteria) this;
        }

        public Criteria andCouReductmoneyIsNull() {
            addCriterion("cou_reductmoney is null");
            return (Criteria) this;
        }

        public Criteria andCouReductmoneyIsNotNull() {
            addCriterion("cou_reductmoney is not null");
            return (Criteria) this;
        }

        public Criteria andCouReductmoneyEqualTo(Double value) {
            addCriterion("cou_reductmoney =", value, "couReductmoney");
            return (Criteria) this;
        }

        public Criteria andCouReductmoneyNotEqualTo(Double value) {
            addCriterion("cou_reductmoney <>", value, "couReductmoney");
            return (Criteria) this;
        }

        public Criteria andCouReductmoneyGreaterThan(Double value) {
            addCriterion("cou_reductmoney >", value, "couReductmoney");
            return (Criteria) this;
        }

        public Criteria andCouReductmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("cou_reductmoney >=", value, "couReductmoney");
            return (Criteria) this;
        }

        public Criteria andCouReductmoneyLessThan(Double value) {
            addCriterion("cou_reductmoney <", value, "couReductmoney");
            return (Criteria) this;
        }

        public Criteria andCouReductmoneyLessThanOrEqualTo(Double value) {
            addCriterion("cou_reductmoney <=", value, "couReductmoney");
            return (Criteria) this;
        }

        public Criteria andCouReductmoneyIn(List<Double> values) {
            addCriterion("cou_reductmoney in", values, "couReductmoney");
            return (Criteria) this;
        }

        public Criteria andCouReductmoneyNotIn(List<Double> values) {
            addCriterion("cou_reductmoney not in", values, "couReductmoney");
            return (Criteria) this;
        }

        public Criteria andCouReductmoneyBetween(Double value1, Double value2) {
            addCriterion("cou_reductmoney between", value1, value2, "couReductmoney");
            return (Criteria) this;
        }

        public Criteria andCouReductmoneyNotBetween(Double value1, Double value2) {
            addCriterion("cou_reductmoney not between", value1, value2, "couReductmoney");
            return (Criteria) this;
        }

        public Criteria andCouGoodtypeIsNull() {
            addCriterion("cou_goodtype is null");
            return (Criteria) this;
        }

        public Criteria andCouGoodtypeIsNotNull() {
            addCriterion("cou_goodtype is not null");
            return (Criteria) this;
        }

        public Criteria andCouGoodtypeEqualTo(Integer value) {
            addCriterion("cou_goodtype =", value, "couGoodtype");
            return (Criteria) this;
        }

        public Criteria andCouGoodtypeNotEqualTo(Integer value) {
            addCriterion("cou_goodtype <>", value, "couGoodtype");
            return (Criteria) this;
        }

        public Criteria andCouGoodtypeGreaterThan(Integer value) {
            addCriterion("cou_goodtype >", value, "couGoodtype");
            return (Criteria) this;
        }

        public Criteria andCouGoodtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cou_goodtype >=", value, "couGoodtype");
            return (Criteria) this;
        }

        public Criteria andCouGoodtypeLessThan(Integer value) {
            addCriterion("cou_goodtype <", value, "couGoodtype");
            return (Criteria) this;
        }

        public Criteria andCouGoodtypeLessThanOrEqualTo(Integer value) {
            addCriterion("cou_goodtype <=", value, "couGoodtype");
            return (Criteria) this;
        }

        public Criteria andCouGoodtypeIn(List<Integer> values) {
            addCriterion("cou_goodtype in", values, "couGoodtype");
            return (Criteria) this;
        }

        public Criteria andCouGoodtypeNotIn(List<Integer> values) {
            addCriterion("cou_goodtype not in", values, "couGoodtype");
            return (Criteria) this;
        }

        public Criteria andCouGoodtypeBetween(Integer value1, Integer value2) {
            addCriterion("cou_goodtype between", value1, value2, "couGoodtype");
            return (Criteria) this;
        }

        public Criteria andCouGoodtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cou_goodtype not between", value1, value2, "couGoodtype");
            return (Criteria) this;
        }

        public Criteria andCouStateIsNull() {
            addCriterion("cou_state is null");
            return (Criteria) this;
        }

        public Criteria andCouStateIsNotNull() {
            addCriterion("cou_state is not null");
            return (Criteria) this;
        }

        public Criteria andCouStateEqualTo(Integer value) {
            addCriterion("cou_state =", value, "couState");
            return (Criteria) this;
        }

        public Criteria andCouStateNotEqualTo(Integer value) {
            addCriterion("cou_state <>", value, "couState");
            return (Criteria) this;
        }

        public Criteria andCouStateGreaterThan(Integer value) {
            addCriterion("cou_state >", value, "couState");
            return (Criteria) this;
        }

        public Criteria andCouStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cou_state >=", value, "couState");
            return (Criteria) this;
        }

        public Criteria andCouStateLessThan(Integer value) {
            addCriterion("cou_state <", value, "couState");
            return (Criteria) this;
        }

        public Criteria andCouStateLessThanOrEqualTo(Integer value) {
            addCriterion("cou_state <=", value, "couState");
            return (Criteria) this;
        }

        public Criteria andCouStateIn(List<Integer> values) {
            addCriterion("cou_state in", values, "couState");
            return (Criteria) this;
        }

        public Criteria andCouStateNotIn(List<Integer> values) {
            addCriterion("cou_state not in", values, "couState");
            return (Criteria) this;
        }

        public Criteria andCouStateBetween(Integer value1, Integer value2) {
            addCriterion("cou_state between", value1, value2, "couState");
            return (Criteria) this;
        }

        public Criteria andCouStateNotBetween(Integer value1, Integer value2) {
            addCriterion("cou_state not between", value1, value2, "couState");
            return (Criteria) this;
        }

        public Criteria andCouTypeIsNull() {
            addCriterion("cou_type is null");
            return (Criteria) this;
        }

        public Criteria andCouTypeIsNotNull() {
            addCriterion("cou_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouTypeEqualTo(Integer value) {
            addCriterion("cou_type =", value, "couType");
            return (Criteria) this;
        }

        public Criteria andCouTypeNotEqualTo(Integer value) {
            addCriterion("cou_type <>", value, "couType");
            return (Criteria) this;
        }

        public Criteria andCouTypeGreaterThan(Integer value) {
            addCriterion("cou_type >", value, "couType");
            return (Criteria) this;
        }

        public Criteria andCouTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cou_type >=", value, "couType");
            return (Criteria) this;
        }

        public Criteria andCouTypeLessThan(Integer value) {
            addCriterion("cou_type <", value, "couType");
            return (Criteria) this;
        }

        public Criteria andCouTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cou_type <=", value, "couType");
            return (Criteria) this;
        }

        public Criteria andCouTypeIn(List<Integer> values) {
            addCriterion("cou_type in", values, "couType");
            return (Criteria) this;
        }

        public Criteria andCouTypeNotIn(List<Integer> values) {
            addCriterion("cou_type not in", values, "couType");
            return (Criteria) this;
        }

        public Criteria andCouTypeBetween(Integer value1, Integer value2) {
            addCriterion("cou_type between", value1, value2, "couType");
            return (Criteria) this;
        }

        public Criteria andCouTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cou_type not between", value1, value2, "couType");
            return (Criteria) this;
        }

        public Criteria andCouStartdateIsNull() {
            addCriterion("cou_startdate is null");
            return (Criteria) this;
        }

        public Criteria andCouStartdateIsNotNull() {
            addCriterion("cou_startdate is not null");
            return (Criteria) this;
        }

        public Criteria andCouStartdateEqualTo(String value) {
            addCriterion("cou_startdate =", value, "couStartdate");
            return (Criteria) this;
        }

        public Criteria andCouStartdateNotEqualTo(String value) {
            addCriterion("cou_startdate <>", value, "couStartdate");
            return (Criteria) this;
        }

        public Criteria andCouStartdateGreaterThan(String value) {
            addCriterion("cou_startdate >", value, "couStartdate");
            return (Criteria) this;
        }

        public Criteria andCouStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("cou_startdate >=", value, "couStartdate");
            return (Criteria) this;
        }

        public Criteria andCouStartdateLessThan(String value) {
            addCriterion("cou_startdate <", value, "couStartdate");
            return (Criteria) this;
        }

        public Criteria andCouStartdateLessThanOrEqualTo(String value) {
            addCriterion("cou_startdate <=", value, "couStartdate");
            return (Criteria) this;
        }

        public Criteria andCouStartdateLike(String value) {
            addCriterion("cou_startdate like", value, "couStartdate");
            return (Criteria) this;
        }

        public Criteria andCouStartdateNotLike(String value) {
            addCriterion("cou_startdate not like", value, "couStartdate");
            return (Criteria) this;
        }

        public Criteria andCouStartdateIn(List<String> values) {
            addCriterion("cou_startdate in", values, "couStartdate");
            return (Criteria) this;
        }

        public Criteria andCouStartdateNotIn(List<String> values) {
            addCriterion("cou_startdate not in", values, "couStartdate");
            return (Criteria) this;
        }

        public Criteria andCouStartdateBetween(String value1, String value2) {
            addCriterion("cou_startdate between", value1, value2, "couStartdate");
            return (Criteria) this;
        }

        public Criteria andCouStartdateNotBetween(String value1, String value2) {
            addCriterion("cou_startdate not between", value1, value2, "couStartdate");
            return (Criteria) this;
        }

        public Criteria andCouEnddateIsNull() {
            addCriterion("cou_enddate is null");
            return (Criteria) this;
        }

        public Criteria andCouEnddateIsNotNull() {
            addCriterion("cou_enddate is not null");
            return (Criteria) this;
        }

        public Criteria andCouEnddateEqualTo(String value) {
            addCriterion("cou_enddate =", value, "couEnddate");
            return (Criteria) this;
        }

        public Criteria andCouEnddateNotEqualTo(String value) {
            addCriterion("cou_enddate <>", value, "couEnddate");
            return (Criteria) this;
        }

        public Criteria andCouEnddateGreaterThan(String value) {
            addCriterion("cou_enddate >", value, "couEnddate");
            return (Criteria) this;
        }

        public Criteria andCouEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("cou_enddate >=", value, "couEnddate");
            return (Criteria) this;
        }

        public Criteria andCouEnddateLessThan(String value) {
            addCriterion("cou_enddate <", value, "couEnddate");
            return (Criteria) this;
        }

        public Criteria andCouEnddateLessThanOrEqualTo(String value) {
            addCriterion("cou_enddate <=", value, "couEnddate");
            return (Criteria) this;
        }

        public Criteria andCouEnddateLike(String value) {
            addCriterion("cou_enddate like", value, "couEnddate");
            return (Criteria) this;
        }

        public Criteria andCouEnddateNotLike(String value) {
            addCriterion("cou_enddate not like", value, "couEnddate");
            return (Criteria) this;
        }

        public Criteria andCouEnddateIn(List<String> values) {
            addCriterion("cou_enddate in", values, "couEnddate");
            return (Criteria) this;
        }

        public Criteria andCouEnddateNotIn(List<String> values) {
            addCriterion("cou_enddate not in", values, "couEnddate");
            return (Criteria) this;
        }

        public Criteria andCouEnddateBetween(String value1, String value2) {
            addCriterion("cou_enddate between", value1, value2, "couEnddate");
            return (Criteria) this;
        }

        public Criteria andCouEnddateNotBetween(String value1, String value2) {
            addCriterion("cou_enddate not between", value1, value2, "couEnddate");
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