package com.ceying.chx.cpi.base.rm.org.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LoginUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoginUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNull() {
            addCriterion("LAST_LOGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNotNull() {
            addCriterion("LAST_LOGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateEqualTo(BigDecimal value) {
            addCriterion("LAST_LOGIN_DATE =", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotEqualTo(BigDecimal value) {
            addCriterion("LAST_LOGIN_DATE <>", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThan(BigDecimal value) {
            addCriterion("LAST_LOGIN_DATE >", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_LOGIN_DATE >=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThan(BigDecimal value) {
            addCriterion("LAST_LOGIN_DATE <", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_LOGIN_DATE <=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIn(List<BigDecimal> values) {
            addCriterion("LAST_LOGIN_DATE in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotIn(List<BigDecimal> values) {
            addCriterion("LAST_LOGIN_DATE not in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_LOGIN_DATE between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_LOGIN_DATE not between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("LAST_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("LAST_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(BigDecimal value) {
            addCriterion("LAST_LOGIN_TIME =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(BigDecimal value) {
            addCriterion("LAST_LOGIN_TIME <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(BigDecimal value) {
            addCriterion("LAST_LOGIN_TIME >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_LOGIN_TIME >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(BigDecimal value) {
            addCriterion("LAST_LOGIN_TIME <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_LOGIN_TIME <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<BigDecimal> values) {
            addCriterion("LAST_LOGIN_TIME in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<BigDecimal> values) {
            addCriterion("LAST_LOGIN_TIME not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_LOGIN_TIME between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_LOGIN_TIME not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("LAST_LOGIN_IP is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("LAST_LOGIN_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("LAST_LOGIN_IP =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("LAST_LOGIN_IP <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("LAST_LOGIN_IP >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_IP >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("LAST_LOGIN_IP <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_IP <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("LAST_LOGIN_IP like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("LAST_LOGIN_IP not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("LAST_LOGIN_IP in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("LAST_LOGIN_IP not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_IP between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_IP not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesIsNull() {
            addCriterion("LOGIN_FAIL_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesIsNotNull() {
            addCriterion("LOGIN_FAIL_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesEqualTo(BigDecimal value) {
            addCriterion("LOGIN_FAIL_TIMES =", value, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesNotEqualTo(BigDecimal value) {
            addCriterion("LOGIN_FAIL_TIMES <>", value, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesGreaterThan(BigDecimal value) {
            addCriterion("LOGIN_FAIL_TIMES >", value, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGIN_FAIL_TIMES >=", value, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesLessThan(BigDecimal value) {
            addCriterion("LOGIN_FAIL_TIMES <", value, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGIN_FAIL_TIMES <=", value, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesIn(List<BigDecimal> values) {
            addCriterion("LOGIN_FAIL_TIMES in", values, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesNotIn(List<BigDecimal> values) {
            addCriterion("LOGIN_FAIL_TIMES not in", values, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGIN_FAIL_TIMES between", value1, value2, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFailTimesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGIN_FAIL_TIMES not between", value1, value2, "loginFailTimes");
            return (Criteria) this;
        }

        public Criteria andLastFailDateIsNull() {
            addCriterion("LAST_FAIL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastFailDateIsNotNull() {
            addCriterion("LAST_FAIL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastFailDateEqualTo(BigDecimal value) {
            addCriterion("LAST_FAIL_DATE =", value, "lastFailDate");
            return (Criteria) this;
        }

        public Criteria andLastFailDateNotEqualTo(BigDecimal value) {
            addCriterion("LAST_FAIL_DATE <>", value, "lastFailDate");
            return (Criteria) this;
        }

        public Criteria andLastFailDateGreaterThan(BigDecimal value) {
            addCriterion("LAST_FAIL_DATE >", value, "lastFailDate");
            return (Criteria) this;
        }

        public Criteria andLastFailDateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_FAIL_DATE >=", value, "lastFailDate");
            return (Criteria) this;
        }

        public Criteria andLastFailDateLessThan(BigDecimal value) {
            addCriterion("LAST_FAIL_DATE <", value, "lastFailDate");
            return (Criteria) this;
        }

        public Criteria andLastFailDateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_FAIL_DATE <=", value, "lastFailDate");
            return (Criteria) this;
        }

        public Criteria andLastFailDateIn(List<BigDecimal> values) {
            addCriterion("LAST_FAIL_DATE in", values, "lastFailDate");
            return (Criteria) this;
        }

        public Criteria andLastFailDateNotIn(List<BigDecimal> values) {
            addCriterion("LAST_FAIL_DATE not in", values, "lastFailDate");
            return (Criteria) this;
        }

        public Criteria andLastFailDateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_FAIL_DATE between", value1, value2, "lastFailDate");
            return (Criteria) this;
        }

        public Criteria andLastFailDateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_FAIL_DATE not between", value1, value2, "lastFailDate");
            return (Criteria) this;
        }

        public Criteria andExtFieldIsNull() {
            addCriterion("EXT_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andExtFieldIsNotNull() {
            addCriterion("EXT_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andExtFieldEqualTo(String value) {
            addCriterion("EXT_FIELD =", value, "extField");
            return (Criteria) this;
        }

        public Criteria andExtFieldNotEqualTo(String value) {
            addCriterion("EXT_FIELD <>", value, "extField");
            return (Criteria) this;
        }

        public Criteria andExtFieldGreaterThan(String value) {
            addCriterion("EXT_FIELD >", value, "extField");
            return (Criteria) this;
        }

        public Criteria andExtFieldGreaterThanOrEqualTo(String value) {
            addCriterion("EXT_FIELD >=", value, "extField");
            return (Criteria) this;
        }

        public Criteria andExtFieldLessThan(String value) {
            addCriterion("EXT_FIELD <", value, "extField");
            return (Criteria) this;
        }

        public Criteria andExtFieldLessThanOrEqualTo(String value) {
            addCriterion("EXT_FIELD <=", value, "extField");
            return (Criteria) this;
        }

        public Criteria andExtFieldLike(String value) {
            addCriterion("EXT_FIELD like", value, "extField");
            return (Criteria) this;
        }

        public Criteria andExtFieldNotLike(String value) {
            addCriterion("EXT_FIELD not like", value, "extField");
            return (Criteria) this;
        }

        public Criteria andExtFieldIn(List<String> values) {
            addCriterion("EXT_FIELD in", values, "extField");
            return (Criteria) this;
        }

        public Criteria andExtFieldNotIn(List<String> values) {
            addCriterion("EXT_FIELD not in", values, "extField");
            return (Criteria) this;
        }

        public Criteria andExtFieldBetween(String value1, String value2) {
            addCriterion("EXT_FIELD between", value1, value2, "extField");
            return (Criteria) this;
        }

        public Criteria andExtFieldNotBetween(String value1, String value2) {
            addCriterion("EXT_FIELD not between", value1, value2, "extField");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(BigDecimal value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(BigDecimal value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(BigDecimal value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(BigDecimal value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<BigDecimal> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<BigDecimal> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("ORG_ID like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("ORG_ID not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameIsNull() {
            addCriterion("TENANT_CNSHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameIsNotNull() {
            addCriterion("TENANT_CNSHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameEqualTo(String value) {
            addCriterion("TENANT_CNSHORTNAME =", value, "tenantCnshortname");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameNotEqualTo(String value) {
            addCriterion("TENANT_CNSHORTNAME <>", value, "tenantCnshortname");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameGreaterThan(String value) {
            addCriterion("TENANT_CNSHORTNAME >", value, "tenantCnshortname");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_CNSHORTNAME >=", value, "tenantCnshortname");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameLessThan(String value) {
            addCriterion("TENANT_CNSHORTNAME <", value, "tenantCnshortname");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameLessThanOrEqualTo(String value) {
            addCriterion("TENANT_CNSHORTNAME <=", value, "tenantCnshortname");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameLike(String value) {
            addCriterion("TENANT_CNSHORTNAME like", value, "tenantCnshortname");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameNotLike(String value) {
            addCriterion("TENANT_CNSHORTNAME not like", value, "tenantCnshortname");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameIn(List<String> values) {
            addCriterion("TENANT_CNSHORTNAME in", values, "tenantCnshortname");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameNotIn(List<String> values) {
            addCriterion("TENANT_CNSHORTNAME not in", values, "tenantCnshortname");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameBetween(String value1, String value2) {
            addCriterion("TENANT_CNSHORTNAME between", value1, value2, "tenantCnshortname");
            return (Criteria) this;
        }

        public Criteria andTenantCnshortnameNotBetween(String value1, String value2) {
            addCriterion("TENANT_CNSHORTNAME not between", value1, value2, "tenantCnshortname");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameIsNull() {
            addCriterion("TENANT_SHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameIsNotNull() {
            addCriterion("TENANT_SHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameEqualTo(String value) {
            addCriterion("TENANT_SHORTNAME =", value, "tenantShortname");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameNotEqualTo(String value) {
            addCriterion("TENANT_SHORTNAME <>", value, "tenantShortname");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameGreaterThan(String value) {
            addCriterion("TENANT_SHORTNAME >", value, "tenantShortname");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_SHORTNAME >=", value, "tenantShortname");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameLessThan(String value) {
            addCriterion("TENANT_SHORTNAME <", value, "tenantShortname");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameLessThanOrEqualTo(String value) {
            addCriterion("TENANT_SHORTNAME <=", value, "tenantShortname");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameLike(String value) {
            addCriterion("TENANT_SHORTNAME like", value, "tenantShortname");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameNotLike(String value) {
            addCriterion("TENANT_SHORTNAME not like", value, "tenantShortname");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameIn(List<String> values) {
            addCriterion("TENANT_SHORTNAME in", values, "tenantShortname");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameNotIn(List<String> values) {
            addCriterion("TENANT_SHORTNAME not in", values, "tenantShortname");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameBetween(String value1, String value2) {
            addCriterion("TENANT_SHORTNAME between", value1, value2, "tenantShortname");
            return (Criteria) this;
        }

        public Criteria andTenantShortnameNotBetween(String value1, String value2) {
            addCriterion("TENANT_SHORTNAME not between", value1, value2, "tenantShortname");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andCCredentialsIsNull() {
            addCriterion("C_CREDENTIALS is null");
            return (Criteria) this;
        }

        public Criteria andCCredentialsIsNotNull() {
            addCriterion("C_CREDENTIALS is not null");
            return (Criteria) this;
        }

        public Criteria andCCredentialsEqualTo(String value) {
            addCriterion("C_CREDENTIALS =", value, "cCredentials");
            return (Criteria) this;
        }

        public Criteria andCCredentialsNotEqualTo(String value) {
            addCriterion("C_CREDENTIALS <>", value, "cCredentials");
            return (Criteria) this;
        }

        public Criteria andCCredentialsGreaterThan(String value) {
            addCriterion("C_CREDENTIALS >", value, "cCredentials");
            return (Criteria) this;
        }

        public Criteria andCCredentialsGreaterThanOrEqualTo(String value) {
            addCriterion("C_CREDENTIALS >=", value, "cCredentials");
            return (Criteria) this;
        }

        public Criteria andCCredentialsLessThan(String value) {
            addCriterion("C_CREDENTIALS <", value, "cCredentials");
            return (Criteria) this;
        }

        public Criteria andCCredentialsLessThanOrEqualTo(String value) {
            addCriterion("C_CREDENTIALS <=", value, "cCredentials");
            return (Criteria) this;
        }

        public Criteria andCCredentialsLike(String value) {
            addCriterion("C_CREDENTIALS like", value, "cCredentials");
            return (Criteria) this;
        }

        public Criteria andCCredentialsNotLike(String value) {
            addCriterion("C_CREDENTIALS not like", value, "cCredentials");
            return (Criteria) this;
        }

        public Criteria andCCredentialsIn(List<String> values) {
            addCriterion("C_CREDENTIALS in", values, "cCredentials");
            return (Criteria) this;
        }

        public Criteria andCCredentialsNotIn(List<String> values) {
            addCriterion("C_CREDENTIALS not in", values, "cCredentials");
            return (Criteria) this;
        }

        public Criteria andCCredentialsBetween(String value1, String value2) {
            addCriterion("C_CREDENTIALS between", value1, value2, "cCredentials");
            return (Criteria) this;
        }

        public Criteria andCCredentialsNotBetween(String value1, String value2) {
            addCriterion("C_CREDENTIALS not between", value1, value2, "cCredentials");
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