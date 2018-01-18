package com.ceying.chx.cpi.base.rm.base.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripartiteagreementTemplateEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TripartiteagreementTemplateEntityExample() {
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

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeIsNull() {
            addCriterion("tatemplate_code is null");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeIsNotNull() {
            addCriterion("tatemplate_code is not null");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeEqualTo(String value) {
            addCriterion("tatemplate_code =", value, "tatemplateCode");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeNotEqualTo(String value) {
            addCriterion("tatemplate_code <>", value, "tatemplateCode");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeGreaterThan(String value) {
            addCriterion("tatemplate_code >", value, "tatemplateCode");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tatemplate_code >=", value, "tatemplateCode");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeLessThan(String value) {
            addCriterion("tatemplate_code <", value, "tatemplateCode");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeLessThanOrEqualTo(String value) {
            addCriterion("tatemplate_code <=", value, "tatemplateCode");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeLike(String value) {
            addCriterion("tatemplate_code like", value, "tatemplateCode");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeNotLike(String value) {
            addCriterion("tatemplate_code not like", value, "tatemplateCode");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeIn(List<String> values) {
            addCriterion("tatemplate_code in", values, "tatemplateCode");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeNotIn(List<String> values) {
            addCriterion("tatemplate_code not in", values, "tatemplateCode");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeBetween(String value1, String value2) {
            addCriterion("tatemplate_code between", value1, value2, "tatemplateCode");
            return (Criteria) this;
        }

        public Criteria andTatemplateCodeNotBetween(String value1, String value2) {
            addCriterion("tatemplate_code not between", value1, value2, "tatemplateCode");
            return (Criteria) this;
        }

        public Criteria andTatemplateVersionIsNull() {
            addCriterion("tatemplate_version is null");
            return (Criteria) this;
        }

        public Criteria andTatemplateVersionIsNotNull() {
            addCriterion("tatemplate_version is not null");
            return (Criteria) this;
        }

        public Criteria andTatemplateVersionEqualTo(Integer value) {
            addCriterion("tatemplate_version =", value, "tatemplateVersion");
            return (Criteria) this;
        }

        public Criteria andTatemplateVersionNotEqualTo(Integer value) {
            addCriterion("tatemplate_version <>", value, "tatemplateVersion");
            return (Criteria) this;
        }

        public Criteria andTatemplateVersionGreaterThan(Integer value) {
            addCriterion("tatemplate_version >", value, "tatemplateVersion");
            return (Criteria) this;
        }

        public Criteria andTatemplateVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("tatemplate_version >=", value, "tatemplateVersion");
            return (Criteria) this;
        }

        public Criteria andTatemplateVersionLessThan(Integer value) {
            addCriterion("tatemplate_version <", value, "tatemplateVersion");
            return (Criteria) this;
        }

        public Criteria andTatemplateVersionLessThanOrEqualTo(Integer value) {
            addCriterion("tatemplate_version <=", value, "tatemplateVersion");
            return (Criteria) this;
        }

        public Criteria andTatemplateVersionIn(List<Integer> values) {
            addCriterion("tatemplate_version in", values, "tatemplateVersion");
            return (Criteria) this;
        }

        public Criteria andTatemplateVersionNotIn(List<Integer> values) {
            addCriterion("tatemplate_version not in", values, "tatemplateVersion");
            return (Criteria) this;
        }

        public Criteria andTatemplateVersionBetween(Integer value1, Integer value2) {
            addCriterion("tatemplate_version between", value1, value2, "tatemplateVersion");
            return (Criteria) this;
        }

        public Criteria andTatemplateVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("tatemplate_version not between", value1, value2, "tatemplateVersion");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("bank_id like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("bank_id not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdIsNull() {
            addCriterion("corecompany_id is null");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdIsNotNull() {
            addCriterion("corecompany_id is not null");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdEqualTo(String value) {
            addCriterion("corecompany_id =", value, "corecompanyId");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdNotEqualTo(String value) {
            addCriterion("corecompany_id <>", value, "corecompanyId");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdGreaterThan(String value) {
            addCriterion("corecompany_id >", value, "corecompanyId");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("corecompany_id >=", value, "corecompanyId");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdLessThan(String value) {
            addCriterion("corecompany_id <", value, "corecompanyId");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdLessThanOrEqualTo(String value) {
            addCriterion("corecompany_id <=", value, "corecompanyId");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdLike(String value) {
            addCriterion("corecompany_id like", value, "corecompanyId");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdNotLike(String value) {
            addCriterion("corecompany_id not like", value, "corecompanyId");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdIn(List<String> values) {
            addCriterion("corecompany_id in", values, "corecompanyId");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdNotIn(List<String> values) {
            addCriterion("corecompany_id not in", values, "corecompanyId");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdBetween(String value1, String value2) {
            addCriterion("corecompany_id between", value1, value2, "corecompanyId");
            return (Criteria) this;
        }

        public Criteria andCorecompanyIdNotBetween(String value1, String value2) {
            addCriterion("corecompany_id not between", value1, value2, "corecompanyId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNull() {
            addCriterion("credit_limit is null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIsNotNull() {
            addCriterion("credit_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitEqualTo(BigDecimal value) {
            addCriterion("credit_limit =", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotEqualTo(BigDecimal value) {
            addCriterion("credit_limit <>", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThan(BigDecimal value) {
            addCriterion("credit_limit >", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_limit >=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThan(BigDecimal value) {
            addCriterion("credit_limit <", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credit_limit <=", value, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIn(List<BigDecimal> values) {
            addCriterion("credit_limit in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotIn(List<BigDecimal> values) {
            addCriterion("credit_limit not in", values, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_limit between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andCreditLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credit_limit not between", value1, value2, "creditLimit");
            return (Criteria) this;
        }

        public Criteria andIsresourseIsNull() {
            addCriterion("isresourse is null");
            return (Criteria) this;
        }

        public Criteria andIsresourseIsNotNull() {
            addCriterion("isresourse is not null");
            return (Criteria) this;
        }

        public Criteria andIsresourseEqualTo(String value) {
            addCriterion("isresourse =", value, "isresourse");
            return (Criteria) this;
        }

        public Criteria andIsresourseNotEqualTo(String value) {
            addCriterion("isresourse <>", value, "isresourse");
            return (Criteria) this;
        }

        public Criteria andIsresourseGreaterThan(String value) {
            addCriterion("isresourse >", value, "isresourse");
            return (Criteria) this;
        }

        public Criteria andIsresourseGreaterThanOrEqualTo(String value) {
            addCriterion("isresourse >=", value, "isresourse");
            return (Criteria) this;
        }

        public Criteria andIsresourseLessThan(String value) {
            addCriterion("isresourse <", value, "isresourse");
            return (Criteria) this;
        }

        public Criteria andIsresourseLessThanOrEqualTo(String value) {
            addCriterion("isresourse <=", value, "isresourse");
            return (Criteria) this;
        }

        public Criteria andIsresourseLike(String value) {
            addCriterion("isresourse like", value, "isresourse");
            return (Criteria) this;
        }

        public Criteria andIsresourseNotLike(String value) {
            addCriterion("isresourse not like", value, "isresourse");
            return (Criteria) this;
        }

        public Criteria andIsresourseIn(List<String> values) {
            addCriterion("isresourse in", values, "isresourse");
            return (Criteria) this;
        }

        public Criteria andIsresourseNotIn(List<String> values) {
            addCriterion("isresourse not in", values, "isresourse");
            return (Criteria) this;
        }

        public Criteria andIsresourseBetween(String value1, String value2) {
            addCriterion("isresourse between", value1, value2, "isresourse");
            return (Criteria) this;
        }

        public Criteria andIsresourseNotBetween(String value1, String value2) {
            addCriterion("isresourse not between", value1, value2, "isresourse");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("isactive is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("isactive is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(String value) {
            addCriterion("isactive =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(String value) {
            addCriterion("isactive <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(String value) {
            addCriterion("isactive >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(String value) {
            addCriterion("isactive >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(String value) {
            addCriterion("isactive <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(String value) {
            addCriterion("isactive <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLike(String value) {
            addCriterion("isactive like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotLike(String value) {
            addCriterion("isactive not like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<String> values) {
            addCriterion("isactive in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<String> values) {
            addCriterion("isactive not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(String value1, String value2) {
            addCriterion("isactive between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(String value1, String value2) {
            addCriterion("isactive not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createby is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("createby =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("createby <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("createby >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("createby >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("createby <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("createby <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("createby like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("createby not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("createby in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("createby not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("createby between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("createby not between", value1, value2, "createby");
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

        public Criteria andLastModifiedbyIsNull() {
            addCriterion("last_modifiedby is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedbyIsNotNull() {
            addCriterion("last_modifiedby is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedbyEqualTo(String value) {
            addCriterion("last_modifiedby =", value, "lastModifiedby");
            return (Criteria) this;
        }

        public Criteria andLastModifiedbyNotEqualTo(String value) {
            addCriterion("last_modifiedby <>", value, "lastModifiedby");
            return (Criteria) this;
        }

        public Criteria andLastModifiedbyGreaterThan(String value) {
            addCriterion("last_modifiedby >", value, "lastModifiedby");
            return (Criteria) this;
        }

        public Criteria andLastModifiedbyGreaterThanOrEqualTo(String value) {
            addCriterion("last_modifiedby >=", value, "lastModifiedby");
            return (Criteria) this;
        }

        public Criteria andLastModifiedbyLessThan(String value) {
            addCriterion("last_modifiedby <", value, "lastModifiedby");
            return (Criteria) this;
        }

        public Criteria andLastModifiedbyLessThanOrEqualTo(String value) {
            addCriterion("last_modifiedby <=", value, "lastModifiedby");
            return (Criteria) this;
        }

        public Criteria andLastModifiedbyLike(String value) {
            addCriterion("last_modifiedby like", value, "lastModifiedby");
            return (Criteria) this;
        }

        public Criteria andLastModifiedbyNotLike(String value) {
            addCriterion("last_modifiedby not like", value, "lastModifiedby");
            return (Criteria) this;
        }

        public Criteria andLastModifiedbyIn(List<String> values) {
            addCriterion("last_modifiedby in", values, "lastModifiedby");
            return (Criteria) this;
        }

        public Criteria andLastModifiedbyNotIn(List<String> values) {
            addCriterion("last_modifiedby not in", values, "lastModifiedby");
            return (Criteria) this;
        }

        public Criteria andLastModifiedbyBetween(String value1, String value2) {
            addCriterion("last_modifiedby between", value1, value2, "lastModifiedby");
            return (Criteria) this;
        }

        public Criteria andLastModifiedbyNotBetween(String value1, String value2) {
            addCriterion("last_modifiedby not between", value1, value2, "lastModifiedby");
            return (Criteria) this;
        }

        public Criteria andLastModifiedonIsNull() {
            addCriterion("last_modifiedon is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedonIsNotNull() {
            addCriterion("last_modifiedon is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedonEqualTo(Date value) {
            addCriterion("last_modifiedon =", value, "lastModifiedon");
            return (Criteria) this;
        }

        public Criteria andLastModifiedonNotEqualTo(Date value) {
            addCriterion("last_modifiedon <>", value, "lastModifiedon");
            return (Criteria) this;
        }

        public Criteria andLastModifiedonGreaterThan(Date value) {
            addCriterion("last_modifiedon >", value, "lastModifiedon");
            return (Criteria) this;
        }

        public Criteria andLastModifiedonGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modifiedon >=", value, "lastModifiedon");
            return (Criteria) this;
        }

        public Criteria andLastModifiedonLessThan(Date value) {
            addCriterion("last_modifiedon <", value, "lastModifiedon");
            return (Criteria) this;
        }

        public Criteria andLastModifiedonLessThanOrEqualTo(Date value) {
            addCriterion("last_modifiedon <=", value, "lastModifiedon");
            return (Criteria) this;
        }

        public Criteria andLastModifiedonIn(List<Date> values) {
            addCriterion("last_modifiedon in", values, "lastModifiedon");
            return (Criteria) this;
        }

        public Criteria andLastModifiedonNotIn(List<Date> values) {
            addCriterion("last_modifiedon not in", values, "lastModifiedon");
            return (Criteria) this;
        }

        public Criteria andLastModifiedonBetween(Date value1, Date value2) {
            addCriterion("last_modifiedon between", value1, value2, "lastModifiedon");
            return (Criteria) this;
        }

        public Criteria andLastModifiedonNotBetween(Date value1, Date value2) {
            addCriterion("last_modifiedon not between", value1, value2, "lastModifiedon");
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

        public Criteria andRowversionEqualTo(BigDecimal value) {
            addCriterion("rowversion =", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionNotEqualTo(BigDecimal value) {
            addCriterion("rowversion <>", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionGreaterThan(BigDecimal value) {
            addCriterion("rowversion >", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rowversion >=", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionLessThan(BigDecimal value) {
            addCriterion("rowversion <", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rowversion <=", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionIn(List<BigDecimal> values) {
            addCriterion("rowversion in", values, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionNotIn(List<BigDecimal> values) {
            addCriterion("rowversion not in", values, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rowversion between", value1, value2, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andLastOperateflagIsNull() {
            addCriterion("last_operateflag is null");
            return (Criteria) this;
        }

        public Criteria andLastOperateflagIsNotNull() {
            addCriterion("last_operateflag is not null");
            return (Criteria) this;
        }

        public Criteria andLastOperateflagEqualTo(String value) {
            addCriterion("last_operateflag =", value, "lastOperateflag");
            return (Criteria) this;
        }

        public Criteria andLastOperateflagNotEqualTo(String value) {
            addCriterion("last_operateflag <>", value, "lastOperateflag");
            return (Criteria) this;
        }

        public Criteria andLastOperateflagGreaterThan(String value) {
            addCriterion("last_operateflag >", value, "lastOperateflag");
            return (Criteria) this;
        }

        public Criteria andLastOperateflagGreaterThanOrEqualTo(String value) {
            addCriterion("last_operateflag >=", value, "lastOperateflag");
            return (Criteria) this;
        }

        public Criteria andLastOperateflagLessThan(String value) {
            addCriterion("last_operateflag <", value, "lastOperateflag");
            return (Criteria) this;
        }

        public Criteria andLastOperateflagLessThanOrEqualTo(String value) {
            addCriterion("last_operateflag <=", value, "lastOperateflag");
            return (Criteria) this;
        }

        public Criteria andLastOperateflagLike(String value) {
            addCriterion("last_operateflag like", value, "lastOperateflag");
            return (Criteria) this;
        }

        public Criteria andLastOperateflagNotLike(String value) {
            addCriterion("last_operateflag not like", value, "lastOperateflag");
            return (Criteria) this;
        }

        public Criteria andLastOperateflagIn(List<String> values) {
            addCriterion("last_operateflag in", values, "lastOperateflag");
            return (Criteria) this;
        }

        public Criteria andLastOperateflagNotIn(List<String> values) {
            addCriterion("last_operateflag not in", values, "lastOperateflag");
            return (Criteria) this;
        }

        public Criteria andLastOperateflagBetween(String value1, String value2) {
            addCriterion("last_operateflag between", value1, value2, "lastOperateflag");
            return (Criteria) this;
        }

        public Criteria andLastOperateflagNotBetween(String value1, String value2) {
            addCriterion("last_operateflag not between", value1, value2, "lastOperateflag");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("businesstype is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("businesstype is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(String value) {
            addCriterion("businesstype =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(String value) {
            addCriterion("businesstype <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(String value) {
            addCriterion("businesstype >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("businesstype >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(String value) {
            addCriterion("businesstype <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("businesstype <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLike(String value) {
            addCriterion("businesstype like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotLike(String value) {
            addCriterion("businesstype not like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<String> values) {
            addCriterion("businesstype in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<String> values) {
            addCriterion("businesstype not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(String value1, String value2) {
            addCriterion("businesstype between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(String value1, String value2) {
            addCriterion("businesstype not between", value1, value2, "businesstype");
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