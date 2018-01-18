package com.ceying.chx.cpi.base.rm.base.dto;

import java.util.ArrayList;
import java.util.List;

public class SubTransEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubTransEntityExample() {
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

        public Criteria andTransCodeIsNull() {
            addCriterion("trans_code is null");
            return (Criteria) this;
        }

        public Criteria andTransCodeIsNotNull() {
            addCriterion("trans_code is not null");
            return (Criteria) this;
        }

        public Criteria andTransCodeEqualTo(String value) {
            addCriterion("trans_code =", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotEqualTo(String value) {
            addCriterion("trans_code <>", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeGreaterThan(String value) {
            addCriterion("trans_code >", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeGreaterThanOrEqualTo(String value) {
            addCriterion("trans_code >=", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeLessThan(String value) {
            addCriterion("trans_code <", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeLessThanOrEqualTo(String value) {
            addCriterion("trans_code <=", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeLike(String value) {
            addCriterion("trans_code like", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotLike(String value) {
            addCriterion("trans_code not like", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeIn(List<String> values) {
            addCriterion("trans_code in", values, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotIn(List<String> values) {
            addCriterion("trans_code not in", values, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeBetween(String value1, String value2) {
            addCriterion("trans_code between", value1, value2, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotBetween(String value1, String value2) {
            addCriterion("trans_code not between", value1, value2, "transCode");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeIsNull() {
            addCriterion("sub_trans_code is null");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeIsNotNull() {
            addCriterion("sub_trans_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeEqualTo(String value) {
            addCriterion("sub_trans_code =", value, "subTransCode");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeNotEqualTo(String value) {
            addCriterion("sub_trans_code <>", value, "subTransCode");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeGreaterThan(String value) {
            addCriterion("sub_trans_code >", value, "subTransCode");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_trans_code >=", value, "subTransCode");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeLessThan(String value) {
            addCriterion("sub_trans_code <", value, "subTransCode");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeLessThanOrEqualTo(String value) {
            addCriterion("sub_trans_code <=", value, "subTransCode");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeLike(String value) {
            addCriterion("sub_trans_code like", value, "subTransCode");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeNotLike(String value) {
            addCriterion("sub_trans_code not like", value, "subTransCode");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeIn(List<String> values) {
            addCriterion("sub_trans_code in", values, "subTransCode");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeNotIn(List<String> values) {
            addCriterion("sub_trans_code not in", values, "subTransCode");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeBetween(String value1, String value2) {
            addCriterion("sub_trans_code between", value1, value2, "subTransCode");
            return (Criteria) this;
        }

        public Criteria andSubTransCodeNotBetween(String value1, String value2) {
            addCriterion("sub_trans_code not between", value1, value2, "subTransCode");
            return (Criteria) this;
        }

        public Criteria andSubTransNameIsNull() {
            addCriterion("sub_trans_name is null");
            return (Criteria) this;
        }

        public Criteria andSubTransNameIsNotNull() {
            addCriterion("sub_trans_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubTransNameEqualTo(String value) {
            addCriterion("sub_trans_name =", value, "subTransName");
            return (Criteria) this;
        }

        public Criteria andSubTransNameNotEqualTo(String value) {
            addCriterion("sub_trans_name <>", value, "subTransName");
            return (Criteria) this;
        }

        public Criteria andSubTransNameGreaterThan(String value) {
            addCriterion("sub_trans_name >", value, "subTransName");
            return (Criteria) this;
        }

        public Criteria andSubTransNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_trans_name >=", value, "subTransName");
            return (Criteria) this;
        }

        public Criteria andSubTransNameLessThan(String value) {
            addCriterion("sub_trans_name <", value, "subTransName");
            return (Criteria) this;
        }

        public Criteria andSubTransNameLessThanOrEqualTo(String value) {
            addCriterion("sub_trans_name <=", value, "subTransName");
            return (Criteria) this;
        }

        public Criteria andSubTransNameLike(String value) {
            addCriterion("sub_trans_name like", value, "subTransName");
            return (Criteria) this;
        }

        public Criteria andSubTransNameNotLike(String value) {
            addCriterion("sub_trans_name not like", value, "subTransName");
            return (Criteria) this;
        }

        public Criteria andSubTransNameIn(List<String> values) {
            addCriterion("sub_trans_name in", values, "subTransName");
            return (Criteria) this;
        }

        public Criteria andSubTransNameNotIn(List<String> values) {
            addCriterion("sub_trans_name not in", values, "subTransName");
            return (Criteria) this;
        }

        public Criteria andSubTransNameBetween(String value1, String value2) {
            addCriterion("sub_trans_name between", value1, value2, "subTransName");
            return (Criteria) this;
        }

        public Criteria andSubTransNameNotBetween(String value1, String value2) {
            addCriterion("sub_trans_name not between", value1, value2, "subTransName");
            return (Criteria) this;
        }

        public Criteria andRelServIsNull() {
            addCriterion("rel_serv is null");
            return (Criteria) this;
        }

        public Criteria andRelServIsNotNull() {
            addCriterion("rel_serv is not null");
            return (Criteria) this;
        }

        public Criteria andRelServEqualTo(String value) {
            addCriterion("rel_serv =", value, "relServ");
            return (Criteria) this;
        }

        public Criteria andRelServNotEqualTo(String value) {
            addCriterion("rel_serv <>", value, "relServ");
            return (Criteria) this;
        }

        public Criteria andRelServGreaterThan(String value) {
            addCriterion("rel_serv >", value, "relServ");
            return (Criteria) this;
        }

        public Criteria andRelServGreaterThanOrEqualTo(String value) {
            addCriterion("rel_serv >=", value, "relServ");
            return (Criteria) this;
        }

        public Criteria andRelServLessThan(String value) {
            addCriterion("rel_serv <", value, "relServ");
            return (Criteria) this;
        }

        public Criteria andRelServLessThanOrEqualTo(String value) {
            addCriterion("rel_serv <=", value, "relServ");
            return (Criteria) this;
        }

        public Criteria andRelServLike(String value) {
            addCriterion("rel_serv like", value, "relServ");
            return (Criteria) this;
        }

        public Criteria andRelServNotLike(String value) {
            addCriterion("rel_serv not like", value, "relServ");
            return (Criteria) this;
        }

        public Criteria andRelServIn(List<String> values) {
            addCriterion("rel_serv in", values, "relServ");
            return (Criteria) this;
        }

        public Criteria andRelServNotIn(List<String> values) {
            addCriterion("rel_serv not in", values, "relServ");
            return (Criteria) this;
        }

        public Criteria andRelServBetween(String value1, String value2) {
            addCriterion("rel_serv between", value1, value2, "relServ");
            return (Criteria) this;
        }

        public Criteria andRelServNotBetween(String value1, String value2) {
            addCriterion("rel_serv not between", value1, value2, "relServ");
            return (Criteria) this;
        }

        public Criteria andRelUrlIsNull() {
            addCriterion("rel_url is null");
            return (Criteria) this;
        }

        public Criteria andRelUrlIsNotNull() {
            addCriterion("rel_url is not null");
            return (Criteria) this;
        }

        public Criteria andRelUrlEqualTo(String value) {
            addCriterion("rel_url =", value, "relUrl");
            return (Criteria) this;
        }

        public Criteria andRelUrlNotEqualTo(String value) {
            addCriterion("rel_url <>", value, "relUrl");
            return (Criteria) this;
        }

        public Criteria andRelUrlGreaterThan(String value) {
            addCriterion("rel_url >", value, "relUrl");
            return (Criteria) this;
        }

        public Criteria andRelUrlGreaterThanOrEqualTo(String value) {
            addCriterion("rel_url >=", value, "relUrl");
            return (Criteria) this;
        }

        public Criteria andRelUrlLessThan(String value) {
            addCriterion("rel_url <", value, "relUrl");
            return (Criteria) this;
        }

        public Criteria andRelUrlLessThanOrEqualTo(String value) {
            addCriterion("rel_url <=", value, "relUrl");
            return (Criteria) this;
        }

        public Criteria andRelUrlLike(String value) {
            addCriterion("rel_url like", value, "relUrl");
            return (Criteria) this;
        }

        public Criteria andRelUrlNotLike(String value) {
            addCriterion("rel_url not like", value, "relUrl");
            return (Criteria) this;
        }

        public Criteria andRelUrlIn(List<String> values) {
            addCriterion("rel_url in", values, "relUrl");
            return (Criteria) this;
        }

        public Criteria andRelUrlNotIn(List<String> values) {
            addCriterion("rel_url not in", values, "relUrl");
            return (Criteria) this;
        }

        public Criteria andRelUrlBetween(String value1, String value2) {
            addCriterion("rel_url between", value1, value2, "relUrl");
            return (Criteria) this;
        }

        public Criteria andRelUrlNotBetween(String value1, String value2) {
            addCriterion("rel_url not between", value1, value2, "relUrl");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagIsNull() {
            addCriterion("ctrl_flag is null");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagIsNotNull() {
            addCriterion("ctrl_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagEqualTo(String value) {
            addCriterion("ctrl_flag =", value, "ctrlFlag");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagNotEqualTo(String value) {
            addCriterion("ctrl_flag <>", value, "ctrlFlag");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagGreaterThan(String value) {
            addCriterion("ctrl_flag >", value, "ctrlFlag");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ctrl_flag >=", value, "ctrlFlag");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagLessThan(String value) {
            addCriterion("ctrl_flag <", value, "ctrlFlag");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagLessThanOrEqualTo(String value) {
            addCriterion("ctrl_flag <=", value, "ctrlFlag");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagLike(String value) {
            addCriterion("ctrl_flag like", value, "ctrlFlag");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagNotLike(String value) {
            addCriterion("ctrl_flag not like", value, "ctrlFlag");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagIn(List<String> values) {
            addCriterion("ctrl_flag in", values, "ctrlFlag");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagNotIn(List<String> values) {
            addCriterion("ctrl_flag not in", values, "ctrlFlag");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagBetween(String value1, String value2) {
            addCriterion("ctrl_flag between", value1, value2, "ctrlFlag");
            return (Criteria) this;
        }

        public Criteria andCtrlFlagNotBetween(String value1, String value2) {
            addCriterion("ctrl_flag not between", value1, value2, "ctrlFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagIsNull() {
            addCriterion("login_flag is null");
            return (Criteria) this;
        }

        public Criteria andLoginFlagIsNotNull() {
            addCriterion("login_flag is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFlagEqualTo(String value) {
            addCriterion("login_flag =", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotEqualTo(String value) {
            addCriterion("login_flag <>", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagGreaterThan(String value) {
            addCriterion("login_flag >", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagGreaterThanOrEqualTo(String value) {
            addCriterion("login_flag >=", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagLessThan(String value) {
            addCriterion("login_flag <", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagLessThanOrEqualTo(String value) {
            addCriterion("login_flag <=", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagLike(String value) {
            addCriterion("login_flag like", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotLike(String value) {
            addCriterion("login_flag not like", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagIn(List<String> values) {
            addCriterion("login_flag in", values, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotIn(List<String> values) {
            addCriterion("login_flag not in", values, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagBetween(String value1, String value2) {
            addCriterion("login_flag between", value1, value2, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotBetween(String value1, String value2) {
            addCriterion("login_flag not between", value1, value2, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andExtField1IsNull() {
            addCriterion("ext_field_1 is null");
            return (Criteria) this;
        }

        public Criteria andExtField1IsNotNull() {
            addCriterion("ext_field_1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtField1EqualTo(String value) {
            addCriterion("ext_field_1 =", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1NotEqualTo(String value) {
            addCriterion("ext_field_1 <>", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1GreaterThan(String value) {
            addCriterion("ext_field_1 >", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1GreaterThanOrEqualTo(String value) {
            addCriterion("ext_field_1 >=", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1LessThan(String value) {
            addCriterion("ext_field_1 <", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1LessThanOrEqualTo(String value) {
            addCriterion("ext_field_1 <=", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1Like(String value) {
            addCriterion("ext_field_1 like", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1NotLike(String value) {
            addCriterion("ext_field_1 not like", value, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1In(List<String> values) {
            addCriterion("ext_field_1 in", values, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1NotIn(List<String> values) {
            addCriterion("ext_field_1 not in", values, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1Between(String value1, String value2) {
            addCriterion("ext_field_1 between", value1, value2, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField1NotBetween(String value1, String value2) {
            addCriterion("ext_field_1 not between", value1, value2, "extField1");
            return (Criteria) this;
        }

        public Criteria andExtField2IsNull() {
            addCriterion("ext_field_2 is null");
            return (Criteria) this;
        }

        public Criteria andExtField2IsNotNull() {
            addCriterion("ext_field_2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtField2EqualTo(String value) {
            addCriterion("ext_field_2 =", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2NotEqualTo(String value) {
            addCriterion("ext_field_2 <>", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2GreaterThan(String value) {
            addCriterion("ext_field_2 >", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2GreaterThanOrEqualTo(String value) {
            addCriterion("ext_field_2 >=", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2LessThan(String value) {
            addCriterion("ext_field_2 <", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2LessThanOrEqualTo(String value) {
            addCriterion("ext_field_2 <=", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2Like(String value) {
            addCriterion("ext_field_2 like", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2NotLike(String value) {
            addCriterion("ext_field_2 not like", value, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2In(List<String> values) {
            addCriterion("ext_field_2 in", values, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2NotIn(List<String> values) {
            addCriterion("ext_field_2 not in", values, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2Between(String value1, String value2) {
            addCriterion("ext_field_2 between", value1, value2, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField2NotBetween(String value1, String value2) {
            addCriterion("ext_field_2 not between", value1, value2, "extField2");
            return (Criteria) this;
        }

        public Criteria andExtField3IsNull() {
            addCriterion("ext_field_3 is null");
            return (Criteria) this;
        }

        public Criteria andExtField3IsNotNull() {
            addCriterion("ext_field_3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtField3EqualTo(String value) {
            addCriterion("ext_field_3 =", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3NotEqualTo(String value) {
            addCriterion("ext_field_3 <>", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3GreaterThan(String value) {
            addCriterion("ext_field_3 >", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3GreaterThanOrEqualTo(String value) {
            addCriterion("ext_field_3 >=", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3LessThan(String value) {
            addCriterion("ext_field_3 <", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3LessThanOrEqualTo(String value) {
            addCriterion("ext_field_3 <=", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3Like(String value) {
            addCriterion("ext_field_3 like", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3NotLike(String value) {
            addCriterion("ext_field_3 not like", value, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3In(List<String> values) {
            addCriterion("ext_field_3 in", values, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3NotIn(List<String> values) {
            addCriterion("ext_field_3 not in", values, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3Between(String value1, String value2) {
            addCriterion("ext_field_3 between", value1, value2, "extField3");
            return (Criteria) this;
        }

        public Criteria andExtField3NotBetween(String value1, String value2) {
            addCriterion("ext_field_3 not between", value1, value2, "extField3");
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