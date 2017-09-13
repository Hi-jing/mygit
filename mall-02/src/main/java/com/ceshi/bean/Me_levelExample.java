package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class Me_levelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Me_levelExample() {
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

        public Criteria andLeIdIsNull() {
            addCriterion("le_id is null");
            return (Criteria) this;
        }

        public Criteria andLeIdIsNotNull() {
            addCriterion("le_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeIdEqualTo(Integer value) {
            addCriterion("le_id =", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdNotEqualTo(Integer value) {
            addCriterion("le_id <>", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdGreaterThan(Integer value) {
            addCriterion("le_id >", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("le_id >=", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdLessThan(Integer value) {
            addCriterion("le_id <", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdLessThanOrEqualTo(Integer value) {
            addCriterion("le_id <=", value, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdIn(List<Integer> values) {
            addCriterion("le_id in", values, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdNotIn(List<Integer> values) {
            addCriterion("le_id not in", values, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdBetween(Integer value1, Integer value2) {
            addCriterion("le_id between", value1, value2, "leId");
            return (Criteria) this;
        }

        public Criteria andLeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("le_id not between", value1, value2, "leId");
            return (Criteria) this;
        }

        public Criteria andLePhaseIsNull() {
            addCriterion("le_phase is null");
            return (Criteria) this;
        }

        public Criteria andLePhaseIsNotNull() {
            addCriterion("le_phase is not null");
            return (Criteria) this;
        }

        public Criteria andLePhaseEqualTo(String value) {
            addCriterion("le_phase =", value, "lePhase");
            return (Criteria) this;
        }

        public Criteria andLePhaseNotEqualTo(String value) {
            addCriterion("le_phase <>", value, "lePhase");
            return (Criteria) this;
        }

        public Criteria andLePhaseGreaterThan(String value) {
            addCriterion("le_phase >", value, "lePhase");
            return (Criteria) this;
        }

        public Criteria andLePhaseGreaterThanOrEqualTo(String value) {
            addCriterion("le_phase >=", value, "lePhase");
            return (Criteria) this;
        }

        public Criteria andLePhaseLessThan(String value) {
            addCriterion("le_phase <", value, "lePhase");
            return (Criteria) this;
        }

        public Criteria andLePhaseLessThanOrEqualTo(String value) {
            addCriterion("le_phase <=", value, "lePhase");
            return (Criteria) this;
        }

        public Criteria andLePhaseLike(String value) {
            addCriterion("le_phase like", value, "lePhase");
            return (Criteria) this;
        }

        public Criteria andLePhaseNotLike(String value) {
            addCriterion("le_phase not like", value, "lePhase");
            return (Criteria) this;
        }

        public Criteria andLePhaseIn(List<String> values) {
            addCriterion("le_phase in", values, "lePhase");
            return (Criteria) this;
        }

        public Criteria andLePhaseNotIn(List<String> values) {
            addCriterion("le_phase not in", values, "lePhase");
            return (Criteria) this;
        }

        public Criteria andLePhaseBetween(String value1, String value2) {
            addCriterion("le_phase between", value1, value2, "lePhase");
            return (Criteria) this;
        }

        public Criteria andLePhaseNotBetween(String value1, String value2) {
            addCriterion("le_phase not between", value1, value2, "lePhase");
            return (Criteria) this;
        }

        public Criteria andLeGrowthvalueIsNull() {
            addCriterion("le_growthvalue is null");
            return (Criteria) this;
        }

        public Criteria andLeGrowthvalueIsNotNull() {
            addCriterion("le_growthvalue is not null");
            return (Criteria) this;
        }

        public Criteria andLeGrowthvalueEqualTo(Integer value) {
            addCriterion("le_growthvalue =", value, "leGrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeGrowthvalueNotEqualTo(Integer value) {
            addCriterion("le_growthvalue <>", value, "leGrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeGrowthvalueGreaterThan(Integer value) {
            addCriterion("le_growthvalue >", value, "leGrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeGrowthvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("le_growthvalue >=", value, "leGrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeGrowthvalueLessThan(Integer value) {
            addCriterion("le_growthvalue <", value, "leGrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeGrowthvalueLessThanOrEqualTo(Integer value) {
            addCriterion("le_growthvalue <=", value, "leGrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeGrowthvalueIn(List<Integer> values) {
            addCriterion("le_growthvalue in", values, "leGrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeGrowthvalueNotIn(List<Integer> values) {
            addCriterion("le_growthvalue not in", values, "leGrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeGrowthvalueBetween(Integer value1, Integer value2) {
            addCriterion("le_growthvalue between", value1, value2, "leGrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeGrowthvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("le_growthvalue not between", value1, value2, "leGrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeNeedgrowthvalueIsNull() {
            addCriterion("le_needgrowthvalue is null");
            return (Criteria) this;
        }

        public Criteria andLeNeedgrowthvalueIsNotNull() {
            addCriterion("le_needgrowthvalue is not null");
            return (Criteria) this;
        }

        public Criteria andLeNeedgrowthvalueEqualTo(Integer value) {
            addCriterion("le_needgrowthvalue =", value, "leNeedgrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeNeedgrowthvalueNotEqualTo(Integer value) {
            addCriterion("le_needgrowthvalue <>", value, "leNeedgrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeNeedgrowthvalueGreaterThan(Integer value) {
            addCriterion("le_needgrowthvalue >", value, "leNeedgrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeNeedgrowthvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("le_needgrowthvalue >=", value, "leNeedgrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeNeedgrowthvalueLessThan(Integer value) {
            addCriterion("le_needgrowthvalue <", value, "leNeedgrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeNeedgrowthvalueLessThanOrEqualTo(Integer value) {
            addCriterion("le_needgrowthvalue <=", value, "leNeedgrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeNeedgrowthvalueIn(List<Integer> values) {
            addCriterion("le_needgrowthvalue in", values, "leNeedgrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeNeedgrowthvalueNotIn(List<Integer> values) {
            addCriterion("le_needgrowthvalue not in", values, "leNeedgrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeNeedgrowthvalueBetween(Integer value1, Integer value2) {
            addCriterion("le_needgrowthvalue between", value1, value2, "leNeedgrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeNeedgrowthvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("le_needgrowthvalue not between", value1, value2, "leNeedgrowthvalue");
            return (Criteria) this;
        }

        public Criteria andLeDiscountIsNull() {
            addCriterion("le_discount is null");
            return (Criteria) this;
        }

        public Criteria andLeDiscountIsNotNull() {
            addCriterion("le_discount is not null");
            return (Criteria) this;
        }

        public Criteria andLeDiscountEqualTo(Double value) {
            addCriterion("le_discount =", value, "leDiscount");
            return (Criteria) this;
        }

        public Criteria andLeDiscountNotEqualTo(Double value) {
            addCriterion("le_discount <>", value, "leDiscount");
            return (Criteria) this;
        }

        public Criteria andLeDiscountGreaterThan(Double value) {
            addCriterion("le_discount >", value, "leDiscount");
            return (Criteria) this;
        }

        public Criteria andLeDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("le_discount >=", value, "leDiscount");
            return (Criteria) this;
        }

        public Criteria andLeDiscountLessThan(Double value) {
            addCriterion("le_discount <", value, "leDiscount");
            return (Criteria) this;
        }

        public Criteria andLeDiscountLessThanOrEqualTo(Double value) {
            addCriterion("le_discount <=", value, "leDiscount");
            return (Criteria) this;
        }

        public Criteria andLeDiscountIn(List<Double> values) {
            addCriterion("le_discount in", values, "leDiscount");
            return (Criteria) this;
        }

        public Criteria andLeDiscountNotIn(List<Double> values) {
            addCriterion("le_discount not in", values, "leDiscount");
            return (Criteria) this;
        }

        public Criteria andLeDiscountBetween(Double value1, Double value2) {
            addCriterion("le_discount between", value1, value2, "leDiscount");
            return (Criteria) this;
        }

        public Criteria andLeDiscountNotBetween(Double value1, Double value2) {
            addCriterion("le_discount not between", value1, value2, "leDiscount");
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