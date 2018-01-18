package com.ceying.chx.cpi.base.rm.org.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(Object value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(Object value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(Object value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(Object value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(Object value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(Object value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<Object> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<Object> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(Object value1, Object value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(Object value1, Object value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("USER_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("USER_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("USER_PWD =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("USER_PWD <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("USER_PWD >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PWD >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("USER_PWD <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("USER_PWD <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("USER_PWD like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("USER_PWD not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("USER_PWD in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("USER_PWD not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("USER_PWD between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("USER_PWD not between", value1, value2, "userPwd");
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

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("USER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("USER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(String value) {
            addCriterion("USER_STATUS =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(String value) {
            addCriterion("USER_STATUS <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(String value) {
            addCriterion("USER_STATUS >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STATUS >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(String value) {
            addCriterion("USER_STATUS <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(String value) {
            addCriterion("USER_STATUS <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLike(String value) {
            addCriterion("USER_STATUS like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotLike(String value) {
            addCriterion("USER_STATUS not like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<String> values) {
            addCriterion("USER_STATUS in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<String> values) {
            addCriterion("USER_STATUS not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(String value1, String value2) {
            addCriterion("USER_STATUS between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(String value1, String value2) {
            addCriterion("USER_STATUS not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNull() {
            addCriterion("LOCK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNotNull() {
            addCriterion("LOCK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLockStatusEqualTo(String value) {
            addCriterion("LOCK_STATUS =", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotEqualTo(String value) {
            addCriterion("LOCK_STATUS <>", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThan(String value) {
            addCriterion("LOCK_STATUS >", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_STATUS >=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThan(String value) {
            addCriterion("LOCK_STATUS <", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThanOrEqualTo(String value) {
            addCriterion("LOCK_STATUS <=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLike(String value) {
            addCriterion("LOCK_STATUS like", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotLike(String value) {
            addCriterion("LOCK_STATUS not like", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusIn(List<String> values) {
            addCriterion("LOCK_STATUS in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotIn(List<String> values) {
            addCriterion("LOCK_STATUS not in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusBetween(String value1, String value2) {
            addCriterion("LOCK_STATUS between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotBetween(String value1, String value2) {
            addCriterion("LOCK_STATUS not between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterionForJDBCDate("MODIFY_DATE =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("MODIFY_DATE <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("MODIFY_DATE >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MODIFY_DATE >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterionForJDBCDate("MODIFY_DATE <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MODIFY_DATE <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterionForJDBCDate("MODIFY_DATE in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("MODIFY_DATE not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MODIFY_DATE between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MODIFY_DATE not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andPassModifyDateIsNull() {
            addCriterion("PASS_MODIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPassModifyDateIsNotNull() {
            addCriterion("PASS_MODIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPassModifyDateEqualTo(Date value) {
            addCriterionForJDBCDate("PASS_MODIFY_DATE =", value, "passModifyDate");
            return (Criteria) this;
        }

        public Criteria andPassModifyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PASS_MODIFY_DATE <>", value, "passModifyDate");
            return (Criteria) this;
        }

        public Criteria andPassModifyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PASS_MODIFY_DATE >", value, "passModifyDate");
            return (Criteria) this;
        }

        public Criteria andPassModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PASS_MODIFY_DATE >=", value, "passModifyDate");
            return (Criteria) this;
        }

        public Criteria andPassModifyDateLessThan(Date value) {
            addCriterionForJDBCDate("PASS_MODIFY_DATE <", value, "passModifyDate");
            return (Criteria) this;
        }

        public Criteria andPassModifyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PASS_MODIFY_DATE <=", value, "passModifyDate");
            return (Criteria) this;
        }

        public Criteria andPassModifyDateIn(List<Date> values) {
            addCriterionForJDBCDate("PASS_MODIFY_DATE in", values, "passModifyDate");
            return (Criteria) this;
        }

        public Criteria andPassModifyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PASS_MODIFY_DATE not in", values, "passModifyDate");
            return (Criteria) this;
        }

        public Criteria andPassModifyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PASS_MODIFY_DATE between", value1, value2, "passModifyDate");
            return (Criteria) this;
        }

        public Criteria andPassModifyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PASS_MODIFY_DATE not between", value1, value2, "passModifyDate");
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

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andExtFlagIsNull() {
            addCriterion("EXT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andExtFlagIsNotNull() {
            addCriterion("EXT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andExtFlagEqualTo(String value) {
            addCriterion("EXT_FLAG =", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagNotEqualTo(String value) {
            addCriterion("EXT_FLAG <>", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagGreaterThan(String value) {
            addCriterion("EXT_FLAG >", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagGreaterThanOrEqualTo(String value) {
            addCriterion("EXT_FLAG >=", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagLessThan(String value) {
            addCriterion("EXT_FLAG <", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagLessThanOrEqualTo(String value) {
            addCriterion("EXT_FLAG <=", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagLike(String value) {
            addCriterion("EXT_FLAG like", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagNotLike(String value) {
            addCriterion("EXT_FLAG not like", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagIn(List<String> values) {
            addCriterion("EXT_FLAG in", values, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagNotIn(List<String> values) {
            addCriterion("EXT_FLAG not in", values, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagBetween(String value1, String value2) {
            addCriterion("EXT_FLAG between", value1, value2, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagNotBetween(String value1, String value2) {
            addCriterion("EXT_FLAG not between", value1, value2, "extFlag");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andExtField1IsNull() {
            addCriterion("EXT_FIELD_1 is null");
            return (Criteria) this;
        }

        public Criteria andExtField1IsNotNull() {
            addCriterion("EXT_FIELD_1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtField1EqualTo(String value) {
            addCriterion("EXT_FIELD_1 =", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1NotEqualTo(String value) {
            addCriterion("EXT_FIELD_1 <>", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1GreaterThan(String value) {
            addCriterion("EXT_FIELD_1 >", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1GreaterThanOrEqualTo(String value) {
            addCriterion("EXT_FIELD_1 >=", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1LessThan(String value) {
            addCriterion("EXT_FIELD_1 <", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1LessThanOrEqualTo(String value) {
            addCriterion("EXT_FIELD_1 <=", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1Like(String value) {
            addCriterion("EXT_FIELD_1 like", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1NotLike(String value) {
            addCriterion("EXT_FIELD_1 not like", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1In(List<String> values) {
            addCriterion("EXT_FIELD_1 in", values, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1NotIn(List<String> values) {
            addCriterion("EXT_FIELD_1 not in", values, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1Between(String value1, String value2) {
            addCriterion("EXT_FIELD_1 between", value1, value2, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1NotBetween(String value1, String value2) {
            addCriterion("EXT_FIELD_1 not between", value1, value2, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField2IsNull() {
            addCriterion("EXT_FIELD_2 is null");
            return (Criteria) this;
        }

        public Criteria andExtField2IsNotNull() {
            addCriterion("EXT_FIELD_2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtField2EqualTo(String value) {
            addCriterion("EXT_FIELD_2 =", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2NotEqualTo(String value) {
            addCriterion("EXT_FIELD_2 <>", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2GreaterThan(String value) {
            addCriterion("EXT_FIELD_2 >", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2GreaterThanOrEqualTo(String value) {
            addCriterion("EXT_FIELD_2 >=", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2LessThan(String value) {
            addCriterion("EXT_FIELD_2 <", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2LessThanOrEqualTo(String value) {
            addCriterion("EXT_FIELD_2 <=", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2Like(String value) {
            addCriterion("EXT_FIELD_2 like", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2NotLike(String value) {
            addCriterion("EXT_FIELD_2 not like", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2In(List<String> values) {
            addCriterion("EXT_FIELD_2 in", values, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2NotIn(List<String> values) {
            addCriterion("EXT_FIELD_2 not in", values, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2Between(String value1, String value2) {
            addCriterion("EXT_FIELD_2 between", value1, value2, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2NotBetween(String value1, String value2) {
            addCriterion("EXT_FIELD_2 not between", value1, value2, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField3IsNull() {
            addCriterion("EXT_FIELD_3 is null");
            return (Criteria) this;
        }

        public Criteria andExtField3IsNotNull() {
            addCriterion("EXT_FIELD_3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtField3EqualTo(String value) {
            addCriterion("EXT_FIELD_3 =", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3NotEqualTo(String value) {
            addCriterion("EXT_FIELD_3 <>", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3GreaterThan(String value) {
            addCriterion("EXT_FIELD_3 >", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3GreaterThanOrEqualTo(String value) {
            addCriterion("EXT_FIELD_3 >=", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3LessThan(String value) {
            addCriterion("EXT_FIELD_3 <", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3LessThanOrEqualTo(String value) {
            addCriterion("EXT_FIELD_3 <=", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3Like(String value) {
            addCriterion("EXT_FIELD_3 like", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3NotLike(String value) {
            addCriterion("EXT_FIELD_3 not like", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3In(List<String> values) {
            addCriterion("EXT_FIELD_3 in", values, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3NotIn(List<String> values) {
            addCriterion("EXT_FIELD_3 not in", values, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3Between(String value1, String value2) {
            addCriterion("EXT_FIELD_3 between", value1, value2, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3NotBetween(String value1, String value2) {
            addCriterion("EXT_FIELD_3 not between", value1, value2, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField4IsNull() {
            addCriterion("EXT_FIELD_4 is null");
            return (Criteria) this;
        }

        public Criteria andExtField4IsNotNull() {
            addCriterion("EXT_FIELD_4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtField4EqualTo(String value) {
            addCriterion("EXT_FIELD_4 =", value, "extField4");
            return (Criteria) this;
        }

        public Criteria andExtField4NotEqualTo(String value) {
            addCriterion("EXT_FIELD_4 <>", value, "extField4");
            return (Criteria) this;
        }

        public Criteria andExtField4GreaterThan(String value) {
            addCriterion("EXT_FIELD_4 >", value, "extField4");
            return (Criteria) this;
        }

        public Criteria andExtField4GreaterThanOrEqualTo(String value) {
            addCriterion("EXT_FIELD_4 >=", value, "extField4");
            return (Criteria) this;
        }

        public Criteria andExtField4LessThan(String value) {
            addCriterion("EXT_FIELD_4 <", value, "extField4");
            return (Criteria) this;
        }

        public Criteria andExtField4LessThanOrEqualTo(String value) {
            addCriterion("EXT_FIELD_4 <=", value, "extField4");
            return (Criteria) this;
        }

        public Criteria andExtField4Like(String value) {
            addCriterion("EXT_FIELD_4 like", value, "extField4");
            return (Criteria) this;
        }

        public Criteria andExtField4NotLike(String value) {
            addCriterion("EXT_FIELD_4 not like", value, "extField4");
            return (Criteria) this;
        }

        public Criteria andExtField4In(List<String> values) {
            addCriterion("EXT_FIELD_4 in", values, "extField4");
            return (Criteria) this;
        }

        public Criteria andExtField4NotIn(List<String> values) {
            addCriterion("EXT_FIELD_4 not in", values, "extField4");
            return (Criteria) this;
        }

        public Criteria andExtField4Between(String value1, String value2) {
            addCriterion("EXT_FIELD_4 between", value1, value2, "extField4");
            return (Criteria) this;
        }

        public Criteria andExtField4NotBetween(String value1, String value2) {
            addCriterion("EXT_FIELD_4 not between", value1, value2, "extField4");
            return (Criteria) this;
        }

        public Criteria andExtField5IsNull() {
            addCriterion("EXT_FIELD_5 is null");
            return (Criteria) this;
        }

        public Criteria andExtField5IsNotNull() {
            addCriterion("EXT_FIELD_5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtField5EqualTo(String value) {
            addCriterion("EXT_FIELD_5 =", value, "extField5");
            return (Criteria) this;
        }

        public Criteria andExtField5NotEqualTo(String value) {
            addCriterion("EXT_FIELD_5 <>", value, "extField5");
            return (Criteria) this;
        }

        public Criteria andExtField5GreaterThan(String value) {
            addCriterion("EXT_FIELD_5 >", value, "extField5");
            return (Criteria) this;
        }

        public Criteria andExtField5GreaterThanOrEqualTo(String value) {
            addCriterion("EXT_FIELD_5 >=", value, "extField5");
            return (Criteria) this;
        }

        public Criteria andExtField5LessThan(String value) {
            addCriterion("EXT_FIELD_5 <", value, "extField5");
            return (Criteria) this;
        }

        public Criteria andExtField5LessThanOrEqualTo(String value) {
            addCriterion("EXT_FIELD_5 <=", value, "extField5");
            return (Criteria) this;
        }

        public Criteria andExtField5Like(String value) {
            addCriterion("EXT_FIELD_5 like", value, "extField5");
            return (Criteria) this;
        }

        public Criteria andExtField5NotLike(String value) {
            addCriterion("EXT_FIELD_5 not like", value, "extField5");
            return (Criteria) this;
        }

        public Criteria andExtField5In(List<String> values) {
            addCriterion("EXT_FIELD_5 in", values, "extField5");
            return (Criteria) this;
        }

        public Criteria andExtField5NotIn(List<String> values) {
            addCriterion("EXT_FIELD_5 not in", values, "extField5");
            return (Criteria) this;
        }

        public Criteria andExtField5Between(String value1, String value2) {
            addCriterion("EXT_FIELD_5 between", value1, value2, "extField5");
            return (Criteria) this;
        }

        public Criteria andExtField5NotBetween(String value1, String value2) {
            addCriterion("EXT_FIELD_5 not between", value1, value2, "extField5");
            return (Criteria) this;
        }

        public Criteria andUserOrderIsNull() {
            addCriterion("USER_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andUserOrderIsNotNull() {
            addCriterion("USER_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrderEqualTo(BigDecimal value) {
            addCriterion("USER_ORDER =", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderNotEqualTo(BigDecimal value) {
            addCriterion("USER_ORDER <>", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderGreaterThan(BigDecimal value) {
            addCriterion("USER_ORDER >", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_ORDER >=", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderLessThan(BigDecimal value) {
            addCriterion("USER_ORDER <", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_ORDER <=", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderIn(List<BigDecimal> values) {
            addCriterion("USER_ORDER in", values, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderNotIn(List<BigDecimal> values) {
            addCriterion("USER_ORDER not in", values, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_ORDER between", value1, value2, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_ORDER not between", value1, value2, "userOrder");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeIsNull() {
            addCriterion("C_IDENTITYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeIsNotNull() {
            addCriterion("C_IDENTITYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeEqualTo(String value) {
            addCriterion("C_IDENTITYTYPE =", value, "cIdentitytype");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeNotEqualTo(String value) {
            addCriterion("C_IDENTITYTYPE <>", value, "cIdentitytype");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeGreaterThan(String value) {
            addCriterion("C_IDENTITYTYPE >", value, "cIdentitytype");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_IDENTITYTYPE >=", value, "cIdentitytype");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeLessThan(String value) {
            addCriterion("C_IDENTITYTYPE <", value, "cIdentitytype");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeLessThanOrEqualTo(String value) {
            addCriterion("C_IDENTITYTYPE <=", value, "cIdentitytype");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeLike(String value) {
            addCriterion("C_IDENTITYTYPE like", value, "cIdentitytype");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeNotLike(String value) {
            addCriterion("C_IDENTITYTYPE not like", value, "cIdentitytype");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeIn(List<String> values) {
            addCriterion("C_IDENTITYTYPE in", values, "cIdentitytype");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeNotIn(List<String> values) {
            addCriterion("C_IDENTITYTYPE not in", values, "cIdentitytype");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeBetween(String value1, String value2) {
            addCriterion("C_IDENTITYTYPE between", value1, value2, "cIdentitytype");
            return (Criteria) this;
        }

        public Criteria andCIdentitytypeNotBetween(String value1, String value2) {
            addCriterion("C_IDENTITYTYPE not between", value1, value2, "cIdentitytype");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoIsNull() {
            addCriterion("C_IDENTITYNO is null");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoIsNotNull() {
            addCriterion("C_IDENTITYNO is not null");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoEqualTo(String value) {
            addCriterion("C_IDENTITYNO =", value, "cIdentityno");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoNotEqualTo(String value) {
            addCriterion("C_IDENTITYNO <>", value, "cIdentityno");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoGreaterThan(String value) {
            addCriterion("C_IDENTITYNO >", value, "cIdentityno");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoGreaterThanOrEqualTo(String value) {
            addCriterion("C_IDENTITYNO >=", value, "cIdentityno");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoLessThan(String value) {
            addCriterion("C_IDENTITYNO <", value, "cIdentityno");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoLessThanOrEqualTo(String value) {
            addCriterion("C_IDENTITYNO <=", value, "cIdentityno");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoLike(String value) {
            addCriterion("C_IDENTITYNO like", value, "cIdentityno");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoNotLike(String value) {
            addCriterion("C_IDENTITYNO not like", value, "cIdentityno");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoIn(List<String> values) {
            addCriterion("C_IDENTITYNO in", values, "cIdentityno");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoNotIn(List<String> values) {
            addCriterion("C_IDENTITYNO not in", values, "cIdentityno");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoBetween(String value1, String value2) {
            addCriterion("C_IDENTITYNO between", value1, value2, "cIdentityno");
            return (Criteria) this;
        }

        public Criteria andCIdentitynoNotBetween(String value1, String value2) {
            addCriterion("C_IDENTITYNO not between", value1, value2, "cIdentityno");
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