package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class Ad_loginrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ad_loginrecordExample() {
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

        public Criteria andLoIdIsNull() {
            addCriterion("lo_id is null");
            return (Criteria) this;
        }

        public Criteria andLoIdIsNotNull() {
            addCriterion("lo_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoIdEqualTo(Integer value) {
            addCriterion("lo_id =", value, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdNotEqualTo(Integer value) {
            addCriterion("lo_id <>", value, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdGreaterThan(Integer value) {
            addCriterion("lo_id >", value, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lo_id >=", value, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdLessThan(Integer value) {
            addCriterion("lo_id <", value, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdLessThanOrEqualTo(Integer value) {
            addCriterion("lo_id <=", value, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdIn(List<Integer> values) {
            addCriterion("lo_id in", values, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdNotIn(List<Integer> values) {
            addCriterion("lo_id not in", values, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdBetween(Integer value1, Integer value2) {
            addCriterion("lo_id between", value1, value2, "loId");
            return (Criteria) this;
        }

        public Criteria andLoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lo_id not between", value1, value2, "loId");
            return (Criteria) this;
        }

        public Criteria andLoAdidIsNull() {
            addCriterion("lo_adid is null");
            return (Criteria) this;
        }

        public Criteria andLoAdidIsNotNull() {
            addCriterion("lo_adid is not null");
            return (Criteria) this;
        }

        public Criteria andLoAdidEqualTo(Integer value) {
            addCriterion("lo_adid =", value, "loAdid");
            return (Criteria) this;
        }

        public Criteria andLoAdidNotEqualTo(Integer value) {
            addCriterion("lo_adid <>", value, "loAdid");
            return (Criteria) this;
        }

        public Criteria andLoAdidGreaterThan(Integer value) {
            addCriterion("lo_adid >", value, "loAdid");
            return (Criteria) this;
        }

        public Criteria andLoAdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lo_adid >=", value, "loAdid");
            return (Criteria) this;
        }

        public Criteria andLoAdidLessThan(Integer value) {
            addCriterion("lo_adid <", value, "loAdid");
            return (Criteria) this;
        }

        public Criteria andLoAdidLessThanOrEqualTo(Integer value) {
            addCriterion("lo_adid <=", value, "loAdid");
            return (Criteria) this;
        }

        public Criteria andLoAdidIn(List<Integer> values) {
            addCriterion("lo_adid in", values, "loAdid");
            return (Criteria) this;
        }

        public Criteria andLoAdidNotIn(List<Integer> values) {
            addCriterion("lo_adid not in", values, "loAdid");
            return (Criteria) this;
        }

        public Criteria andLoAdidBetween(Integer value1, Integer value2) {
            addCriterion("lo_adid between", value1, value2, "loAdid");
            return (Criteria) this;
        }

        public Criteria andLoAdidNotBetween(Integer value1, Integer value2) {
            addCriterion("lo_adid not between", value1, value2, "loAdid");
            return (Criteria) this;
        }

        public Criteria andLoDateIsNull() {
            addCriterion("lo_date is null");
            return (Criteria) this;
        }

        public Criteria andLoDateIsNotNull() {
            addCriterion("lo_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoDateEqualTo(String value) {
            addCriterion("lo_date =", value, "loDate");
            return (Criteria) this;
        }

        public Criteria andLoDateNotEqualTo(String value) {
            addCriterion("lo_date <>", value, "loDate");
            return (Criteria) this;
        }

        public Criteria andLoDateGreaterThan(String value) {
            addCriterion("lo_date >", value, "loDate");
            return (Criteria) this;
        }

        public Criteria andLoDateGreaterThanOrEqualTo(String value) {
            addCriterion("lo_date >=", value, "loDate");
            return (Criteria) this;
        }

        public Criteria andLoDateLessThan(String value) {
            addCriterion("lo_date <", value, "loDate");
            return (Criteria) this;
        }

        public Criteria andLoDateLessThanOrEqualTo(String value) {
            addCriterion("lo_date <=", value, "loDate");
            return (Criteria) this;
        }

        public Criteria andLoDateLike(String value) {
            addCriterion("lo_date like", value, "loDate");
            return (Criteria) this;
        }

        public Criteria andLoDateNotLike(String value) {
            addCriterion("lo_date not like", value, "loDate");
            return (Criteria) this;
        }

        public Criteria andLoDateIn(List<String> values) {
            addCriterion("lo_date in", values, "loDate");
            return (Criteria) this;
        }

        public Criteria andLoDateNotIn(List<String> values) {
            addCriterion("lo_date not in", values, "loDate");
            return (Criteria) this;
        }

        public Criteria andLoDateBetween(String value1, String value2) {
            addCriterion("lo_date between", value1, value2, "loDate");
            return (Criteria) this;
        }

        public Criteria andLoDateNotBetween(String value1, String value2) {
            addCriterion("lo_date not between", value1, value2, "loDate");
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