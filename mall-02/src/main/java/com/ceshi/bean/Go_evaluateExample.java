package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class Go_evaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Go_evaluateExample() {
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

        public Criteria andEvIdIsNull() {
            addCriterion("ev_id is null");
            return (Criteria) this;
        }

        public Criteria andEvIdIsNotNull() {
            addCriterion("ev_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvIdEqualTo(Integer value) {
            addCriterion("ev_id =", value, "evId");
            return (Criteria) this;
        }

        public Criteria andEvIdNotEqualTo(Integer value) {
            addCriterion("ev_id <>", value, "evId");
            return (Criteria) this;
        }

        public Criteria andEvIdGreaterThan(Integer value) {
            addCriterion("ev_id >", value, "evId");
            return (Criteria) this;
        }

        public Criteria andEvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ev_id >=", value, "evId");
            return (Criteria) this;
        }

        public Criteria andEvIdLessThan(Integer value) {
            addCriterion("ev_id <", value, "evId");
            return (Criteria) this;
        }

        public Criteria andEvIdLessThanOrEqualTo(Integer value) {
            addCriterion("ev_id <=", value, "evId");
            return (Criteria) this;
        }

        public Criteria andEvIdIn(List<Integer> values) {
            addCriterion("ev_id in", values, "evId");
            return (Criteria) this;
        }

        public Criteria andEvIdNotIn(List<Integer> values) {
            addCriterion("ev_id not in", values, "evId");
            return (Criteria) this;
        }

        public Criteria andEvIdBetween(Integer value1, Integer value2) {
            addCriterion("ev_id between", value1, value2, "evId");
            return (Criteria) this;
        }

        public Criteria andEvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ev_id not between", value1, value2, "evId");
            return (Criteria) this;
        }

        public Criteria andEvGoodidIsNull() {
            addCriterion("ev_goodid is null");
            return (Criteria) this;
        }

        public Criteria andEvGoodidIsNotNull() {
            addCriterion("ev_goodid is not null");
            return (Criteria) this;
        }

        public Criteria andEvGoodidEqualTo(Integer value) {
            addCriterion("ev_goodid =", value, "evGoodid");
            return (Criteria) this;
        }

        public Criteria andEvGoodidNotEqualTo(Integer value) {
            addCriterion("ev_goodid <>", value, "evGoodid");
            return (Criteria) this;
        }

        public Criteria andEvGoodidGreaterThan(Integer value) {
            addCriterion("ev_goodid >", value, "evGoodid");
            return (Criteria) this;
        }

        public Criteria andEvGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ev_goodid >=", value, "evGoodid");
            return (Criteria) this;
        }

        public Criteria andEvGoodidLessThan(Integer value) {
            addCriterion("ev_goodid <", value, "evGoodid");
            return (Criteria) this;
        }

        public Criteria andEvGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("ev_goodid <=", value, "evGoodid");
            return (Criteria) this;
        }

        public Criteria andEvGoodidIn(List<Integer> values) {
            addCriterion("ev_goodid in", values, "evGoodid");
            return (Criteria) this;
        }

        public Criteria andEvGoodidNotIn(List<Integer> values) {
            addCriterion("ev_goodid not in", values, "evGoodid");
            return (Criteria) this;
        }

        public Criteria andEvGoodidBetween(Integer value1, Integer value2) {
            addCriterion("ev_goodid between", value1, value2, "evGoodid");
            return (Criteria) this;
        }

        public Criteria andEvGoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("ev_goodid not between", value1, value2, "evGoodid");
            return (Criteria) this;
        }

        public Criteria andEvMemberidIsNull() {
            addCriterion("ev_memberid is null");
            return (Criteria) this;
        }

        public Criteria andEvMemberidIsNotNull() {
            addCriterion("ev_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andEvMemberidEqualTo(Integer value) {
            addCriterion("ev_memberid =", value, "evMemberid");
            return (Criteria) this;
        }

        public Criteria andEvMemberidNotEqualTo(Integer value) {
            addCriterion("ev_memberid <>", value, "evMemberid");
            return (Criteria) this;
        }

        public Criteria andEvMemberidGreaterThan(Integer value) {
            addCriterion("ev_memberid >", value, "evMemberid");
            return (Criteria) this;
        }

        public Criteria andEvMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ev_memberid >=", value, "evMemberid");
            return (Criteria) this;
        }

        public Criteria andEvMemberidLessThan(Integer value) {
            addCriterion("ev_memberid <", value, "evMemberid");
            return (Criteria) this;
        }

        public Criteria andEvMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("ev_memberid <=", value, "evMemberid");
            return (Criteria) this;
        }

        public Criteria andEvMemberidIn(List<Integer> values) {
            addCriterion("ev_memberid in", values, "evMemberid");
            return (Criteria) this;
        }

        public Criteria andEvMemberidNotIn(List<Integer> values) {
            addCriterion("ev_memberid not in", values, "evMemberid");
            return (Criteria) this;
        }

        public Criteria andEvMemberidBetween(Integer value1, Integer value2) {
            addCriterion("ev_memberid between", value1, value2, "evMemberid");
            return (Criteria) this;
        }

        public Criteria andEvMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("ev_memberid not between", value1, value2, "evMemberid");
            return (Criteria) this;
        }

        public Criteria andEvTextIsNull() {
            addCriterion("ev_text is null");
            return (Criteria) this;
        }

        public Criteria andEvTextIsNotNull() {
            addCriterion("ev_text is not null");
            return (Criteria) this;
        }

        public Criteria andEvTextEqualTo(String value) {
            addCriterion("ev_text =", value, "evText");
            return (Criteria) this;
        }

        public Criteria andEvTextNotEqualTo(String value) {
            addCriterion("ev_text <>", value, "evText");
            return (Criteria) this;
        }

        public Criteria andEvTextGreaterThan(String value) {
            addCriterion("ev_text >", value, "evText");
            return (Criteria) this;
        }

        public Criteria andEvTextGreaterThanOrEqualTo(String value) {
            addCriterion("ev_text >=", value, "evText");
            return (Criteria) this;
        }

        public Criteria andEvTextLessThan(String value) {
            addCriterion("ev_text <", value, "evText");
            return (Criteria) this;
        }

        public Criteria andEvTextLessThanOrEqualTo(String value) {
            addCriterion("ev_text <=", value, "evText");
            return (Criteria) this;
        }

        public Criteria andEvTextLike(String value) {
            addCriterion("ev_text like", value, "evText");
            return (Criteria) this;
        }

        public Criteria andEvTextNotLike(String value) {
            addCriterion("ev_text not like", value, "evText");
            return (Criteria) this;
        }

        public Criteria andEvTextIn(List<String> values) {
            addCriterion("ev_text in", values, "evText");
            return (Criteria) this;
        }

        public Criteria andEvTextNotIn(List<String> values) {
            addCriterion("ev_text not in", values, "evText");
            return (Criteria) this;
        }

        public Criteria andEvTextBetween(String value1, String value2) {
            addCriterion("ev_text between", value1, value2, "evText");
            return (Criteria) this;
        }

        public Criteria andEvTextNotBetween(String value1, String value2) {
            addCriterion("ev_text not between", value1, value2, "evText");
            return (Criteria) this;
        }

        public Criteria andEvDateIsNull() {
            addCriterion("ev_date is null");
            return (Criteria) this;
        }

        public Criteria andEvDateIsNotNull() {
            addCriterion("ev_date is not null");
            return (Criteria) this;
        }

        public Criteria andEvDateEqualTo(String value) {
            addCriterion("ev_date =", value, "evDate");
            return (Criteria) this;
        }

        public Criteria andEvDateNotEqualTo(String value) {
            addCriterion("ev_date <>", value, "evDate");
            return (Criteria) this;
        }

        public Criteria andEvDateGreaterThan(String value) {
            addCriterion("ev_date >", value, "evDate");
            return (Criteria) this;
        }

        public Criteria andEvDateGreaterThanOrEqualTo(String value) {
            addCriterion("ev_date >=", value, "evDate");
            return (Criteria) this;
        }

        public Criteria andEvDateLessThan(String value) {
            addCriterion("ev_date <", value, "evDate");
            return (Criteria) this;
        }

        public Criteria andEvDateLessThanOrEqualTo(String value) {
            addCriterion("ev_date <=", value, "evDate");
            return (Criteria) this;
        }

        public Criteria andEvDateLike(String value) {
            addCriterion("ev_date like", value, "evDate");
            return (Criteria) this;
        }

        public Criteria andEvDateNotLike(String value) {
            addCriterion("ev_date not like", value, "evDate");
            return (Criteria) this;
        }

        public Criteria andEvDateIn(List<String> values) {
            addCriterion("ev_date in", values, "evDate");
            return (Criteria) this;
        }

        public Criteria andEvDateNotIn(List<String> values) {
            addCriterion("ev_date not in", values, "evDate");
            return (Criteria) this;
        }

        public Criteria andEvDateBetween(String value1, String value2) {
            addCriterion("ev_date between", value1, value2, "evDate");
            return (Criteria) this;
        }

        public Criteria andEvDateNotBetween(String value1, String value2) {
            addCriterion("ev_date not between", value1, value2, "evDate");
            return (Criteria) this;
        }

        public Criteria andEvSatisfactlevelIsNull() {
            addCriterion("ev_satisfactlevel is null");
            return (Criteria) this;
        }

        public Criteria andEvSatisfactlevelIsNotNull() {
            addCriterion("ev_satisfactlevel is not null");
            return (Criteria) this;
        }

        public Criteria andEvSatisfactlevelEqualTo(Integer value) {
            addCriterion("ev_satisfactlevel =", value, "evSatisfactlevel");
            return (Criteria) this;
        }

        public Criteria andEvSatisfactlevelNotEqualTo(Integer value) {
            addCriterion("ev_satisfactlevel <>", value, "evSatisfactlevel");
            return (Criteria) this;
        }

        public Criteria andEvSatisfactlevelGreaterThan(Integer value) {
            addCriterion("ev_satisfactlevel >", value, "evSatisfactlevel");
            return (Criteria) this;
        }

        public Criteria andEvSatisfactlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ev_satisfactlevel >=", value, "evSatisfactlevel");
            return (Criteria) this;
        }

        public Criteria andEvSatisfactlevelLessThan(Integer value) {
            addCriterion("ev_satisfactlevel <", value, "evSatisfactlevel");
            return (Criteria) this;
        }

        public Criteria andEvSatisfactlevelLessThanOrEqualTo(Integer value) {
            addCriterion("ev_satisfactlevel <=", value, "evSatisfactlevel");
            return (Criteria) this;
        }

        public Criteria andEvSatisfactlevelIn(List<Integer> values) {
            addCriterion("ev_satisfactlevel in", values, "evSatisfactlevel");
            return (Criteria) this;
        }

        public Criteria andEvSatisfactlevelNotIn(List<Integer> values) {
            addCriterion("ev_satisfactlevel not in", values, "evSatisfactlevel");
            return (Criteria) this;
        }

        public Criteria andEvSatisfactlevelBetween(Integer value1, Integer value2) {
            addCriterion("ev_satisfactlevel between", value1, value2, "evSatisfactlevel");
            return (Criteria) this;
        }

        public Criteria andEvSatisfactlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("ev_satisfactlevel not between", value1, value2, "evSatisfactlevel");
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