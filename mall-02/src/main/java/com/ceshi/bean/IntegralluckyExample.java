package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class IntegralluckyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegralluckyExample() {
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

        public Criteria andIlIdIsNull() {
            addCriterion("il_id is null");
            return (Criteria) this;
        }

        public Criteria andIlIdIsNotNull() {
            addCriterion("il_id is not null");
            return (Criteria) this;
        }

        public Criteria andIlIdEqualTo(Integer value) {
            addCriterion("il_id =", value, "ilId");
            return (Criteria) this;
        }

        public Criteria andIlIdNotEqualTo(Integer value) {
            addCriterion("il_id <>", value, "ilId");
            return (Criteria) this;
        }

        public Criteria andIlIdGreaterThan(Integer value) {
            addCriterion("il_id >", value, "ilId");
            return (Criteria) this;
        }

        public Criteria andIlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("il_id >=", value, "ilId");
            return (Criteria) this;
        }

        public Criteria andIlIdLessThan(Integer value) {
            addCriterion("il_id <", value, "ilId");
            return (Criteria) this;
        }

        public Criteria andIlIdLessThanOrEqualTo(Integer value) {
            addCriterion("il_id <=", value, "ilId");
            return (Criteria) this;
        }

        public Criteria andIlIdIn(List<Integer> values) {
            addCriterion("il_id in", values, "ilId");
            return (Criteria) this;
        }

        public Criteria andIlIdNotIn(List<Integer> values) {
            addCriterion("il_id not in", values, "ilId");
            return (Criteria) this;
        }

        public Criteria andIlIdBetween(Integer value1, Integer value2) {
            addCriterion("il_id between", value1, value2, "ilId");
            return (Criteria) this;
        }

        public Criteria andIlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("il_id not between", value1, value2, "ilId");
            return (Criteria) this;
        }

        public Criteria andIlMemberidIsNull() {
            addCriterion("il_memberid is null");
            return (Criteria) this;
        }

        public Criteria andIlMemberidIsNotNull() {
            addCriterion("il_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andIlMemberidEqualTo(Integer value) {
            addCriterion("il_memberid =", value, "ilMemberid");
            return (Criteria) this;
        }

        public Criteria andIlMemberidNotEqualTo(Integer value) {
            addCriterion("il_memberid <>", value, "ilMemberid");
            return (Criteria) this;
        }

        public Criteria andIlMemberidGreaterThan(Integer value) {
            addCriterion("il_memberid >", value, "ilMemberid");
            return (Criteria) this;
        }

        public Criteria andIlMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("il_memberid >=", value, "ilMemberid");
            return (Criteria) this;
        }

        public Criteria andIlMemberidLessThan(Integer value) {
            addCriterion("il_memberid <", value, "ilMemberid");
            return (Criteria) this;
        }

        public Criteria andIlMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("il_memberid <=", value, "ilMemberid");
            return (Criteria) this;
        }

        public Criteria andIlMemberidIn(List<Integer> values) {
            addCriterion("il_memberid in", values, "ilMemberid");
            return (Criteria) this;
        }

        public Criteria andIlMemberidNotIn(List<Integer> values) {
            addCriterion("il_memberid not in", values, "ilMemberid");
            return (Criteria) this;
        }

        public Criteria andIlMemberidBetween(Integer value1, Integer value2) {
            addCriterion("il_memberid between", value1, value2, "ilMemberid");
            return (Criteria) this;
        }

        public Criteria andIlMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("il_memberid not between", value1, value2, "ilMemberid");
            return (Criteria) this;
        }

        public Criteria andIlSituationIsNull() {
            addCriterion("il_situation is null");
            return (Criteria) this;
        }

        public Criteria andIlSituationIsNotNull() {
            addCriterion("il_situation is not null");
            return (Criteria) this;
        }

        public Criteria andIlSituationEqualTo(Integer value) {
            addCriterion("il_situation =", value, "ilSituation");
            return (Criteria) this;
        }

        public Criteria andIlSituationNotEqualTo(Integer value) {
            addCriterion("il_situation <>", value, "ilSituation");
            return (Criteria) this;
        }

        public Criteria andIlSituationGreaterThan(Integer value) {
            addCriterion("il_situation >", value, "ilSituation");
            return (Criteria) this;
        }

        public Criteria andIlSituationGreaterThanOrEqualTo(Integer value) {
            addCriterion("il_situation >=", value, "ilSituation");
            return (Criteria) this;
        }

        public Criteria andIlSituationLessThan(Integer value) {
            addCriterion("il_situation <", value, "ilSituation");
            return (Criteria) this;
        }

        public Criteria andIlSituationLessThanOrEqualTo(Integer value) {
            addCriterion("il_situation <=", value, "ilSituation");
            return (Criteria) this;
        }

        public Criteria andIlSituationIn(List<Integer> values) {
            addCriterion("il_situation in", values, "ilSituation");
            return (Criteria) this;
        }

        public Criteria andIlSituationNotIn(List<Integer> values) {
            addCriterion("il_situation not in", values, "ilSituation");
            return (Criteria) this;
        }

        public Criteria andIlSituationBetween(Integer value1, Integer value2) {
            addCriterion("il_situation between", value1, value2, "ilSituation");
            return (Criteria) this;
        }

        public Criteria andIlSituationNotBetween(Integer value1, Integer value2) {
            addCriterion("il_situation not between", value1, value2, "ilSituation");
            return (Criteria) this;
        }

        public Criteria andIlDateIsNull() {
            addCriterion("il_date is null");
            return (Criteria) this;
        }

        public Criteria andIlDateIsNotNull() {
            addCriterion("il_date is not null");
            return (Criteria) this;
        }

        public Criteria andIlDateEqualTo(String value) {
            addCriterion("il_date =", value, "ilDate");
            return (Criteria) this;
        }

        public Criteria andIlDateNotEqualTo(String value) {
            addCriterion("il_date <>", value, "ilDate");
            return (Criteria) this;
        }

        public Criteria andIlDateGreaterThan(String value) {
            addCriterion("il_date >", value, "ilDate");
            return (Criteria) this;
        }

        public Criteria andIlDateGreaterThanOrEqualTo(String value) {
            addCriterion("il_date >=", value, "ilDate");
            return (Criteria) this;
        }

        public Criteria andIlDateLessThan(String value) {
            addCriterion("il_date <", value, "ilDate");
            return (Criteria) this;
        }

        public Criteria andIlDateLessThanOrEqualTo(String value) {
            addCriterion("il_date <=", value, "ilDate");
            return (Criteria) this;
        }

        public Criteria andIlDateLike(String value) {
            addCriterion("il_date like", value, "ilDate");
            return (Criteria) this;
        }

        public Criteria andIlDateNotLike(String value) {
            addCriterion("il_date not like", value, "ilDate");
            return (Criteria) this;
        }

        public Criteria andIlDateIn(List<String> values) {
            addCriterion("il_date in", values, "ilDate");
            return (Criteria) this;
        }

        public Criteria andIlDateNotIn(List<String> values) {
            addCriterion("il_date not in", values, "ilDate");
            return (Criteria) this;
        }

        public Criteria andIlDateBetween(String value1, String value2) {
            addCriterion("il_date between", value1, value2, "ilDate");
            return (Criteria) this;
        }

        public Criteria andIlDateNotBetween(String value1, String value2) {
            addCriterion("il_date not between", value1, value2, "ilDate");
            return (Criteria) this;
        }

        public Criteria andIlCouponidIsNull() {
            addCriterion("il_couponid is null");
            return (Criteria) this;
        }

        public Criteria andIlCouponidIsNotNull() {
            addCriterion("il_couponid is not null");
            return (Criteria) this;
        }

        public Criteria andIlCouponidEqualTo(Integer value) {
            addCriterion("il_couponid =", value, "ilCouponid");
            return (Criteria) this;
        }

        public Criteria andIlCouponidNotEqualTo(Integer value) {
            addCriterion("il_couponid <>", value, "ilCouponid");
            return (Criteria) this;
        }

        public Criteria andIlCouponidGreaterThan(Integer value) {
            addCriterion("il_couponid >", value, "ilCouponid");
            return (Criteria) this;
        }

        public Criteria andIlCouponidGreaterThanOrEqualTo(Integer value) {
            addCriterion("il_couponid >=", value, "ilCouponid");
            return (Criteria) this;
        }

        public Criteria andIlCouponidLessThan(Integer value) {
            addCriterion("il_couponid <", value, "ilCouponid");
            return (Criteria) this;
        }

        public Criteria andIlCouponidLessThanOrEqualTo(Integer value) {
            addCriterion("il_couponid <=", value, "ilCouponid");
            return (Criteria) this;
        }

        public Criteria andIlCouponidIn(List<Integer> values) {
            addCriterion("il_couponid in", values, "ilCouponid");
            return (Criteria) this;
        }

        public Criteria andIlCouponidNotIn(List<Integer> values) {
            addCriterion("il_couponid not in", values, "ilCouponid");
            return (Criteria) this;
        }

        public Criteria andIlCouponidBetween(Integer value1, Integer value2) {
            addCriterion("il_couponid between", value1, value2, "ilCouponid");
            return (Criteria) this;
        }

        public Criteria andIlCouponidNotBetween(Integer value1, Integer value2) {
            addCriterion("il_couponid not between", value1, value2, "ilCouponid");
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