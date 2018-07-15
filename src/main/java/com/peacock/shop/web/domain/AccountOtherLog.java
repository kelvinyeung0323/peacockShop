package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class AccountOtherLog {
    private Integer userId;

    private Integer orderId;

    private String orderSn;

    private BigDecimal money;

    private String payType;

    private String payTime;

    private String changeDesc;

    public AccountOtherLog(Integer userId, Integer orderId, String orderSn, BigDecimal money, String payType, String payTime, String changeDesc) {
        this.userId = userId;
        this.orderId = orderId;
        this.orderSn = orderSn;
        this.money = money;
        this.payType = payType;
        this.payTime = payTime;
        this.changeDesc = changeDesc;
    }

    public AccountOtherLog() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }

    public String getChangeDesc() {
        return changeDesc;
    }

    public void setChangeDesc(String changeDesc) {
        this.changeDesc = changeDesc == null ? null : changeDesc.trim();
    }
}