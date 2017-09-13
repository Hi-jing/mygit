package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class Or_goodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Or_goodExample() {
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

        public Criteria andGoOridIsNull() {
            addCriterion("go_orid is null");
            return (Criteria) this;
        }

        public Criteria andGoOridIsNotNull() {
            addCriterion("go_orid is not null");
            return (Criteria) this;
        }

        public Criteria andGoOridEqualTo(Integer value) {
            addCriterion("go_orid =", value, "goOrid");
            return (Criteria) this;
        }

        public Criteria andGoOridNotEqualTo(Integer value) {
            addCriterion("go_orid <>", value, "goOrid");
            return (Criteria) this;
        }

        public Criteria andGoOridGreaterThan(Integer value) {
            addCriterion("go_orid >", value, "goOrid");
            return (Criteria) this;
        }

        public Criteria andGoOridGreaterThanOrEqualTo(Integer value) {
            addCriterion("go_orid >=", value, "goOrid");
            return (Criteria) this;
        }

        public Criteria andGoOridLessThan(Integer value) {
            addCriterion("go_orid <", value, "goOrid");
            return (Criteria) this;
        }

        public Criteria andGoOridLessThanOrEqualTo(Integer value) {
            addCriterion("go_orid <=", value, "goOrid");
            return (Criteria) this;
        }

        public Criteria andGoOridIn(List<Integer> values) {
            addCriterion("go_orid in", values, "goOrid");
            return (Criteria) this;
        }

        public Criteria andGoOridNotIn(List<Integer> values) {
            addCriterion("go_orid not in", values, "goOrid");
            return (Criteria) this;
        }

        public Criteria andGoOridBetween(Integer value1, Integer value2) {
            addCriterion("go_orid between", value1, value2, "goOrid");
            return (Criteria) this;
        }

        public Criteria andGoOridNotBetween(Integer value1, Integer value2) {
            addCriterion("go_orid not between", value1, value2, "goOrid");
            return (Criteria) this;
        }

        public Criteria andGoGoodidIsNull() {
            addCriterion("go_goodid is null");
            return (Criteria) this;
        }

        public Criteria andGoGoodidIsNotNull() {
            addCriterion("go_goodid is not null");
            return (Criteria) this;
        }

        public Criteria andGoGoodidEqualTo(Integer value) {
            addCriterion("go_goodid =", value, "goGoodid");
            return (Criteria) this;
        }

        public Criteria andGoGoodidNotEqualTo(Integer value) {
            addCriterion("go_goodid <>", value, "goGoodid");
            return (Criteria) this;
        }

        public Criteria andGoGoodidGreaterThan(Integer value) {
            addCriterion("go_goodid >", value, "goGoodid");
            return (Criteria) this;
        }

        public Criteria andGoGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("go_goodid >=", value, "goGoodid");
            return (Criteria) this;
        }

        public Criteria andGoGoodidLessThan(Integer value) {
            addCriterion("go_goodid <", value, "goGoodid");
            return (Criteria) this;
        }

        public Criteria andGoGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("go_goodid <=", value, "goGoodid");
            return (Criteria) this;
        }

        public Criteria andGoGoodidIn(List<Integer> values) {
            addCriterion("go_goodid in", values, "goGoodid");
            return (Criteria) this;
        }

        public Criteria andGoGoodidNotIn(List<Integer> values) {
            addCriterion("go_goodid not in", values, "goGoodid");
            return (Criteria) this;
        }

        public Criteria andGoGoodidBetween(Integer value1, Integer value2) {
            addCriterion("go_goodid between", value1, value2, "goGoodid");
            return (Criteria) this;
        }

        public Criteria andGoGoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("go_goodid not between", value1, value2, "goGoodid");
            return (Criteria) this;
        }

        public Criteria andGoKindidIsNull() {
            addCriterion("go_kindid is null");
            return (Criteria) this;
        }

        public Criteria andGoKindidIsNotNull() {
            addCriterion("go_kindid is not null");
            return (Criteria) this;
        }

        public Criteria andGoKindidEqualTo(Integer value) {
            addCriterion("go_kindid =", value, "goKindid");
            return (Criteria) this;
        }

        public Criteria andGoKindidNotEqualTo(Integer value) {
            addCriterion("go_kindid <>", value, "goKindid");
            return (Criteria) this;
        }

        public Criteria andGoKindidGreaterThan(Integer value) {
            addCriterion("go_kindid >", value, "goKindid");
            return (Criteria) this;
        }

        public Criteria andGoKindidGreaterThanOrEqualTo(Integer value) {
            addCriterion("go_kindid >=", value, "goKindid");
            return (Criteria) this;
        }

        public Criteria andGoKindidLessThan(Integer value) {
            addCriterion("go_kindid <", value, "goKindid");
            return (Criteria) this;
        }

        public Criteria andGoKindidLessThanOrEqualTo(Integer value) {
            addCriterion("go_kindid <=", value, "goKindid");
            return (Criteria) this;
        }

        public Criteria andGoKindidIn(List<Integer> values) {
            addCriterion("go_kindid in", values, "goKindid");
            return (Criteria) this;
        }

        public Criteria andGoKindidNotIn(List<Integer> values) {
            addCriterion("go_kindid not in", values, "goKindid");
            return (Criteria) this;
        }

        public Criteria andGoKindidBetween(Integer value1, Integer value2) {
            addCriterion("go_kindid between", value1, value2, "goKindid");
            return (Criteria) this;
        }

        public Criteria andGoKindidNotBetween(Integer value1, Integer value2) {
            addCriterion("go_kindid not between", value1, value2, "goKindid");
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