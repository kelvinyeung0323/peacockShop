package com.peacock.shop.web.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Boolean value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Boolean value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Boolean value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Boolean value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Boolean> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Boolean> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIsNull() {
            addCriterion("shipping_status is null");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIsNotNull() {
            addCriterion("shipping_status is not null");
            return (Criteria) this;
        }

        public Criteria andShippingStatusEqualTo(Boolean value) {
            addCriterion("shipping_status =", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotEqualTo(Boolean value) {
            addCriterion("shipping_status <>", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusGreaterThan(Boolean value) {
            addCriterion("shipping_status >", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shipping_status >=", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusLessThan(Boolean value) {
            addCriterion("shipping_status <", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("shipping_status <=", value, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusIn(List<Boolean> values) {
            addCriterion("shipping_status in", values, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotIn(List<Boolean> values) {
            addCriterion("shipping_status not in", values, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("shipping_status between", value1, value2, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andShippingStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shipping_status not between", value1, value2, "shippingStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Boolean value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Boolean value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Boolean value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Boolean value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Boolean> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Boolean> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(Short value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(Short value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(Short value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(Short value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(Short value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(Short value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<Short> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<Short> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(Short value1, Short value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(Short value1, Short value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Short value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Short value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Short value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Short value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Short value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Short value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Short> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Short> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Short value1, Short value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Short value1, Short value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Short value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Short value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Short value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Short value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Short value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Short value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Short> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Short> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Short value1, Short value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Short value1, Short value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(Short value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(Short value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(Short value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(Short value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(Short value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(Short value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<Short> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<Short> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(Short value1, Short value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(Short value1, Short value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("zipcode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipcode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipcode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipcode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipcode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipcode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipcode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipcode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipcode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipcode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipcode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipcode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipcode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andBestTimeIsNull() {
            addCriterion("best_time is null");
            return (Criteria) this;
        }

        public Criteria andBestTimeIsNotNull() {
            addCriterion("best_time is not null");
            return (Criteria) this;
        }

        public Criteria andBestTimeEqualTo(String value) {
            addCriterion("best_time =", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeNotEqualTo(String value) {
            addCriterion("best_time <>", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeGreaterThan(String value) {
            addCriterion("best_time >", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeGreaterThanOrEqualTo(String value) {
            addCriterion("best_time >=", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeLessThan(String value) {
            addCriterion("best_time <", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeLessThanOrEqualTo(String value) {
            addCriterion("best_time <=", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeLike(String value) {
            addCriterion("best_time like", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeNotLike(String value) {
            addCriterion("best_time not like", value, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeIn(List<String> values) {
            addCriterion("best_time in", values, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeNotIn(List<String> values) {
            addCriterion("best_time not in", values, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeBetween(String value1, String value2) {
            addCriterion("best_time between", value1, value2, "bestTime");
            return (Criteria) this;
        }

        public Criteria andBestTimeNotBetween(String value1, String value2) {
            addCriterion("best_time not between", value1, value2, "bestTime");
            return (Criteria) this;
        }

        public Criteria andSignBuildingIsNull() {
            addCriterion("sign_building is null");
            return (Criteria) this;
        }

        public Criteria andSignBuildingIsNotNull() {
            addCriterion("sign_building is not null");
            return (Criteria) this;
        }

        public Criteria andSignBuildingEqualTo(String value) {
            addCriterion("sign_building =", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingNotEqualTo(String value) {
            addCriterion("sign_building <>", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingGreaterThan(String value) {
            addCriterion("sign_building >", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingGreaterThanOrEqualTo(String value) {
            addCriterion("sign_building >=", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingLessThan(String value) {
            addCriterion("sign_building <", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingLessThanOrEqualTo(String value) {
            addCriterion("sign_building <=", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingLike(String value) {
            addCriterion("sign_building like", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingNotLike(String value) {
            addCriterion("sign_building not like", value, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingIn(List<String> values) {
            addCriterion("sign_building in", values, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingNotIn(List<String> values) {
            addCriterion("sign_building not in", values, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingBetween(String value1, String value2) {
            addCriterion("sign_building between", value1, value2, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andSignBuildingNotBetween(String value1, String value2) {
            addCriterion("sign_building not between", value1, value2, "signBuilding");
            return (Criteria) this;
        }

        public Criteria andPostscriptIsNull() {
            addCriterion("postscript is null");
            return (Criteria) this;
        }

        public Criteria andPostscriptIsNotNull() {
            addCriterion("postscript is not null");
            return (Criteria) this;
        }

        public Criteria andPostscriptEqualTo(String value) {
            addCriterion("postscript =", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotEqualTo(String value) {
            addCriterion("postscript <>", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptGreaterThan(String value) {
            addCriterion("postscript >", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptGreaterThanOrEqualTo(String value) {
            addCriterion("postscript >=", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLessThan(String value) {
            addCriterion("postscript <", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLessThanOrEqualTo(String value) {
            addCriterion("postscript <=", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLike(String value) {
            addCriterion("postscript like", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotLike(String value) {
            addCriterion("postscript not like", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptIn(List<String> values) {
            addCriterion("postscript in", values, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotIn(List<String> values) {
            addCriterion("postscript not in", values, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptBetween(String value1, String value2) {
            addCriterion("postscript between", value1, value2, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotBetween(String value1, String value2) {
            addCriterion("postscript not between", value1, value2, "postscript");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNull() {
            addCriterion("shipping_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNotNull() {
            addCriterion("shipping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingIdEqualTo(Byte value) {
            addCriterion("shipping_id =", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotEqualTo(Byte value) {
            addCriterion("shipping_id <>", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThan(Byte value) {
            addCriterion("shipping_id >", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("shipping_id >=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThan(Byte value) {
            addCriterion("shipping_id <", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThanOrEqualTo(Byte value) {
            addCriterion("shipping_id <=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdIn(List<Byte> values) {
            addCriterion("shipping_id in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotIn(List<Byte> values) {
            addCriterion("shipping_id not in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdBetween(Byte value1, Byte value2) {
            addCriterion("shipping_id between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotBetween(Byte value1, Byte value2) {
            addCriterion("shipping_id not between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNull() {
            addCriterion("shipping_name is null");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNotNull() {
            addCriterion("shipping_name is not null");
            return (Criteria) this;
        }

        public Criteria andShippingNameEqualTo(String value) {
            addCriterion("shipping_name =", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotEqualTo(String value) {
            addCriterion("shipping_name <>", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThan(String value) {
            addCriterion("shipping_name >", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_name >=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThan(String value) {
            addCriterion("shipping_name <", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThanOrEqualTo(String value) {
            addCriterion("shipping_name <=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLike(String value) {
            addCriterion("shipping_name like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotLike(String value) {
            addCriterion("shipping_name not like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameIn(List<String> values) {
            addCriterion("shipping_name in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotIn(List<String> values) {
            addCriterion("shipping_name not in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameBetween(String value1, String value2) {
            addCriterion("shipping_name between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotBetween(String value1, String value2) {
            addCriterion("shipping_name not between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(Byte value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(Byte value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(Byte value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(Byte value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(Byte value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<Byte> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<Byte> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(Byte value1, Byte value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayNameIsNull() {
            addCriterion("pay_name is null");
            return (Criteria) this;
        }

        public Criteria andPayNameIsNotNull() {
            addCriterion("pay_name is not null");
            return (Criteria) this;
        }

        public Criteria andPayNameEqualTo(String value) {
            addCriterion("pay_name =", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotEqualTo(String value) {
            addCriterion("pay_name <>", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameGreaterThan(String value) {
            addCriterion("pay_name >", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_name >=", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLessThan(String value) {
            addCriterion("pay_name <", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLessThanOrEqualTo(String value) {
            addCriterion("pay_name <=", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameLike(String value) {
            addCriterion("pay_name like", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotLike(String value) {
            addCriterion("pay_name not like", value, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameIn(List<String> values) {
            addCriterion("pay_name in", values, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotIn(List<String> values) {
            addCriterion("pay_name not in", values, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameBetween(String value1, String value2) {
            addCriterion("pay_name between", value1, value2, "payName");
            return (Criteria) this;
        }

        public Criteria andPayNameNotBetween(String value1, String value2) {
            addCriterion("pay_name not between", value1, value2, "payName");
            return (Criteria) this;
        }

        public Criteria andHowOosIsNull() {
            addCriterion("how_oos is null");
            return (Criteria) this;
        }

        public Criteria andHowOosIsNotNull() {
            addCriterion("how_oos is not null");
            return (Criteria) this;
        }

        public Criteria andHowOosEqualTo(String value) {
            addCriterion("how_oos =", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosNotEqualTo(String value) {
            addCriterion("how_oos <>", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosGreaterThan(String value) {
            addCriterion("how_oos >", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosGreaterThanOrEqualTo(String value) {
            addCriterion("how_oos >=", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosLessThan(String value) {
            addCriterion("how_oos <", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosLessThanOrEqualTo(String value) {
            addCriterion("how_oos <=", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosLike(String value) {
            addCriterion("how_oos like", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosNotLike(String value) {
            addCriterion("how_oos not like", value, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosIn(List<String> values) {
            addCriterion("how_oos in", values, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosNotIn(List<String> values) {
            addCriterion("how_oos not in", values, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosBetween(String value1, String value2) {
            addCriterion("how_oos between", value1, value2, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowOosNotBetween(String value1, String value2) {
            addCriterion("how_oos not between", value1, value2, "howOos");
            return (Criteria) this;
        }

        public Criteria andHowSurplusIsNull() {
            addCriterion("how_surplus is null");
            return (Criteria) this;
        }

        public Criteria andHowSurplusIsNotNull() {
            addCriterion("how_surplus is not null");
            return (Criteria) this;
        }

        public Criteria andHowSurplusEqualTo(String value) {
            addCriterion("how_surplus =", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusNotEqualTo(String value) {
            addCriterion("how_surplus <>", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusGreaterThan(String value) {
            addCriterion("how_surplus >", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusGreaterThanOrEqualTo(String value) {
            addCriterion("how_surplus >=", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusLessThan(String value) {
            addCriterion("how_surplus <", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusLessThanOrEqualTo(String value) {
            addCriterion("how_surplus <=", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusLike(String value) {
            addCriterion("how_surplus like", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusNotLike(String value) {
            addCriterion("how_surplus not like", value, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusIn(List<String> values) {
            addCriterion("how_surplus in", values, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusNotIn(List<String> values) {
            addCriterion("how_surplus not in", values, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusBetween(String value1, String value2) {
            addCriterion("how_surplus between", value1, value2, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andHowSurplusNotBetween(String value1, String value2) {
            addCriterion("how_surplus not between", value1, value2, "howSurplus");
            return (Criteria) this;
        }

        public Criteria andPackNameIsNull() {
            addCriterion("pack_name is null");
            return (Criteria) this;
        }

        public Criteria andPackNameIsNotNull() {
            addCriterion("pack_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackNameEqualTo(String value) {
            addCriterion("pack_name =", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameNotEqualTo(String value) {
            addCriterion("pack_name <>", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameGreaterThan(String value) {
            addCriterion("pack_name >", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameGreaterThanOrEqualTo(String value) {
            addCriterion("pack_name >=", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameLessThan(String value) {
            addCriterion("pack_name <", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameLessThanOrEqualTo(String value) {
            addCriterion("pack_name <=", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameLike(String value) {
            addCriterion("pack_name like", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameNotLike(String value) {
            addCriterion("pack_name not like", value, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameIn(List<String> values) {
            addCriterion("pack_name in", values, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameNotIn(List<String> values) {
            addCriterion("pack_name not in", values, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameBetween(String value1, String value2) {
            addCriterion("pack_name between", value1, value2, "packName");
            return (Criteria) this;
        }

        public Criteria andPackNameNotBetween(String value1, String value2) {
            addCriterion("pack_name not between", value1, value2, "packName");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("card_name is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("card_name =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("card_name <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("card_name >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("card_name >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("card_name <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("card_name <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("card_name like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("card_name not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("card_name in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("card_name not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("card_name between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("card_name not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardMessageIsNull() {
            addCriterion("card_message is null");
            return (Criteria) this;
        }

        public Criteria andCardMessageIsNotNull() {
            addCriterion("card_message is not null");
            return (Criteria) this;
        }

        public Criteria andCardMessageEqualTo(String value) {
            addCriterion("card_message =", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageNotEqualTo(String value) {
            addCriterion("card_message <>", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageGreaterThan(String value) {
            addCriterion("card_message >", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageGreaterThanOrEqualTo(String value) {
            addCriterion("card_message >=", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageLessThan(String value) {
            addCriterion("card_message <", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageLessThanOrEqualTo(String value) {
            addCriterion("card_message <=", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageLike(String value) {
            addCriterion("card_message like", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageNotLike(String value) {
            addCriterion("card_message not like", value, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageIn(List<String> values) {
            addCriterion("card_message in", values, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageNotIn(List<String> values) {
            addCriterion("card_message not in", values, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageBetween(String value1, String value2) {
            addCriterion("card_message between", value1, value2, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andCardMessageNotBetween(String value1, String value2) {
            addCriterion("card_message not between", value1, value2, "cardMessage");
            return (Criteria) this;
        }

        public Criteria andInvPayeeIsNull() {
            addCriterion("inv_payee is null");
            return (Criteria) this;
        }

        public Criteria andInvPayeeIsNotNull() {
            addCriterion("inv_payee is not null");
            return (Criteria) this;
        }

        public Criteria andInvPayeeEqualTo(String value) {
            addCriterion("inv_payee =", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeNotEqualTo(String value) {
            addCriterion("inv_payee <>", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeGreaterThan(String value) {
            addCriterion("inv_payee >", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeGreaterThanOrEqualTo(String value) {
            addCriterion("inv_payee >=", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeLessThan(String value) {
            addCriterion("inv_payee <", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeLessThanOrEqualTo(String value) {
            addCriterion("inv_payee <=", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeLike(String value) {
            addCriterion("inv_payee like", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeNotLike(String value) {
            addCriterion("inv_payee not like", value, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeIn(List<String> values) {
            addCriterion("inv_payee in", values, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeNotIn(List<String> values) {
            addCriterion("inv_payee not in", values, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeBetween(String value1, String value2) {
            addCriterion("inv_payee between", value1, value2, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvPayeeNotBetween(String value1, String value2) {
            addCriterion("inv_payee not between", value1, value2, "invPayee");
            return (Criteria) this;
        }

        public Criteria andInvContentIsNull() {
            addCriterion("inv_content is null");
            return (Criteria) this;
        }

        public Criteria andInvContentIsNotNull() {
            addCriterion("inv_content is not null");
            return (Criteria) this;
        }

        public Criteria andInvContentEqualTo(String value) {
            addCriterion("inv_content =", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentNotEqualTo(String value) {
            addCriterion("inv_content <>", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentGreaterThan(String value) {
            addCriterion("inv_content >", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentGreaterThanOrEqualTo(String value) {
            addCriterion("inv_content >=", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentLessThan(String value) {
            addCriterion("inv_content <", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentLessThanOrEqualTo(String value) {
            addCriterion("inv_content <=", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentLike(String value) {
            addCriterion("inv_content like", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentNotLike(String value) {
            addCriterion("inv_content not like", value, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentIn(List<String> values) {
            addCriterion("inv_content in", values, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentNotIn(List<String> values) {
            addCriterion("inv_content not in", values, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentBetween(String value1, String value2) {
            addCriterion("inv_content between", value1, value2, "invContent");
            return (Criteria) this;
        }

        public Criteria andInvContentNotBetween(String value1, String value2) {
            addCriterion("inv_content not between", value1, value2, "invContent");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNull() {
            addCriterion("goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNotNull() {
            addCriterion("goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountEqualTo(BigDecimal value) {
            addCriterion("goods_amount =", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotEqualTo(BigDecimal value) {
            addCriterion("goods_amount <>", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThan(BigDecimal value) {
            addCriterion("goods_amount >", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount >=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThan(BigDecimal value) {
            addCriterion("goods_amount <", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount <=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIn(List<BigDecimal> values) {
            addCriterion("goods_amount in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotIn(List<BigDecimal> values) {
            addCriterion("goods_amount not in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount not between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNull() {
            addCriterion("shipping_fee is null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNotNull() {
            addCriterion("shipping_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeEqualTo(BigDecimal value) {
            addCriterion("shipping_fee =", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <>", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThan(BigDecimal value) {
            addCriterion("shipping_fee >", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee >=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThan(BigDecimal value) {
            addCriterion("shipping_fee <", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIn(List<BigDecimal> values) {
            addCriterion("shipping_fee in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotIn(List<BigDecimal> values) {
            addCriterion("shipping_fee not in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee not between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeIsNull() {
            addCriterion("insure_fee is null");
            return (Criteria) this;
        }

        public Criteria andInsureFeeIsNotNull() {
            addCriterion("insure_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInsureFeeEqualTo(BigDecimal value) {
            addCriterion("insure_fee =", value, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeNotEqualTo(BigDecimal value) {
            addCriterion("insure_fee <>", value, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeGreaterThan(BigDecimal value) {
            addCriterion("insure_fee >", value, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_fee >=", value, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeLessThan(BigDecimal value) {
            addCriterion("insure_fee <", value, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_fee <=", value, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeIn(List<BigDecimal> values) {
            addCriterion("insure_fee in", values, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeNotIn(List<BigDecimal> values) {
            addCriterion("insure_fee not in", values, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_fee between", value1, value2, "insureFee");
            return (Criteria) this;
        }

        public Criteria andInsureFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_fee not between", value1, value2, "insureFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNull() {
            addCriterion("pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNotNull() {
            addCriterion("pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPayFeeEqualTo(BigDecimal value) {
            addCriterion("pay_fee =", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotEqualTo(BigDecimal value) {
            addCriterion("pay_fee <>", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThan(BigDecimal value) {
            addCriterion("pay_fee >", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee >=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThan(BigDecimal value) {
            addCriterion("pay_fee <", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee <=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeIn(List<BigDecimal> values) {
            addCriterion("pay_fee in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotIn(List<BigDecimal> values) {
            addCriterion("pay_fee not in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee not between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeIsNull() {
            addCriterion("pack_fee is null");
            return (Criteria) this;
        }

        public Criteria andPackFeeIsNotNull() {
            addCriterion("pack_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPackFeeEqualTo(BigDecimal value) {
            addCriterion("pack_fee =", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeNotEqualTo(BigDecimal value) {
            addCriterion("pack_fee <>", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeGreaterThan(BigDecimal value) {
            addCriterion("pack_fee >", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pack_fee >=", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeLessThan(BigDecimal value) {
            addCriterion("pack_fee <", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pack_fee <=", value, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeIn(List<BigDecimal> values) {
            addCriterion("pack_fee in", values, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeNotIn(List<BigDecimal> values) {
            addCriterion("pack_fee not in", values, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pack_fee between", value1, value2, "packFee");
            return (Criteria) this;
        }

        public Criteria andPackFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pack_fee not between", value1, value2, "packFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeIsNull() {
            addCriterion("card_fee is null");
            return (Criteria) this;
        }

        public Criteria andCardFeeIsNotNull() {
            addCriterion("card_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCardFeeEqualTo(BigDecimal value) {
            addCriterion("card_fee =", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeNotEqualTo(BigDecimal value) {
            addCriterion("card_fee <>", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeGreaterThan(BigDecimal value) {
            addCriterion("card_fee >", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("card_fee >=", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeLessThan(BigDecimal value) {
            addCriterion("card_fee <", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("card_fee <=", value, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeIn(List<BigDecimal> values) {
            addCriterion("card_fee in", values, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeNotIn(List<BigDecimal> values) {
            addCriterion("card_fee not in", values, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("card_fee between", value1, value2, "cardFee");
            return (Criteria) this;
        }

        public Criteria andCardFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("card_fee not between", value1, value2, "cardFee");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountFeeIsNull() {
            addCriterion("goods_discount_fee is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountFeeIsNotNull() {
            addCriterion("goods_discount_fee is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountFeeEqualTo(BigDecimal value) {
            addCriterion("goods_discount_fee =", value, "goodsDiscountFee");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountFeeNotEqualTo(BigDecimal value) {
            addCriterion("goods_discount_fee <>", value, "goodsDiscountFee");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountFeeGreaterThan(BigDecimal value) {
            addCriterion("goods_discount_fee >", value, "goodsDiscountFee");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_discount_fee >=", value, "goodsDiscountFee");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountFeeLessThan(BigDecimal value) {
            addCriterion("goods_discount_fee <", value, "goodsDiscountFee");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_discount_fee <=", value, "goodsDiscountFee");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountFeeIn(List<BigDecimal> values) {
            addCriterion("goods_discount_fee in", values, "goodsDiscountFee");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountFeeNotIn(List<BigDecimal> values) {
            addCriterion("goods_discount_fee not in", values, "goodsDiscountFee");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_discount_fee between", value1, value2, "goodsDiscountFee");
            return (Criteria) this;
        }

        public Criteria andGoodsDiscountFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_discount_fee not between", value1, value2, "goodsDiscountFee");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidIsNull() {
            addCriterion("money_paid is null");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidIsNotNull() {
            addCriterion("money_paid is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidEqualTo(BigDecimal value) {
            addCriterion("money_paid =", value, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidNotEqualTo(BigDecimal value) {
            addCriterion("money_paid <>", value, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidGreaterThan(BigDecimal value) {
            addCriterion("money_paid >", value, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_paid >=", value, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidLessThan(BigDecimal value) {
            addCriterion("money_paid <", value, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_paid <=", value, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidIn(List<BigDecimal> values) {
            addCriterion("money_paid in", values, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidNotIn(List<BigDecimal> values) {
            addCriterion("money_paid not in", values, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_paid between", value1, value2, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andMoneyPaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_paid not between", value1, value2, "moneyPaid");
            return (Criteria) this;
        }

        public Criteria andSurplusIsNull() {
            addCriterion("surplus is null");
            return (Criteria) this;
        }

        public Criteria andSurplusIsNotNull() {
            addCriterion("surplus is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusEqualTo(BigDecimal value) {
            addCriterion("surplus =", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotEqualTo(BigDecimal value) {
            addCriterion("surplus <>", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusGreaterThan(BigDecimal value) {
            addCriterion("surplus >", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("surplus >=", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusLessThan(BigDecimal value) {
            addCriterion("surplus <", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("surplus <=", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusIn(List<BigDecimal> values) {
            addCriterion("surplus in", values, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotIn(List<BigDecimal> values) {
            addCriterion("surplus not in", values, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("surplus between", value1, value2, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("surplus not between", value1, value2, "surplus");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyIsNull() {
            addCriterion("integral_money is null");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyIsNotNull() {
            addCriterion("integral_money is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyEqualTo(BigDecimal value) {
            addCriterion("integral_money =", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyNotEqualTo(BigDecimal value) {
            addCriterion("integral_money <>", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyGreaterThan(BigDecimal value) {
            addCriterion("integral_money >", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("integral_money >=", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyLessThan(BigDecimal value) {
            addCriterion("integral_money <", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("integral_money <=", value, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyIn(List<BigDecimal> values) {
            addCriterion("integral_money in", values, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyNotIn(List<BigDecimal> values) {
            addCriterion("integral_money not in", values, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integral_money between", value1, value2, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andIntegralMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integral_money not between", value1, value2, "integralMoney");
            return (Criteria) this;
        }

        public Criteria andBonusIsNull() {
            addCriterion("bonus is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("bonus is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(BigDecimal value) {
            addCriterion("bonus =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(BigDecimal value) {
            addCriterion("bonus <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(BigDecimal value) {
            addCriterion("bonus >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(BigDecimal value) {
            addCriterion("bonus <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<BigDecimal> values) {
            addCriterion("bonus in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<BigDecimal> values) {
            addCriterion("bonus not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus not between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andFromAdIsNull() {
            addCriterion("from_ad is null");
            return (Criteria) this;
        }

        public Criteria andFromAdIsNotNull() {
            addCriterion("from_ad is not null");
            return (Criteria) this;
        }

        public Criteria andFromAdEqualTo(Short value) {
            addCriterion("from_ad =", value, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdNotEqualTo(Short value) {
            addCriterion("from_ad <>", value, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdGreaterThan(Short value) {
            addCriterion("from_ad >", value, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdGreaterThanOrEqualTo(Short value) {
            addCriterion("from_ad >=", value, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdLessThan(Short value) {
            addCriterion("from_ad <", value, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdLessThanOrEqualTo(Short value) {
            addCriterion("from_ad <=", value, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdIn(List<Short> values) {
            addCriterion("from_ad in", values, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdNotIn(List<Short> values) {
            addCriterion("from_ad not in", values, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdBetween(Short value1, Short value2) {
            addCriterion("from_ad between", value1, value2, "fromAd");
            return (Criteria) this;
        }

        public Criteria andFromAdNotBetween(Short value1, Short value2) {
            addCriterion("from_ad not between", value1, value2, "fromAd");
            return (Criteria) this;
        }

        public Criteria andRefererIsNull() {
            addCriterion("referer is null");
            return (Criteria) this;
        }

        public Criteria andRefererIsNotNull() {
            addCriterion("referer is not null");
            return (Criteria) this;
        }

        public Criteria andRefererEqualTo(String value) {
            addCriterion("referer =", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotEqualTo(String value) {
            addCriterion("referer <>", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererGreaterThan(String value) {
            addCriterion("referer >", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererGreaterThanOrEqualTo(String value) {
            addCriterion("referer >=", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererLessThan(String value) {
            addCriterion("referer <", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererLessThanOrEqualTo(String value) {
            addCriterion("referer <=", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererLike(String value) {
            addCriterion("referer like", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotLike(String value) {
            addCriterion("referer not like", value, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererIn(List<String> values) {
            addCriterion("referer in", values, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotIn(List<String> values) {
            addCriterion("referer not in", values, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererBetween(String value1, String value2) {
            addCriterion("referer between", value1, value2, "referer");
            return (Criteria) this;
        }

        public Criteria andRefererNotBetween(String value1, String value2) {
            addCriterion("referer not between", value1, value2, "referer");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Integer value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Integer value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Integer value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Integer value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Integer> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Integer> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Integer value1, Integer value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Integer value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Integer value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Integer value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Integer value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Integer> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Integer> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Integer value1, Integer value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNull() {
            addCriterion("shipping_time is null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNotNull() {
            addCriterion("shipping_time is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeEqualTo(Integer value) {
            addCriterion("shipping_time =", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotEqualTo(Integer value) {
            addCriterion("shipping_time <>", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThan(Integer value) {
            addCriterion("shipping_time >", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_time >=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThan(Integer value) {
            addCriterion("shipping_time <", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_time <=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIn(List<Integer> values) {
            addCriterion("shipping_time in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotIn(List<Integer> values) {
            addCriterion("shipping_time not in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeBetween(Integer value1, Integer value2) {
            addCriterion("shipping_time between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_time not between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andPackIdIsNull() {
            addCriterion("pack_id is null");
            return (Criteria) this;
        }

        public Criteria andPackIdIsNotNull() {
            addCriterion("pack_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackIdEqualTo(Byte value) {
            addCriterion("pack_id =", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotEqualTo(Byte value) {
            addCriterion("pack_id <>", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThan(Byte value) {
            addCriterion("pack_id >", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("pack_id >=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThan(Byte value) {
            addCriterion("pack_id <", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdLessThanOrEqualTo(Byte value) {
            addCriterion("pack_id <=", value, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdIn(List<Byte> values) {
            addCriterion("pack_id in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotIn(List<Byte> values) {
            addCriterion("pack_id not in", values, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdBetween(Byte value1, Byte value2) {
            addCriterion("pack_id between", value1, value2, "packId");
            return (Criteria) this;
        }

        public Criteria andPackIdNotBetween(Byte value1, Byte value2) {
            addCriterion("pack_id not between", value1, value2, "packId");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Byte value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Byte value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Byte value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Byte value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Byte value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Byte> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Byte> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Byte value1, Byte value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Byte value1, Byte value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andBonusIdIsNull() {
            addCriterion("bonus_id is null");
            return (Criteria) this;
        }

        public Criteria andBonusIdIsNotNull() {
            addCriterion("bonus_id is not null");
            return (Criteria) this;
        }

        public Criteria andBonusIdEqualTo(Integer value) {
            addCriterion("bonus_id =", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdNotEqualTo(Integer value) {
            addCriterion("bonus_id <>", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdGreaterThan(Integer value) {
            addCriterion("bonus_id >", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bonus_id >=", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdLessThan(Integer value) {
            addCriterion("bonus_id <", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdLessThanOrEqualTo(Integer value) {
            addCriterion("bonus_id <=", value, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdIn(List<Integer> values) {
            addCriterion("bonus_id in", values, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdNotIn(List<Integer> values) {
            addCriterion("bonus_id not in", values, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdBetween(Integer value1, Integer value2) {
            addCriterion("bonus_id between", value1, value2, "bonusId");
            return (Criteria) this;
        }

        public Criteria andBonusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bonus_id not between", value1, value2, "bonusId");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNull() {
            addCriterion("invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("invoice_no =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("invoice_no <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("invoice_no >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_no >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("invoice_no <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("invoice_no <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("invoice_no like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("invoice_no not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("invoice_no in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("invoice_no not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("invoice_no between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("invoice_no not between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeIsNull() {
            addCriterion("extension_code is null");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeIsNotNull() {
            addCriterion("extension_code is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeEqualTo(String value) {
            addCriterion("extension_code =", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeNotEqualTo(String value) {
            addCriterion("extension_code <>", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeGreaterThan(String value) {
            addCriterion("extension_code >", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("extension_code >=", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeLessThan(String value) {
            addCriterion("extension_code <", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeLessThanOrEqualTo(String value) {
            addCriterion("extension_code <=", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeLike(String value) {
            addCriterion("extension_code like", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeNotLike(String value) {
            addCriterion("extension_code not like", value, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeIn(List<String> values) {
            addCriterion("extension_code in", values, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeNotIn(List<String> values) {
            addCriterion("extension_code not in", values, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeBetween(String value1, String value2) {
            addCriterion("extension_code between", value1, value2, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionCodeNotBetween(String value1, String value2) {
            addCriterion("extension_code not between", value1, value2, "extensionCode");
            return (Criteria) this;
        }

        public Criteria andExtensionIdIsNull() {
            addCriterion("extension_id is null");
            return (Criteria) this;
        }

        public Criteria andExtensionIdIsNotNull() {
            addCriterion("extension_id is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionIdEqualTo(Integer value) {
            addCriterion("extension_id =", value, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdNotEqualTo(Integer value) {
            addCriterion("extension_id <>", value, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdGreaterThan(Integer value) {
            addCriterion("extension_id >", value, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("extension_id >=", value, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdLessThan(Integer value) {
            addCriterion("extension_id <", value, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdLessThanOrEqualTo(Integer value) {
            addCriterion("extension_id <=", value, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdIn(List<Integer> values) {
            addCriterion("extension_id in", values, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdNotIn(List<Integer> values) {
            addCriterion("extension_id not in", values, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdBetween(Integer value1, Integer value2) {
            addCriterion("extension_id between", value1, value2, "extensionId");
            return (Criteria) this;
        }

        public Criteria andExtensionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("extension_id not between", value1, value2, "extensionId");
            return (Criteria) this;
        }

        public Criteria andToBuyerIsNull() {
            addCriterion("to_buyer is null");
            return (Criteria) this;
        }

        public Criteria andToBuyerIsNotNull() {
            addCriterion("to_buyer is not null");
            return (Criteria) this;
        }

        public Criteria andToBuyerEqualTo(String value) {
            addCriterion("to_buyer =", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerNotEqualTo(String value) {
            addCriterion("to_buyer <>", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerGreaterThan(String value) {
            addCriterion("to_buyer >", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("to_buyer >=", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerLessThan(String value) {
            addCriterion("to_buyer <", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerLessThanOrEqualTo(String value) {
            addCriterion("to_buyer <=", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerLike(String value) {
            addCriterion("to_buyer like", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerNotLike(String value) {
            addCriterion("to_buyer not like", value, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerIn(List<String> values) {
            addCriterion("to_buyer in", values, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerNotIn(List<String> values) {
            addCriterion("to_buyer not in", values, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerBetween(String value1, String value2) {
            addCriterion("to_buyer between", value1, value2, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andToBuyerNotBetween(String value1, String value2) {
            addCriterion("to_buyer not between", value1, value2, "toBuyer");
            return (Criteria) this;
        }

        public Criteria andPayNoteIsNull() {
            addCriterion("pay_note is null");
            return (Criteria) this;
        }

        public Criteria andPayNoteIsNotNull() {
            addCriterion("pay_note is not null");
            return (Criteria) this;
        }

        public Criteria andPayNoteEqualTo(String value) {
            addCriterion("pay_note =", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteNotEqualTo(String value) {
            addCriterion("pay_note <>", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteGreaterThan(String value) {
            addCriterion("pay_note >", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteGreaterThanOrEqualTo(String value) {
            addCriterion("pay_note >=", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteLessThan(String value) {
            addCriterion("pay_note <", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteLessThanOrEqualTo(String value) {
            addCriterion("pay_note <=", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteLike(String value) {
            addCriterion("pay_note like", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteNotLike(String value) {
            addCriterion("pay_note not like", value, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteIn(List<String> values) {
            addCriterion("pay_note in", values, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteNotIn(List<String> values) {
            addCriterion("pay_note not in", values, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteBetween(String value1, String value2) {
            addCriterion("pay_note between", value1, value2, "payNote");
            return (Criteria) this;
        }

        public Criteria andPayNoteNotBetween(String value1, String value2) {
            addCriterion("pay_note not between", value1, value2, "payNote");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNull() {
            addCriterion("agency_id is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNotNull() {
            addCriterion("agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdEqualTo(Short value) {
            addCriterion("agency_id =", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotEqualTo(Short value) {
            addCriterion("agency_id <>", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThan(Short value) {
            addCriterion("agency_id >", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThanOrEqualTo(Short value) {
            addCriterion("agency_id >=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThan(Short value) {
            addCriterion("agency_id <", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThanOrEqualTo(Short value) {
            addCriterion("agency_id <=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIn(List<Short> values) {
            addCriterion("agency_id in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotIn(List<Short> values) {
            addCriterion("agency_id not in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdBetween(Short value1, Short value2) {
            addCriterion("agency_id between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotBetween(Short value1, Short value2) {
            addCriterion("agency_id not between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andInvTypeIsNull() {
            addCriterion("inv_type is null");
            return (Criteria) this;
        }

        public Criteria andInvTypeIsNotNull() {
            addCriterion("inv_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvTypeEqualTo(String value) {
            addCriterion("inv_type =", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeNotEqualTo(String value) {
            addCriterion("inv_type <>", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeGreaterThan(String value) {
            addCriterion("inv_type >", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeGreaterThanOrEqualTo(String value) {
            addCriterion("inv_type >=", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeLessThan(String value) {
            addCriterion("inv_type <", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeLessThanOrEqualTo(String value) {
            addCriterion("inv_type <=", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeLike(String value) {
            addCriterion("inv_type like", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeNotLike(String value) {
            addCriterion("inv_type not like", value, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeIn(List<String> values) {
            addCriterion("inv_type in", values, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeNotIn(List<String> values) {
            addCriterion("inv_type not in", values, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeBetween(String value1, String value2) {
            addCriterion("inv_type between", value1, value2, "invType");
            return (Criteria) this;
        }

        public Criteria andInvTypeNotBetween(String value1, String value2) {
            addCriterion("inv_type not between", value1, value2, "invType");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andIsSeparateIsNull() {
            addCriterion("is_separate is null");
            return (Criteria) this;
        }

        public Criteria andIsSeparateIsNotNull() {
            addCriterion("is_separate is not null");
            return (Criteria) this;
        }

        public Criteria andIsSeparateEqualTo(Boolean value) {
            addCriterion("is_separate =", value, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateNotEqualTo(Boolean value) {
            addCriterion("is_separate <>", value, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateGreaterThan(Boolean value) {
            addCriterion("is_separate >", value, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_separate >=", value, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateLessThan(Boolean value) {
            addCriterion("is_separate <", value, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateLessThanOrEqualTo(Boolean value) {
            addCriterion("is_separate <=", value, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateIn(List<Boolean> values) {
            addCriterion("is_separate in", values, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateNotIn(List<Boolean> values) {
            addCriterion("is_separate not in", values, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateBetween(Boolean value1, Boolean value2) {
            addCriterion("is_separate between", value1, value2, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andIsSeparateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_separate not between", value1, value2, "isSeparate");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusIsNull() {
            addCriterion("callback_status is null");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusIsNotNull() {
            addCriterion("callback_status is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusEqualTo(String value) {
            addCriterion("callback_status =", value, "callbackStatus");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusNotEqualTo(String value) {
            addCriterion("callback_status <>", value, "callbackStatus");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusGreaterThan(String value) {
            addCriterion("callback_status >", value, "callbackStatus");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusGreaterThanOrEqualTo(String value) {
            addCriterion("callback_status >=", value, "callbackStatus");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusLessThan(String value) {
            addCriterion("callback_status <", value, "callbackStatus");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusLessThanOrEqualTo(String value) {
            addCriterion("callback_status <=", value, "callbackStatus");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusLike(String value) {
            addCriterion("callback_status like", value, "callbackStatus");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusNotLike(String value) {
            addCriterion("callback_status not like", value, "callbackStatus");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusIn(List<String> values) {
            addCriterion("callback_status in", values, "callbackStatus");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusNotIn(List<String> values) {
            addCriterion("callback_status not in", values, "callbackStatus");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusBetween(String value1, String value2) {
            addCriterion("callback_status between", value1, value2, "callbackStatus");
            return (Criteria) this;
        }

        public Criteria andCallbackStatusNotBetween(String value1, String value2) {
            addCriterion("callback_status not between", value1, value2, "callbackStatus");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIsNull() {
            addCriterion("lastmodify is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIsNotNull() {
            addCriterion("lastmodify is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifyEqualTo(Integer value) {
            addCriterion("lastmodify =", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyNotEqualTo(Integer value) {
            addCriterion("lastmodify <>", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyGreaterThan(Integer value) {
            addCriterion("lastmodify >", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastmodify >=", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyLessThan(Integer value) {
            addCriterion("lastmodify <", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyLessThanOrEqualTo(Integer value) {
            addCriterion("lastmodify <=", value, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIn(List<Integer> values) {
            addCriterion("lastmodify in", values, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyNotIn(List<Integer> values) {
            addCriterion("lastmodify not in", values, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyBetween(Integer value1, Integer value2) {
            addCriterion("lastmodify between", value1, value2, "lastmodify");
            return (Criteria) this;
        }

        public Criteria andLastmodifyNotBetween(Integer value1, Integer value2) {
            addCriterion("lastmodify not between", value1, value2, "lastmodify");
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