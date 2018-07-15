package com.peacock.shop.web.domain;

import java.util.ArrayList;
import java.util.List;

public class VirtualCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VirtualCardExample() {
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

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Integer value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Integer value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Integer value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Integer value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Integer> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Integer> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Integer value1, Integer value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
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

        public Criteria andCardSnIsNull() {
            addCriterion("card_sn is null");
            return (Criteria) this;
        }

        public Criteria andCardSnIsNotNull() {
            addCriterion("card_sn is not null");
            return (Criteria) this;
        }

        public Criteria andCardSnEqualTo(String value) {
            addCriterion("card_sn =", value, "cardSn");
            return (Criteria) this;
        }

        public Criteria andCardSnNotEqualTo(String value) {
            addCriterion("card_sn <>", value, "cardSn");
            return (Criteria) this;
        }

        public Criteria andCardSnGreaterThan(String value) {
            addCriterion("card_sn >", value, "cardSn");
            return (Criteria) this;
        }

        public Criteria andCardSnGreaterThanOrEqualTo(String value) {
            addCriterion("card_sn >=", value, "cardSn");
            return (Criteria) this;
        }

        public Criteria andCardSnLessThan(String value) {
            addCriterion("card_sn <", value, "cardSn");
            return (Criteria) this;
        }

        public Criteria andCardSnLessThanOrEqualTo(String value) {
            addCriterion("card_sn <=", value, "cardSn");
            return (Criteria) this;
        }

        public Criteria andCardSnLike(String value) {
            addCriterion("card_sn like", value, "cardSn");
            return (Criteria) this;
        }

        public Criteria andCardSnNotLike(String value) {
            addCriterion("card_sn not like", value, "cardSn");
            return (Criteria) this;
        }

        public Criteria andCardSnIn(List<String> values) {
            addCriterion("card_sn in", values, "cardSn");
            return (Criteria) this;
        }

        public Criteria andCardSnNotIn(List<String> values) {
            addCriterion("card_sn not in", values, "cardSn");
            return (Criteria) this;
        }

        public Criteria andCardSnBetween(String value1, String value2) {
            addCriterion("card_sn between", value1, value2, "cardSn");
            return (Criteria) this;
        }

        public Criteria andCardSnNotBetween(String value1, String value2) {
            addCriterion("card_sn not between", value1, value2, "cardSn");
            return (Criteria) this;
        }

        public Criteria andCardPasswordIsNull() {
            addCriterion("card_password is null");
            return (Criteria) this;
        }

        public Criteria andCardPasswordIsNotNull() {
            addCriterion("card_password is not null");
            return (Criteria) this;
        }

        public Criteria andCardPasswordEqualTo(String value) {
            addCriterion("card_password =", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordNotEqualTo(String value) {
            addCriterion("card_password <>", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordGreaterThan(String value) {
            addCriterion("card_password >", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("card_password >=", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordLessThan(String value) {
            addCriterion("card_password <", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordLessThanOrEqualTo(String value) {
            addCriterion("card_password <=", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordLike(String value) {
            addCriterion("card_password like", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordNotLike(String value) {
            addCriterion("card_password not like", value, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordIn(List<String> values) {
            addCriterion("card_password in", values, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordNotIn(List<String> values) {
            addCriterion("card_password not in", values, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordBetween(String value1, String value2) {
            addCriterion("card_password between", value1, value2, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andCardPasswordNotBetween(String value1, String value2) {
            addCriterion("card_password not between", value1, value2, "cardPassword");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNull() {
            addCriterion("add_date is null");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNotNull() {
            addCriterion("add_date is not null");
            return (Criteria) this;
        }

        public Criteria andAddDateEqualTo(Integer value) {
            addCriterion("add_date =", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotEqualTo(Integer value) {
            addCriterion("add_date <>", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThan(Integer value) {
            addCriterion("add_date >", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_date >=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThan(Integer value) {
            addCriterion("add_date <", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThanOrEqualTo(Integer value) {
            addCriterion("add_date <=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateIn(List<Integer> values) {
            addCriterion("add_date in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotIn(List<Integer> values) {
            addCriterion("add_date not in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateBetween(Integer value1, Integer value2) {
            addCriterion("add_date between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotBetween(Integer value1, Integer value2) {
            addCriterion("add_date not between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Integer value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Integer value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Integer value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Integer value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Integer value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Integer> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Integer> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Integer value1, Integer value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Integer value1, Integer value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andIsSaledIsNull() {
            addCriterion("is_saled is null");
            return (Criteria) this;
        }

        public Criteria andIsSaledIsNotNull() {
            addCriterion("is_saled is not null");
            return (Criteria) this;
        }

        public Criteria andIsSaledEqualTo(Boolean value) {
            addCriterion("is_saled =", value, "isSaled");
            return (Criteria) this;
        }

        public Criteria andIsSaledNotEqualTo(Boolean value) {
            addCriterion("is_saled <>", value, "isSaled");
            return (Criteria) this;
        }

        public Criteria andIsSaledGreaterThan(Boolean value) {
            addCriterion("is_saled >", value, "isSaled");
            return (Criteria) this;
        }

        public Criteria andIsSaledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_saled >=", value, "isSaled");
            return (Criteria) this;
        }

        public Criteria andIsSaledLessThan(Boolean value) {
            addCriterion("is_saled <", value, "isSaled");
            return (Criteria) this;
        }

        public Criteria andIsSaledLessThanOrEqualTo(Boolean value) {
            addCriterion("is_saled <=", value, "isSaled");
            return (Criteria) this;
        }

        public Criteria andIsSaledIn(List<Boolean> values) {
            addCriterion("is_saled in", values, "isSaled");
            return (Criteria) this;
        }

        public Criteria andIsSaledNotIn(List<Boolean> values) {
            addCriterion("is_saled not in", values, "isSaled");
            return (Criteria) this;
        }

        public Criteria andIsSaledBetween(Boolean value1, Boolean value2) {
            addCriterion("is_saled between", value1, value2, "isSaled");
            return (Criteria) this;
        }

        public Criteria andIsSaledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_saled not between", value1, value2, "isSaled");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andCrc32IsNull() {
            addCriterion("crc32 is null");
            return (Criteria) this;
        }

        public Criteria andCrc32IsNotNull() {
            addCriterion("crc32 is not null");
            return (Criteria) this;
        }

        public Criteria andCrc32EqualTo(String value) {
            addCriterion("crc32 =", value, "crc32");
            return (Criteria) this;
        }

        public Criteria andCrc32NotEqualTo(String value) {
            addCriterion("crc32 <>", value, "crc32");
            return (Criteria) this;
        }

        public Criteria andCrc32GreaterThan(String value) {
            addCriterion("crc32 >", value, "crc32");
            return (Criteria) this;
        }

        public Criteria andCrc32GreaterThanOrEqualTo(String value) {
            addCriterion("crc32 >=", value, "crc32");
            return (Criteria) this;
        }

        public Criteria andCrc32LessThan(String value) {
            addCriterion("crc32 <", value, "crc32");
            return (Criteria) this;
        }

        public Criteria andCrc32LessThanOrEqualTo(String value) {
            addCriterion("crc32 <=", value, "crc32");
            return (Criteria) this;
        }

        public Criteria andCrc32Like(String value) {
            addCriterion("crc32 like", value, "crc32");
            return (Criteria) this;
        }

        public Criteria andCrc32NotLike(String value) {
            addCriterion("crc32 not like", value, "crc32");
            return (Criteria) this;
        }

        public Criteria andCrc32In(List<String> values) {
            addCriterion("crc32 in", values, "crc32");
            return (Criteria) this;
        }

        public Criteria andCrc32NotIn(List<String> values) {
            addCriterion("crc32 not in", values, "crc32");
            return (Criteria) this;
        }

        public Criteria andCrc32Between(String value1, String value2) {
            addCriterion("crc32 between", value1, value2, "crc32");
            return (Criteria) this;
        }

        public Criteria andCrc32NotBetween(String value1, String value2) {
            addCriterion("crc32 not between", value1, value2, "crc32");
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