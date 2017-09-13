package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class Good_searchrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Good_searchrecordExample() {
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

        public Criteria andSeIdIsNull() {
            addCriterion("se_id is null");
            return (Criteria) this;
        }

        public Criteria andSeIdIsNotNull() {
            addCriterion("se_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeIdEqualTo(Integer value) {
            addCriterion("se_id =", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotEqualTo(Integer value) {
            addCriterion("se_id <>", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdGreaterThan(Integer value) {
            addCriterion("se_id >", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("se_id >=", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdLessThan(Integer value) {
            addCriterion("se_id <", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdLessThanOrEqualTo(Integer value) {
            addCriterion("se_id <=", value, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdIn(List<Integer> values) {
            addCriterion("se_id in", values, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotIn(List<Integer> values) {
            addCriterion("se_id not in", values, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdBetween(Integer value1, Integer value2) {
            addCriterion("se_id between", value1, value2, "seId");
            return (Criteria) this;
        }

        public Criteria andSeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("se_id not between", value1, value2, "seId");
            return (Criteria) this;
        }

        public Criteria andSeTextIsNull() {
            addCriterion("se_text is null");
            return (Criteria) this;
        }

        public Criteria andSeTextIsNotNull() {
            addCriterion("se_text is not null");
            return (Criteria) this;
        }

        public Criteria andSeTextEqualTo(String value) {
            addCriterion("se_text =", value, "seText");
            return (Criteria) this;
        }

        public Criteria andSeTextNotEqualTo(String value) {
            addCriterion("se_text <>", value, "seText");
            return (Criteria) this;
        }

        public Criteria andSeTextGreaterThan(String value) {
            addCriterion("se_text >", value, "seText");
            return (Criteria) this;
        }

        public Criteria andSeTextGreaterThanOrEqualTo(String value) {
            addCriterion("se_text >=", value, "seText");
            return (Criteria) this;
        }

        public Criteria andSeTextLessThan(String value) {
            addCriterion("se_text <", value, "seText");
            return (Criteria) this;
        }

        public Criteria andSeTextLessThanOrEqualTo(String value) {
            addCriterion("se_text <=", value, "seText");
            return (Criteria) this;
        }

        public Criteria andSeTextLike(String value) {
            addCriterion("se_text like", value, "seText");
            return (Criteria) this;
        }

        public Criteria andSeTextNotLike(String value) {
            addCriterion("se_text not like", value, "seText");
            return (Criteria) this;
        }

        public Criteria andSeTextIn(List<String> values) {
            addCriterion("se_text in", values, "seText");
            return (Criteria) this;
        }

        public Criteria andSeTextNotIn(List<String> values) {
            addCriterion("se_text not in", values, "seText");
            return (Criteria) this;
        }

        public Criteria andSeTextBetween(String value1, String value2) {
            addCriterion("se_text between", value1, value2, "seText");
            return (Criteria) this;
        }

        public Criteria andSeTextNotBetween(String value1, String value2) {
            addCriterion("se_text not between", value1, value2, "seText");
            return (Criteria) this;
        }

        public Criteria andSeMemidIsNull() {
            addCriterion("se_memid is null");
            return (Criteria) this;
        }

        public Criteria andSeMemidIsNotNull() {
            addCriterion("se_memid is not null");
            return (Criteria) this;
        }

        public Criteria andSeMemidEqualTo(Integer value) {
            addCriterion("se_memid =", value, "seMemid");
            return (Criteria) this;
        }

        public Criteria andSeMemidNotEqualTo(Integer value) {
            addCriterion("se_memid <>", value, "seMemid");
            return (Criteria) this;
        }

        public Criteria andSeMemidGreaterThan(Integer value) {
            addCriterion("se_memid >", value, "seMemid");
            return (Criteria) this;
        }

        public Criteria andSeMemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("se_memid >=", value, "seMemid");
            return (Criteria) this;
        }

        public Criteria andSeMemidLessThan(Integer value) {
            addCriterion("se_memid <", value, "seMemid");
            return (Criteria) this;
        }

        public Criteria andSeMemidLessThanOrEqualTo(Integer value) {
            addCriterion("se_memid <=", value, "seMemid");
            return (Criteria) this;
        }

        public Criteria andSeMemidIn(List<Integer> values) {
            addCriterion("se_memid in", values, "seMemid");
            return (Criteria) this;
        }

        public Criteria andSeMemidNotIn(List<Integer> values) {
            addCriterion("se_memid not in", values, "seMemid");
            return (Criteria) this;
        }

        public Criteria andSeMemidBetween(Integer value1, Integer value2) {
            addCriterion("se_memid between", value1, value2, "seMemid");
            return (Criteria) this;
        }

        public Criteria andSeMemidNotBetween(Integer value1, Integer value2) {
            addCriterion("se_memid not between", value1, value2, "seMemid");
            return (Criteria) this;
        }

        public Criteria andSeDateIsNull() {
            addCriterion("se_date is null");
            return (Criteria) this;
        }

        public Criteria andSeDateIsNotNull() {
            addCriterion("se_date is not null");
            return (Criteria) this;
        }

        public Criteria andSeDateEqualTo(String value) {
            addCriterion("se_date =", value, "seDate");
            return (Criteria) this;
        }

        public Criteria andSeDateNotEqualTo(String value) {
            addCriterion("se_date <>", value, "seDate");
            return (Criteria) this;
        }

        public Criteria andSeDateGreaterThan(String value) {
            addCriterion("se_date >", value, "seDate");
            return (Criteria) this;
        }

        public Criteria andSeDateGreaterThanOrEqualTo(String value) {
            addCriterion("se_date >=", value, "seDate");
            return (Criteria) this;
        }

        public Criteria andSeDateLessThan(String value) {
            addCriterion("se_date <", value, "seDate");
            return (Criteria) this;
        }

        public Criteria andSeDateLessThanOrEqualTo(String value) {
            addCriterion("se_date <=", value, "seDate");
            return (Criteria) this;
        }

        public Criteria andSeDateLike(String value) {
            addCriterion("se_date like", value, "seDate");
            return (Criteria) this;
        }

        public Criteria andSeDateNotLike(String value) {
            addCriterion("se_date not like", value, "seDate");
            return (Criteria) this;
        }

        public Criteria andSeDateIn(List<String> values) {
            addCriterion("se_date in", values, "seDate");
            return (Criteria) this;
        }

        public Criteria andSeDateNotIn(List<String> values) {
            addCriterion("se_date not in", values, "seDate");
            return (Criteria) this;
        }

        public Criteria andSeDateBetween(String value1, String value2) {
            addCriterion("se_date between", value1, value2, "seDate");
            return (Criteria) this;
        }

        public Criteria andSeDateNotBetween(String value1, String value2) {
            addCriterion("se_date not between", value1, value2, "seDate");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiIsNull() {
            addCriterion("se_beizhi is null");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiIsNotNull() {
            addCriterion("se_beizhi is not null");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiEqualTo(String value) {
            addCriterion("se_beizhi =", value, "seBeizhi");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiNotEqualTo(String value) {
            addCriterion("se_beizhi <>", value, "seBeizhi");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiGreaterThan(String value) {
            addCriterion("se_beizhi >", value, "seBeizhi");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiGreaterThanOrEqualTo(String value) {
            addCriterion("se_beizhi >=", value, "seBeizhi");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiLessThan(String value) {
            addCriterion("se_beizhi <", value, "seBeizhi");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiLessThanOrEqualTo(String value) {
            addCriterion("se_beizhi <=", value, "seBeizhi");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiLike(String value) {
            addCriterion("se_beizhi like", value, "seBeizhi");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiNotLike(String value) {
            addCriterion("se_beizhi not like", value, "seBeizhi");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiIn(List<String> values) {
            addCriterion("se_beizhi in", values, "seBeizhi");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiNotIn(List<String> values) {
            addCriterion("se_beizhi not in", values, "seBeizhi");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiBetween(String value1, String value2) {
            addCriterion("se_beizhi between", value1, value2, "seBeizhi");
            return (Criteria) this;
        }

        public Criteria andSeBeizhiNotBetween(String value1, String value2) {
            addCriterion("se_beizhi not between", value1, value2, "seBeizhi");
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