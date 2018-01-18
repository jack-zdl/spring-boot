package com.ceying.chx.cpi.base.rm.org.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * 由插件自动生成的实体类相关的东西
 */
public class OrganizationRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationRelationExample() {
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

        public Criteria andUridIsNull() {
            addCriterion("URID is null");
            return (Criteria) this;
        }

        public Criteria andUridIsNotNull() {
            addCriterion("URID is not null");
            return (Criteria) this;
        }

        public Criteria andUridEqualTo(String value) {
            addCriterion("URID =", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotEqualTo(String value) {
            addCriterion("URID <>", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridGreaterThan(String value) {
            addCriterion("URID >", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridGreaterThanOrEqualTo(String value) {
            addCriterion("URID >=", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridLessThan(String value) {
            addCriterion("URID <", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridLessThanOrEqualTo(String value) {
            addCriterion("URID <=", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridLike(String value) {
            addCriterion("URID like", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotLike(String value) {
            addCriterion("URID not like", value, "urid");
            return (Criteria) this;
        }

        public Criteria andUridIn(List<String> values) {
            addCriterion("URID in", values, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotIn(List<String> values) {
            addCriterion("URID not in", values, "urid");
            return (Criteria) this;
        }

        public Criteria andUridBetween(String value1, String value2) {
            addCriterion("URID between", value1, value2, "urid");
            return (Criteria) this;
        }

        public Criteria andUridNotBetween(String value1, String value2) {
            addCriterion("URID not between", value1, value2, "urid");
            return (Criteria) this;
        }

        public Criteria andOurorgidIsNull() {
            addCriterion("OURORGID is null");
            return (Criteria) this;
        }

        public Criteria andOurorgidIsNotNull() {
            addCriterion("OURORGID is not null");
            return (Criteria) this;
        }

        public Criteria andOurorgidEqualTo(String value) {
            addCriterion("OURORGID =", value, "ourorgid");
            return (Criteria) this;
        }

        public Criteria andOurorgidNotEqualTo(String value) {
            addCriterion("OURORGID <>", value, "ourorgid");
            return (Criteria) this;
        }

        public Criteria andOurorgidGreaterThan(String value) {
            addCriterion("OURORGID >", value, "ourorgid");
            return (Criteria) this;
        }

        public Criteria andOurorgidGreaterThanOrEqualTo(String value) {
            addCriterion("OURORGID >=", value, "ourorgid");
            return (Criteria) this;
        }

        public Criteria andOurorgidLessThan(String value) {
            addCriterion("OURORGID <", value, "ourorgid");
            return (Criteria) this;
        }

        public Criteria andOurorgidLessThanOrEqualTo(String value) {
            addCriterion("OURORGID <=", value, "ourorgid");
            return (Criteria) this;
        }

        public Criteria andOurorgidLike(String value) {
            addCriterion("OURORGID like", value, "ourorgid");
            return (Criteria) this;
        }

        public Criteria andOurorgidNotLike(String value) {
            addCriterion("OURORGID not like", value, "ourorgid");
            return (Criteria) this;
        }

        public Criteria andOurorgidIn(List<String> values) {
            addCriterion("OURORGID in", values, "ourorgid");
            return (Criteria) this;
        }

        public Criteria andOurorgidNotIn(List<String> values) {
            addCriterion("OURORGID not in", values, "ourorgid");
            return (Criteria) this;
        }

        public Criteria andOurorgidBetween(String value1, String value2) {
            addCriterion("OURORGID between", value1, value2, "ourorgid");
            return (Criteria) this;
        }

        public Criteria andOurorgidNotBetween(String value1, String value2) {
            addCriterion("OURORGID not between", value1, value2, "ourorgid");
            return (Criteria) this;
        }

        public Criteria andOpporgidIsNull() {
            addCriterion("OPPORGID is null");
            return (Criteria) this;
        }

        public Criteria andOpporgidIsNotNull() {
            addCriterion("OPPORGID is not null");
            return (Criteria) this;
        }

        public Criteria andOpporgidEqualTo(String value) {
            addCriterion("OPPORGID =", value, "opporgid");
            return (Criteria) this;
        }

        public Criteria andOpporgidNotEqualTo(String value) {
            addCriterion("OPPORGID <>", value, "opporgid");
            return (Criteria) this;
        }

        public Criteria andOpporgidGreaterThan(String value) {
            addCriterion("OPPORGID >", value, "opporgid");
            return (Criteria) this;
        }

        public Criteria andOpporgidGreaterThanOrEqualTo(String value) {
            addCriterion("OPPORGID >=", value, "opporgid");
            return (Criteria) this;
        }

        public Criteria andOpporgidLessThan(String value) {
            addCriterion("OPPORGID <", value, "opporgid");
            return (Criteria) this;
        }

        public Criteria andOpporgidLessThanOrEqualTo(String value) {
            addCriterion("OPPORGID <=", value, "opporgid");
            return (Criteria) this;
        }

        public Criteria andOpporgidLike(String value) {
            addCriterion("OPPORGID like", value, "opporgid");
            return (Criteria) this;
        }

        public Criteria andOpporgidNotLike(String value) {
            addCriterion("OPPORGID not like", value, "opporgid");
            return (Criteria) this;
        }

        public Criteria andOpporgidIn(List<String> values) {
            addCriterion("OPPORGID in", values, "opporgid");
            return (Criteria) this;
        }

        public Criteria andOpporgidNotIn(List<String> values) {
            addCriterion("OPPORGID not in", values, "opporgid");
            return (Criteria) this;
        }

        public Criteria andOpporgidBetween(String value1, String value2) {
            addCriterion("OPPORGID between", value1, value2, "opporgid");
            return (Criteria) this;
        }

        public Criteria andOpporgidNotBetween(String value1, String value2) {
            addCriterion("OPPORGID not between", value1, value2, "opporgid");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("PRIORITY like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("PRIORITY not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("CATEGORY =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("CATEGORY <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("CATEGORY >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("CATEGORY <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("CATEGORY like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("CATEGORY not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("CATEGORY in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("CATEGORY not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("CATEGORY between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("CATEGORY not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCorecompanysupplierrateIsNull() {
            addCriterion("CORECOMPANYSUPPLIERRATE is null");
            return (Criteria) this;
        }

        public Criteria andCorecompanysupplierrateIsNotNull() {
            addCriterion("CORECOMPANYSUPPLIERRATE is not null");
            return (Criteria) this;
        }

        public Criteria andCorecompanysupplierrateEqualTo(Double value) {
            addCriterion("CORECOMPANYSUPPLIERRATE =", value, "corecompanysupplierrate");
            return (Criteria) this;
        }

        public Criteria andCorecompanysupplierrateNotEqualTo(Double value) {
            addCriterion("CORECOMPANYSUPPLIERRATE <>", value, "corecompanysupplierrate");
            return (Criteria) this;
        }

        public Criteria andCorecompanysupplierrateGreaterThan(Double value) {
            addCriterion("CORECOMPANYSUPPLIERRATE >", value, "corecompanysupplierrate");
            return (Criteria) this;
        }

        public Criteria andCorecompanysupplierrateGreaterThanOrEqualTo(Double value) {
            addCriterion("CORECOMPANYSUPPLIERRATE >=", value, "corecompanysupplierrate");
            return (Criteria) this;
        }

        public Criteria andCorecompanysupplierrateLessThan(Double value) {
            addCriterion("CORECOMPANYSUPPLIERRATE <", value, "corecompanysupplierrate");
            return (Criteria) this;
        }

        public Criteria andCorecompanysupplierrateLessThanOrEqualTo(Double value) {
            addCriterion("CORECOMPANYSUPPLIERRATE <=", value, "corecompanysupplierrate");
            return (Criteria) this;
        }

        public Criteria andCorecompanysupplierrateIn(List<Double> values) {
            addCriterion("CORECOMPANYSUPPLIERRATE in", values, "corecompanysupplierrate");
            return (Criteria) this;
        }

        public Criteria andCorecompanysupplierrateNotIn(List<Double> values) {
            addCriterion("CORECOMPANYSUPPLIERRATE not in", values, "corecompanysupplierrate");
            return (Criteria) this;
        }

        public Criteria andCorecompanysupplierrateBetween(Double value1, Double value2) {
            addCriterion("CORECOMPANYSUPPLIERRATE between", value1, value2, "corecompanysupplierrate");
            return (Criteria) this;
        }

        public Criteria andCorecompanysupplierrateNotBetween(Double value1, Double value2) {
            addCriterion("CORECOMPANYSUPPLIERRATE not between", value1, value2, "corecompanysupplierrate");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("CREATEDBY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("CREATEDBY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(String value) {
            addCriterion("CREATEDBY =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(String value) {
            addCriterion("CREATEDBY <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(String value) {
            addCriterion("CREATEDBY >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEDBY >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(String value) {
            addCriterion("CREATEDBY <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(String value) {
            addCriterion("CREATEDBY <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLike(String value) {
            addCriterion("CREATEDBY like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotLike(String value) {
            addCriterion("CREATEDBY not like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<String> values) {
            addCriterion("CREATEDBY in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<String> values) {
            addCriterion("CREATEDBY not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(String value1, String value2) {
            addCriterion("CREATEDBY between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(String value1, String value2) {
            addCriterion("CREATEDBY not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedonIsNull() {
            addCriterion("CREATEDON is null");
            return (Criteria) this;
        }

        public Criteria andCreatedonIsNotNull() {
            addCriterion("CREATEDON is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedonEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDON =", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDON <>", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATEDON >", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDON >=", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonLessThan(Date value) {
            addCriterionForJDBCDate("CREATEDON <", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDON <=", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonIn(List<Date> values) {
            addCriterionForJDBCDate("CREATEDON in", values, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATEDON not in", values, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATEDON between", value1, value2, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATEDON not between", value1, value2, "createdon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIsNull() {
            addCriterion("LASTMODIFIEDBY is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIsNotNull() {
            addCriterion("LASTMODIFIEDBY is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyEqualTo(String value) {
            addCriterion("LASTMODIFIEDBY =", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotEqualTo(String value) {
            addCriterion("LASTMODIFIEDBY <>", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyGreaterThan(String value) {
            addCriterion("LASTMODIFIEDBY >", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyGreaterThanOrEqualTo(String value) {
            addCriterion("LASTMODIFIEDBY >=", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLessThan(String value) {
            addCriterion("LASTMODIFIEDBY <", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLessThanOrEqualTo(String value) {
            addCriterion("LASTMODIFIEDBY <=", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLike(String value) {
            addCriterion("LASTMODIFIEDBY like", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotLike(String value) {
            addCriterion("LASTMODIFIEDBY not like", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIn(List<String> values) {
            addCriterion("LASTMODIFIEDBY in", values, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotIn(List<String> values) {
            addCriterion("LASTMODIFIEDBY not in", values, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyBetween(String value1, String value2) {
            addCriterion("LASTMODIFIEDBY between", value1, value2, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotBetween(String value1, String value2) {
            addCriterion("LASTMODIFIEDBY not between", value1, value2, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonIsNull() {
            addCriterion("LASTMODIFIEDON is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonIsNotNull() {
            addCriterion("LASTMODIFIEDON is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonEqualTo(Date value) {
            addCriterionForJDBCDate("LASTMODIFIEDON =", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonNotEqualTo(Date value) {
            addCriterionForJDBCDate("LASTMODIFIEDON <>", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonGreaterThan(Date value) {
            addCriterionForJDBCDate("LASTMODIFIEDON >", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LASTMODIFIEDON >=", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonLessThan(Date value) {
            addCriterionForJDBCDate("LASTMODIFIEDON <", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LASTMODIFIEDON <=", value, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonIn(List<Date> values) {
            addCriterionForJDBCDate("LASTMODIFIEDON in", values, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonNotIn(List<Date> values) {
            addCriterionForJDBCDate("LASTMODIFIEDON not in", values, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LASTMODIFIEDON between", value1, value2, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedonNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LASTMODIFIEDON not between", value1, value2, "lastmodifiedon");
            return (Criteria) this;
        }

        public Criteria andRowversionIsNull() {
            addCriterion("ROWVERSION is null");
            return (Criteria) this;
        }

        public Criteria andRowversionIsNotNull() {
            addCriterion("ROWVERSION is not null");
            return (Criteria) this;
        }

        public Criteria andRowversionEqualTo(BigDecimal value) {
            addCriterion("ROWVERSION =", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionNotEqualTo(BigDecimal value) {
            addCriterion("ROWVERSION <>", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionGreaterThan(BigDecimal value) {
            addCriterion("ROWVERSION >", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROWVERSION >=", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionLessThan(BigDecimal value) {
            addCriterion("ROWVERSION <", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROWVERSION <=", value, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionIn(List<BigDecimal> values) {
            addCriterion("ROWVERSION in", values, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionNotIn(List<BigDecimal> values) {
            addCriterion("ROWVERSION not in", values, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROWVERSION between", value1, value2, "rowversion");
            return (Criteria) this;
        }

        public Criteria andRowversionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROWVERSION not between", value1, value2, "rowversion");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andIsblackIsNull() {
            addCriterion("ISBLACK is null");
            return (Criteria) this;
        }

        public Criteria andIsblackIsNotNull() {
            addCriterion("ISBLACK is not null");
            return (Criteria) this;
        }

        public Criteria andIsblackEqualTo(String value) {
            addCriterion("ISBLACK =", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackNotEqualTo(String value) {
            addCriterion("ISBLACK <>", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackGreaterThan(String value) {
            addCriterion("ISBLACK >", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackGreaterThanOrEqualTo(String value) {
            addCriterion("ISBLACK >=", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackLessThan(String value) {
            addCriterion("ISBLACK <", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackLessThanOrEqualTo(String value) {
            addCriterion("ISBLACK <=", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackLike(String value) {
            addCriterion("ISBLACK like", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackNotLike(String value) {
            addCriterion("ISBLACK not like", value, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackIn(List<String> values) {
            addCriterion("ISBLACK in", values, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackNotIn(List<String> values) {
            addCriterion("ISBLACK not in", values, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackBetween(String value1, String value2) {
            addCriterion("ISBLACK between", value1, value2, "isblack");
            return (Criteria) this;
        }

        public Criteria andIsblackNotBetween(String value1, String value2) {
            addCriterion("ISBLACK not between", value1, value2, "isblack");
            return (Criteria) this;
        }

        public Criteria andExtensiondateIsNull() {
            addCriterion("EXTENSIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andExtensiondateIsNotNull() {
            addCriterion("EXTENSIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andExtensiondateEqualTo(BigDecimal value) {
            addCriterion("EXTENSIONDATE =", value, "extensiondate");
            return (Criteria) this;
        }

        public Criteria andExtensiondateNotEqualTo(BigDecimal value) {
            addCriterion("EXTENSIONDATE <>", value, "extensiondate");
            return (Criteria) this;
        }

        public Criteria andExtensiondateGreaterThan(BigDecimal value) {
            addCriterion("EXTENSIONDATE >", value, "extensiondate");
            return (Criteria) this;
        }

        public Criteria andExtensiondateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTENSIONDATE >=", value, "extensiondate");
            return (Criteria) this;
        }

        public Criteria andExtensiondateLessThan(BigDecimal value) {
            addCriterion("EXTENSIONDATE <", value, "extensiondate");
            return (Criteria) this;
        }

        public Criteria andExtensiondateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTENSIONDATE <=", value, "extensiondate");
            return (Criteria) this;
        }

        public Criteria andExtensiondateIn(List<BigDecimal> values) {
            addCriterion("EXTENSIONDATE in", values, "extensiondate");
            return (Criteria) this;
        }

        public Criteria andExtensiondateNotIn(List<BigDecimal> values) {
            addCriterion("EXTENSIONDATE not in", values, "extensiondate");
            return (Criteria) this;
        }

        public Criteria andExtensiondateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTENSIONDATE between", value1, value2, "extensiondate");
            return (Criteria) this;
        }

        public Criteria andExtensiondateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTENSIONDATE not between", value1, value2, "extensiondate");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidIsNull() {
            addCriterion("ORGANIZATIONRELATIONID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidIsNotNull() {
            addCriterion("ORGANIZATIONRELATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidEqualTo(String value) {
            addCriterion("ORGANIZATIONRELATIONID =", value, "organizationrelationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidNotEqualTo(String value) {
            addCriterion("ORGANIZATIONRELATIONID <>", value, "organizationrelationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidGreaterThan(String value) {
            addCriterion("ORGANIZATIONRELATIONID >", value, "organizationrelationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONRELATIONID >=", value, "organizationrelationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidLessThan(String value) {
            addCriterion("ORGANIZATIONRELATIONID <", value, "organizationrelationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONRELATIONID <=", value, "organizationrelationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidLike(String value) {
            addCriterion("ORGANIZATIONRELATIONID like", value, "organizationrelationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidNotLike(String value) {
            addCriterion("ORGANIZATIONRELATIONID not like", value, "organizationrelationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidIn(List<String> values) {
            addCriterion("ORGANIZATIONRELATIONID in", values, "organizationrelationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidNotIn(List<String> values) {
            addCriterion("ORGANIZATIONRELATIONID not in", values, "organizationrelationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONRELATIONID between", value1, value2, "organizationrelationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationrelationidNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONRELATIONID not between", value1, value2, "organizationrelationid");
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