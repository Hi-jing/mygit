package com.ceshi.bean;

import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andMeWxopenidIsNull() {
            addCriterion("me_wxopenid is null");
            return (Criteria) this;
        }

        public Criteria andMeWxopenidIsNotNull() {
            addCriterion("me_wxopenid is not null");
            return (Criteria) this;
        }

        public Criteria andMeWxopenidEqualTo(String value) {
            addCriterion("me_wxopenid =", value, "meWxopenid");
            return (Criteria) this;
        }

        public Criteria andMeWxopenidNotEqualTo(String value) {
            addCriterion("me_wxopenid <>", value, "meWxopenid");
            return (Criteria) this;
        }

        public Criteria andMeWxopenidGreaterThan(String value) {
            addCriterion("me_wxopenid >", value, "meWxopenid");
            return (Criteria) this;
        }

        public Criteria andMeWxopenidGreaterThanOrEqualTo(String value) {
            addCriterion("me_wxopenid >=", value, "meWxopenid");
            return (Criteria) this;
        }

        public Criteria andMeWxopenidLessThan(String value) {
            addCriterion("me_wxopenid <", value, "meWxopenid");
            return (Criteria) this;
        }

        public Criteria andMeWxopenidLessThanOrEqualTo(String value) {
            addCriterion("me_wxopenid <=", value, "meWxopenid");
            return (Criteria) this;
        }

        public Criteria andMeWxopenidLike(String value) {
            addCriterion("me_wxopenid like", value, "meWxopenid");
            return (Criteria) this;
        }

        public Criteria andMeWxopenidNotLike(String value) {
            addCriterion("me_wxopenid not like", value, "meWxopenid");
            return (Criteria) this;
        }

        public Criteria andMeWxopenidIn(List<String> values) {
            addCriterion("me_wxopenid in", values, "meWxopenid");
            return (Criteria) this;
        }

        public Criteria andMeWxopenidNotIn(List<String> values) {
            addCriterion("me_wxopenid not in", values, "meWxopenid");
            return (Criteria) this;
        }

        public Criteria andMeWxopenidBetween(String value1, String value2) {
            addCriterion("me_wxopenid between", value1, value2, "meWxopenid");
            return (Criteria) this;
        }

        public Criteria andMeWxopenidNotBetween(String value1, String value2) {
            addCriterion("me_wxopenid not between", value1, value2, "meWxopenid");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidIsNull() {
            addCriterion("me_qqopenid is null");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidIsNotNull() {
            addCriterion("me_qqopenid is not null");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidEqualTo(String value) {
            addCriterion("me_qqopenid =", value, "meQqopenid");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidNotEqualTo(String value) {
            addCriterion("me_qqopenid <>", value, "meQqopenid");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidGreaterThan(String value) {
            addCriterion("me_qqopenid >", value, "meQqopenid");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidGreaterThanOrEqualTo(String value) {
            addCriterion("me_qqopenid >=", value, "meQqopenid");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidLessThan(String value) {
            addCriterion("me_qqopenid <", value, "meQqopenid");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidLessThanOrEqualTo(String value) {
            addCriterion("me_qqopenid <=", value, "meQqopenid");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidLike(String value) {
            addCriterion("me_qqopenid like", value, "meQqopenid");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidNotLike(String value) {
            addCriterion("me_qqopenid not like", value, "meQqopenid");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidIn(List<String> values) {
            addCriterion("me_qqopenid in", values, "meQqopenid");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidNotIn(List<String> values) {
            addCriterion("me_qqopenid not in", values, "meQqopenid");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidBetween(String value1, String value2) {
            addCriterion("me_qqopenid between", value1, value2, "meQqopenid");
            return (Criteria) this;
        }

        public Criteria andMeQqopenidNotBetween(String value1, String value2) {
            addCriterion("me_qqopenid not between", value1, value2, "meQqopenid");
            return (Criteria) this;
        }

        public Criteria andMeNameIsNull() {
            addCriterion("me_name is null");
            return (Criteria) this;
        }

        public Criteria andMeNameIsNotNull() {
            addCriterion("me_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeNameEqualTo(String value) {
            addCriterion("me_name =", value, "meName");
            return (Criteria) this;
        }

        public Criteria andMeNameNotEqualTo(String value) {
            addCriterion("me_name <>", value, "meName");
            return (Criteria) this;
        }

        public Criteria andMeNameGreaterThan(String value) {
            addCriterion("me_name >", value, "meName");
            return (Criteria) this;
        }

        public Criteria andMeNameGreaterThanOrEqualTo(String value) {
            addCriterion("me_name >=", value, "meName");
            return (Criteria) this;
        }

        public Criteria andMeNameLessThan(String value) {
            addCriterion("me_name <", value, "meName");
            return (Criteria) this;
        }

        public Criteria andMeNameLessThanOrEqualTo(String value) {
            addCriterion("me_name <=", value, "meName");
            return (Criteria) this;
        }

        public Criteria andMeNameLike(String value) {
            addCriterion("me_name like", value, "meName");
            return (Criteria) this;
        }

        public Criteria andMeNameNotLike(String value) {
            addCriterion("me_name not like", value, "meName");
            return (Criteria) this;
        }

        public Criteria andMeNameIn(List<String> values) {
            addCriterion("me_name in", values, "meName");
            return (Criteria) this;
        }

        public Criteria andMeNameNotIn(List<String> values) {
            addCriterion("me_name not in", values, "meName");
            return (Criteria) this;
        }

        public Criteria andMeNameBetween(String value1, String value2) {
            addCriterion("me_name between", value1, value2, "meName");
            return (Criteria) this;
        }

        public Criteria andMeNameNotBetween(String value1, String value2) {
            addCriterion("me_name not between", value1, value2, "meName");
            return (Criteria) this;
        }

        public Criteria andMeSexIsNull() {
            addCriterion("me_sex is null");
            return (Criteria) this;
        }

        public Criteria andMeSexIsNotNull() {
            addCriterion("me_sex is not null");
            return (Criteria) this;
        }

        public Criteria andMeSexEqualTo(String value) {
            addCriterion("me_sex =", value, "meSex");
            return (Criteria) this;
        }

        public Criteria andMeSexNotEqualTo(String value) {
            addCriterion("me_sex <>", value, "meSex");
            return (Criteria) this;
        }

        public Criteria andMeSexGreaterThan(String value) {
            addCriterion("me_sex >", value, "meSex");
            return (Criteria) this;
        }

        public Criteria andMeSexGreaterThanOrEqualTo(String value) {
            addCriterion("me_sex >=", value, "meSex");
            return (Criteria) this;
        }

        public Criteria andMeSexLessThan(String value) {
            addCriterion("me_sex <", value, "meSex");
            return (Criteria) this;
        }

        public Criteria andMeSexLessThanOrEqualTo(String value) {
            addCriterion("me_sex <=", value, "meSex");
            return (Criteria) this;
        }

        public Criteria andMeSexLike(String value) {
            addCriterion("me_sex like", value, "meSex");
            return (Criteria) this;
        }

        public Criteria andMeSexNotLike(String value) {
            addCriterion("me_sex not like", value, "meSex");
            return (Criteria) this;
        }

        public Criteria andMeSexIn(List<String> values) {
            addCriterion("me_sex in", values, "meSex");
            return (Criteria) this;
        }

        public Criteria andMeSexNotIn(List<String> values) {
            addCriterion("me_sex not in", values, "meSex");
            return (Criteria) this;
        }

        public Criteria andMeSexBetween(String value1, String value2) {
            addCriterion("me_sex between", value1, value2, "meSex");
            return (Criteria) this;
        }

        public Criteria andMeSexNotBetween(String value1, String value2) {
            addCriterion("me_sex not between", value1, value2, "meSex");
            return (Criteria) this;
        }

        public Criteria andMeEmailIsNull() {
            addCriterion("me_email is null");
            return (Criteria) this;
        }

        public Criteria andMeEmailIsNotNull() {
            addCriterion("me_email is not null");
            return (Criteria) this;
        }

        public Criteria andMeEmailEqualTo(String value) {
            addCriterion("me_email =", value, "meEmail");
            return (Criteria) this;
        }

        public Criteria andMeEmailNotEqualTo(String value) {
            addCriterion("me_email <>", value, "meEmail");
            return (Criteria) this;
        }

        public Criteria andMeEmailGreaterThan(String value) {
            addCriterion("me_email >", value, "meEmail");
            return (Criteria) this;
        }

        public Criteria andMeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("me_email >=", value, "meEmail");
            return (Criteria) this;
        }

        public Criteria andMeEmailLessThan(String value) {
            addCriterion("me_email <", value, "meEmail");
            return (Criteria) this;
        }

        public Criteria andMeEmailLessThanOrEqualTo(String value) {
            addCriterion("me_email <=", value, "meEmail");
            return (Criteria) this;
        }

        public Criteria andMeEmailLike(String value) {
            addCriterion("me_email like", value, "meEmail");
            return (Criteria) this;
        }

        public Criteria andMeEmailNotLike(String value) {
            addCriterion("me_email not like", value, "meEmail");
            return (Criteria) this;
        }

        public Criteria andMeEmailIn(List<String> values) {
            addCriterion("me_email in", values, "meEmail");
            return (Criteria) this;
        }

        public Criteria andMeEmailNotIn(List<String> values) {
            addCriterion("me_email not in", values, "meEmail");
            return (Criteria) this;
        }

        public Criteria andMeEmailBetween(String value1, String value2) {
            addCriterion("me_email between", value1, value2, "meEmail");
            return (Criteria) this;
        }

        public Criteria andMeEmailNotBetween(String value1, String value2) {
            addCriterion("me_email not between", value1, value2, "meEmail");
            return (Criteria) this;
        }

        public Criteria andMeRegisterIsNull() {
            addCriterion("me_register is null");
            return (Criteria) this;
        }

        public Criteria andMeRegisterIsNotNull() {
            addCriterion("me_register is not null");
            return (Criteria) this;
        }

        public Criteria andMeRegisterEqualTo(String value) {
            addCriterion("me_register =", value, "meRegister");
            return (Criteria) this;
        }

        public Criteria andMeRegisterNotEqualTo(String value) {
            addCriterion("me_register <>", value, "meRegister");
            return (Criteria) this;
        }

        public Criteria andMeRegisterGreaterThan(String value) {
            addCriterion("me_register >", value, "meRegister");
            return (Criteria) this;
        }

        public Criteria andMeRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("me_register >=", value, "meRegister");
            return (Criteria) this;
        }

        public Criteria andMeRegisterLessThan(String value) {
            addCriterion("me_register <", value, "meRegister");
            return (Criteria) this;
        }

        public Criteria andMeRegisterLessThanOrEqualTo(String value) {
            addCriterion("me_register <=", value, "meRegister");
            return (Criteria) this;
        }

        public Criteria andMeRegisterLike(String value) {
            addCriterion("me_register like", value, "meRegister");
            return (Criteria) this;
        }

        public Criteria andMeRegisterNotLike(String value) {
            addCriterion("me_register not like", value, "meRegister");
            return (Criteria) this;
        }

        public Criteria andMeRegisterIn(List<String> values) {
            addCriterion("me_register in", values, "meRegister");
            return (Criteria) this;
        }

        public Criteria andMeRegisterNotIn(List<String> values) {
            addCriterion("me_register not in", values, "meRegister");
            return (Criteria) this;
        }

        public Criteria andMeRegisterBetween(String value1, String value2) {
            addCriterion("me_register between", value1, value2, "meRegister");
            return (Criteria) this;
        }

        public Criteria andMeRegisterNotBetween(String value1, String value2) {
            addCriterion("me_register not between", value1, value2, "meRegister");
            return (Criteria) this;
        }

        public Criteria andMeLastloginIsNull() {
            addCriterion("me_lastlogin is null");
            return (Criteria) this;
        }

        public Criteria andMeLastloginIsNotNull() {
            addCriterion("me_lastlogin is not null");
            return (Criteria) this;
        }

        public Criteria andMeLastloginEqualTo(String value) {
            addCriterion("me_lastlogin =", value, "meLastlogin");
            return (Criteria) this;
        }

        public Criteria andMeLastloginNotEqualTo(String value) {
            addCriterion("me_lastlogin <>", value, "meLastlogin");
            return (Criteria) this;
        }

        public Criteria andMeLastloginGreaterThan(String value) {
            addCriterion("me_lastlogin >", value, "meLastlogin");
            return (Criteria) this;
        }

        public Criteria andMeLastloginGreaterThanOrEqualTo(String value) {
            addCriterion("me_lastlogin >=", value, "meLastlogin");
            return (Criteria) this;
        }

        public Criteria andMeLastloginLessThan(String value) {
            addCriterion("me_lastlogin <", value, "meLastlogin");
            return (Criteria) this;
        }

        public Criteria andMeLastloginLessThanOrEqualTo(String value) {
            addCriterion("me_lastlogin <=", value, "meLastlogin");
            return (Criteria) this;
        }

        public Criteria andMeLastloginLike(String value) {
            addCriterion("me_lastlogin like", value, "meLastlogin");
            return (Criteria) this;
        }

        public Criteria andMeLastloginNotLike(String value) {
            addCriterion("me_lastlogin not like", value, "meLastlogin");
            return (Criteria) this;
        }

        public Criteria andMeLastloginIn(List<String> values) {
            addCriterion("me_lastlogin in", values, "meLastlogin");
            return (Criteria) this;
        }

        public Criteria andMeLastloginNotIn(List<String> values) {
            addCriterion("me_lastlogin not in", values, "meLastlogin");
            return (Criteria) this;
        }

        public Criteria andMeLastloginBetween(String value1, String value2) {
            addCriterion("me_lastlogin between", value1, value2, "meLastlogin");
            return (Criteria) this;
        }

        public Criteria andMeLastloginNotBetween(String value1, String value2) {
            addCriterion("me_lastlogin not between", value1, value2, "meLastlogin");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressIsNull() {
            addCriterion("me_headaddress is null");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressIsNotNull() {
            addCriterion("me_headaddress is not null");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressEqualTo(String value) {
            addCriterion("me_headaddress =", value, "meHeadaddress");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressNotEqualTo(String value) {
            addCriterion("me_headaddress <>", value, "meHeadaddress");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressGreaterThan(String value) {
            addCriterion("me_headaddress >", value, "meHeadaddress");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressGreaterThanOrEqualTo(String value) {
            addCriterion("me_headaddress >=", value, "meHeadaddress");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressLessThan(String value) {
            addCriterion("me_headaddress <", value, "meHeadaddress");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressLessThanOrEqualTo(String value) {
            addCriterion("me_headaddress <=", value, "meHeadaddress");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressLike(String value) {
            addCriterion("me_headaddress like", value, "meHeadaddress");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressNotLike(String value) {
            addCriterion("me_headaddress not like", value, "meHeadaddress");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressIn(List<String> values) {
            addCriterion("me_headaddress in", values, "meHeadaddress");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressNotIn(List<String> values) {
            addCriterion("me_headaddress not in", values, "meHeadaddress");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressBetween(String value1, String value2) {
            addCriterion("me_headaddress between", value1, value2, "meHeadaddress");
            return (Criteria) this;
        }

        public Criteria andMeHeadaddressNotBetween(String value1, String value2) {
            addCriterion("me_headaddress not between", value1, value2, "meHeadaddress");
            return (Criteria) this;
        }

        public Criteria andMeDistrictIsNull() {
            addCriterion("me_district is null");
            return (Criteria) this;
        }

        public Criteria andMeDistrictIsNotNull() {
            addCriterion("me_district is not null");
            return (Criteria) this;
        }

        public Criteria andMeDistrictEqualTo(String value) {
            addCriterion("me_district =", value, "meDistrict");
            return (Criteria) this;
        }

        public Criteria andMeDistrictNotEqualTo(String value) {
            addCriterion("me_district <>", value, "meDistrict");
            return (Criteria) this;
        }

        public Criteria andMeDistrictGreaterThan(String value) {
            addCriterion("me_district >", value, "meDistrict");
            return (Criteria) this;
        }

        public Criteria andMeDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("me_district >=", value, "meDistrict");
            return (Criteria) this;
        }

        public Criteria andMeDistrictLessThan(String value) {
            addCriterion("me_district <", value, "meDistrict");
            return (Criteria) this;
        }

        public Criteria andMeDistrictLessThanOrEqualTo(String value) {
            addCriterion("me_district <=", value, "meDistrict");
            return (Criteria) this;
        }

        public Criteria andMeDistrictLike(String value) {
            addCriterion("me_district like", value, "meDistrict");
            return (Criteria) this;
        }

        public Criteria andMeDistrictNotLike(String value) {
            addCriterion("me_district not like", value, "meDistrict");
            return (Criteria) this;
        }

        public Criteria andMeDistrictIn(List<String> values) {
            addCriterion("me_district in", values, "meDistrict");
            return (Criteria) this;
        }

        public Criteria andMeDistrictNotIn(List<String> values) {
            addCriterion("me_district not in", values, "meDistrict");
            return (Criteria) this;
        }

        public Criteria andMeDistrictBetween(String value1, String value2) {
            addCriterion("me_district between", value1, value2, "meDistrict");
            return (Criteria) this;
        }

        public Criteria andMeDistrictNotBetween(String value1, String value2) {
            addCriterion("me_district not between", value1, value2, "meDistrict");
            return (Criteria) this;
        }

        public Criteria andMeNicknameIsNull() {
            addCriterion("me_nickname is null");
            return (Criteria) this;
        }

        public Criteria andMeNicknameIsNotNull() {
            addCriterion("me_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andMeNicknameEqualTo(String value) {
            addCriterion("me_nickname =", value, "meNickname");
            return (Criteria) this;
        }

        public Criteria andMeNicknameNotEqualTo(String value) {
            addCriterion("me_nickname <>", value, "meNickname");
            return (Criteria) this;
        }

        public Criteria andMeNicknameGreaterThan(String value) {
            addCriterion("me_nickname >", value, "meNickname");
            return (Criteria) this;
        }

        public Criteria andMeNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("me_nickname >=", value, "meNickname");
            return (Criteria) this;
        }

        public Criteria andMeNicknameLessThan(String value) {
            addCriterion("me_nickname <", value, "meNickname");
            return (Criteria) this;
        }

        public Criteria andMeNicknameLessThanOrEqualTo(String value) {
            addCriterion("me_nickname <=", value, "meNickname");
            return (Criteria) this;
        }

        public Criteria andMeNicknameLike(String value) {
            addCriterion("me_nickname like", value, "meNickname");
            return (Criteria) this;
        }

        public Criteria andMeNicknameNotLike(String value) {
            addCriterion("me_nickname not like", value, "meNickname");
            return (Criteria) this;
        }

        public Criteria andMeNicknameIn(List<String> values) {
            addCriterion("me_nickname in", values, "meNickname");
            return (Criteria) this;
        }

        public Criteria andMeNicknameNotIn(List<String> values) {
            addCriterion("me_nickname not in", values, "meNickname");
            return (Criteria) this;
        }

        public Criteria andMeNicknameBetween(String value1, String value2) {
            addCriterion("me_nickname between", value1, value2, "meNickname");
            return (Criteria) this;
        }

        public Criteria andMeNicknameNotBetween(String value1, String value2) {
            addCriterion("me_nickname not between", value1, value2, "meNickname");
            return (Criteria) this;
        }

        public Criteria andMePhoneIsNull() {
            addCriterion("me_phone is null");
            return (Criteria) this;
        }

        public Criteria andMePhoneIsNotNull() {
            addCriterion("me_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMePhoneEqualTo(String value) {
            addCriterion("me_phone =", value, "mePhone");
            return (Criteria) this;
        }

        public Criteria andMePhoneNotEqualTo(String value) {
            addCriterion("me_phone <>", value, "mePhone");
            return (Criteria) this;
        }

        public Criteria andMePhoneGreaterThan(String value) {
            addCriterion("me_phone >", value, "mePhone");
            return (Criteria) this;
        }

        public Criteria andMePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("me_phone >=", value, "mePhone");
            return (Criteria) this;
        }

        public Criteria andMePhoneLessThan(String value) {
            addCriterion("me_phone <", value, "mePhone");
            return (Criteria) this;
        }

        public Criteria andMePhoneLessThanOrEqualTo(String value) {
            addCriterion("me_phone <=", value, "mePhone");
            return (Criteria) this;
        }

        public Criteria andMePhoneLike(String value) {
            addCriterion("me_phone like", value, "mePhone");
            return (Criteria) this;
        }

        public Criteria andMePhoneNotLike(String value) {
            addCriterion("me_phone not like", value, "mePhone");
            return (Criteria) this;
        }

        public Criteria andMePhoneIn(List<String> values) {
            addCriterion("me_phone in", values, "mePhone");
            return (Criteria) this;
        }

        public Criteria andMePhoneNotIn(List<String> values) {
            addCriterion("me_phone not in", values, "mePhone");
            return (Criteria) this;
        }

        public Criteria andMePhoneBetween(String value1, String value2) {
            addCriterion("me_phone between", value1, value2, "mePhone");
            return (Criteria) this;
        }

        public Criteria andMePhoneNotBetween(String value1, String value2) {
            addCriterion("me_phone not between", value1, value2, "mePhone");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayIsNull() {
            addCriterion("me_brithday is null");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayIsNotNull() {
            addCriterion("me_brithday is not null");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayEqualTo(String value) {
            addCriterion("me_brithday =", value, "meBrithday");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayNotEqualTo(String value) {
            addCriterion("me_brithday <>", value, "meBrithday");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayGreaterThan(String value) {
            addCriterion("me_brithday >", value, "meBrithday");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayGreaterThanOrEqualTo(String value) {
            addCriterion("me_brithday >=", value, "meBrithday");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayLessThan(String value) {
            addCriterion("me_brithday <", value, "meBrithday");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayLessThanOrEqualTo(String value) {
            addCriterion("me_brithday <=", value, "meBrithday");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayLike(String value) {
            addCriterion("me_brithday like", value, "meBrithday");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayNotLike(String value) {
            addCriterion("me_brithday not like", value, "meBrithday");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayIn(List<String> values) {
            addCriterion("me_brithday in", values, "meBrithday");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayNotIn(List<String> values) {
            addCriterion("me_brithday not in", values, "meBrithday");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayBetween(String value1, String value2) {
            addCriterion("me_brithday between", value1, value2, "meBrithday");
            return (Criteria) this;
        }

        public Criteria andMeBrithdayNotBetween(String value1, String value2) {
            addCriterion("me_brithday not between", value1, value2, "meBrithday");
            return (Criteria) this;
        }

        public Criteria andMeLoyaltyIsNull() {
            addCriterion("me_loyalty is null");
            return (Criteria) this;
        }

        public Criteria andMeLoyaltyIsNotNull() {
            addCriterion("me_loyalty is not null");
            return (Criteria) this;
        }

        public Criteria andMeLoyaltyEqualTo(Integer value) {
            addCriterion("me_loyalty =", value, "meLoyalty");
            return (Criteria) this;
        }

        public Criteria andMeLoyaltyNotEqualTo(Integer value) {
            addCriterion("me_loyalty <>", value, "meLoyalty");
            return (Criteria) this;
        }

        public Criteria andMeLoyaltyGreaterThan(Integer value) {
            addCriterion("me_loyalty >", value, "meLoyalty");
            return (Criteria) this;
        }

        public Criteria andMeLoyaltyGreaterThanOrEqualTo(Integer value) {
            addCriterion("me_loyalty >=", value, "meLoyalty");
            return (Criteria) this;
        }

        public Criteria andMeLoyaltyLessThan(Integer value) {
            addCriterion("me_loyalty <", value, "meLoyalty");
            return (Criteria) this;
        }

        public Criteria andMeLoyaltyLessThanOrEqualTo(Integer value) {
            addCriterion("me_loyalty <=", value, "meLoyalty");
            return (Criteria) this;
        }

        public Criteria andMeLoyaltyIn(List<Integer> values) {
            addCriterion("me_loyalty in", values, "meLoyalty");
            return (Criteria) this;
        }

        public Criteria andMeLoyaltyNotIn(List<Integer> values) {
            addCriterion("me_loyalty not in", values, "meLoyalty");
            return (Criteria) this;
        }

        public Criteria andMeLoyaltyBetween(Integer value1, Integer value2) {
            addCriterion("me_loyalty between", value1, value2, "meLoyalty");
            return (Criteria) this;
        }

        public Criteria andMeLoyaltyNotBetween(Integer value1, Integer value2) {
            addCriterion("me_loyalty not between", value1, value2, "meLoyalty");
            return (Criteria) this;
        }

        public Criteria andMePasswordIsNull() {
            addCriterion("me_password is null");
            return (Criteria) this;
        }

        public Criteria andMePasswordIsNotNull() {
            addCriterion("me_password is not null");
            return (Criteria) this;
        }

        public Criteria andMePasswordEqualTo(String value) {
            addCriterion("me_password =", value, "mePassword");
            return (Criteria) this;
        }

        public Criteria andMePasswordNotEqualTo(String value) {
            addCriterion("me_password <>", value, "mePassword");
            return (Criteria) this;
        }

        public Criteria andMePasswordGreaterThan(String value) {
            addCriterion("me_password >", value, "mePassword");
            return (Criteria) this;
        }

        public Criteria andMePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("me_password >=", value, "mePassword");
            return (Criteria) this;
        }

        public Criteria andMePasswordLessThan(String value) {
            addCriterion("me_password <", value, "mePassword");
            return (Criteria) this;
        }

        public Criteria andMePasswordLessThanOrEqualTo(String value) {
            addCriterion("me_password <=", value, "mePassword");
            return (Criteria) this;
        }

        public Criteria andMePasswordLike(String value) {
            addCriterion("me_password like", value, "mePassword");
            return (Criteria) this;
        }

        public Criteria andMePasswordNotLike(String value) {
            addCriterion("me_password not like", value, "mePassword");
            return (Criteria) this;
        }

        public Criteria andMePasswordIn(List<String> values) {
            addCriterion("me_password in", values, "mePassword");
            return (Criteria) this;
        }

        public Criteria andMePasswordNotIn(List<String> values) {
            addCriterion("me_password not in", values, "mePassword");
            return (Criteria) this;
        }

        public Criteria andMePasswordBetween(String value1, String value2) {
            addCriterion("me_password between", value1, value2, "mePassword");
            return (Criteria) this;
        }

        public Criteria andMePasswordNotBetween(String value1, String value2) {
            addCriterion("me_password not between", value1, value2, "mePassword");
            return (Criteria) this;
        }

        public Criteria andMeIdentityIsNull() {
            addCriterion("me_identity is null");
            return (Criteria) this;
        }

        public Criteria andMeIdentityIsNotNull() {
            addCriterion("me_identity is not null");
            return (Criteria) this;
        }

        public Criteria andMeIdentityEqualTo(String value) {
            addCriterion("me_identity =", value, "meIdentity");
            return (Criteria) this;
        }

        public Criteria andMeIdentityNotEqualTo(String value) {
            addCriterion("me_identity <>", value, "meIdentity");
            return (Criteria) this;
        }

        public Criteria andMeIdentityGreaterThan(String value) {
            addCriterion("me_identity >", value, "meIdentity");
            return (Criteria) this;
        }

        public Criteria andMeIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("me_identity >=", value, "meIdentity");
            return (Criteria) this;
        }

        public Criteria andMeIdentityLessThan(String value) {
            addCriterion("me_identity <", value, "meIdentity");
            return (Criteria) this;
        }

        public Criteria andMeIdentityLessThanOrEqualTo(String value) {
            addCriterion("me_identity <=", value, "meIdentity");
            return (Criteria) this;
        }

        public Criteria andMeIdentityLike(String value) {
            addCriterion("me_identity like", value, "meIdentity");
            return (Criteria) this;
        }

        public Criteria andMeIdentityNotLike(String value) {
            addCriterion("me_identity not like", value, "meIdentity");
            return (Criteria) this;
        }

        public Criteria andMeIdentityIn(List<String> values) {
            addCriterion("me_identity in", values, "meIdentity");
            return (Criteria) this;
        }

        public Criteria andMeIdentityNotIn(List<String> values) {
            addCriterion("me_identity not in", values, "meIdentity");
            return (Criteria) this;
        }

        public Criteria andMeIdentityBetween(String value1, String value2) {
            addCriterion("me_identity between", value1, value2, "meIdentity");
            return (Criteria) this;
        }

        public Criteria andMeIdentityNotBetween(String value1, String value2) {
            addCriterion("me_identity not between", value1, value2, "meIdentity");
            return (Criteria) this;
        }

        public Criteria andMeLevelidIsNull() {
            addCriterion("me_levelid is null");
            return (Criteria) this;
        }

        public Criteria andMeLevelidIsNotNull() {
            addCriterion("me_levelid is not null");
            return (Criteria) this;
        }

        public Criteria andMeLevelidEqualTo(Integer value) {
            addCriterion("me_levelid =", value, "meLevelid");
            return (Criteria) this;
        }

        public Criteria andMeLevelidNotEqualTo(Integer value) {
            addCriterion("me_levelid <>", value, "meLevelid");
            return (Criteria) this;
        }

        public Criteria andMeLevelidGreaterThan(Integer value) {
            addCriterion("me_levelid >", value, "meLevelid");
            return (Criteria) this;
        }

        public Criteria andMeLevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("me_levelid >=", value, "meLevelid");
            return (Criteria) this;
        }

        public Criteria andMeLevelidLessThan(Integer value) {
            addCriterion("me_levelid <", value, "meLevelid");
            return (Criteria) this;
        }

        public Criteria andMeLevelidLessThanOrEqualTo(Integer value) {
            addCriterion("me_levelid <=", value, "meLevelid");
            return (Criteria) this;
        }

        public Criteria andMeLevelidIn(List<Integer> values) {
            addCriterion("me_levelid in", values, "meLevelid");
            return (Criteria) this;
        }

        public Criteria andMeLevelidNotIn(List<Integer> values) {
            addCriterion("me_levelid not in", values, "meLevelid");
            return (Criteria) this;
        }

        public Criteria andMeLevelidBetween(Integer value1, Integer value2) {
            addCriterion("me_levelid between", value1, value2, "meLevelid");
            return (Criteria) this;
        }

        public Criteria andMeLevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("me_levelid not between", value1, value2, "meLevelid");
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