package com.peacock.shop.web.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AuctionLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuctionLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andActIdIsNull() {
            addCriterion("act_id is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("act_id is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(Integer value) {
            addCriterion("act_id =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(Integer value) {
            addCriterion("act_id <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(Integer value) {
            addCriterion("act_id >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_id >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(Integer value) {
            addCriterion("act_id <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(Integer value) {
            addCriterion("act_id <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<Integer> values) {
            addCriterion("act_id in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<Integer> values) {
            addCriterion("act_id not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(Integer value1, Integer value2) {
            addCriterion("act_id between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(Integer value1, Integer value2) {
            addCriterion("act_id not between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andBidUserIsNull() {
            addCriterion("bid_user is null");
            return (Criteria) this;
        }

        public Criteria andBidUserIsNotNull() {
            addCriterion("bid_user is not null");
            return (Criteria) this;
        }

        public Criteria andBidUserEqualTo(Integer value) {
            addCriterion("bid_user =", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserNotEqualTo(Integer value) {
            addCriterion("bid_user <>", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserGreaterThan(Integer value) {
            addCriterion("bid_user >", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid_user >=", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserLessThan(Integer value) {
            addCriterion("bid_user <", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserLessThanOrEqualTo(Integer value) {
            addCriterion("bid_user <=", value, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserIn(List<Integer> values) {
            addCriterion("bid_user in", values, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserNotIn(List<Integer> values) {
            addCriterion("bid_user not in", values, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserBetween(Integer value1, Integer value2) {
            addCriterion("bid_user between", value1, value2, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidUserNotBetween(Integer value1, Integer value2) {
            addCriterion("bid_user not between", value1, value2, "bidUser");
            return (Criteria) this;
        }

        public Criteria andBidPriceIsNull() {
            addCriterion("bid_price is null");
            return (Criteria) this;
        }

        public Criteria andBidPriceIsNotNull() {
            addCriterion("bid_price is not null");
            return (Criteria) this;
        }

        public Criteria andBidPriceEqualTo(BigDecimal value) {
            addCriterion("bid_price =", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotEqualTo(BigDecimal value) {
            addCriterion("bid_price <>", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThan(BigDecimal value) {
            addCriterion("bid_price >", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bid_price >=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThan(BigDecimal value) {
            addCriterion("bid_price <", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bid_price <=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceIn(List<BigDecimal> values) {
            addCriterion("bid_price in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotIn(List<BigDecimal> values) {
            addCriterion("bid_price not in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bid_price between", value1, value2, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bid_price not between", value1, value2, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidTimeIsNull() {
            addCriterion("bid_time is null");
            return (Criteria) this;
        }

        public Criteria andBidTimeIsNotNull() {
            addCriterion("bid_time is not null");
            return (Criteria) this;
        }

        public Criteria andBidTimeEqualTo(Integer value) {
            addCriterion("bid_time =", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotEqualTo(Integer value) {
            addCriterion("bid_time <>", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeGreaterThan(Integer value) {
            addCriterion("bid_time >", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid_time >=", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeLessThan(Integer value) {
            addCriterion("bid_time <", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeLessThanOrEqualTo(Integer value) {
            addCriterion("bid_time <=", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeIn(List<Integer> values) {
            addCriterion("bid_time in", values, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotIn(List<Integer> values) {
            addCriterion("bid_time not in", values, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeBetween(Integer value1, Integer value2) {
            addCriterion("bid_time between", value1, value2, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("bid_time not between", value1, value2, "bidTime");
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