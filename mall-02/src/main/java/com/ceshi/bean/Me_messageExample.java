package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class Me_messageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Me_messageExample() {
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

        public Criteria andMeIdIsNull() {
            addCriterion("me_id is null");
            return (Criteria) this;
        }

        public Criteria andMeIdIsNotNull() {
            addCriterion("me_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeIdEqualTo(Integer value) {
            addCriterion("me_id =", value, "meId");
            return (Criteria) this;
        }

        public Criteria andMeIdNotEqualTo(Integer value) {
            addCriterion("me_id <>", value, "meId");
            return (Criteria) this;
        }

        public Criteria andMeIdGreaterThan(Integer value) {
            addCriterion("me_id >", value, "meId");
            return (Criteria) this;
        }

        public Criteria andMeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("me_id >=", value, "meId");
            return (Criteria) this;
        }

        public Criteria andMeIdLessThan(Integer value) {
            addCriterion("me_id <", value, "meId");
            return (Criteria) this;
        }

        public Criteria andMeIdLessThanOrEqualTo(Integer value) {
            addCriterion("me_id <=", value, "meId");
            return (Criteria) this;
        }

        public Criteria andMeIdIn(List<Integer> values) {
            addCriterion("me_id in", values, "meId");
            return (Criteria) this;
        }

        public Criteria andMeIdNotIn(List<Integer> values) {
            addCriterion("me_id not in", values, "meId");
            return (Criteria) this;
        }

        public Criteria andMeIdBetween(Integer value1, Integer value2) {
            addCriterion("me_id between", value1, value2, "meId");
            return (Criteria) this;
        }

        public Criteria andMeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("me_id not between", value1, value2, "meId");
            return (Criteria) this;
        }

        public Criteria andMeMemberidIsNull() {
            addCriterion("me_memberid is null");
            return (Criteria) this;
        }

        public Criteria andMeMemberidIsNotNull() {
            addCriterion("me_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMeMemberidEqualTo(Integer value) {
            addCriterion("me_memberid =", value, "meMemberid");
            return (Criteria) this;
        }

        public Criteria andMeMemberidNotEqualTo(Integer value) {
            addCriterion("me_memberid <>", value, "meMemberid");
            return (Criteria) this;
        }

        public Criteria andMeMemberidGreaterThan(Integer value) {
            addCriterion("me_memberid >", value, "meMemberid");
            return (Criteria) this;
        }

        public Criteria andMeMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("me_memberid >=", value, "meMemberid");
            return (Criteria) this;
        }

        public Criteria andMeMemberidLessThan(Integer value) {
            addCriterion("me_memberid <", value, "meMemberid");
            return (Criteria) this;
        }

        public Criteria andMeMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("me_memberid <=", value, "meMemberid");
            return (Criteria) this;
        }

        public Criteria andMeMemberidIn(List<Integer> values) {
            addCriterion("me_memberid in", values, "meMemberid");
            return (Criteria) this;
        }

        public Criteria andMeMemberidNotIn(List<Integer> values) {
            addCriterion("me_memberid not in", values, "meMemberid");
            return (Criteria) this;
        }

        public Criteria andMeMemberidBetween(Integer value1, Integer value2) {
            addCriterion("me_memberid between", value1, value2, "meMemberid");
            return (Criteria) this;
        }

        public Criteria andMeMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("me_memberid not between", value1, value2, "meMemberid");
            return (Criteria) this;
        }

        public Criteria andMeMessagetypeIsNull() {
            addCriterion("me_messagetype is null");
            return (Criteria) this;
        }

        public Criteria andMeMessagetypeIsNotNull() {
            addCriterion("me_messagetype is not null");
            return (Criteria) this;
        }

        public Criteria andMeMessagetypeEqualTo(Integer value) {
            addCriterion("me_messagetype =", value, "meMessagetype");
            return (Criteria) this;
        }

        public Criteria andMeMessagetypeNotEqualTo(Integer value) {
            addCriterion("me_messagetype <>", value, "meMessagetype");
            return (Criteria) this;
        }

        public Criteria andMeMessagetypeGreaterThan(Integer value) {
            addCriterion("me_messagetype >", value, "meMessagetype");
            return (Criteria) this;
        }

        public Criteria andMeMessagetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("me_messagetype >=", value, "meMessagetype");
            return (Criteria) this;
        }

        public Criteria andMeMessagetypeLessThan(Integer value) {
            addCriterion("me_messagetype <", value, "meMessagetype");
            return (Criteria) this;
        }

        public Criteria andMeMessagetypeLessThanOrEqualTo(Integer value) {
            addCriterion("me_messagetype <=", value, "meMessagetype");
            return (Criteria) this;
        }

        public Criteria andMeMessagetypeIn(List<Integer> values) {
            addCriterion("me_messagetype in", values, "meMessagetype");
            return (Criteria) this;
        }

        public Criteria andMeMessagetypeNotIn(List<Integer> values) {
            addCriterion("me_messagetype not in", values, "meMessagetype");
            return (Criteria) this;
        }

        public Criteria andMeMessagetypeBetween(Integer value1, Integer value2) {
            addCriterion("me_messagetype between", value1, value2, "meMessagetype");
            return (Criteria) this;
        }

        public Criteria andMeMessagetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("me_messagetype not between", value1, value2, "meMessagetype");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextIsNull() {
            addCriterion("me_messagetext is null");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextIsNotNull() {
            addCriterion("me_messagetext is not null");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextEqualTo(String value) {
            addCriterion("me_messagetext =", value, "meMessagetext");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextNotEqualTo(String value) {
            addCriterion("me_messagetext <>", value, "meMessagetext");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextGreaterThan(String value) {
            addCriterion("me_messagetext >", value, "meMessagetext");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextGreaterThanOrEqualTo(String value) {
            addCriterion("me_messagetext >=", value, "meMessagetext");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextLessThan(String value) {
            addCriterion("me_messagetext <", value, "meMessagetext");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextLessThanOrEqualTo(String value) {
            addCriterion("me_messagetext <=", value, "meMessagetext");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextLike(String value) {
            addCriterion("me_messagetext like", value, "meMessagetext");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextNotLike(String value) {
            addCriterion("me_messagetext not like", value, "meMessagetext");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextIn(List<String> values) {
            addCriterion("me_messagetext in", values, "meMessagetext");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextNotIn(List<String> values) {
            addCriterion("me_messagetext not in", values, "meMessagetext");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextBetween(String value1, String value2) {
            addCriterion("me_messagetext between", value1, value2, "meMessagetext");
            return (Criteria) this;
        }

        public Criteria andMeMessagetextNotBetween(String value1, String value2) {
            addCriterion("me_messagetext not between", value1, value2, "meMessagetext");
            return (Criteria) this;
        }

        public Criteria andMeTitleIsNull() {
            addCriterion("me_title is null");
            return (Criteria) this;
        }

        public Criteria andMeTitleIsNotNull() {
            addCriterion("me_title is not null");
            return (Criteria) this;
        }

        public Criteria andMeTitleEqualTo(String value) {
            addCriterion("me_title =", value, "meTitle");
            return (Criteria) this;
        }

        public Criteria andMeTitleNotEqualTo(String value) {
            addCriterion("me_title <>", value, "meTitle");
            return (Criteria) this;
        }

        public Criteria andMeTitleGreaterThan(String value) {
            addCriterion("me_title >", value, "meTitle");
            return (Criteria) this;
        }

        public Criteria andMeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("me_title >=", value, "meTitle");
            return (Criteria) this;
        }

        public Criteria andMeTitleLessThan(String value) {
            addCriterion("me_title <", value, "meTitle");
            return (Criteria) this;
        }

        public Criteria andMeTitleLessThanOrEqualTo(String value) {
            addCriterion("me_title <=", value, "meTitle");
            return (Criteria) this;
        }

        public Criteria andMeTitleLike(String value) {
            addCriterion("me_title like", value, "meTitle");
            return (Criteria) this;
        }

        public Criteria andMeTitleNotLike(String value) {
            addCriterion("me_title not like", value, "meTitle");
            return (Criteria) this;
        }

        public Criteria andMeTitleIn(List<String> values) {
            addCriterion("me_title in", values, "meTitle");
            return (Criteria) this;
        }

        public Criteria andMeTitleNotIn(List<String> values) {
            addCriterion("me_title not in", values, "meTitle");
            return (Criteria) this;
        }

        public Criteria andMeTitleBetween(String value1, String value2) {
            addCriterion("me_title between", value1, value2, "meTitle");
            return (Criteria) this;
        }

        public Criteria andMeTitleNotBetween(String value1, String value2) {
            addCriterion("me_title not between", value1, value2, "meTitle");
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