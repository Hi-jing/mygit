package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class Me_membercardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Me_membercardExample() {
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

        public Criteria andMcIdIsNull() {
            addCriterion("mc_id is null");
            return (Criteria) this;
        }

        public Criteria andMcIdIsNotNull() {
            addCriterion("mc_id is not null");
            return (Criteria) this;
        }

        public Criteria andMcIdEqualTo(Integer value) {
            addCriterion("mc_id =", value, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdNotEqualTo(Integer value) {
            addCriterion("mc_id <>", value, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdGreaterThan(Integer value) {
            addCriterion("mc_id >", value, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mc_id >=", value, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdLessThan(Integer value) {
            addCriterion("mc_id <", value, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdLessThanOrEqualTo(Integer value) {
            addCriterion("mc_id <=", value, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdIn(List<Integer> values) {
            addCriterion("mc_id in", values, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdNotIn(List<Integer> values) {
            addCriterion("mc_id not in", values, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdBetween(Integer value1, Integer value2) {
            addCriterion("mc_id between", value1, value2, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mc_id not between", value1, value2, "mcId");
            return (Criteria) this;
        }

        public Criteria andMcMemberidIsNull() {
            addCriterion("mc_memberid is null");
            return (Criteria) this;
        }

        public Criteria andMcMemberidIsNotNull() {
            addCriterion("mc_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMcMemberidEqualTo(Integer value) {
            addCriterion("mc_memberid =", value, "mcMemberid");
            return (Criteria) this;
        }

        public Criteria andMcMemberidNotEqualTo(Integer value) {
            addCriterion("mc_memberid <>", value, "mcMemberid");
            return (Criteria) this;
        }

        public Criteria andMcMemberidGreaterThan(Integer value) {
            addCriterion("mc_memberid >", value, "mcMemberid");
            return (Criteria) this;
        }

        public Criteria andMcMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mc_memberid >=", value, "mcMemberid");
            return (Criteria) this;
        }

        public Criteria andMcMemberidLessThan(Integer value) {
            addCriterion("mc_memberid <", value, "mcMemberid");
            return (Criteria) this;
        }

        public Criteria andMcMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("mc_memberid <=", value, "mcMemberid");
            return (Criteria) this;
        }

        public Criteria andMcMemberidIn(List<Integer> values) {
            addCriterion("mc_memberid in", values, "mcMemberid");
            return (Criteria) this;
        }

        public Criteria andMcMemberidNotIn(List<Integer> values) {
            addCriterion("mc_memberid not in", values, "mcMemberid");
            return (Criteria) this;
        }

        public Criteria andMcMemberidBetween(Integer value1, Integer value2) {
            addCriterion("mc_memberid between", value1, value2, "mcMemberid");
            return (Criteria) this;
        }

        public Criteria andMcMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("mc_memberid not between", value1, value2, "mcMemberid");
            return (Criteria) this;
        }

        public Criteria andMcMoneyIsNull() {
            addCriterion("mc_money is null");
            return (Criteria) this;
        }

        public Criteria andMcMoneyIsNotNull() {
            addCriterion("mc_money is not null");
            return (Criteria) this;
        }

        public Criteria andMcMoneyEqualTo(Double value) {
            addCriterion("mc_money =", value, "mcMoney");
            return (Criteria) this;
        }

        public Criteria andMcMoneyNotEqualTo(Double value) {
            addCriterion("mc_money <>", value, "mcMoney");
            return (Criteria) this;
        }

        public Criteria andMcMoneyGreaterThan(Double value) {
            addCriterion("mc_money >", value, "mcMoney");
            return (Criteria) this;
        }

        public Criteria andMcMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("mc_money >=", value, "mcMoney");
            return (Criteria) this;
        }

        public Criteria andMcMoneyLessThan(Double value) {
            addCriterion("mc_money <", value, "mcMoney");
            return (Criteria) this;
        }

        public Criteria andMcMoneyLessThanOrEqualTo(Double value) {
            addCriterion("mc_money <=", value, "mcMoney");
            return (Criteria) this;
        }

        public Criteria andMcMoneyIn(List<Double> values) {
            addCriterion("mc_money in", values, "mcMoney");
            return (Criteria) this;
        }

        public Criteria andMcMoneyNotIn(List<Double> values) {
            addCriterion("mc_money not in", values, "mcMoney");
            return (Criteria) this;
        }

        public Criteria andMcMoneyBetween(Double value1, Double value2) {
            addCriterion("mc_money between", value1, value2, "mcMoney");
            return (Criteria) this;
        }

        public Criteria andMcMoneyNotBetween(Double value1, Double value2) {
            addCriterion("mc_money not between", value1, value2, "mcMoney");
            return (Criteria) this;
        }

        public Criteria andMcStateIsNull() {
            addCriterion("mc_state is null");
            return (Criteria) this;
        }

        public Criteria andMcStateIsNotNull() {
            addCriterion("mc_state is not null");
            return (Criteria) this;
        }

        public Criteria andMcStateEqualTo(Integer value) {
            addCriterion("mc_state =", value, "mcState");
            return (Criteria) this;
        }

        public Criteria andMcStateNotEqualTo(Integer value) {
            addCriterion("mc_state <>", value, "mcState");
            return (Criteria) this;
        }

        public Criteria andMcStateGreaterThan(Integer value) {
            addCriterion("mc_state >", value, "mcState");
            return (Criteria) this;
        }

        public Criteria andMcStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("mc_state >=", value, "mcState");
            return (Criteria) this;
        }

        public Criteria andMcStateLessThan(Integer value) {
            addCriterion("mc_state <", value, "mcState");
            return (Criteria) this;
        }

        public Criteria andMcStateLessThanOrEqualTo(Integer value) {
            addCriterion("mc_state <=", value, "mcState");
            return (Criteria) this;
        }

        public Criteria andMcStateIn(List<Integer> values) {
            addCriterion("mc_state in", values, "mcState");
            return (Criteria) this;
        }

        public Criteria andMcStateNotIn(List<Integer> values) {
            addCriterion("mc_state not in", values, "mcState");
            return (Criteria) this;
        }

        public Criteria andMcStateBetween(Integer value1, Integer value2) {
            addCriterion("mc_state between", value1, value2, "mcState");
            return (Criteria) this;
        }

        public Criteria andMcStateNotBetween(Integer value1, Integer value2) {
            addCriterion("mc_state not between", value1, value2, "mcState");
            return (Criteria) this;
        }

        public Criteria andMcLevelidIsNull() {
            addCriterion("mc_levelid is null");
            return (Criteria) this;
        }

        public Criteria andMcLevelidIsNotNull() {
            addCriterion("mc_levelid is not null");
            return (Criteria) this;
        }

        public Criteria andMcLevelidEqualTo(Integer value) {
            addCriterion("mc_levelid =", value, "mcLevelid");
            return (Criteria) this;
        }

        public Criteria andMcLevelidNotEqualTo(Integer value) {
            addCriterion("mc_levelid <>", value, "mcLevelid");
            return (Criteria) this;
        }

        public Criteria andMcLevelidGreaterThan(Integer value) {
            addCriterion("mc_levelid >", value, "mcLevelid");
            return (Criteria) this;
        }

        public Criteria andMcLevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mc_levelid >=", value, "mcLevelid");
            return (Criteria) this;
        }

        public Criteria andMcLevelidLessThan(Integer value) {
            addCriterion("mc_levelid <", value, "mcLevelid");
            return (Criteria) this;
        }

        public Criteria andMcLevelidLessThanOrEqualTo(Integer value) {
            addCriterion("mc_levelid <=", value, "mcLevelid");
            return (Criteria) this;
        }

        public Criteria andMcLevelidIn(List<Integer> values) {
            addCriterion("mc_levelid in", values, "mcLevelid");
            return (Criteria) this;
        }

        public Criteria andMcLevelidNotIn(List<Integer> values) {
            addCriterion("mc_levelid not in", values, "mcLevelid");
            return (Criteria) this;
        }

        public Criteria andMcLevelidBetween(Integer value1, Integer value2) {
            addCriterion("mc_levelid between", value1, value2, "mcLevelid");
            return (Criteria) this;
        }

        public Criteria andMcLevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("mc_levelid not between", value1, value2, "mcLevelid");
            return (Criteria) this;
        }

        public Criteria andMcCardnumberIsNull() {
            addCriterion("mc_cardnumber is null");
            return (Criteria) this;
        }

        public Criteria andMcCardnumberIsNotNull() {
            addCriterion("mc_cardnumber is not null");
            return (Criteria) this;
        }

        public Criteria andMcCardnumberEqualTo(Long value) {
            addCriterion("mc_cardnumber =", value, "mcCardnumber");
            return (Criteria) this;
        }

        public Criteria andMcCardnumberNotEqualTo(Long value) {
            addCriterion("mc_cardnumber <>", value, "mcCardnumber");
            return (Criteria) this;
        }

        public Criteria andMcCardnumberGreaterThan(Long value) {
            addCriterion("mc_cardnumber >", value, "mcCardnumber");
            return (Criteria) this;
        }

        public Criteria andMcCardnumberGreaterThanOrEqualTo(Long value) {
            addCriterion("mc_cardnumber >=", value, "mcCardnumber");
            return (Criteria) this;
        }

        public Criteria andMcCardnumberLessThan(Long value) {
            addCriterion("mc_cardnumber <", value, "mcCardnumber");
            return (Criteria) this;
        }

        public Criteria andMcCardnumberLessThanOrEqualTo(Long value) {
            addCriterion("mc_cardnumber <=", value, "mcCardnumber");
            return (Criteria) this;
        }

        public Criteria andMcCardnumberIn(List<Long> values) {
            addCriterion("mc_cardnumber in", values, "mcCardnumber");
            return (Criteria) this;
        }

        public Criteria andMcCardnumberNotIn(List<Long> values) {
            addCriterion("mc_cardnumber not in", values, "mcCardnumber");
            return (Criteria) this;
        }

        public Criteria andMcCardnumberBetween(Long value1, Long value2) {
            addCriterion("mc_cardnumber between", value1, value2, "mcCardnumber");
            return (Criteria) this;
        }

        public Criteria andMcCardnumberNotBetween(Long value1, Long value2) {
            addCriterion("mc_cardnumber not between", value1, value2, "mcCardnumber");
            return (Criteria) this;
        }

        public Criteria andMcPaynumberIsNull() {
            addCriterion("mc_paynumber is null");
            return (Criteria) this;
        }

        public Criteria andMcPaynumberIsNotNull() {
            addCriterion("mc_paynumber is not null");
            return (Criteria) this;
        }

        public Criteria andMcPaynumberEqualTo(Integer value) {
            addCriterion("mc_paynumber =", value, "mcPaynumber");
            return (Criteria) this;
        }

        public Criteria andMcPaynumberNotEqualTo(Integer value) {
            addCriterion("mc_paynumber <>", value, "mcPaynumber");
            return (Criteria) this;
        }

        public Criteria andMcPaynumberGreaterThan(Integer value) {
            addCriterion("mc_paynumber >", value, "mcPaynumber");
            return (Criteria) this;
        }

        public Criteria andMcPaynumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("mc_paynumber >=", value, "mcPaynumber");
            return (Criteria) this;
        }

        public Criteria andMcPaynumberLessThan(Integer value) {
            addCriterion("mc_paynumber <", value, "mcPaynumber");
            return (Criteria) this;
        }

        public Criteria andMcPaynumberLessThanOrEqualTo(Integer value) {
            addCriterion("mc_paynumber <=", value, "mcPaynumber");
            return (Criteria) this;
        }

        public Criteria andMcPaynumberIn(List<Integer> values) {
            addCriterion("mc_paynumber in", values, "mcPaynumber");
            return (Criteria) this;
        }

        public Criteria andMcPaynumberNotIn(List<Integer> values) {
            addCriterion("mc_paynumber not in", values, "mcPaynumber");
            return (Criteria) this;
        }

        public Criteria andMcPaynumberBetween(Integer value1, Integer value2) {
            addCriterion("mc_paynumber between", value1, value2, "mcPaynumber");
            return (Criteria) this;
        }

        public Criteria andMcPaynumberNotBetween(Integer value1, Integer value2) {
            addCriterion("mc_paynumber not between", value1, value2, "mcPaynumber");
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