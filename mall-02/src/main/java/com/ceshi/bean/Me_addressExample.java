package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class Me_addressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Me_addressExample() {
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

        public Criteria andAdMemberidIsNull() {
            addCriterion("ad_memberid is null");
            return (Criteria) this;
        }

        public Criteria andAdMemberidIsNotNull() {
            addCriterion("ad_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andAdMemberidEqualTo(Integer value) {
            addCriterion("ad_memberid =", value, "adMemberid");
            return (Criteria) this;
        }

        public Criteria andAdMemberidNotEqualTo(Integer value) {
            addCriterion("ad_memberid <>", value, "adMemberid");
            return (Criteria) this;
        }

        public Criteria andAdMemberidGreaterThan(Integer value) {
            addCriterion("ad_memberid >", value, "adMemberid");
            return (Criteria) this;
        }

        public Criteria andAdMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_memberid >=", value, "adMemberid");
            return (Criteria) this;
        }

        public Criteria andAdMemberidLessThan(Integer value) {
            addCriterion("ad_memberid <", value, "adMemberid");
            return (Criteria) this;
        }

        public Criteria andAdMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("ad_memberid <=", value, "adMemberid");
            return (Criteria) this;
        }

        public Criteria andAdMemberidIn(List<Integer> values) {
            addCriterion("ad_memberid in", values, "adMemberid");
            return (Criteria) this;
        }

        public Criteria andAdMemberidNotIn(List<Integer> values) {
            addCriterion("ad_memberid not in", values, "adMemberid");
            return (Criteria) this;
        }

        public Criteria andAdMemberidBetween(Integer value1, Integer value2) {
            addCriterion("ad_memberid between", value1, value2, "adMemberid");
            return (Criteria) this;
        }

        public Criteria andAdMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_memberid not between", value1, value2, "adMemberid");
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

        public Criteria andAdDistrictIsNull() {
            addCriterion("ad_district is null");
            return (Criteria) this;
        }

        public Criteria andAdDistrictIsNotNull() {
            addCriterion("ad_district is not null");
            return (Criteria) this;
        }

        public Criteria andAdDistrictEqualTo(String value) {
            addCriterion("ad_district =", value, "adDistrict");
            return (Criteria) this;
        }

        public Criteria andAdDistrictNotEqualTo(String value) {
            addCriterion("ad_district <>", value, "adDistrict");
            return (Criteria) this;
        }

        public Criteria andAdDistrictGreaterThan(String value) {
            addCriterion("ad_district >", value, "adDistrict");
            return (Criteria) this;
        }

        public Criteria andAdDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("ad_district >=", value, "adDistrict");
            return (Criteria) this;
        }

        public Criteria andAdDistrictLessThan(String value) {
            addCriterion("ad_district <", value, "adDistrict");
            return (Criteria) this;
        }

        public Criteria andAdDistrictLessThanOrEqualTo(String value) {
            addCriterion("ad_district <=", value, "adDistrict");
            return (Criteria) this;
        }

        public Criteria andAdDistrictLike(String value) {
            addCriterion("ad_district like", value, "adDistrict");
            return (Criteria) this;
        }

        public Criteria andAdDistrictNotLike(String value) {
            addCriterion("ad_district not like", value, "adDistrict");
            return (Criteria) this;
        }

        public Criteria andAdDistrictIn(List<String> values) {
            addCriterion("ad_district in", values, "adDistrict");
            return (Criteria) this;
        }

        public Criteria andAdDistrictNotIn(List<String> values) {
            addCriterion("ad_district not in", values, "adDistrict");
            return (Criteria) this;
        }

        public Criteria andAdDistrictBetween(String value1, String value2) {
            addCriterion("ad_district between", value1, value2, "adDistrict");
            return (Criteria) this;
        }

        public Criteria andAdDistrictNotBetween(String value1, String value2) {
            addCriterion("ad_district not between", value1, value2, "adDistrict");
            return (Criteria) this;
        }

        public Criteria andAdAddressIsNull() {
            addCriterion("ad_address is null");
            return (Criteria) this;
        }

        public Criteria andAdAddressIsNotNull() {
            addCriterion("ad_address is not null");
            return (Criteria) this;
        }

        public Criteria andAdAddressEqualTo(String value) {
            addCriterion("ad_address =", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressNotEqualTo(String value) {
            addCriterion("ad_address <>", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressGreaterThan(String value) {
            addCriterion("ad_address >", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ad_address >=", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressLessThan(String value) {
            addCriterion("ad_address <", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressLessThanOrEqualTo(String value) {
            addCriterion("ad_address <=", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressLike(String value) {
            addCriterion("ad_address like", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressNotLike(String value) {
            addCriterion("ad_address not like", value, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressIn(List<String> values) {
            addCriterion("ad_address in", values, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressNotIn(List<String> values) {
            addCriterion("ad_address not in", values, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressBetween(String value1, String value2) {
            addCriterion("ad_address between", value1, value2, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdAddressNotBetween(String value1, String value2) {
            addCriterion("ad_address not between", value1, value2, "adAddress");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeIsNull() {
            addCriterion("ad_zipcode is null");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeIsNotNull() {
            addCriterion("ad_zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeEqualTo(String value) {
            addCriterion("ad_zipcode =", value, "adZipcode");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeNotEqualTo(String value) {
            addCriterion("ad_zipcode <>", value, "adZipcode");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeGreaterThan(String value) {
            addCriterion("ad_zipcode >", value, "adZipcode");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ad_zipcode >=", value, "adZipcode");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeLessThan(String value) {
            addCriterion("ad_zipcode <", value, "adZipcode");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeLessThanOrEqualTo(String value) {
            addCriterion("ad_zipcode <=", value, "adZipcode");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeLike(String value) {
            addCriterion("ad_zipcode like", value, "adZipcode");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeNotLike(String value) {
            addCriterion("ad_zipcode not like", value, "adZipcode");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeIn(List<String> values) {
            addCriterion("ad_zipcode in", values, "adZipcode");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeNotIn(List<String> values) {
            addCriterion("ad_zipcode not in", values, "adZipcode");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeBetween(String value1, String value2) {
            addCriterion("ad_zipcode between", value1, value2, "adZipcode");
            return (Criteria) this;
        }

        public Criteria andAdZipcodeNotBetween(String value1, String value2) {
            addCriterion("ad_zipcode not between", value1, value2, "adZipcode");
            return (Criteria) this;
        }

        public Criteria andAdLabelIsNull() {
            addCriterion("ad_label is null");
            return (Criteria) this;
        }

        public Criteria andAdLabelIsNotNull() {
            addCriterion("ad_label is not null");
            return (Criteria) this;
        }

        public Criteria andAdLabelEqualTo(String value) {
            addCriterion("ad_label =", value, "adLabel");
            return (Criteria) this;
        }

        public Criteria andAdLabelNotEqualTo(String value) {
            addCriterion("ad_label <>", value, "adLabel");
            return (Criteria) this;
        }

        public Criteria andAdLabelGreaterThan(String value) {
            addCriterion("ad_label >", value, "adLabel");
            return (Criteria) this;
        }

        public Criteria andAdLabelGreaterThanOrEqualTo(String value) {
            addCriterion("ad_label >=", value, "adLabel");
            return (Criteria) this;
        }

        public Criteria andAdLabelLessThan(String value) {
            addCriterion("ad_label <", value, "adLabel");
            return (Criteria) this;
        }

        public Criteria andAdLabelLessThanOrEqualTo(String value) {
            addCriterion("ad_label <=", value, "adLabel");
            return (Criteria) this;
        }

        public Criteria andAdLabelLike(String value) {
            addCriterion("ad_label like", value, "adLabel");
            return (Criteria) this;
        }

        public Criteria andAdLabelNotLike(String value) {
            addCriterion("ad_label not like", value, "adLabel");
            return (Criteria) this;
        }

        public Criteria andAdLabelIn(List<String> values) {
            addCriterion("ad_label in", values, "adLabel");
            return (Criteria) this;
        }

        public Criteria andAdLabelNotIn(List<String> values) {
            addCriterion("ad_label not in", values, "adLabel");
            return (Criteria) this;
        }

        public Criteria andAdLabelBetween(String value1, String value2) {
            addCriterion("ad_label between", value1, value2, "adLabel");
            return (Criteria) this;
        }

        public Criteria andAdLabelNotBetween(String value1, String value2) {
            addCriterion("ad_label not between", value1, value2, "adLabel");
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