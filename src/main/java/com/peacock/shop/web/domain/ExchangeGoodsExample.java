package com.peacock.shop.web.domain;

import java.util.ArrayList;
import java.util.List;

public class ExchangeGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeGoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralIsNull() {
            addCriterion("exchange_integral is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralIsNotNull() {
            addCriterion("exchange_integral is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralEqualTo(Integer value) {
            addCriterion("exchange_integral =", value, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralNotEqualTo(Integer value) {
            addCriterion("exchange_integral <>", value, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralGreaterThan(Integer value) {
            addCriterion("exchange_integral >", value, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_integral >=", value, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralLessThan(Integer value) {
            addCriterion("exchange_integral <", value, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_integral <=", value, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralIn(List<Integer> values) {
            addCriterion("exchange_integral in", values, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralNotIn(List<Integer> values) {
            addCriterion("exchange_integral not in", values, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralBetween(Integer value1, Integer value2) {
            addCriterion("exchange_integral between", value1, value2, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andExchangeIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_integral not between", value1, value2, "exchangeIntegral");
            return (Criteria) this;
        }

        public Criteria andIsExchangeIsNull() {
            addCriterion("is_exchange is null");
            return (Criteria) this;
        }

        public Criteria andIsExchangeIsNotNull() {
            addCriterion("is_exchange is not null");
            return (Criteria) this;
        }

        public Criteria andIsExchangeEqualTo(Boolean value) {
            addCriterion("is_exchange =", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeNotEqualTo(Boolean value) {
            addCriterion("is_exchange <>", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGreaterThan(Boolean value) {
            addCriterion("is_exchange >", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_exchange >=", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeLessThan(Boolean value) {
            addCriterion("is_exchange <", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_exchange <=", value, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeIn(List<Boolean> values) {
            addCriterion("is_exchange in", values, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeNotIn(List<Boolean> values) {
            addCriterion("is_exchange not in", values, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_exchange between", value1, value2, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsExchangeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_exchange not between", value1, value2, "isExchange");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Boolean value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Boolean value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Boolean value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Boolean value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Boolean value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Boolean> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Boolean> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
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