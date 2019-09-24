package com.ceying.chx.cpi.base.rm.base.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MallSeckillOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallSeckillOrderExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdIsNull() {
            addCriterion("mall_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdIsNotNull() {
            addCriterion("mall_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdEqualTo(String value) {
            addCriterion("mall_goods_id =", value, "mallGoodsId");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdNotEqualTo(String value) {
            addCriterion("mall_goods_id <>", value, "mallGoodsId");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdGreaterThan(String value) {
            addCriterion("mall_goods_id >", value, "mallGoodsId");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("mall_goods_id >=", value, "mallGoodsId");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdLessThan(String value) {
            addCriterion("mall_goods_id <", value, "mallGoodsId");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("mall_goods_id <=", value, "mallGoodsId");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdLike(String value) {
            addCriterion("mall_goods_id like", value, "mallGoodsId");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdNotLike(String value) {
            addCriterion("mall_goods_id not like", value, "mallGoodsId");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdIn(List<String> values) {
            addCriterion("mall_goods_id in", values, "mallGoodsId");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdNotIn(List<String> values) {
            addCriterion("mall_goods_id not in", values, "mallGoodsId");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdBetween(String value1, String value2) {
            addCriterion("mall_goods_id between", value1, value2, "mallGoodsId");
            return (Criteria) this;
        }

        public Criteria andMallGoodsIdNotBetween(String value1, String value2) {
            addCriterion("mall_goods_id not between", value1, value2, "mallGoodsId");
            return (Criteria) this;
        }

        public Criteria andTotalStockIsNull() {
            addCriterion("total_stock is null");
            return (Criteria) this;
        }

        public Criteria andTotalStockIsNotNull() {
            addCriterion("total_stock is not null");
            return (Criteria) this;
        }

        public Criteria andTotalStockEqualTo(Integer value) {
            addCriterion("total_stock =", value, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockNotEqualTo(Integer value) {
            addCriterion("total_stock <>", value, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockGreaterThan(Integer value) {
            addCriterion("total_stock >", value, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_stock >=", value, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockLessThan(Integer value) {
            addCriterion("total_stock <", value, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockLessThanOrEqualTo(Integer value) {
            addCriterion("total_stock <=", value, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockIn(List<Integer> values) {
            addCriterion("total_stock in", values, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockNotIn(List<Integer> values) {
            addCriterion("total_stock not in", values, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockBetween(Integer value1, Integer value2) {
            addCriterion("total_stock between", value1, value2, "totalStock");
            return (Criteria) this;
        }

        public Criteria andTotalStockNotBetween(Integer value1, Integer value2) {
            addCriterion("total_stock not between", value1, value2, "totalStock");
            return (Criteria) this;
        }

        public Criteria andResidueStockIsNull() {
            addCriterion("residue_stock is null");
            return (Criteria) this;
        }

        public Criteria andResidueStockIsNotNull() {
            addCriterion("residue_stock is not null");
            return (Criteria) this;
        }

        public Criteria andResidueStockEqualTo(Integer value) {
            addCriterion("residue_stock =", value, "residueStock");
            return (Criteria) this;
        }

        public Criteria andResidueStockNotEqualTo(Integer value) {
            addCriterion("residue_stock <>", value, "residueStock");
            return (Criteria) this;
        }

        public Criteria andResidueStockGreaterThan(Integer value) {
            addCriterion("residue_stock >", value, "residueStock");
            return (Criteria) this;
        }

        public Criteria andResidueStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("residue_stock >=", value, "residueStock");
            return (Criteria) this;
        }

        public Criteria andResidueStockLessThan(Integer value) {
            addCriterion("residue_stock <", value, "residueStock");
            return (Criteria) this;
        }

        public Criteria andResidueStockLessThanOrEqualTo(Integer value) {
            addCriterion("residue_stock <=", value, "residueStock");
            return (Criteria) this;
        }

        public Criteria andResidueStockIn(List<Integer> values) {
            addCriterion("residue_stock in", values, "residueStock");
            return (Criteria) this;
        }

        public Criteria andResidueStockNotIn(List<Integer> values) {
            addCriterion("residue_stock not in", values, "residueStock");
            return (Criteria) this;
        }

        public Criteria andResidueStockBetween(Integer value1, Integer value2) {
            addCriterion("residue_stock between", value1, value2, "residueStock");
            return (Criteria) this;
        }

        public Criteria andResidueStockNotBetween(Integer value1, Integer value2) {
            addCriterion("residue_stock not between", value1, value2, "residueStock");
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

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andRversionIsNull() {
            addCriterion("rversion is null");
            return (Criteria) this;
        }

        public Criteria andRversionIsNotNull() {
            addCriterion("rversion is not null");
            return (Criteria) this;
        }

        public Criteria andRversionEqualTo(Integer value) {
            addCriterion("rversion =", value, "rversion");
            return (Criteria) this;
        }

        public Criteria andRversionNotEqualTo(Integer value) {
            addCriterion("rversion <>", value, "rversion");
            return (Criteria) this;
        }

        public Criteria andRversionGreaterThan(Integer value) {
            addCriterion("rversion >", value, "rversion");
            return (Criteria) this;
        }

        public Criteria andRversionGreaterThanOrEqualTo(Integer value) {
            addCriterion("rversion >=", value, "rversion");
            return (Criteria) this;
        }

        public Criteria andRversionLessThan(Integer value) {
            addCriterion("rversion <", value, "rversion");
            return (Criteria) this;
        }

        public Criteria andRversionLessThanOrEqualTo(Integer value) {
            addCriterion("rversion <=", value, "rversion");
            return (Criteria) this;
        }

        public Criteria andRversionIn(List<Integer> values) {
            addCriterion("rversion in", values, "rversion");
            return (Criteria) this;
        }

        public Criteria andRversionNotIn(List<Integer> values) {
            addCriterion("rversion not in", values, "rversion");
            return (Criteria) this;
        }

        public Criteria andRversionBetween(Integer value1, Integer value2) {
            addCriterion("rversion between", value1, value2, "rversion");
            return (Criteria) this;
        }

        public Criteria andRversionNotBetween(Integer value1, Integer value2) {
            addCriterion("rversion not between", value1, value2, "rversion");
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