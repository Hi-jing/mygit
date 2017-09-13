package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class Go_paytypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Go_paytypeExample() {
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

        public Criteria andPtIdIsNull() {
            addCriterion("pt_id is null");
            return (Criteria) this;
        }

        public Criteria andPtIdIsNotNull() {
            addCriterion("pt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPtIdEqualTo(Integer value) {
            addCriterion("pt_id =", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotEqualTo(Integer value) {
            addCriterion("pt_id <>", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThan(Integer value) {
            addCriterion("pt_id >", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_id >=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThan(Integer value) {
            addCriterion("pt_id <", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThanOrEqualTo(Integer value) {
            addCriterion("pt_id <=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdIn(List<Integer> values) {
            addCriterion("pt_id in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotIn(List<Integer> values) {
            addCriterion("pt_id not in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdBetween(Integer value1, Integer value2) {
            addCriterion("pt_id between", value1, value2, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_id not between", value1, value2, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtGoodidIsNull() {
            addCriterion("pt_goodid is null");
            return (Criteria) this;
        }

        public Criteria andPtGoodidIsNotNull() {
            addCriterion("pt_goodid is not null");
            return (Criteria) this;
        }

        public Criteria andPtGoodidEqualTo(Integer value) {
            addCriterion("pt_goodid =", value, "ptGoodid");
            return (Criteria) this;
        }

        public Criteria andPtGoodidNotEqualTo(Integer value) {
            addCriterion("pt_goodid <>", value, "ptGoodid");
            return (Criteria) this;
        }

        public Criteria andPtGoodidGreaterThan(Integer value) {
            addCriterion("pt_goodid >", value, "ptGoodid");
            return (Criteria) this;
        }

        public Criteria andPtGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_goodid >=", value, "ptGoodid");
            return (Criteria) this;
        }

        public Criteria andPtGoodidLessThan(Integer value) {
            addCriterion("pt_goodid <", value, "ptGoodid");
            return (Criteria) this;
        }

        public Criteria andPtGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("pt_goodid <=", value, "ptGoodid");
            return (Criteria) this;
        }

        public Criteria andPtGoodidIn(List<Integer> values) {
            addCriterion("pt_goodid in", values, "ptGoodid");
            return (Criteria) this;
        }

        public Criteria andPtGoodidNotIn(List<Integer> values) {
            addCriterion("pt_goodid not in", values, "ptGoodid");
            return (Criteria) this;
        }

        public Criteria andPtGoodidBetween(Integer value1, Integer value2) {
            addCriterion("pt_goodid between", value1, value2, "ptGoodid");
            return (Criteria) this;
        }

        public Criteria andPtGoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_goodid not between", value1, value2, "ptGoodid");
            return (Criteria) this;
        }

        public Criteria andPtNameIsNull() {
            addCriterion("pt_name is null");
            return (Criteria) this;
        }

        public Criteria andPtNameIsNotNull() {
            addCriterion("pt_name is not null");
            return (Criteria) this;
        }

        public Criteria andPtNameEqualTo(Integer value) {
            addCriterion("pt_name =", value, "ptName");
            return (Criteria) this;
        }

        public Criteria andPtNameNotEqualTo(Integer value) {
            addCriterion("pt_name <>", value, "ptName");
            return (Criteria) this;
        }

        public Criteria andPtNameGreaterThan(Integer value) {
            addCriterion("pt_name >", value, "ptName");
            return (Criteria) this;
        }

        public Criteria andPtNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_name >=", value, "ptName");
            return (Criteria) this;
        }

        public Criteria andPtNameLessThan(Integer value) {
            addCriterion("pt_name <", value, "ptName");
            return (Criteria) this;
        }

        public Criteria andPtNameLessThanOrEqualTo(Integer value) {
            addCriterion("pt_name <=", value, "ptName");
            return (Criteria) this;
        }

        public Criteria andPtNameIn(List<Integer> values) {
            addCriterion("pt_name in", values, "ptName");
            return (Criteria) this;
        }

        public Criteria andPtNameNotIn(List<Integer> values) {
            addCriterion("pt_name not in", values, "ptName");
            return (Criteria) this;
        }

        public Criteria andPtNameBetween(Integer value1, Integer value2) {
            addCriterion("pt_name between", value1, value2, "ptName");
            return (Criteria) this;
        }

        public Criteria andPtNameNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_name not between", value1, value2, "ptName");
            return (Criteria) this;
        }

        public Criteria andPtNeedintegralIsNull() {
            addCriterion("pt_needintegral is null");
            return (Criteria) this;
        }

        public Criteria andPtNeedintegralIsNotNull() {
            addCriterion("pt_needintegral is not null");
            return (Criteria) this;
        }

        public Criteria andPtNeedintegralEqualTo(Integer value) {
            addCriterion("pt_needintegral =", value, "ptNeedintegral");
            return (Criteria) this;
        }

        public Criteria andPtNeedintegralNotEqualTo(Integer value) {
            addCriterion("pt_needintegral <>", value, "ptNeedintegral");
            return (Criteria) this;
        }

        public Criteria andPtNeedintegralGreaterThan(Integer value) {
            addCriterion("pt_needintegral >", value, "ptNeedintegral");
            return (Criteria) this;
        }

        public Criteria andPtNeedintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("pt_needintegral >=", value, "ptNeedintegral");
            return (Criteria) this;
        }

        public Criteria andPtNeedintegralLessThan(Integer value) {
            addCriterion("pt_needintegral <", value, "ptNeedintegral");
            return (Criteria) this;
        }

        public Criteria andPtNeedintegralLessThanOrEqualTo(Integer value) {
            addCriterion("pt_needintegral <=", value, "ptNeedintegral");
            return (Criteria) this;
        }

        public Criteria andPtNeedintegralIn(List<Integer> values) {
            addCriterion("pt_needintegral in", values, "ptNeedintegral");
            return (Criteria) this;
        }

        public Criteria andPtNeedintegralNotIn(List<Integer> values) {
            addCriterion("pt_needintegral not in", values, "ptNeedintegral");
            return (Criteria) this;
        }

        public Criteria andPtNeedintegralBetween(Integer value1, Integer value2) {
            addCriterion("pt_needintegral between", value1, value2, "ptNeedintegral");
            return (Criteria) this;
        }

        public Criteria andPtNeedintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("pt_needintegral not between", value1, value2, "ptNeedintegral");
            return (Criteria) this;
        }

        public Criteria andPtStartdateIsNull() {
            addCriterion("pt_startdate is null");
            return (Criteria) this;
        }

        public Criteria andPtStartdateIsNotNull() {
            addCriterion("pt_startdate is not null");
            return (Criteria) this;
        }

        public Criteria andPtStartdateEqualTo(String value) {
            addCriterion("pt_startdate =", value, "ptStartdate");
            return (Criteria) this;
        }

        public Criteria andPtStartdateNotEqualTo(String value) {
            addCriterion("pt_startdate <>", value, "ptStartdate");
            return (Criteria) this;
        }

        public Criteria andPtStartdateGreaterThan(String value) {
            addCriterion("pt_startdate >", value, "ptStartdate");
            return (Criteria) this;
        }

        public Criteria andPtStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("pt_startdate >=", value, "ptStartdate");
            return (Criteria) this;
        }

        public Criteria andPtStartdateLessThan(String value) {
            addCriterion("pt_startdate <", value, "ptStartdate");
            return (Criteria) this;
        }

        public Criteria andPtStartdateLessThanOrEqualTo(String value) {
            addCriterion("pt_startdate <=", value, "ptStartdate");
            return (Criteria) this;
        }

        public Criteria andPtStartdateLike(String value) {
            addCriterion("pt_startdate like", value, "ptStartdate");
            return (Criteria) this;
        }

        public Criteria andPtStartdateNotLike(String value) {
            addCriterion("pt_startdate not like", value, "ptStartdate");
            return (Criteria) this;
        }

        public Criteria andPtStartdateIn(List<String> values) {
            addCriterion("pt_startdate in", values, "ptStartdate");
            return (Criteria) this;
        }

        public Criteria andPtStartdateNotIn(List<String> values) {
            addCriterion("pt_startdate not in", values, "ptStartdate");
            return (Criteria) this;
        }

        public Criteria andPtStartdateBetween(String value1, String value2) {
            addCriterion("pt_startdate between", value1, value2, "ptStartdate");
            return (Criteria) this;
        }

        public Criteria andPtStartdateNotBetween(String value1, String value2) {
            addCriterion("pt_startdate not between", value1, value2, "ptStartdate");
            return (Criteria) this;
        }

        public Criteria andPtOverdateIsNull() {
            addCriterion("pt_overdate is null");
            return (Criteria) this;
        }

        public Criteria andPtOverdateIsNotNull() {
            addCriterion("pt_overdate is not null");
            return (Criteria) this;
        }

        public Criteria andPtOverdateEqualTo(String value) {
            addCriterion("pt_overdate =", value, "ptOverdate");
            return (Criteria) this;
        }

        public Criteria andPtOverdateNotEqualTo(String value) {
            addCriterion("pt_overdate <>", value, "ptOverdate");
            return (Criteria) this;
        }

        public Criteria andPtOverdateGreaterThan(String value) {
            addCriterion("pt_overdate >", value, "ptOverdate");
            return (Criteria) this;
        }

        public Criteria andPtOverdateGreaterThanOrEqualTo(String value) {
            addCriterion("pt_overdate >=", value, "ptOverdate");
            return (Criteria) this;
        }

        public Criteria andPtOverdateLessThan(String value) {
            addCriterion("pt_overdate <", value, "ptOverdate");
            return (Criteria) this;
        }

        public Criteria andPtOverdateLessThanOrEqualTo(String value) {
            addCriterion("pt_overdate <=", value, "ptOverdate");
            return (Criteria) this;
        }

        public Criteria andPtOverdateLike(String value) {
            addCriterion("pt_overdate like", value, "ptOverdate");
            return (Criteria) this;
        }

        public Criteria andPtOverdateNotLike(String value) {
            addCriterion("pt_overdate not like", value, "ptOverdate");
            return (Criteria) this;
        }

        public Criteria andPtOverdateIn(List<String> values) {
            addCriterion("pt_overdate in", values, "ptOverdate");
            return (Criteria) this;
        }

        public Criteria andPtOverdateNotIn(List<String> values) {
            addCriterion("pt_overdate not in", values, "ptOverdate");
            return (Criteria) this;
        }

        public Criteria andPtOverdateBetween(String value1, String value2) {
            addCriterion("pt_overdate between", value1, value2, "ptOverdate");
            return (Criteria) this;
        }

        public Criteria andPtOverdateNotBetween(String value1, String value2) {
            addCriterion("pt_overdate not between", value1, value2, "ptOverdate");
            return (Criteria) this;
        }

        public Criteria andPtAddmoneyIsNull() {
            addCriterion("pt_addmoney is null");
            return (Criteria) this;
        }

        public Criteria andPtAddmoneyIsNotNull() {
            addCriterion("pt_addmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPtAddmoneyEqualTo(Double value) {
            addCriterion("pt_addmoney =", value, "ptAddmoney");
            return (Criteria) this;
        }

        public Criteria andPtAddmoneyNotEqualTo(Double value) {
            addCriterion("pt_addmoney <>", value, "ptAddmoney");
            return (Criteria) this;
        }

        public Criteria andPtAddmoneyGreaterThan(Double value) {
            addCriterion("pt_addmoney >", value, "ptAddmoney");
            return (Criteria) this;
        }

        public Criteria andPtAddmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("pt_addmoney >=", value, "ptAddmoney");
            return (Criteria) this;
        }

        public Criteria andPtAddmoneyLessThan(Double value) {
            addCriterion("pt_addmoney <", value, "ptAddmoney");
            return (Criteria) this;
        }

        public Criteria andPtAddmoneyLessThanOrEqualTo(Double value) {
            addCriterion("pt_addmoney <=", value, "ptAddmoney");
            return (Criteria) this;
        }

        public Criteria andPtAddmoneyIn(List<Double> values) {
            addCriterion("pt_addmoney in", values, "ptAddmoney");
            return (Criteria) this;
        }

        public Criteria andPtAddmoneyNotIn(List<Double> values) {
            addCriterion("pt_addmoney not in", values, "ptAddmoney");
            return (Criteria) this;
        }

        public Criteria andPtAddmoneyBetween(Double value1, Double value2) {
            addCriterion("pt_addmoney between", value1, value2, "ptAddmoney");
            return (Criteria) this;
        }

        public Criteria andPtAddmoneyNotBetween(Double value1, Double value2) {
            addCriterion("pt_addmoney not between", value1, value2, "ptAddmoney");
            return (Criteria) this;
        }

        public Criteria andPtMsgIsNull() {
            addCriterion("pt_msg is null");
            return (Criteria) this;
        }

        public Criteria andPtMsgIsNotNull() {
            addCriterion("pt_msg is not null");
            return (Criteria) this;
        }

        public Criteria andPtMsgEqualTo(String value) {
            addCriterion("pt_msg =", value, "ptMsg");
            return (Criteria) this;
        }

        public Criteria andPtMsgNotEqualTo(String value) {
            addCriterion("pt_msg <>", value, "ptMsg");
            return (Criteria) this;
        }

        public Criteria andPtMsgGreaterThan(String value) {
            addCriterion("pt_msg >", value, "ptMsg");
            return (Criteria) this;
        }

        public Criteria andPtMsgGreaterThanOrEqualTo(String value) {
            addCriterion("pt_msg >=", value, "ptMsg");
            return (Criteria) this;
        }

        public Criteria andPtMsgLessThan(String value) {
            addCriterion("pt_msg <", value, "ptMsg");
            return (Criteria) this;
        }

        public Criteria andPtMsgLessThanOrEqualTo(String value) {
            addCriterion("pt_msg <=", value, "ptMsg");
            return (Criteria) this;
        }

        public Criteria andPtMsgLike(String value) {
            addCriterion("pt_msg like", value, "ptMsg");
            return (Criteria) this;
        }

        public Criteria andPtMsgNotLike(String value) {
            addCriterion("pt_msg not like", value, "ptMsg");
            return (Criteria) this;
        }

        public Criteria andPtMsgIn(List<String> values) {
            addCriterion("pt_msg in", values, "ptMsg");
            return (Criteria) this;
        }

        public Criteria andPtMsgNotIn(List<String> values) {
            addCriterion("pt_msg not in", values, "ptMsg");
            return (Criteria) this;
        }

        public Criteria andPtMsgBetween(String value1, String value2) {
            addCriterion("pt_msg between", value1, value2, "ptMsg");
            return (Criteria) this;
        }

        public Criteria andPtMsgNotBetween(String value1, String value2) {
            addCriterion("pt_msg not between", value1, value2, "ptMsg");
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