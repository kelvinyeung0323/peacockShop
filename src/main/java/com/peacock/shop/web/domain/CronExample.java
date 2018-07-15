package com.peacock.shop.web.domain;

import java.util.ArrayList;
import java.util.List;

public class CronExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CronExample() {
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

        public Criteria andCronIdIsNull() {
            addCriterion("cron_id is null");
            return (Criteria) this;
        }

        public Criteria andCronIdIsNotNull() {
            addCriterion("cron_id is not null");
            return (Criteria) this;
        }

        public Criteria andCronIdEqualTo(Byte value) {
            addCriterion("cron_id =", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdNotEqualTo(Byte value) {
            addCriterion("cron_id <>", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdGreaterThan(Byte value) {
            addCriterion("cron_id >", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("cron_id >=", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdLessThan(Byte value) {
            addCriterion("cron_id <", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdLessThanOrEqualTo(Byte value) {
            addCriterion("cron_id <=", value, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdIn(List<Byte> values) {
            addCriterion("cron_id in", values, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdNotIn(List<Byte> values) {
            addCriterion("cron_id not in", values, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdBetween(Byte value1, Byte value2) {
            addCriterion("cron_id between", value1, value2, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronIdNotBetween(Byte value1, Byte value2) {
            addCriterion("cron_id not between", value1, value2, "cronId");
            return (Criteria) this;
        }

        public Criteria andCronCodeIsNull() {
            addCriterion("cron_code is null");
            return (Criteria) this;
        }

        public Criteria andCronCodeIsNotNull() {
            addCriterion("cron_code is not null");
            return (Criteria) this;
        }

        public Criteria andCronCodeEqualTo(String value) {
            addCriterion("cron_code =", value, "cronCode");
            return (Criteria) this;
        }

        public Criteria andCronCodeNotEqualTo(String value) {
            addCriterion("cron_code <>", value, "cronCode");
            return (Criteria) this;
        }

        public Criteria andCronCodeGreaterThan(String value) {
            addCriterion("cron_code >", value, "cronCode");
            return (Criteria) this;
        }

        public Criteria andCronCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cron_code >=", value, "cronCode");
            return (Criteria) this;
        }

        public Criteria andCronCodeLessThan(String value) {
            addCriterion("cron_code <", value, "cronCode");
            return (Criteria) this;
        }

        public Criteria andCronCodeLessThanOrEqualTo(String value) {
            addCriterion("cron_code <=", value, "cronCode");
            return (Criteria) this;
        }

        public Criteria andCronCodeLike(String value) {
            addCriterion("cron_code like", value, "cronCode");
            return (Criteria) this;
        }

        public Criteria andCronCodeNotLike(String value) {
            addCriterion("cron_code not like", value, "cronCode");
            return (Criteria) this;
        }

        public Criteria andCronCodeIn(List<String> values) {
            addCriterion("cron_code in", values, "cronCode");
            return (Criteria) this;
        }

        public Criteria andCronCodeNotIn(List<String> values) {
            addCriterion("cron_code not in", values, "cronCode");
            return (Criteria) this;
        }

        public Criteria andCronCodeBetween(String value1, String value2) {
            addCriterion("cron_code between", value1, value2, "cronCode");
            return (Criteria) this;
        }

        public Criteria andCronCodeNotBetween(String value1, String value2) {
            addCriterion("cron_code not between", value1, value2, "cronCode");
            return (Criteria) this;
        }

        public Criteria andCronNameIsNull() {
            addCriterion("cron_name is null");
            return (Criteria) this;
        }

        public Criteria andCronNameIsNotNull() {
            addCriterion("cron_name is not null");
            return (Criteria) this;
        }

        public Criteria andCronNameEqualTo(String value) {
            addCriterion("cron_name =", value, "cronName");
            return (Criteria) this;
        }

        public Criteria andCronNameNotEqualTo(String value) {
            addCriterion("cron_name <>", value, "cronName");
            return (Criteria) this;
        }

        public Criteria andCronNameGreaterThan(String value) {
            addCriterion("cron_name >", value, "cronName");
            return (Criteria) this;
        }

        public Criteria andCronNameGreaterThanOrEqualTo(String value) {
            addCriterion("cron_name >=", value, "cronName");
            return (Criteria) this;
        }

        public Criteria andCronNameLessThan(String value) {
            addCriterion("cron_name <", value, "cronName");
            return (Criteria) this;
        }

        public Criteria andCronNameLessThanOrEqualTo(String value) {
            addCriterion("cron_name <=", value, "cronName");
            return (Criteria) this;
        }

        public Criteria andCronNameLike(String value) {
            addCriterion("cron_name like", value, "cronName");
            return (Criteria) this;
        }

        public Criteria andCronNameNotLike(String value) {
            addCriterion("cron_name not like", value, "cronName");
            return (Criteria) this;
        }

        public Criteria andCronNameIn(List<String> values) {
            addCriterion("cron_name in", values, "cronName");
            return (Criteria) this;
        }

        public Criteria andCronNameNotIn(List<String> values) {
            addCriterion("cron_name not in", values, "cronName");
            return (Criteria) this;
        }

        public Criteria andCronNameBetween(String value1, String value2) {
            addCriterion("cron_name between", value1, value2, "cronName");
            return (Criteria) this;
        }

        public Criteria andCronNameNotBetween(String value1, String value2) {
            addCriterion("cron_name not between", value1, value2, "cronName");
            return (Criteria) this;
        }

        public Criteria andCronOrderIsNull() {
            addCriterion("cron_order is null");
            return (Criteria) this;
        }

        public Criteria andCronOrderIsNotNull() {
            addCriterion("cron_order is not null");
            return (Criteria) this;
        }

        public Criteria andCronOrderEqualTo(Byte value) {
            addCriterion("cron_order =", value, "cronOrder");
            return (Criteria) this;
        }

        public Criteria andCronOrderNotEqualTo(Byte value) {
            addCriterion("cron_order <>", value, "cronOrder");
            return (Criteria) this;
        }

        public Criteria andCronOrderGreaterThan(Byte value) {
            addCriterion("cron_order >", value, "cronOrder");
            return (Criteria) this;
        }

        public Criteria andCronOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("cron_order >=", value, "cronOrder");
            return (Criteria) this;
        }

        public Criteria andCronOrderLessThan(Byte value) {
            addCriterion("cron_order <", value, "cronOrder");
            return (Criteria) this;
        }

        public Criteria andCronOrderLessThanOrEqualTo(Byte value) {
            addCriterion("cron_order <=", value, "cronOrder");
            return (Criteria) this;
        }

        public Criteria andCronOrderIn(List<Byte> values) {
            addCriterion("cron_order in", values, "cronOrder");
            return (Criteria) this;
        }

        public Criteria andCronOrderNotIn(List<Byte> values) {
            addCriterion("cron_order not in", values, "cronOrder");
            return (Criteria) this;
        }

        public Criteria andCronOrderBetween(Byte value1, Byte value2) {
            addCriterion("cron_order between", value1, value2, "cronOrder");
            return (Criteria) this;
        }

        public Criteria andCronOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("cron_order not between", value1, value2, "cronOrder");
            return (Criteria) this;
        }

        public Criteria andThistimeIsNull() {
            addCriterion("thistime is null");
            return (Criteria) this;
        }

        public Criteria andThistimeIsNotNull() {
            addCriterion("thistime is not null");
            return (Criteria) this;
        }

        public Criteria andThistimeEqualTo(Integer value) {
            addCriterion("thistime =", value, "thistime");
            return (Criteria) this;
        }

        public Criteria andThistimeNotEqualTo(Integer value) {
            addCriterion("thistime <>", value, "thistime");
            return (Criteria) this;
        }

        public Criteria andThistimeGreaterThan(Integer value) {
            addCriterion("thistime >", value, "thistime");
            return (Criteria) this;
        }

        public Criteria andThistimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("thistime >=", value, "thistime");
            return (Criteria) this;
        }

        public Criteria andThistimeLessThan(Integer value) {
            addCriterion("thistime <", value, "thistime");
            return (Criteria) this;
        }

        public Criteria andThistimeLessThanOrEqualTo(Integer value) {
            addCriterion("thistime <=", value, "thistime");
            return (Criteria) this;
        }

        public Criteria andThistimeIn(List<Integer> values) {
            addCriterion("thistime in", values, "thistime");
            return (Criteria) this;
        }

        public Criteria andThistimeNotIn(List<Integer> values) {
            addCriterion("thistime not in", values, "thistime");
            return (Criteria) this;
        }

        public Criteria andThistimeBetween(Integer value1, Integer value2) {
            addCriterion("thistime between", value1, value2, "thistime");
            return (Criteria) this;
        }

        public Criteria andThistimeNotBetween(Integer value1, Integer value2) {
            addCriterion("thistime not between", value1, value2, "thistime");
            return (Criteria) this;
        }

        public Criteria andNextimeIsNull() {
            addCriterion("nextime is null");
            return (Criteria) this;
        }

        public Criteria andNextimeIsNotNull() {
            addCriterion("nextime is not null");
            return (Criteria) this;
        }

        public Criteria andNextimeEqualTo(Integer value) {
            addCriterion("nextime =", value, "nextime");
            return (Criteria) this;
        }

        public Criteria andNextimeNotEqualTo(Integer value) {
            addCriterion("nextime <>", value, "nextime");
            return (Criteria) this;
        }

        public Criteria andNextimeGreaterThan(Integer value) {
            addCriterion("nextime >", value, "nextime");
            return (Criteria) this;
        }

        public Criteria andNextimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("nextime >=", value, "nextime");
            return (Criteria) this;
        }

        public Criteria andNextimeLessThan(Integer value) {
            addCriterion("nextime <", value, "nextime");
            return (Criteria) this;
        }

        public Criteria andNextimeLessThanOrEqualTo(Integer value) {
            addCriterion("nextime <=", value, "nextime");
            return (Criteria) this;
        }

        public Criteria andNextimeIn(List<Integer> values) {
            addCriterion("nextime in", values, "nextime");
            return (Criteria) this;
        }

        public Criteria andNextimeNotIn(List<Integer> values) {
            addCriterion("nextime not in", values, "nextime");
            return (Criteria) this;
        }

        public Criteria andNextimeBetween(Integer value1, Integer value2) {
            addCriterion("nextime between", value1, value2, "nextime");
            return (Criteria) this;
        }

        public Criteria andNextimeNotBetween(Integer value1, Integer value2) {
            addCriterion("nextime not between", value1, value2, "nextime");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("day is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("day is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Byte value) {
            addCriterion("day =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Byte value) {
            addCriterion("day <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Byte value) {
            addCriterion("day >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Byte value) {
            addCriterion("day >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Byte value) {
            addCriterion("day <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Byte value) {
            addCriterion("day <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Byte> values) {
            addCriterion("day in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Byte> values) {
            addCriterion("day not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Byte value1, Byte value2) {
            addCriterion("day between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Byte value1, Byte value2) {
            addCriterion("day not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(String value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(String value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(String value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(String value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(String value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(String value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLike(String value) {
            addCriterion("week like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotLike(String value) {
            addCriterion("week not like", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<String> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<String> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(String value1, String value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(String value1, String value2) {
            addCriterion("week not between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andHourIsNull() {
            addCriterion("hour is null");
            return (Criteria) this;
        }

        public Criteria andHourIsNotNull() {
            addCriterion("hour is not null");
            return (Criteria) this;
        }

        public Criteria andHourEqualTo(String value) {
            addCriterion("hour =", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotEqualTo(String value) {
            addCriterion("hour <>", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourGreaterThan(String value) {
            addCriterion("hour >", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourGreaterThanOrEqualTo(String value) {
            addCriterion("hour >=", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourLessThan(String value) {
            addCriterion("hour <", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourLessThanOrEqualTo(String value) {
            addCriterion("hour <=", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourLike(String value) {
            addCriterion("hour like", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotLike(String value) {
            addCriterion("hour not like", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourIn(List<String> values) {
            addCriterion("hour in", values, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotIn(List<String> values) {
            addCriterion("hour not in", values, "hour");
            return (Criteria) this;
        }

        public Criteria andHourBetween(String value1, String value2) {
            addCriterion("hour between", value1, value2, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotBetween(String value1, String value2) {
            addCriterion("hour not between", value1, value2, "hour");
            return (Criteria) this;
        }

        public Criteria andMinuteIsNull() {
            addCriterion("minute is null");
            return (Criteria) this;
        }

        public Criteria andMinuteIsNotNull() {
            addCriterion("minute is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteEqualTo(String value) {
            addCriterion("minute =", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotEqualTo(String value) {
            addCriterion("minute <>", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteGreaterThan(String value) {
            addCriterion("minute >", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteGreaterThanOrEqualTo(String value) {
            addCriterion("minute >=", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteLessThan(String value) {
            addCriterion("minute <", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteLessThanOrEqualTo(String value) {
            addCriterion("minute <=", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteLike(String value) {
            addCriterion("minute like", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotLike(String value) {
            addCriterion("minute not like", value, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteIn(List<String> values) {
            addCriterion("minute in", values, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotIn(List<String> values) {
            addCriterion("minute not in", values, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteBetween(String value1, String value2) {
            addCriterion("minute between", value1, value2, "minute");
            return (Criteria) this;
        }

        public Criteria andMinuteNotBetween(String value1, String value2) {
            addCriterion("minute not between", value1, value2, "minute");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Boolean value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Boolean value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Boolean value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Boolean value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Boolean value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Boolean> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Boolean> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Boolean value1, Boolean value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andRunOnceIsNull() {
            addCriterion("run_once is null");
            return (Criteria) this;
        }

        public Criteria andRunOnceIsNotNull() {
            addCriterion("run_once is not null");
            return (Criteria) this;
        }

        public Criteria andRunOnceEqualTo(Boolean value) {
            addCriterion("run_once =", value, "runOnce");
            return (Criteria) this;
        }

        public Criteria andRunOnceNotEqualTo(Boolean value) {
            addCriterion("run_once <>", value, "runOnce");
            return (Criteria) this;
        }

        public Criteria andRunOnceGreaterThan(Boolean value) {
            addCriterion("run_once >", value, "runOnce");
            return (Criteria) this;
        }

        public Criteria andRunOnceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("run_once >=", value, "runOnce");
            return (Criteria) this;
        }

        public Criteria andRunOnceLessThan(Boolean value) {
            addCriterion("run_once <", value, "runOnce");
            return (Criteria) this;
        }

        public Criteria andRunOnceLessThanOrEqualTo(Boolean value) {
            addCriterion("run_once <=", value, "runOnce");
            return (Criteria) this;
        }

        public Criteria andRunOnceIn(List<Boolean> values) {
            addCriterion("run_once in", values, "runOnce");
            return (Criteria) this;
        }

        public Criteria andRunOnceNotIn(List<Boolean> values) {
            addCriterion("run_once not in", values, "runOnce");
            return (Criteria) this;
        }

        public Criteria andRunOnceBetween(Boolean value1, Boolean value2) {
            addCriterion("run_once between", value1, value2, "runOnce");
            return (Criteria) this;
        }

        public Criteria andRunOnceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("run_once not between", value1, value2, "runOnce");
            return (Criteria) this;
        }

        public Criteria andAllowIpIsNull() {
            addCriterion("allow_ip is null");
            return (Criteria) this;
        }

        public Criteria andAllowIpIsNotNull() {
            addCriterion("allow_ip is not null");
            return (Criteria) this;
        }

        public Criteria andAllowIpEqualTo(String value) {
            addCriterion("allow_ip =", value, "allowIp");
            return (Criteria) this;
        }

        public Criteria andAllowIpNotEqualTo(String value) {
            addCriterion("allow_ip <>", value, "allowIp");
            return (Criteria) this;
        }

        public Criteria andAllowIpGreaterThan(String value) {
            addCriterion("allow_ip >", value, "allowIp");
            return (Criteria) this;
        }

        public Criteria andAllowIpGreaterThanOrEqualTo(String value) {
            addCriterion("allow_ip >=", value, "allowIp");
            return (Criteria) this;
        }

        public Criteria andAllowIpLessThan(String value) {
            addCriterion("allow_ip <", value, "allowIp");
            return (Criteria) this;
        }

        public Criteria andAllowIpLessThanOrEqualTo(String value) {
            addCriterion("allow_ip <=", value, "allowIp");
            return (Criteria) this;
        }

        public Criteria andAllowIpLike(String value) {
            addCriterion("allow_ip like", value, "allowIp");
            return (Criteria) this;
        }

        public Criteria andAllowIpNotLike(String value) {
            addCriterion("allow_ip not like", value, "allowIp");
            return (Criteria) this;
        }

        public Criteria andAllowIpIn(List<String> values) {
            addCriterion("allow_ip in", values, "allowIp");
            return (Criteria) this;
        }

        public Criteria andAllowIpNotIn(List<String> values) {
            addCriterion("allow_ip not in", values, "allowIp");
            return (Criteria) this;
        }

        public Criteria andAllowIpBetween(String value1, String value2) {
            addCriterion("allow_ip between", value1, value2, "allowIp");
            return (Criteria) this;
        }

        public Criteria andAllowIpNotBetween(String value1, String value2) {
            addCriterion("allow_ip not between", value1, value2, "allowIp");
            return (Criteria) this;
        }

        public Criteria andAlowFilesIsNull() {
            addCriterion("alow_files is null");
            return (Criteria) this;
        }

        public Criteria andAlowFilesIsNotNull() {
            addCriterion("alow_files is not null");
            return (Criteria) this;
        }

        public Criteria andAlowFilesEqualTo(String value) {
            addCriterion("alow_files =", value, "alowFiles");
            return (Criteria) this;
        }

        public Criteria andAlowFilesNotEqualTo(String value) {
            addCriterion("alow_files <>", value, "alowFiles");
            return (Criteria) this;
        }

        public Criteria andAlowFilesGreaterThan(String value) {
            addCriterion("alow_files >", value, "alowFiles");
            return (Criteria) this;
        }

        public Criteria andAlowFilesGreaterThanOrEqualTo(String value) {
            addCriterion("alow_files >=", value, "alowFiles");
            return (Criteria) this;
        }

        public Criteria andAlowFilesLessThan(String value) {
            addCriterion("alow_files <", value, "alowFiles");
            return (Criteria) this;
        }

        public Criteria andAlowFilesLessThanOrEqualTo(String value) {
            addCriterion("alow_files <=", value, "alowFiles");
            return (Criteria) this;
        }

        public Criteria andAlowFilesLike(String value) {
            addCriterion("alow_files like", value, "alowFiles");
            return (Criteria) this;
        }

        public Criteria andAlowFilesNotLike(String value) {
            addCriterion("alow_files not like", value, "alowFiles");
            return (Criteria) this;
        }

        public Criteria andAlowFilesIn(List<String> values) {
            addCriterion("alow_files in", values, "alowFiles");
            return (Criteria) this;
        }

        public Criteria andAlowFilesNotIn(List<String> values) {
            addCriterion("alow_files not in", values, "alowFiles");
            return (Criteria) this;
        }

        public Criteria andAlowFilesBetween(String value1, String value2) {
            addCriterion("alow_files between", value1, value2, "alowFiles");
            return (Criteria) this;
        }

        public Criteria andAlowFilesNotBetween(String value1, String value2) {
            addCriterion("alow_files not between", value1, value2, "alowFiles");
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