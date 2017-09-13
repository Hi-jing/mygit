package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodExample() {
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

        public Criteria andGoIdIsNull() {
            addCriterion("go_id is null");
            return (Criteria) this;
        }

        public Criteria andGoIdIsNotNull() {
            addCriterion("go_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoIdEqualTo(Integer value) {
            addCriterion("go_id =", value, "goId");
            return (Criteria) this;
        }

        public Criteria andGoIdNotEqualTo(Integer value) {
            addCriterion("go_id <>", value, "goId");
            return (Criteria) this;
        }

        public Criteria andGoIdGreaterThan(Integer value) {
            addCriterion("go_id >", value, "goId");
            return (Criteria) this;
        }

        public Criteria andGoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("go_id >=", value, "goId");
            return (Criteria) this;
        }

        public Criteria andGoIdLessThan(Integer value) {
            addCriterion("go_id <", value, "goId");
            return (Criteria) this;
        }

        public Criteria andGoIdLessThanOrEqualTo(Integer value) {
            addCriterion("go_id <=", value, "goId");
            return (Criteria) this;
        }

        public Criteria andGoIdIn(List<Integer> values) {
            addCriterion("go_id in", values, "goId");
            return (Criteria) this;
        }

        public Criteria andGoIdNotIn(List<Integer> values) {
            addCriterion("go_id not in", values, "goId");
            return (Criteria) this;
        }

        public Criteria andGoIdBetween(Integer value1, Integer value2) {
            addCriterion("go_id between", value1, value2, "goId");
            return (Criteria) this;
        }

        public Criteria andGoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("go_id not between", value1, value2, "goId");
            return (Criteria) this;
        }

        public Criteria andGoTypeIsNull() {
            addCriterion("go_type is null");
            return (Criteria) this;
        }

        public Criteria andGoTypeIsNotNull() {
            addCriterion("go_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoTypeEqualTo(String value) {
            addCriterion("go_type =", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeNotEqualTo(String value) {
            addCriterion("go_type <>", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeGreaterThan(String value) {
            addCriterion("go_type >", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("go_type >=", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeLessThan(String value) {
            addCriterion("go_type <", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeLessThanOrEqualTo(String value) {
            addCriterion("go_type <=", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeLike(String value) {
            addCriterion("go_type like", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeNotLike(String value) {
            addCriterion("go_type not like", value, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeIn(List<String> values) {
            addCriterion("go_type in", values, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeNotIn(List<String> values) {
            addCriterion("go_type not in", values, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeBetween(String value1, String value2) {
            addCriterion("go_type between", value1, value2, "goType");
            return (Criteria) this;
        }

        public Criteria andGoTypeNotBetween(String value1, String value2) {
            addCriterion("go_type not between", value1, value2, "goType");
            return (Criteria) this;
        }

        public Criteria andGoNameIsNull() {
            addCriterion("go_name is null");
            return (Criteria) this;
        }

        public Criteria andGoNameIsNotNull() {
            addCriterion("go_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoNameEqualTo(String value) {
            addCriterion("go_name =", value, "goName");
            return (Criteria) this;
        }

        public Criteria andGoNameNotEqualTo(String value) {
            addCriterion("go_name <>", value, "goName");
            return (Criteria) this;
        }

        public Criteria andGoNameGreaterThan(String value) {
            addCriterion("go_name >", value, "goName");
            return (Criteria) this;
        }

        public Criteria andGoNameGreaterThanOrEqualTo(String value) {
            addCriterion("go_name >=", value, "goName");
            return (Criteria) this;
        }

        public Criteria andGoNameLessThan(String value) {
            addCriterion("go_name <", value, "goName");
            return (Criteria) this;
        }

        public Criteria andGoNameLessThanOrEqualTo(String value) {
            addCriterion("go_name <=", value, "goName");
            return (Criteria) this;
        }

        public Criteria andGoNameLike(String value) {
            addCriterion("go_name like", value, "goName");
            return (Criteria) this;
        }

        public Criteria andGoNameNotLike(String value) {
            addCriterion("go_name not like", value, "goName");
            return (Criteria) this;
        }

        public Criteria andGoNameIn(List<String> values) {
            addCriterion("go_name in", values, "goName");
            return (Criteria) this;
        }

        public Criteria andGoNameNotIn(List<String> values) {
            addCriterion("go_name not in", values, "goName");
            return (Criteria) this;
        }

        public Criteria andGoNameBetween(String value1, String value2) {
            addCriterion("go_name between", value1, value2, "goName");
            return (Criteria) this;
        }

        public Criteria andGoNameNotBetween(String value1, String value2) {
            addCriterion("go_name not between", value1, value2, "goName");
            return (Criteria) this;
        }

        public Criteria andGoLooksumIsNull() {
            addCriterion("go_looksum is null");
            return (Criteria) this;
        }

        public Criteria andGoLooksumIsNotNull() {
            addCriterion("go_looksum is not null");
            return (Criteria) this;
        }

        public Criteria andGoLooksumEqualTo(Integer value) {
            addCriterion("go_looksum =", value, "goLooksum");
            return (Criteria) this;
        }

        public Criteria andGoLooksumNotEqualTo(Integer value) {
            addCriterion("go_looksum <>", value, "goLooksum");
            return (Criteria) this;
        }

        public Criteria andGoLooksumGreaterThan(Integer value) {
            addCriterion("go_looksum >", value, "goLooksum");
            return (Criteria) this;
        }

        public Criteria andGoLooksumGreaterThanOrEqualTo(Integer value) {
            addCriterion("go_looksum >=", value, "goLooksum");
            return (Criteria) this;
        }

        public Criteria andGoLooksumLessThan(Integer value) {
            addCriterion("go_looksum <", value, "goLooksum");
            return (Criteria) this;
        }

        public Criteria andGoLooksumLessThanOrEqualTo(Integer value) {
            addCriterion("go_looksum <=", value, "goLooksum");
            return (Criteria) this;
        }

        public Criteria andGoLooksumIn(List<Integer> values) {
            addCriterion("go_looksum in", values, "goLooksum");
            return (Criteria) this;
        }

        public Criteria andGoLooksumNotIn(List<Integer> values) {
            addCriterion("go_looksum not in", values, "goLooksum");
            return (Criteria) this;
        }

        public Criteria andGoLooksumBetween(Integer value1, Integer value2) {
            addCriterion("go_looksum between", value1, value2, "goLooksum");
            return (Criteria) this;
        }

        public Criteria andGoLooksumNotBetween(Integer value1, Integer value2) {
            addCriterion("go_looksum not between", value1, value2, "goLooksum");
            return (Criteria) this;
        }

        public Criteria andGoBuysumIsNull() {
            addCriterion("go_buysum is null");
            return (Criteria) this;
        }

        public Criteria andGoBuysumIsNotNull() {
            addCriterion("go_buysum is not null");
            return (Criteria) this;
        }

        public Criteria andGoBuysumEqualTo(Integer value) {
            addCriterion("go_buysum =", value, "goBuysum");
            return (Criteria) this;
        }

        public Criteria andGoBuysumNotEqualTo(Integer value) {
            addCriterion("go_buysum <>", value, "goBuysum");
            return (Criteria) this;
        }

        public Criteria andGoBuysumGreaterThan(Integer value) {
            addCriterion("go_buysum >", value, "goBuysum");
            return (Criteria) this;
        }

        public Criteria andGoBuysumGreaterThanOrEqualTo(Integer value) {
            addCriterion("go_buysum >=", value, "goBuysum");
            return (Criteria) this;
        }

        public Criteria andGoBuysumLessThan(Integer value) {
            addCriterion("go_buysum <", value, "goBuysum");
            return (Criteria) this;
        }

        public Criteria andGoBuysumLessThanOrEqualTo(Integer value) {
            addCriterion("go_buysum <=", value, "goBuysum");
            return (Criteria) this;
        }

        public Criteria andGoBuysumIn(List<Integer> values) {
            addCriterion("go_buysum in", values, "goBuysum");
            return (Criteria) this;
        }

        public Criteria andGoBuysumNotIn(List<Integer> values) {
            addCriterion("go_buysum not in", values, "goBuysum");
            return (Criteria) this;
        }

        public Criteria andGoBuysumBetween(Integer value1, Integer value2) {
            addCriterion("go_buysum between", value1, value2, "goBuysum");
            return (Criteria) this;
        }

        public Criteria andGoBuysumNotBetween(Integer value1, Integer value2) {
            addCriterion("go_buysum not between", value1, value2, "goBuysum");
            return (Criteria) this;
        }

        public Criteria andGoTotalIsNull() {
            addCriterion("go_total is null");
            return (Criteria) this;
        }

        public Criteria andGoTotalIsNotNull() {
            addCriterion("go_total is not null");
            return (Criteria) this;
        }

        public Criteria andGoTotalEqualTo(Integer value) {
            addCriterion("go_total =", value, "goTotal");
            return (Criteria) this;
        }

        public Criteria andGoTotalNotEqualTo(Integer value) {
            addCriterion("go_total <>", value, "goTotal");
            return (Criteria) this;
        }

        public Criteria andGoTotalGreaterThan(Integer value) {
            addCriterion("go_total >", value, "goTotal");
            return (Criteria) this;
        }

        public Criteria andGoTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("go_total >=", value, "goTotal");
            return (Criteria) this;
        }

        public Criteria andGoTotalLessThan(Integer value) {
            addCriterion("go_total <", value, "goTotal");
            return (Criteria) this;
        }

        public Criteria andGoTotalLessThanOrEqualTo(Integer value) {
            addCriterion("go_total <=", value, "goTotal");
            return (Criteria) this;
        }

        public Criteria andGoTotalIn(List<Integer> values) {
            addCriterion("go_total in", values, "goTotal");
            return (Criteria) this;
        }

        public Criteria andGoTotalNotIn(List<Integer> values) {
            addCriterion("go_total not in", values, "goTotal");
            return (Criteria) this;
        }

        public Criteria andGoTotalBetween(Integer value1, Integer value2) {
            addCriterion("go_total between", value1, value2, "goTotal");
            return (Criteria) this;
        }

        public Criteria andGoTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("go_total not between", value1, value2, "goTotal");
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