package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class MyorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyorderExample() {
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

        public Criteria andOrIdIsNull() {
            addCriterion("or_id is null");
            return (Criteria) this;
        }

        public Criteria andOrIdIsNotNull() {
            addCriterion("or_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrIdEqualTo(Integer value) {
            addCriterion("or_id =", value, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdNotEqualTo(Integer value) {
            addCriterion("or_id <>", value, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdGreaterThan(Integer value) {
            addCriterion("or_id >", value, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_id >=", value, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdLessThan(Integer value) {
            addCriterion("or_id <", value, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdLessThanOrEqualTo(Integer value) {
            addCriterion("or_id <=", value, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdIn(List<Integer> values) {
            addCriterion("or_id in", values, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdNotIn(List<Integer> values) {
            addCriterion("or_id not in", values, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdBetween(Integer value1, Integer value2) {
            addCriterion("or_id between", value1, value2, "orId");
            return (Criteria) this;
        }

        public Criteria andOrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("or_id not between", value1, value2, "orId");
            return (Criteria) this;
        }

        public Criteria andOrMemberidIsNull() {
            addCriterion("or_memberid is null");
            return (Criteria) this;
        }

        public Criteria andOrMemberidIsNotNull() {
            addCriterion("or_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andOrMemberidEqualTo(Integer value) {
            addCriterion("or_memberid =", value, "orMemberid");
            return (Criteria) this;
        }

        public Criteria andOrMemberidNotEqualTo(Integer value) {
            addCriterion("or_memberid <>", value, "orMemberid");
            return (Criteria) this;
        }

        public Criteria andOrMemberidGreaterThan(Integer value) {
            addCriterion("or_memberid >", value, "orMemberid");
            return (Criteria) this;
        }

        public Criteria andOrMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_memberid >=", value, "orMemberid");
            return (Criteria) this;
        }

        public Criteria andOrMemberidLessThan(Integer value) {
            addCriterion("or_memberid <", value, "orMemberid");
            return (Criteria) this;
        }

        public Criteria andOrMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("or_memberid <=", value, "orMemberid");
            return (Criteria) this;
        }

        public Criteria andOrMemberidIn(List<Integer> values) {
            addCriterion("or_memberid in", values, "orMemberid");
            return (Criteria) this;
        }

        public Criteria andOrMemberidNotIn(List<Integer> values) {
            addCriterion("or_memberid not in", values, "orMemberid");
            return (Criteria) this;
        }

        public Criteria andOrMemberidBetween(Integer value1, Integer value2) {
            addCriterion("or_memberid between", value1, value2, "orMemberid");
            return (Criteria) this;
        }

        public Criteria andOrMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("or_memberid not between", value1, value2, "orMemberid");
            return (Criteria) this;
        }

        public Criteria andOrCostmoneyIsNull() {
            addCriterion("or_costmoney is null");
            return (Criteria) this;
        }

        public Criteria andOrCostmoneyIsNotNull() {
            addCriterion("or_costmoney is not null");
            return (Criteria) this;
        }

        public Criteria andOrCostmoneyEqualTo(Double value) {
            addCriterion("or_costmoney =", value, "orCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrCostmoneyNotEqualTo(Double value) {
            addCriterion("or_costmoney <>", value, "orCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrCostmoneyGreaterThan(Double value) {
            addCriterion("or_costmoney >", value, "orCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrCostmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("or_costmoney >=", value, "orCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrCostmoneyLessThan(Double value) {
            addCriterion("or_costmoney <", value, "orCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrCostmoneyLessThanOrEqualTo(Double value) {
            addCriterion("or_costmoney <=", value, "orCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrCostmoneyIn(List<Double> values) {
            addCriterion("or_costmoney in", values, "orCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrCostmoneyNotIn(List<Double> values) {
            addCriterion("or_costmoney not in", values, "orCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrCostmoneyBetween(Double value1, Double value2) {
            addCriterion("or_costmoney between", value1, value2, "orCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrCostmoneyNotBetween(Double value1, Double value2) {
            addCriterion("or_costmoney not between", value1, value2, "orCostmoney");
            return (Criteria) this;
        }

        public Criteria andOrDateIsNull() {
            addCriterion("or_date is null");
            return (Criteria) this;
        }

        public Criteria andOrDateIsNotNull() {
            addCriterion("or_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrDateEqualTo(String value) {
            addCriterion("or_date =", value, "orDate");
            return (Criteria) this;
        }

        public Criteria andOrDateNotEqualTo(String value) {
            addCriterion("or_date <>", value, "orDate");
            return (Criteria) this;
        }

        public Criteria andOrDateGreaterThan(String value) {
            addCriterion("or_date >", value, "orDate");
            return (Criteria) this;
        }

        public Criteria andOrDateGreaterThanOrEqualTo(String value) {
            addCriterion("or_date >=", value, "orDate");
            return (Criteria) this;
        }

        public Criteria andOrDateLessThan(String value) {
            addCriterion("or_date <", value, "orDate");
            return (Criteria) this;
        }

        public Criteria andOrDateLessThanOrEqualTo(String value) {
            addCriterion("or_date <=", value, "orDate");
            return (Criteria) this;
        }

        public Criteria andOrDateLike(String value) {
            addCriterion("or_date like", value, "orDate");
            return (Criteria) this;
        }

        public Criteria andOrDateNotLike(String value) {
            addCriterion("or_date not like", value, "orDate");
            return (Criteria) this;
        }

        public Criteria andOrDateIn(List<String> values) {
            addCriterion("or_date in", values, "orDate");
            return (Criteria) this;
        }

        public Criteria andOrDateNotIn(List<String> values) {
            addCriterion("or_date not in", values, "orDate");
            return (Criteria) this;
        }

        public Criteria andOrDateBetween(String value1, String value2) {
            addCriterion("or_date between", value1, value2, "orDate");
            return (Criteria) this;
        }

        public Criteria andOrDateNotBetween(String value1, String value2) {
            addCriterion("or_date not between", value1, value2, "orDate");
            return (Criteria) this;
        }

        public Criteria andOrStateIsNull() {
            addCriterion("or_state is null");
            return (Criteria) this;
        }

        public Criteria andOrStateIsNotNull() {
            addCriterion("or_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrStateEqualTo(Integer value) {
            addCriterion("or_state =", value, "orState");
            return (Criteria) this;
        }

        public Criteria andOrStateNotEqualTo(Integer value) {
            addCriterion("or_state <>", value, "orState");
            return (Criteria) this;
        }

        public Criteria andOrStateGreaterThan(Integer value) {
            addCriterion("or_state >", value, "orState");
            return (Criteria) this;
        }

        public Criteria andOrStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_state >=", value, "orState");
            return (Criteria) this;
        }

        public Criteria andOrStateLessThan(Integer value) {
            addCriterion("or_state <", value, "orState");
            return (Criteria) this;
        }

        public Criteria andOrStateLessThanOrEqualTo(Integer value) {
            addCriterion("or_state <=", value, "orState");
            return (Criteria) this;
        }

        public Criteria andOrStateIn(List<Integer> values) {
            addCriterion("or_state in", values, "orState");
            return (Criteria) this;
        }

        public Criteria andOrStateNotIn(List<Integer> values) {
            addCriterion("or_state not in", values, "orState");
            return (Criteria) this;
        }

        public Criteria andOrStateBetween(Integer value1, Integer value2) {
            addCriterion("or_state between", value1, value2, "orState");
            return (Criteria) this;
        }

        public Criteria andOrStateNotBetween(Integer value1, Integer value2) {
            addCriterion("or_state not between", value1, value2, "orState");
            return (Criteria) this;
        }

        public Criteria andOrSendtypeIsNull() {
            addCriterion("or_sendtype is null");
            return (Criteria) this;
        }

        public Criteria andOrSendtypeIsNotNull() {
            addCriterion("or_sendtype is not null");
            return (Criteria) this;
        }

        public Criteria andOrSendtypeEqualTo(Integer value) {
            addCriterion("or_sendtype =", value, "orSendtype");
            return (Criteria) this;
        }

        public Criteria andOrSendtypeNotEqualTo(Integer value) {
            addCriterion("or_sendtype <>", value, "orSendtype");
            return (Criteria) this;
        }

        public Criteria andOrSendtypeGreaterThan(Integer value) {
            addCriterion("or_sendtype >", value, "orSendtype");
            return (Criteria) this;
        }

        public Criteria andOrSendtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_sendtype >=", value, "orSendtype");
            return (Criteria) this;
        }

        public Criteria andOrSendtypeLessThan(Integer value) {
            addCriterion("or_sendtype <", value, "orSendtype");
            return (Criteria) this;
        }

        public Criteria andOrSendtypeLessThanOrEqualTo(Integer value) {
            addCriterion("or_sendtype <=", value, "orSendtype");
            return (Criteria) this;
        }

        public Criteria andOrSendtypeIn(List<Integer> values) {
            addCriterion("or_sendtype in", values, "orSendtype");
            return (Criteria) this;
        }

        public Criteria andOrSendtypeNotIn(List<Integer> values) {
            addCriterion("or_sendtype not in", values, "orSendtype");
            return (Criteria) this;
        }

        public Criteria andOrSendtypeBetween(Integer value1, Integer value2) {
            addCriterion("or_sendtype between", value1, value2, "orSendtype");
            return (Criteria) this;
        }

        public Criteria andOrSendtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("or_sendtype not between", value1, value2, "orSendtype");
            return (Criteria) this;
        }

        public Criteria andOrAddressidIsNull() {
            addCriterion("or_addressid is null");
            return (Criteria) this;
        }

        public Criteria andOrAddressidIsNotNull() {
            addCriterion("or_addressid is not null");
            return (Criteria) this;
        }

        public Criteria andOrAddressidEqualTo(Integer value) {
            addCriterion("or_addressid =", value, "orAddressid");
            return (Criteria) this;
        }

        public Criteria andOrAddressidNotEqualTo(Integer value) {
            addCriterion("or_addressid <>", value, "orAddressid");
            return (Criteria) this;
        }

        public Criteria andOrAddressidGreaterThan(Integer value) {
            addCriterion("or_addressid >", value, "orAddressid");
            return (Criteria) this;
        }

        public Criteria andOrAddressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_addressid >=", value, "orAddressid");
            return (Criteria) this;
        }

        public Criteria andOrAddressidLessThan(Integer value) {
            addCriterion("or_addressid <", value, "orAddressid");
            return (Criteria) this;
        }

        public Criteria andOrAddressidLessThanOrEqualTo(Integer value) {
            addCriterion("or_addressid <=", value, "orAddressid");
            return (Criteria) this;
        }

        public Criteria andOrAddressidIn(List<Integer> values) {
            addCriterion("or_addressid in", values, "orAddressid");
            return (Criteria) this;
        }

        public Criteria andOrAddressidNotIn(List<Integer> values) {
            addCriterion("or_addressid not in", values, "orAddressid");
            return (Criteria) this;
        }

        public Criteria andOrAddressidBetween(Integer value1, Integer value2) {
            addCriterion("or_addressid between", value1, value2, "orAddressid");
            return (Criteria) this;
        }

        public Criteria andOrAddressidNotBetween(Integer value1, Integer value2) {
            addCriterion("or_addressid not between", value1, value2, "orAddressid");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgIsNull() {
            addCriterion("or_leavemsg is null");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgIsNotNull() {
            addCriterion("or_leavemsg is not null");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgEqualTo(String value) {
            addCriterion("or_leavemsg =", value, "orLeavemsg");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgNotEqualTo(String value) {
            addCriterion("or_leavemsg <>", value, "orLeavemsg");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgGreaterThan(String value) {
            addCriterion("or_leavemsg >", value, "orLeavemsg");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgGreaterThanOrEqualTo(String value) {
            addCriterion("or_leavemsg >=", value, "orLeavemsg");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgLessThan(String value) {
            addCriterion("or_leavemsg <", value, "orLeavemsg");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgLessThanOrEqualTo(String value) {
            addCriterion("or_leavemsg <=", value, "orLeavemsg");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgLike(String value) {
            addCriterion("or_leavemsg like", value, "orLeavemsg");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgNotLike(String value) {
            addCriterion("or_leavemsg not like", value, "orLeavemsg");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgIn(List<String> values) {
            addCriterion("or_leavemsg in", values, "orLeavemsg");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgNotIn(List<String> values) {
            addCriterion("or_leavemsg not in", values, "orLeavemsg");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgBetween(String value1, String value2) {
            addCriterion("or_leavemsg between", value1, value2, "orLeavemsg");
            return (Criteria) this;
        }

        public Criteria andOrLeavemsgNotBetween(String value1, String value2) {
            addCriterion("or_leavemsg not between", value1, value2, "orLeavemsg");
            return (Criteria) this;
        }

        public Criteria andOrCouponidIsNull() {
            addCriterion("or_couponid is null");
            return (Criteria) this;
        }

        public Criteria andOrCouponidIsNotNull() {
            addCriterion("or_couponid is not null");
            return (Criteria) this;
        }

        public Criteria andOrCouponidEqualTo(Integer value) {
            addCriterion("or_couponid =", value, "orCouponid");
            return (Criteria) this;
        }

        public Criteria andOrCouponidNotEqualTo(Integer value) {
            addCriterion("or_couponid <>", value, "orCouponid");
            return (Criteria) this;
        }

        public Criteria andOrCouponidGreaterThan(Integer value) {
            addCriterion("or_couponid >", value, "orCouponid");
            return (Criteria) this;
        }

        public Criteria andOrCouponidGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_couponid >=", value, "orCouponid");
            return (Criteria) this;
        }

        public Criteria andOrCouponidLessThan(Integer value) {
            addCriterion("or_couponid <", value, "orCouponid");
            return (Criteria) this;
        }

        public Criteria andOrCouponidLessThanOrEqualTo(Integer value) {
            addCriterion("or_couponid <=", value, "orCouponid");
            return (Criteria) this;
        }

        public Criteria andOrCouponidIn(List<Integer> values) {
            addCriterion("or_couponid in", values, "orCouponid");
            return (Criteria) this;
        }

        public Criteria andOrCouponidNotIn(List<Integer> values) {
            addCriterion("or_couponid not in", values, "orCouponid");
            return (Criteria) this;
        }

        public Criteria andOrCouponidBetween(Integer value1, Integer value2) {
            addCriterion("or_couponid between", value1, value2, "orCouponid");
            return (Criteria) this;
        }

        public Criteria andOrCouponidNotBetween(Integer value1, Integer value2) {
            addCriterion("or_couponid not between", value1, value2, "orCouponid");
            return (Criteria) this;
        }

        public Criteria andOrPaytypeIsNull() {
            addCriterion("or_paytype is null");
            return (Criteria) this;
        }

        public Criteria andOrPaytypeIsNotNull() {
            addCriterion("or_paytype is not null");
            return (Criteria) this;
        }

        public Criteria andOrPaytypeEqualTo(Integer value) {
            addCriterion("or_paytype =", value, "orPaytype");
            return (Criteria) this;
        }

        public Criteria andOrPaytypeNotEqualTo(Integer value) {
            addCriterion("or_paytype <>", value, "orPaytype");
            return (Criteria) this;
        }

        public Criteria andOrPaytypeGreaterThan(Integer value) {
            addCriterion("or_paytype >", value, "orPaytype");
            return (Criteria) this;
        }

        public Criteria andOrPaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_paytype >=", value, "orPaytype");
            return (Criteria) this;
        }

        public Criteria andOrPaytypeLessThan(Integer value) {
            addCriterion("or_paytype <", value, "orPaytype");
            return (Criteria) this;
        }

        public Criteria andOrPaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("or_paytype <=", value, "orPaytype");
            return (Criteria) this;
        }

        public Criteria andOrPaytypeIn(List<Integer> values) {
            addCriterion("or_paytype in", values, "orPaytype");
            return (Criteria) this;
        }

        public Criteria andOrPaytypeNotIn(List<Integer> values) {
            addCriterion("or_paytype not in", values, "orPaytype");
            return (Criteria) this;
        }

        public Criteria andOrPaytypeBetween(Integer value1, Integer value2) {
            addCriterion("or_paytype between", value1, value2, "orPaytype");
            return (Criteria) this;
        }

        public Criteria andOrPaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("or_paytype not between", value1, value2, "orPaytype");
            return (Criteria) this;
        }

        public Criteria andOrSenddateIsNull() {
            addCriterion("or_senddate is null");
            return (Criteria) this;
        }

        public Criteria andOrSenddateIsNotNull() {
            addCriterion("or_senddate is not null");
            return (Criteria) this;
        }

        public Criteria andOrSenddateEqualTo(String value) {
            addCriterion("or_senddate =", value, "orSenddate");
            return (Criteria) this;
        }

        public Criteria andOrSenddateNotEqualTo(String value) {
            addCriterion("or_senddate <>", value, "orSenddate");
            return (Criteria) this;
        }

        public Criteria andOrSenddateGreaterThan(String value) {
            addCriterion("or_senddate >", value, "orSenddate");
            return (Criteria) this;
        }

        public Criteria andOrSenddateGreaterThanOrEqualTo(String value) {
            addCriterion("or_senddate >=", value, "orSenddate");
            return (Criteria) this;
        }

        public Criteria andOrSenddateLessThan(String value) {
            addCriterion("or_senddate <", value, "orSenddate");
            return (Criteria) this;
        }

        public Criteria andOrSenddateLessThanOrEqualTo(String value) {
            addCriterion("or_senddate <=", value, "orSenddate");
            return (Criteria) this;
        }

        public Criteria andOrSenddateLike(String value) {
            addCriterion("or_senddate like", value, "orSenddate");
            return (Criteria) this;
        }

        public Criteria andOrSenddateNotLike(String value) {
            addCriterion("or_senddate not like", value, "orSenddate");
            return (Criteria) this;
        }

        public Criteria andOrSenddateIn(List<String> values) {
            addCriterion("or_senddate in", values, "orSenddate");
            return (Criteria) this;
        }

        public Criteria andOrSenddateNotIn(List<String> values) {
            addCriterion("or_senddate not in", values, "orSenddate");
            return (Criteria) this;
        }

        public Criteria andOrSenddateBetween(String value1, String value2) {
            addCriterion("or_senddate between", value1, value2, "orSenddate");
            return (Criteria) this;
        }

        public Criteria andOrSenddateNotBetween(String value1, String value2) {
            addCriterion("or_senddate not between", value1, value2, "orSenddate");
            return (Criteria) this;
        }

        public Criteria andOrGetdateIsNull() {
            addCriterion("or_getdate is null");
            return (Criteria) this;
        }

        public Criteria andOrGetdateIsNotNull() {
            addCriterion("or_getdate is not null");
            return (Criteria) this;
        }

        public Criteria andOrGetdateEqualTo(String value) {
            addCriterion("or_getdate =", value, "orGetdate");
            return (Criteria) this;
        }

        public Criteria andOrGetdateNotEqualTo(String value) {
            addCriterion("or_getdate <>", value, "orGetdate");
            return (Criteria) this;
        }

        public Criteria andOrGetdateGreaterThan(String value) {
            addCriterion("or_getdate >", value, "orGetdate");
            return (Criteria) this;
        }

        public Criteria andOrGetdateGreaterThanOrEqualTo(String value) {
            addCriterion("or_getdate >=", value, "orGetdate");
            return (Criteria) this;
        }

        public Criteria andOrGetdateLessThan(String value) {
            addCriterion("or_getdate <", value, "orGetdate");
            return (Criteria) this;
        }

        public Criteria andOrGetdateLessThanOrEqualTo(String value) {
            addCriterion("or_getdate <=", value, "orGetdate");
            return (Criteria) this;
        }

        public Criteria andOrGetdateLike(String value) {
            addCriterion("or_getdate like", value, "orGetdate");
            return (Criteria) this;
        }

        public Criteria andOrGetdateNotLike(String value) {
            addCriterion("or_getdate not like", value, "orGetdate");
            return (Criteria) this;
        }

        public Criteria andOrGetdateIn(List<String> values) {
            addCriterion("or_getdate in", values, "orGetdate");
            return (Criteria) this;
        }

        public Criteria andOrGetdateNotIn(List<String> values) {
            addCriterion("or_getdate not in", values, "orGetdate");
            return (Criteria) this;
        }

        public Criteria andOrGetdateBetween(String value1, String value2) {
            addCriterion("or_getdate between", value1, value2, "orGetdate");
            return (Criteria) this;
        }

        public Criteria andOrGetdateNotBetween(String value1, String value2) {
            addCriterion("or_getdate not between", value1, value2, "orGetdate");
            return (Criteria) this;
        }

        public Criteria andOrBuytypeIsNull() {
            addCriterion("or_buytype is null");
            return (Criteria) this;
        }

        public Criteria andOrBuytypeIsNotNull() {
            addCriterion("or_buytype is not null");
            return (Criteria) this;
        }

        public Criteria andOrBuytypeEqualTo(Integer value) {
            addCriterion("or_buytype =", value, "orBuytype");
            return (Criteria) this;
        }

        public Criteria andOrBuytypeNotEqualTo(Integer value) {
            addCriterion("or_buytype <>", value, "orBuytype");
            return (Criteria) this;
        }

        public Criteria andOrBuytypeGreaterThan(Integer value) {
            addCriterion("or_buytype >", value, "orBuytype");
            return (Criteria) this;
        }

        public Criteria andOrBuytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_buytype >=", value, "orBuytype");
            return (Criteria) this;
        }

        public Criteria andOrBuytypeLessThan(Integer value) {
            addCriterion("or_buytype <", value, "orBuytype");
            return (Criteria) this;
        }

        public Criteria andOrBuytypeLessThanOrEqualTo(Integer value) {
            addCriterion("or_buytype <=", value, "orBuytype");
            return (Criteria) this;
        }

        public Criteria andOrBuytypeIn(List<Integer> values) {
            addCriterion("or_buytype in", values, "orBuytype");
            return (Criteria) this;
        }

        public Criteria andOrBuytypeNotIn(List<Integer> values) {
            addCriterion("or_buytype not in", values, "orBuytype");
            return (Criteria) this;
        }

        public Criteria andOrBuytypeBetween(Integer value1, Integer value2) {
            addCriterion("or_buytype between", value1, value2, "orBuytype");
            return (Criteria) this;
        }

        public Criteria andOrBuytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("or_buytype not between", value1, value2, "orBuytype");
            return (Criteria) this;
        }

        public Criteria andOrExpendvalIsNull() {
            addCriterion("or_expendval is null");
            return (Criteria) this;
        }

        public Criteria andOrExpendvalIsNotNull() {
            addCriterion("or_expendval is not null");
            return (Criteria) this;
        }

        public Criteria andOrExpendvalEqualTo(Integer value) {
            addCriterion("or_expendval =", value, "orExpendval");
            return (Criteria) this;
        }

        public Criteria andOrExpendvalNotEqualTo(Integer value) {
            addCriterion("or_expendval <>", value, "orExpendval");
            return (Criteria) this;
        }

        public Criteria andOrExpendvalGreaterThan(Integer value) {
            addCriterion("or_expendval >", value, "orExpendval");
            return (Criteria) this;
        }

        public Criteria andOrExpendvalGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_expendval >=", value, "orExpendval");
            return (Criteria) this;
        }

        public Criteria andOrExpendvalLessThan(Integer value) {
            addCriterion("or_expendval <", value, "orExpendval");
            return (Criteria) this;
        }

        public Criteria andOrExpendvalLessThanOrEqualTo(Integer value) {
            addCriterion("or_expendval <=", value, "orExpendval");
            return (Criteria) this;
        }

        public Criteria andOrExpendvalIn(List<Integer> values) {
            addCriterion("or_expendval in", values, "orExpendval");
            return (Criteria) this;
        }

        public Criteria andOrExpendvalNotIn(List<Integer> values) {
            addCriterion("or_expendval not in", values, "orExpendval");
            return (Criteria) this;
        }

        public Criteria andOrExpendvalBetween(Integer value1, Integer value2) {
            addCriterion("or_expendval between", value1, value2, "orExpendval");
            return (Criteria) this;
        }

        public Criteria andOrExpendvalNotBetween(Integer value1, Integer value2) {
            addCriterion("or_expendval not between", value1, value2, "orExpendval");
            return (Criteria) this;
        }

        public Criteria andOrTypeIsNull() {
            addCriterion("or_type is null");
            return (Criteria) this;
        }

        public Criteria andOrTypeIsNotNull() {
            addCriterion("or_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrTypeEqualTo(Integer value) {
            addCriterion("or_type =", value, "orType");
            return (Criteria) this;
        }

        public Criteria andOrTypeNotEqualTo(Integer value) {
            addCriterion("or_type <>", value, "orType");
            return (Criteria) this;
        }

        public Criteria andOrTypeGreaterThan(Integer value) {
            addCriterion("or_type >", value, "orType");
            return (Criteria) this;
        }

        public Criteria andOrTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("or_type >=", value, "orType");
            return (Criteria) this;
        }

        public Criteria andOrTypeLessThan(Integer value) {
            addCriterion("or_type <", value, "orType");
            return (Criteria) this;
        }

        public Criteria andOrTypeLessThanOrEqualTo(Integer value) {
            addCriterion("or_type <=", value, "orType");
            return (Criteria) this;
        }

        public Criteria andOrTypeIn(List<Integer> values) {
            addCriterion("or_type in", values, "orType");
            return (Criteria) this;
        }

        public Criteria andOrTypeNotIn(List<Integer> values) {
            addCriterion("or_type not in", values, "orType");
            return (Criteria) this;
        }

        public Criteria andOrTypeBetween(Integer value1, Integer value2) {
            addCriterion("or_type between", value1, value2, "orType");
            return (Criteria) this;
        }

        public Criteria andOrTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("or_type not between", value1, value2, "orType");
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