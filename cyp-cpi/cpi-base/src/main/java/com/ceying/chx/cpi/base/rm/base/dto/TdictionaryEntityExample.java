package com.ceying.chx.cpi.base.rm.base.dto;

import java.util.ArrayList;
import java.util.List;

public class TdictionaryEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TdictionaryEntityExample() {
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

        public Criteria andCSysnameIsNull() {
            addCriterion("c_sysname is null");
            return (Criteria) this;
        }

        public Criteria andCSysnameIsNotNull() {
            addCriterion("c_sysname is not null");
            return (Criteria) this;
        }

        public Criteria andCSysnameEqualTo(String value) {
            addCriterion("c_sysname =", value, "cSysname");
            return (Criteria) this;
        }

        public Criteria andCSysnameNotEqualTo(String value) {
            addCriterion("c_sysname <>", value, "cSysname");
            return (Criteria) this;
        }

        public Criteria andCSysnameGreaterThan(String value) {
            addCriterion("c_sysname >", value, "cSysname");
            return (Criteria) this;
        }

        public Criteria andCSysnameGreaterThanOrEqualTo(String value) {
            addCriterion("c_sysname >=", value, "cSysname");
            return (Criteria) this;
        }

        public Criteria andCSysnameLessThan(String value) {
            addCriterion("c_sysname <", value, "cSysname");
            return (Criteria) this;
        }

        public Criteria andCSysnameLessThanOrEqualTo(String value) {
            addCriterion("c_sysname <=", value, "cSysname");
            return (Criteria) this;
        }

        public Criteria andCSysnameLike(String value) {
            addCriterion("c_sysname like", value, "cSysname");
            return (Criteria) this;
        }

        public Criteria andCSysnameNotLike(String value) {
            addCriterion("c_sysname not like", value, "cSysname");
            return (Criteria) this;
        }

        public Criteria andCSysnameIn(List<String> values) {
            addCriterion("c_sysname in", values, "cSysname");
            return (Criteria) this;
        }

        public Criteria andCSysnameNotIn(List<String> values) {
            addCriterion("c_sysname not in", values, "cSysname");
            return (Criteria) this;
        }

        public Criteria andCSysnameBetween(String value1, String value2) {
            addCriterion("c_sysname between", value1, value2, "cSysname");
            return (Criteria) this;
        }

        public Criteria andCSysnameNotBetween(String value1, String value2) {
            addCriterion("c_sysname not between", value1, value2, "cSysname");
            return (Criteria) this;
        }

        public Criteria andLKeynoIsNull() {
            addCriterion("l_keyno is null");
            return (Criteria) this;
        }

        public Criteria andLKeynoIsNotNull() {
            addCriterion("l_keyno is not null");
            return (Criteria) this;
        }

        public Criteria andLKeynoEqualTo(Integer value) {
            addCriterion("l_keyno =", value, "lKeyno");
            return (Criteria) this;
        }

        public Criteria andLKeynoNotEqualTo(Integer value) {
            addCriterion("l_keyno <>", value, "lKeyno");
            return (Criteria) this;
        }

        public Criteria andLKeynoGreaterThan(Integer value) {
            addCriterion("l_keyno >", value, "lKeyno");
            return (Criteria) this;
        }

        public Criteria andLKeynoGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_keyno >=", value, "lKeyno");
            return (Criteria) this;
        }

        public Criteria andLKeynoLessThan(Integer value) {
            addCriterion("l_keyno <", value, "lKeyno");
            return (Criteria) this;
        }

        public Criteria andLKeynoLessThanOrEqualTo(Integer value) {
            addCriterion("l_keyno <=", value, "lKeyno");
            return (Criteria) this;
        }

        public Criteria andLKeynoIn(List<Integer> values) {
            addCriterion("l_keyno in", values, "lKeyno");
            return (Criteria) this;
        }

        public Criteria andLKeynoNotIn(List<Integer> values) {
            addCriterion("l_keyno not in", values, "lKeyno");
            return (Criteria) this;
        }

        public Criteria andLKeynoBetween(Integer value1, Integer value2) {
            addCriterion("l_keyno between", value1, value2, "lKeyno");
            return (Criteria) this;
        }

        public Criteria andLKeynoNotBetween(Integer value1, Integer value2) {
            addCriterion("l_keyno not between", value1, value2, "lKeyno");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueIsNull() {
            addCriterion("c_keyvalue is null");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueIsNotNull() {
            addCriterion("c_keyvalue is not null");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueEqualTo(String value) {
            addCriterion("c_keyvalue =", value, "cKeyvalue");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueNotEqualTo(String value) {
            addCriterion("c_keyvalue <>", value, "cKeyvalue");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueGreaterThan(String value) {
            addCriterion("c_keyvalue >", value, "cKeyvalue");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueGreaterThanOrEqualTo(String value) {
            addCriterion("c_keyvalue >=", value, "cKeyvalue");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueLessThan(String value) {
            addCriterion("c_keyvalue <", value, "cKeyvalue");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueLessThanOrEqualTo(String value) {
            addCriterion("c_keyvalue <=", value, "cKeyvalue");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueLike(String value) {
            addCriterion("c_keyvalue like", value, "cKeyvalue");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueNotLike(String value) {
            addCriterion("c_keyvalue not like", value, "cKeyvalue");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueIn(List<String> values) {
            addCriterion("c_keyvalue in", values, "cKeyvalue");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueNotIn(List<String> values) {
            addCriterion("c_keyvalue not in", values, "cKeyvalue");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueBetween(String value1, String value2) {
            addCriterion("c_keyvalue between", value1, value2, "cKeyvalue");
            return (Criteria) this;
        }

        public Criteria andCKeyvalueNotBetween(String value1, String value2) {
            addCriterion("c_keyvalue not between", value1, value2, "cKeyvalue");
            return (Criteria) this;
        }

        public Criteria andCCaptionIsNull() {
            addCriterion("c_caption is null");
            return (Criteria) this;
        }

        public Criteria andCCaptionIsNotNull() {
            addCriterion("c_caption is not null");
            return (Criteria) this;
        }

        public Criteria andCCaptionEqualTo(String value) {
            addCriterion("c_caption =", value, "cCaption");
            return (Criteria) this;
        }

        public Criteria andCCaptionNotEqualTo(String value) {
            addCriterion("c_caption <>", value, "cCaption");
            return (Criteria) this;
        }

        public Criteria andCCaptionGreaterThan(String value) {
            addCriterion("c_caption >", value, "cCaption");
            return (Criteria) this;
        }

        public Criteria andCCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("c_caption >=", value, "cCaption");
            return (Criteria) this;
        }

        public Criteria andCCaptionLessThan(String value) {
            addCriterion("c_caption <", value, "cCaption");
            return (Criteria) this;
        }

        public Criteria andCCaptionLessThanOrEqualTo(String value) {
            addCriterion("c_caption <=", value, "cCaption");
            return (Criteria) this;
        }

        public Criteria andCCaptionLike(String value) {
            addCriterion("c_caption like", value, "cCaption");
            return (Criteria) this;
        }

        public Criteria andCCaptionNotLike(String value) {
            addCriterion("c_caption not like", value, "cCaption");
            return (Criteria) this;
        }

        public Criteria andCCaptionIn(List<String> values) {
            addCriterion("c_caption in", values, "cCaption");
            return (Criteria) this;
        }

        public Criteria andCCaptionNotIn(List<String> values) {
            addCriterion("c_caption not in", values, "cCaption");
            return (Criteria) this;
        }

        public Criteria andCCaptionBetween(String value1, String value2) {
            addCriterion("c_caption between", value1, value2, "cCaption");
            return (Criteria) this;
        }

        public Criteria andCCaptionNotBetween(String value1, String value2) {
            addCriterion("c_caption not between", value1, value2, "cCaption");
            return (Criteria) this;
        }

        public Criteria andCModifyIsNull() {
            addCriterion("c_modify is null");
            return (Criteria) this;
        }

        public Criteria andCModifyIsNotNull() {
            addCriterion("c_modify is not null");
            return (Criteria) this;
        }

        public Criteria andCModifyEqualTo(String value) {
            addCriterion("c_modify =", value, "cModify");
            return (Criteria) this;
        }

        public Criteria andCModifyNotEqualTo(String value) {
            addCriterion("c_modify <>", value, "cModify");
            return (Criteria) this;
        }

        public Criteria andCModifyGreaterThan(String value) {
            addCriterion("c_modify >", value, "cModify");
            return (Criteria) this;
        }

        public Criteria andCModifyGreaterThanOrEqualTo(String value) {
            addCriterion("c_modify >=", value, "cModify");
            return (Criteria) this;
        }

        public Criteria andCModifyLessThan(String value) {
            addCriterion("c_modify <", value, "cModify");
            return (Criteria) this;
        }

        public Criteria andCModifyLessThanOrEqualTo(String value) {
            addCriterion("c_modify <=", value, "cModify");
            return (Criteria) this;
        }

        public Criteria andCModifyLike(String value) {
            addCriterion("c_modify like", value, "cModify");
            return (Criteria) this;
        }

        public Criteria andCModifyNotLike(String value) {
            addCriterion("c_modify not like", value, "cModify");
            return (Criteria) this;
        }

        public Criteria andCModifyIn(List<String> values) {
            addCriterion("c_modify in", values, "cModify");
            return (Criteria) this;
        }

        public Criteria andCModifyNotIn(List<String> values) {
            addCriterion("c_modify not in", values, "cModify");
            return (Criteria) this;
        }

        public Criteria andCModifyBetween(String value1, String value2) {
            addCriterion("c_modify between", value1, value2, "cModify");
            return (Criteria) this;
        }

        public Criteria andCModifyNotBetween(String value1, String value2) {
            addCriterion("c_modify not between", value1, value2, "cModify");
            return (Criteria) this;
        }

        public Criteria andCMemoIsNull() {
            addCriterion("c_memo is null");
            return (Criteria) this;
        }

        public Criteria andCMemoIsNotNull() {
            addCriterion("c_memo is not null");
            return (Criteria) this;
        }

        public Criteria andCMemoEqualTo(String value) {
            addCriterion("c_memo =", value, "cMemo");
            return (Criteria) this;
        }

        public Criteria andCMemoNotEqualTo(String value) {
            addCriterion("c_memo <>", value, "cMemo");
            return (Criteria) this;
        }

        public Criteria andCMemoGreaterThan(String value) {
            addCriterion("c_memo >", value, "cMemo");
            return (Criteria) this;
        }

        public Criteria andCMemoGreaterThanOrEqualTo(String value) {
            addCriterion("c_memo >=", value, "cMemo");
            return (Criteria) this;
        }

        public Criteria andCMemoLessThan(String value) {
            addCriterion("c_memo <", value, "cMemo");
            return (Criteria) this;
        }

        public Criteria andCMemoLessThanOrEqualTo(String value) {
            addCriterion("c_memo <=", value, "cMemo");
            return (Criteria) this;
        }

        public Criteria andCMemoLike(String value) {
            addCriterion("c_memo like", value, "cMemo");
            return (Criteria) this;
        }

        public Criteria andCMemoNotLike(String value) {
            addCriterion("c_memo not like", value, "cMemo");
            return (Criteria) this;
        }

        public Criteria andCMemoIn(List<String> values) {
            addCriterion("c_memo in", values, "cMemo");
            return (Criteria) this;
        }

        public Criteria andCMemoNotIn(List<String> values) {
            addCriterion("c_memo not in", values, "cMemo");
            return (Criteria) this;
        }

        public Criteria andCMemoBetween(String value1, String value2) {
            addCriterion("c_memo between", value1, value2, "cMemo");
            return (Criteria) this;
        }

        public Criteria andCMemoNotBetween(String value1, String value2) {
            addCriterion("c_memo not between", value1, value2, "cMemo");
            return (Criteria) this;
        }

        public Criteria andCEnglishIsNull() {
            addCriterion("c_english is null");
            return (Criteria) this;
        }

        public Criteria andCEnglishIsNotNull() {
            addCriterion("c_english is not null");
            return (Criteria) this;
        }

        public Criteria andCEnglishEqualTo(String value) {
            addCriterion("c_english =", value, "cEnglish");
            return (Criteria) this;
        }

        public Criteria andCEnglishNotEqualTo(String value) {
            addCriterion("c_english <>", value, "cEnglish");
            return (Criteria) this;
        }

        public Criteria andCEnglishGreaterThan(String value) {
            addCriterion("c_english >", value, "cEnglish");
            return (Criteria) this;
        }

        public Criteria andCEnglishGreaterThanOrEqualTo(String value) {
            addCriterion("c_english >=", value, "cEnglish");
            return (Criteria) this;
        }

        public Criteria andCEnglishLessThan(String value) {
            addCriterion("c_english <", value, "cEnglish");
            return (Criteria) this;
        }

        public Criteria andCEnglishLessThanOrEqualTo(String value) {
            addCriterion("c_english <=", value, "cEnglish");
            return (Criteria) this;
        }

        public Criteria andCEnglishLike(String value) {
            addCriterion("c_english like", value, "cEnglish");
            return (Criteria) this;
        }

        public Criteria andCEnglishNotLike(String value) {
            addCriterion("c_english not like", value, "cEnglish");
            return (Criteria) this;
        }

        public Criteria andCEnglishIn(List<String> values) {
            addCriterion("c_english in", values, "cEnglish");
            return (Criteria) this;
        }

        public Criteria andCEnglishNotIn(List<String> values) {
            addCriterion("c_english not in", values, "cEnglish");
            return (Criteria) this;
        }

        public Criteria andCEnglishBetween(String value1, String value2) {
            addCriterion("c_english between", value1, value2, "cEnglish");
            return (Criteria) this;
        }

        public Criteria andCEnglishNotBetween(String value1, String value2) {
            addCriterion("c_english not between", value1, value2, "cEnglish");
            return (Criteria) this;
        }

        public Criteria andLOrderIsNull() {
            addCriterion("l_order is null");
            return (Criteria) this;
        }

        public Criteria andLOrderIsNotNull() {
            addCriterion("l_order is not null");
            return (Criteria) this;
        }

        public Criteria andLOrderEqualTo(Integer value) {
            addCriterion("l_order =", value, "lOrder");
            return (Criteria) this;
        }

        public Criteria andLOrderNotEqualTo(Integer value) {
            addCriterion("l_order <>", value, "lOrder");
            return (Criteria) this;
        }

        public Criteria andLOrderGreaterThan(Integer value) {
            addCriterion("l_order >", value, "lOrder");
            return (Criteria) this;
        }

        public Criteria andLOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_order >=", value, "lOrder");
            return (Criteria) this;
        }

        public Criteria andLOrderLessThan(Integer value) {
            addCriterion("l_order <", value, "lOrder");
            return (Criteria) this;
        }

        public Criteria andLOrderLessThanOrEqualTo(Integer value) {
            addCriterion("l_order <=", value, "lOrder");
            return (Criteria) this;
        }

        public Criteria andLOrderIn(List<Integer> values) {
            addCriterion("l_order in", values, "lOrder");
            return (Criteria) this;
        }

        public Criteria andLOrderNotIn(List<Integer> values) {
            addCriterion("l_order not in", values, "lOrder");
            return (Criteria) this;
        }

        public Criteria andLOrderBetween(Integer value1, Integer value2) {
            addCriterion("l_order between", value1, value2, "lOrder");
            return (Criteria) this;
        }

        public Criteria andLOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("l_order not between", value1, value2, "lOrder");
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