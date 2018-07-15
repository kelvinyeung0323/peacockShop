package com.peacock.shop.web.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VolumePriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VolumePriceExample() {
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

        public Criteria andPriceTypeIsNull() {
            addCriterion("price_type is null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNotNull() {
            addCriterion("price_type is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeEqualTo(Boolean value) {
            addCriterion("price_type =", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotEqualTo(Boolean value) {
            addCriterion("price_type <>", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThan(Boolean value) {
            addCriterion("price_type >", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("price_type >=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThan(Boolean value) {
            addCriterion("price_type <", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("price_type <=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIn(List<Boolean> values) {
            addCriterion("price_type in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotIn(List<Boolean> values) {
            addCriterion("price_type not in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("price_type between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("price_type not between", value1, value2, "priceType");
            return (Criteria) this;
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

        public Criteria andVolumeNumberIsNull() {
            addCriterion("volume_number is null");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberIsNotNull() {
            addCriterion("volume_number is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberEqualTo(Short value) {
            addCriterion("volume_number =", value, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberNotEqualTo(Short value) {
            addCriterion("volume_number <>", value, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberGreaterThan(Short value) {
            addCriterion("volume_number >", value, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("volume_number >=", value, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberLessThan(Short value) {
            addCriterion("volume_number <", value, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberLessThanOrEqualTo(Short value) {
            addCriterion("volume_number <=", value, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberIn(List<Short> values) {
            addCriterion("volume_number in", values, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberNotIn(List<Short> values) {
            addCriterion("volume_number not in", values, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberBetween(Short value1, Short value2) {
            addCriterion("volume_number between", value1, value2, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumeNumberNotBetween(Short value1, Short value2) {
            addCriterion("volume_number not between", value1, value2, "volumeNumber");
            return (Criteria) this;
        }

        public Criteria andVolumePriceIsNull() {
            addCriterion("volume_price is null");
            return (Criteria) this;
        }

        public Criteria andVolumePriceIsNotNull() {
            addCriterion("volume_price is not null");
            return (Criteria) this;
        }

        public Criteria andVolumePriceEqualTo(BigDecimal value) {
            addCriterion("volume_price =", value, "volumePrice");
            return (Criteria) this;
        }

        public Criteria andVolumePriceNotEqualTo(BigDecimal value) {
            addCriterion("volume_price <>", value, "volumePrice");
            return (Criteria) this;
        }

        public Criteria andVolumePriceGreaterThan(BigDecimal value) {
            addCriterion("volume_price >", value, "volumePrice");
            return (Criteria) this;
        }

        public Criteria andVolumePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("volume_price >=", value, "volumePrice");
            return (Criteria) this;
        }

        public Criteria andVolumePriceLessThan(BigDecimal value) {
            addCriterion("volume_price <", value, "volumePrice");
            return (Criteria) this;
        }

        public Criteria andVolumePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("volume_price <=", value, "volumePrice");
            return (Criteria) this;
        }

        public Criteria andVolumePriceIn(List<BigDecimal> values) {
            addCriterion("volume_price in", values, "volumePrice");
            return (Criteria) this;
        }

        public Criteria andVolumePriceNotIn(List<BigDecimal> values) {
            addCriterion("volume_price not in", values, "volumePrice");
            return (Criteria) this;
        }

        public Criteria andVolumePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volume_price between", value1, value2, "volumePrice");
            return (Criteria) this;
        }

        public Criteria andVolumePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volume_price not between", value1, value2, "volumePrice");
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