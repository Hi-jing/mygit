package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class AdministratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdministratorExample() {
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

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(Integer value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(Integer value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(Integer value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(Integer value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Integer value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<Integer> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<Integer> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(Integer value1, Integer value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdUsernameIsNull() {
            addCriterion("ad_username is null");
            return (Criteria) this;
        }

        public Criteria andAdUsernameIsNotNull() {
            addCriterion("ad_username is not null");
            return (Criteria) this;
        }

        public Criteria andAdUsernameEqualTo(String value) {
            addCriterion("ad_username =", value, "adUsername");
            return (Criteria) this;
        }

        public Criteria andAdUsernameNotEqualTo(String value) {
            addCriterion("ad_username <>", value, "adUsername");
            return (Criteria) this;
        }

        public Criteria andAdUsernameGreaterThan(String value) {
            addCriterion("ad_username >", value, "adUsername");
            return (Criteria) this;
        }

        public Criteria andAdUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("ad_username >=", value, "adUsername");
            return (Criteria) this;
        }

        public Criteria andAdUsernameLessThan(String value) {
            addCriterion("ad_username <", value, "adUsername");
            return (Criteria) this;
        }

        public Criteria andAdUsernameLessThanOrEqualTo(String value) {
            addCriterion("ad_username <=", value, "adUsername");
            return (Criteria) this;
        }

        public Criteria andAdUsernameLike(String value) {
            addCriterion("ad_username like", value, "adUsername");
            return (Criteria) this;
        }

        public Criteria andAdUsernameNotLike(String value) {
            addCriterion("ad_username not like", value, "adUsername");
            return (Criteria) this;
        }

        public Criteria andAdUsernameIn(List<String> values) {
            addCriterion("ad_username in", values, "adUsername");
            return (Criteria) this;
        }

        public Criteria andAdUsernameNotIn(List<String> values) {
            addCriterion("ad_username not in", values, "adUsername");
            return (Criteria) this;
        }

        public Criteria andAdUsernameBetween(String value1, String value2) {
            addCriterion("ad_username between", value1, value2, "adUsername");
            return (Criteria) this;
        }

        public Criteria andAdUsernameNotBetween(String value1, String value2) {
            addCriterion("ad_username not between", value1, value2, "adUsername");
            return (Criteria) this;
        }

        public Criteria andAdPasswordIsNull() {
            addCriterion("ad_password is null");
            return (Criteria) this;
        }

        public Criteria andAdPasswordIsNotNull() {
            addCriterion("ad_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdPasswordEqualTo(String value) {
            addCriterion("ad_password =", value, "adPassword");
            return (Criteria) this;
        }

        public Criteria andAdPasswordNotEqualTo(String value) {
            addCriterion("ad_password <>", value, "adPassword");
            return (Criteria) this;
        }

        public Criteria andAdPasswordGreaterThan(String value) {
            addCriterion("ad_password >", value, "adPassword");
            return (Criteria) this;
        }

        public Criteria andAdPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ad_password >=", value, "adPassword");
            return (Criteria) this;
        }

        public Criteria andAdPasswordLessThan(String value) {
            addCriterion("ad_password <", value, "adPassword");
            return (Criteria) this;
        }

        public Criteria andAdPasswordLessThanOrEqualTo(String value) {
            addCriterion("ad_password <=", value, "adPassword");
            return (Criteria) this;
        }

        public Criteria andAdPasswordLike(String value) {
            addCriterion("ad_password like", value, "adPassword");
            return (Criteria) this;
        }

        public Criteria andAdPasswordNotLike(String value) {
            addCriterion("ad_password not like", value, "adPassword");
            return (Criteria) this;
        }

        public Criteria andAdPasswordIn(List<String> values) {
            addCriterion("ad_password in", values, "adPassword");
            return (Criteria) this;
        }

        public Criteria andAdPasswordNotIn(List<String> values) {
            addCriterion("ad_password not in", values, "adPassword");
            return (Criteria) this;
        }

        public Criteria andAdPasswordBetween(String value1, String value2) {
            addCriterion("ad_password between", value1, value2, "adPassword");
            return (Criteria) this;
        }

        public Criteria andAdPasswordNotBetween(String value1, String value2) {
            addCriterion("ad_password not between", value1, value2, "adPassword");
            return (Criteria) this;
        }

        public Criteria andAdPhoneIsNull() {
            addCriterion("ad_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdPhoneIsNotNull() {
            addCriterion("ad_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdPhoneEqualTo(String value) {
            addCriterion("ad_phone =", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotEqualTo(String value) {
            addCriterion("ad_phone <>", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneGreaterThan(String value) {
            addCriterion("ad_phone >", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ad_phone >=", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneLessThan(String value) {
            addCriterion("ad_phone <", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneLessThanOrEqualTo(String value) {
            addCriterion("ad_phone <=", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneLike(String value) {
            addCriterion("ad_phone like", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotLike(String value) {
            addCriterion("ad_phone not like", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneIn(List<String> values) {
            addCriterion("ad_phone in", values, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotIn(List<String> values) {
            addCriterion("ad_phone not in", values, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneBetween(String value1, String value2) {
            addCriterion("ad_phone between", value1, value2, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotBetween(String value1, String value2) {
            addCriterion("ad_phone not between", value1, value2, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdEmailIsNull() {
            addCriterion("ad_email is null");
            return (Criteria) this;
        }

        public Criteria andAdEmailIsNotNull() {
            addCriterion("ad_email is not null");
            return (Criteria) this;
        }

        public Criteria andAdEmailEqualTo(String value) {
            addCriterion("ad_email =", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailNotEqualTo(String value) {
            addCriterion("ad_email <>", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailGreaterThan(String value) {
            addCriterion("ad_email >", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ad_email >=", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailLessThan(String value) {
            addCriterion("ad_email <", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailLessThanOrEqualTo(String value) {
            addCriterion("ad_email <=", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailLike(String value) {
            addCriterion("ad_email like", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailNotLike(String value) {
            addCriterion("ad_email not like", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailIn(List<String> values) {
            addCriterion("ad_email in", values, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailNotIn(List<String> values) {
            addCriterion("ad_email not in", values, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailBetween(String value1, String value2) {
            addCriterion("ad_email between", value1, value2, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailNotBetween(String value1, String value2) {
            addCriterion("ad_email not between", value1, value2, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdDateIsNull() {
            addCriterion("ad_date is null");
            return (Criteria) this;
        }

        public Criteria andAdDateIsNotNull() {
            addCriterion("ad_date is not null");
            return (Criteria) this;
        }

        public Criteria andAdDateEqualTo(String value) {
            addCriterion("ad_date =", value, "adDate");
            return (Criteria) this;
        }

        public Criteria andAdDateNotEqualTo(String value) {
            addCriterion("ad_date <>", value, "adDate");
            return (Criteria) this;
        }

        public Criteria andAdDateGreaterThan(String value) {
            addCriterion("ad_date >", value, "adDate");
            return (Criteria) this;
        }

        public Criteria andAdDateGreaterThanOrEqualTo(String value) {
            addCriterion("ad_date >=", value, "adDate");
            return (Criteria) this;
        }

        public Criteria andAdDateLessThan(String value) {
            addCriterion("ad_date <", value, "adDate");
            return (Criteria) this;
        }

        public Criteria andAdDateLessThanOrEqualTo(String value) {
            addCriterion("ad_date <=", value, "adDate");
            return (Criteria) this;
        }

        public Criteria andAdDateLike(String value) {
            addCriterion("ad_date like", value, "adDate");
            return (Criteria) this;
        }

        public Criteria andAdDateNotLike(String value) {
            addCriterion("ad_date not like", value, "adDate");
            return (Criteria) this;
        }

        public Criteria andAdDateIn(List<String> values) {
            addCriterion("ad_date in", values, "adDate");
            return (Criteria) this;
        }

        public Criteria andAdDateNotIn(List<String> values) {
            addCriterion("ad_date not in", values, "adDate");
            return (Criteria) this;
        }

        public Criteria andAdDateBetween(String value1, String value2) {
            addCriterion("ad_date between", value1, value2, "adDate");
            return (Criteria) this;
        }

        public Criteria andAdDateNotBetween(String value1, String value2) {
            addCriterion("ad_date not between", value1, value2, "adDate");
            return (Criteria) this;
        }

        public Criteria andAdStateIsNull() {
            addCriterion("ad_state is null");
            return (Criteria) this;
        }

        public Criteria andAdStateIsNotNull() {
            addCriterion("ad_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdStateEqualTo(Integer value) {
            addCriterion("ad_state =", value, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateNotEqualTo(Integer value) {
            addCriterion("ad_state <>", value, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateGreaterThan(Integer value) {
            addCriterion("ad_state >", value, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_state >=", value, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateLessThan(Integer value) {
            addCriterion("ad_state <", value, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateLessThanOrEqualTo(Integer value) {
            addCriterion("ad_state <=", value, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateIn(List<Integer> values) {
            addCriterion("ad_state in", values, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateNotIn(List<Integer> values) {
            addCriterion("ad_state not in", values, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateBetween(Integer value1, Integer value2) {
            addCriterion("ad_state between", value1, value2, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_state not between", value1, value2, "adState");
            return (Criteria) this;
        }

        public Criteria andAdLevelIsNull() {
            addCriterion("ad_level is null");
            return (Criteria) this;
        }

        public Criteria andAdLevelIsNotNull() {
            addCriterion("ad_level is not null");
            return (Criteria) this;
        }

        public Criteria andAdLevelEqualTo(Integer value) {
            addCriterion("ad_level =", value, "adLevel");
            return (Criteria) this;
        }

        public Criteria andAdLevelNotEqualTo(Integer value) {
            addCriterion("ad_level <>", value, "adLevel");
            return (Criteria) this;
        }

        public Criteria andAdLevelGreaterThan(Integer value) {
            addCriterion("ad_level >", value, "adLevel");
            return (Criteria) this;
        }

        public Criteria andAdLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_level >=", value, "adLevel");
            return (Criteria) this;
        }

        public Criteria andAdLevelLessThan(Integer value) {
            addCriterion("ad_level <", value, "adLevel");
            return (Criteria) this;
        }

        public Criteria andAdLevelLessThanOrEqualTo(Integer value) {
            addCriterion("ad_level <=", value, "adLevel");
            return (Criteria) this;
        }

        public Criteria andAdLevelIn(List<Integer> values) {
            addCriterion("ad_level in", values, "adLevel");
            return (Criteria) this;
        }

        public Criteria andAdLevelNotIn(List<Integer> values) {
            addCriterion("ad_level not in", values, "adLevel");
            return (Criteria) this;
        }

        public Criteria andAdLevelBetween(Integer value1, Integer value2) {
            addCriterion("ad_level between", value1, value2, "adLevel");
            return (Criteria) this;
        }

        public Criteria andAdLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_level not between", value1, value2, "adLevel");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNull() {
            addCriterion("ad_name is null");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNotNull() {
            addCriterion("ad_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdNameEqualTo(String value) {
            addCriterion("ad_name =", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotEqualTo(String value) {
            addCriterion("ad_name <>", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThan(String value) {
            addCriterion("ad_name >", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThanOrEqualTo(String value) {
            addCriterion("ad_name >=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThan(String value) {
            addCriterion("ad_name <", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThanOrEqualTo(String value) {
            addCriterion("ad_name <=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLike(String value) {
            addCriterion("ad_name like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotLike(String value) {
            addCriterion("ad_name not like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameIn(List<String> values) {
            addCriterion("ad_name in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotIn(List<String> values) {
            addCriterion("ad_name not in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameBetween(String value1, String value2) {
            addCriterion("ad_name between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotBetween(String value1, String value2) {
            addCriterion("ad_name not between", value1, value2, "adName");
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