package com.peacock.shop.web.domain;

import java.util.ArrayList;
import java.util.List;

public class AdminMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminMessageExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Short value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Short value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Short value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Short value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Short value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Short value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Short> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Short> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Short value1, Short value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Short value1, Short value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNull() {
            addCriterion("sender_id is null");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNotNull() {
            addCriterion("sender_id is not null");
            return (Criteria) this;
        }

        public Criteria andSenderIdEqualTo(Byte value) {
            addCriterion("sender_id =", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotEqualTo(Byte value) {
            addCriterion("sender_id <>", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThan(Byte value) {
            addCriterion("sender_id >", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("sender_id >=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThan(Byte value) {
            addCriterion("sender_id <", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThanOrEqualTo(Byte value) {
            addCriterion("sender_id <=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIn(List<Byte> values) {
            addCriterion("sender_id in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotIn(List<Byte> values) {
            addCriterion("sender_id not in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdBetween(Byte value1, Byte value2) {
            addCriterion("sender_id between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotBetween(Byte value1, Byte value2) {
            addCriterion("sender_id not between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNull() {
            addCriterion("receiver_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNotNull() {
            addCriterion("receiver_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdEqualTo(Byte value) {
            addCriterion("receiver_id =", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotEqualTo(Byte value) {
            addCriterion("receiver_id <>", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThan(Byte value) {
            addCriterion("receiver_id >", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("receiver_id >=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThan(Byte value) {
            addCriterion("receiver_id <", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThanOrEqualTo(Byte value) {
            addCriterion("receiver_id <=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIn(List<Byte> values) {
            addCriterion("receiver_id in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotIn(List<Byte> values) {
            addCriterion("receiver_id not in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdBetween(Byte value1, Byte value2) {
            addCriterion("receiver_id between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotBetween(Byte value1, Byte value2) {
            addCriterion("receiver_id not between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andSentTimeIsNull() {
            addCriterion("sent_time is null");
            return (Criteria) this;
        }

        public Criteria andSentTimeIsNotNull() {
            addCriterion("sent_time is not null");
            return (Criteria) this;
        }

        public Criteria andSentTimeEqualTo(Integer value) {
            addCriterion("sent_time =", value, "sentTime");
            return (Criteria) this;
        }

        public Criteria andSentTimeNotEqualTo(Integer value) {
            addCriterion("sent_time <>", value, "sentTime");
            return (Criteria) this;
        }

        public Criteria andSentTimeGreaterThan(Integer value) {
            addCriterion("sent_time >", value, "sentTime");
            return (Criteria) this;
        }

        public Criteria andSentTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sent_time >=", value, "sentTime");
            return (Criteria) this;
        }

        public Criteria andSentTimeLessThan(Integer value) {
            addCriterion("sent_time <", value, "sentTime");
            return (Criteria) this;
        }

        public Criteria andSentTimeLessThanOrEqualTo(Integer value) {
            addCriterion("sent_time <=", value, "sentTime");
            return (Criteria) this;
        }

        public Criteria andSentTimeIn(List<Integer> values) {
            addCriterion("sent_time in", values, "sentTime");
            return (Criteria) this;
        }

        public Criteria andSentTimeNotIn(List<Integer> values) {
            addCriterion("sent_time not in", values, "sentTime");
            return (Criteria) this;
        }

        public Criteria andSentTimeBetween(Integer value1, Integer value2) {
            addCriterion("sent_time between", value1, value2, "sentTime");
            return (Criteria) this;
        }

        public Criteria andSentTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sent_time not between", value1, value2, "sentTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeIsNull() {
            addCriterion("read_time is null");
            return (Criteria) this;
        }

        public Criteria andReadTimeIsNotNull() {
            addCriterion("read_time is not null");
            return (Criteria) this;
        }

        public Criteria andReadTimeEqualTo(Integer value) {
            addCriterion("read_time =", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeNotEqualTo(Integer value) {
            addCriterion("read_time <>", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeGreaterThan(Integer value) {
            addCriterion("read_time >", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_time >=", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeLessThan(Integer value) {
            addCriterion("read_time <", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeLessThanOrEqualTo(Integer value) {
            addCriterion("read_time <=", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeIn(List<Integer> values) {
            addCriterion("read_time in", values, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeNotIn(List<Integer> values) {
            addCriterion("read_time not in", values, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeBetween(Integer value1, Integer value2) {
            addCriterion("read_time between", value1, value2, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("read_time not between", value1, value2, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadedIsNull() {
            addCriterion("readed is null");
            return (Criteria) this;
        }

        public Criteria andReadedIsNotNull() {
            addCriterion("readed is not null");
            return (Criteria) this;
        }

        public Criteria andReadedEqualTo(Boolean value) {
            addCriterion("readed =", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotEqualTo(Boolean value) {
            addCriterion("readed <>", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedGreaterThan(Boolean value) {
            addCriterion("readed >", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("readed >=", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedLessThan(Boolean value) {
            addCriterion("readed <", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedLessThanOrEqualTo(Boolean value) {
            addCriterion("readed <=", value, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedIn(List<Boolean> values) {
            addCriterion("readed in", values, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotIn(List<Boolean> values) {
            addCriterion("readed not in", values, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedBetween(Boolean value1, Boolean value2) {
            addCriterion("readed between", value1, value2, "readed");
            return (Criteria) this;
        }

        public Criteria andReadedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("readed not between", value1, value2, "readed");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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