package com.ceying.chx.cpi.base.rm.base.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaTemplateOperationsEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaTemplateOperationsEntityExample() {
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

        public Criteria andUridIsNull() {
            addCriterion("urid is null");
            return (Criteria) this;
        }

        public Criteria andUridIsNotNull() {
            addCriterion("urid is not null");
            return (Criteria) this;
        }

        public Criteria andUridEqualTo(String value) {
            addCriterion("urid =", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotEqualTo(String value) {
            addCriterion("urid <>", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridGreaterThan(String value) {
            addCriterion("urid >", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridGreaterThanOrEqualTo(String value) {
            addCriterion("urid >=", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridLessThan(String value) {
            addCriterion("urid <", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridLessThanOrEqualTo(String value) {
            addCriterion("urid <=", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridLike(String value) {
            addCriterion("urid like", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotLike(String value) {
            addCriterion("urid not like", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridIn(List<String> values) {
            addCriterion("urid in", values, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotIn(List<String> values) {
            addCriterion("urid not in", values, "urid");
            return (Criteria) this;
        }

        public Criteria andUridBetween(String value1, String value2) {
            addCriterion("urid between", value1, value2, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotBetween(String value1, String value2) {
            addCriterion("urid not between", value1, value2, "urid");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdIsNull() {
            addCriterion("tatemplate_id is null");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdIsNotNull() {
            addCriterion("tatemplate_id is not null");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdEqualTo(String value) {
            addCriterion("tatemplate_id =", value, "tatemplateId");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdNotEqualTo(String value) {
            addCriterion("tatemplate_id <>", value, "tatemplateId");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdGreaterThan(String value) {
            addCriterion("tatemplate_id >", value, "tatemplateId");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("tatemplate_id >=", value, "tatemplateId");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdLessThan(String value) {
            addCriterion("tatemplate_id <", value, "tatemplateId");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdLessThanOrEqualTo(String value) {
            addCriterion("tatemplate_id <=", value, "tatemplateId");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdLike(String value) {
            addCriterion("tatemplate_id like", value, "tatemplateId");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdNotLike(String value) {
            addCriterion("tatemplate_id not like", value, "tatemplateId");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdIn(List<String> values) {
            addCriterion("tatemplate_id in", values, "tatemplateId");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdNotIn(List<String> values) {
            addCriterion("tatemplate_id not in", values, "tatemplateId");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdBetween(String value1, String value2) {
            addCriterion("tatemplate_id between", value1, value2, "tatemplateId");
            return (Criteria) this;
        }

        public Criteria andTatemplateIdNotBetween(String value1, String value2) {
            addCriterion("tatemplate_id not between", value1, value2, "tatemplateId");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("`operator` is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("`operator` is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("`operator` =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("`operator` <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("`operator` >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("`operator` >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("`operator` <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("`operator` <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("`operator` like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("`operator` not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("`operator` in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("`operator` not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("`operator` between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("`operator` not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdIsNull() {
            addCriterion("operate_org_id is null");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdIsNotNull() {
            addCriterion("operate_org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdEqualTo(String value) {
            addCriterion("operate_org_id =", value, "operateOrgId");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdNotEqualTo(String value) {
            addCriterion("operate_org_id <>", value, "operateOrgId");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdGreaterThan(String value) {
            addCriterion("operate_org_id >", value, "operateOrgId");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("operate_org_id >=", value, "operateOrgId");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdLessThan(String value) {
            addCriterion("operate_org_id <", value, "operateOrgId");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdLessThanOrEqualTo(String value) {
            addCriterion("operate_org_id <=", value, "operateOrgId");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdLike(String value) {
            addCriterion("operate_org_id like", value, "operateOrgId");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdNotLike(String value) {
            addCriterion("operate_org_id not like", value, "operateOrgId");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdIn(List<String> values) {
            addCriterion("operate_org_id in", values, "operateOrgId");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdNotIn(List<String> values) {
            addCriterion("operate_org_id not in", values, "operateOrgId");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdBetween(String value1, String value2) {
            addCriterion("operate_org_id between", value1, value2, "operateOrgId");
            return (Criteria) this;
        }

        public Criteria andOperateOrgIdNotBetween(String value1, String value2) {
            addCriterion("operate_org_id not between", value1, value2, "operateOrgId");
            return (Criteria) this;
        }

        public Criteria andOperateDateIsNull() {
            addCriterion("operate_date is null");
            return (Criteria) this;
        }

        public Criteria andOperateDateIsNotNull() {
            addCriterion("operate_date is not null");
            return (Criteria) this;
        }

        public Criteria andOperateDateEqualTo(Date value) {
            addCriterion("operate_date =", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotEqualTo(Date value) {
            addCriterion("operate_date <>", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateGreaterThan(Date value) {
            addCriterion("operate_date >", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("operate_date >=", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLessThan(Date value) {
            addCriterion("operate_date <", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLessThanOrEqualTo(Date value) {
            addCriterion("operate_date <=", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateIn(List<Date> values) {
            addCriterion("operate_date in", values, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotIn(List<Date> values) {
            addCriterion("operate_date not in", values, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateBetween(Date value1, Date value2) {
            addCriterion("operate_date between", value1, value2, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotBetween(Date value1, Date value2) {
            addCriterion("operate_date not between", value1, value2, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateFlagIsNull() {
            addCriterion("operate_flag is null");
            return (Criteria) this;
        }

        public Criteria andOperateFlagIsNotNull() {
            addCriterion("operate_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOperateFlagEqualTo(String value) {
            addCriterion("operate_flag =", value, "operateFlag");
            return (Criteria) this;
        }

        public Criteria andOperateFlagNotEqualTo(String value) {
            addCriterion("operate_flag <>", value, "operateFlag");
            return (Criteria) this;
        }

        public Criteria andOperateFlagGreaterThan(String value) {
            addCriterion("operate_flag >", value, "operateFlag");
            return (Criteria) this;
        }

        public Criteria andOperateFlagGreaterThanOrEqualTo(String value) {
            addCriterion("operate_flag >=", value, "operateFlag");
            return (Criteria) this;
        }

        public Criteria andOperateFlagLessThan(String value) {
            addCriterion("operate_flag <", value, "operateFlag");
            return (Criteria) this;
        }

        public Criteria andOperateFlagLessThanOrEqualTo(String value) {
            addCriterion("operate_flag <=", value, "operateFlag");
            return (Criteria) this;
        }

        public Criteria andOperateFlagLike(String value) {
            addCriterion("operate_flag like", value, "operateFlag");
            return (Criteria) this;
        }

        public Criteria andOperateFlagNotLike(String value) {
            addCriterion("operate_flag not like", value, "operateFlag");
            return (Criteria) this;
        }

        public Criteria andOperateFlagIn(List<String> values) {
            addCriterion("operate_flag in", values, "operateFlag");
            return (Criteria) this;
        }

        public Criteria andOperateFlagNotIn(List<String> values) {
            addCriterion("operate_flag not in", values, "operateFlag");
            return (Criteria) this;
        }

        public Criteria andOperateFlagBetween(String value1, String value2) {
            addCriterion("operate_flag between", value1, value2, "operateFlag");
            return (Criteria) this;
        }

        public Criteria andOperateFlagNotBetween(String value1, String value2) {
            addCriterion("operate_flag not between", value1, value2, "operateFlag");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("createdby is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("createdby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(String value) {
            addCriterion("createdby =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(String value) {
            addCriterion("createdby <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(String value) {
            addCriterion("createdby >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(String value) {
            addCriterion("createdby >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(String value) {
            addCriterion("createdby <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(String value) {
            addCriterion("createdby <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLike(String value) {
            addCriterion("createdby like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotLike(String value) {
            addCriterion("createdby not like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<String> values) {
            addCriterion("createdby in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<String> values) {
            addCriterion("createdby not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(String value1, String value2) {
            addCriterion("createdby between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(String value1, String value2) {
            addCriterion("createdby not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedonIsNull() {
            addCriterion("createdon is null");
            return (Criteria) this;
        }

        public Criteria andCreatedonIsNotNull() {
            addCriterion("createdon is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedonEqualTo(Date value) {
            addCriterion("createdon =", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotEqualTo(Date value) {
            addCriterion("createdon <>", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonGreaterThan(Date value) {
            addCriterion("createdon >", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonGreaterThanOrEqualTo(Date value) {
            addCriterion("createdon >=", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonLessThan(Date value) {
            addCriterion("createdon <", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonLessThanOrEqualTo(Date value) {
            addCriterion("createdon <=", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonIn(List<Date> values) {
            addCriterion("createdon in", values, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotIn(List<Date> values) {
            addCriterion("createdon not in", values, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonBetween(Date value1, Date value2) {
            addCriterion("createdon between", value1, value2, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotBetween(Date value1, Date value2) {
            addCriterion("createdon not between", value1, value2, "createdon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIsNull() {
            addCriterion("lastmodifiedby is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIsNotNull() {
            addCriterion("lastmodifiedby is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyEqualTo(String value) {
            addCriterion("lastmodifiedby =", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotEqualTo(String value) {
            addCriterion("lastmodifiedby <>", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyGreaterThan(String value) {
            addCriterion("lastmodifiedby >", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyGreaterThanOrEqualTo(String value) {
            addCriterion("lastmodifiedby >=", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLessThan(String value) {
            addCriterion("lastmodifiedby <", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLessThanOrEqualTo(String value) {
            addCriterion("lastmodifiedby <=", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLike(String value) {
            addCriterion("lastmodifiedby like", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotLike(String value) {
            addCriterion("lastmodifiedby not like", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIn(List<String> values) {
            addCriterion("lastmodifiedby in", values, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotIn(List<String> values) {
            addCriterion("lastmodifiedby not in", values, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyBetween(String value1, String value2) {
            addCriterion("lastmodifiedby between", value1, value2, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotBetween(String value1, String value2) {
            addCriterion("lastmodifiedby not between", value1, value2, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonIsNull() {
            addCriterion("lastmodifiedon is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonIsNotNull() {
            addCriterion("lastmodifiedon is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonEqualTo(Date value) {
            addCriterion("lastmodifiedon =", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonNotEqualTo(Date value) {
            addCriterion("lastmodifiedon <>", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonGreaterThan(Date value) {
            addCriterion("lastmodifiedon >", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonGreaterThanOrEqualTo(Date value) {
            addCriterion("lastmodifiedon >=", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonLessThan(Date value) {
            addCriterion("lastmodifiedon <", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonLessThanOrEqualTo(Date value) {
            addCriterion("lastmodifiedon <=", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonIn(List<Date> values) {
            addCriterion("lastmodifiedon in", values, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonNotIn(List<Date> values) {
            addCriterion("lastmodifiedon not in", values, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonBetween(Date value1, Date value2) {
            addCriterion("lastmodifiedon between", value1, value2, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonNotBetween(Date value1, Date value2) {
            addCriterion("lastmodifiedon not between", value1, value2, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andRowversionIsNull() {
            addCriterion("rowversion is null");
            return (Criteria) this;
        }

        public Criteria andRowversionIsNotNull() {
            addCriterion("rowversion is not null");
            return (Criteria) this;
        }

        public Criteria andRowversionEqualTo(Integer value) {
            addCriterion("rowversion =", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionNotEqualTo(Integer value) {
            addCriterion("rowversion <>", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionGreaterThan(Integer value) {
            addCriterion("rowversion >", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionGreaterThanOrEqualTo(Integer value) {
            addCriterion("rowversion >=", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionLessThan(Integer value) {
            addCriterion("rowversion <", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionLessThanOrEqualTo(Integer value) {
            addCriterion("rowversion <=", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionIn(List<Integer> values) {
            addCriterion("rowversion in", values, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionNotIn(List<Integer> values) {
            addCriterion("rowversion not in", values, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionBetween(Integer value1, Integer value2) {
            addCriterion("rowversion between", value1, value2, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionNotBetween(Integer value1, Integer value2) {
            addCriterion("rowversion not between", value1, value2, "rowversion");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdIsNull() {
            addCriterion("relateoperate_id is null");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdIsNotNull() {
            addCriterion("relateoperate_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdEqualTo(String value) {
            addCriterion("relateoperate_id =", value, "relateoperateId");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdNotEqualTo(String value) {
            addCriterion("relateoperate_id <>", value, "relateoperateId");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdGreaterThan(String value) {
            addCriterion("relateoperate_id >", value, "relateoperateId");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdGreaterThanOrEqualTo(String value) {
            addCriterion("relateoperate_id >=", value, "relateoperateId");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdLessThan(String value) {
            addCriterion("relateoperate_id <", value, "relateoperateId");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdLessThanOrEqualTo(String value) {
            addCriterion("relateoperate_id <=", value, "relateoperateId");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdLike(String value) {
            addCriterion("relateoperate_id like", value, "relateoperateId");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdNotLike(String value) {
            addCriterion("relateoperate_id not like", value, "relateoperateId");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdIn(List<String> values) {
            addCriterion("relateoperate_id in", values, "relateoperateId");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdNotIn(List<String> values) {
            addCriterion("relateoperate_id not in", values, "relateoperateId");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdBetween(String value1, String value2) {
            addCriterion("relateoperate_id between", value1, value2, "relateoperateId");
            return (Criteria) this;
        }

        public Criteria andRelateoperateIdNotBetween(String value1, String value2) {
            addCriterion("relateoperate_id not between", value1, value2, "relateoperateId");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressIsNull() {
            addCriterion("blockchainaddress is null");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressIsNotNull() {
            addCriterion("blockchainaddress is not null");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressEqualTo(String value) {
            addCriterion("blockchainaddress =", value, "blockchainaddress");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressNotEqualTo(String value) {
            addCriterion("blockchainaddress <>", value, "blockchainaddress");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressGreaterThan(String value) {
            addCriterion("blockchainaddress >", value, "blockchainaddress");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressGreaterThanOrEqualTo(String value) {
            addCriterion("blockchainaddress >=", value, "blockchainaddress");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressLessThan(String value) {
            addCriterion("blockchainaddress <", value, "blockchainaddress");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressLessThanOrEqualTo(String value) {
            addCriterion("blockchainaddress <=", value, "blockchainaddress");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressLike(String value) {
            addCriterion("blockchainaddress like", value, "blockchainaddress");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressNotLike(String value) {
            addCriterion("blockchainaddress not like", value, "blockchainaddress");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressIn(List<String> values) {
            addCriterion("blockchainaddress in", values, "blockchainaddress");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressNotIn(List<String> values) {
            addCriterion("blockchainaddress not in", values, "blockchainaddress");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressBetween(String value1, String value2) {
            addCriterion("blockchainaddress between", value1, value2, "blockchainaddress");
            return (Criteria) this;
        }

        public Criteria andBlockchainaddressNotBetween(String value1, String value2) {
            addCriterion("blockchainaddress not between", value1, value2, "blockchainaddress");
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