package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class PayLog {
    private Integer logId;

    private Integer orderId;

    private BigDecimal orderAmount;

    private Boolean orderType;

    private Boolean isPaid;

    public PayLog(Integer logId, Integer orderId, BigDecimal orderAmount, Boolean orderType, Boolean isPaid) {
        this.logId = logId;
        this.orderId = orderId;
        this.orderAmount = orderAmount;
        this.orderType = orderType;
        this.isPaid = isPaid;
    }

    public PayLog() {
        super();
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Boolean getOrderType() {
        return orderType;
    }

    public void setOrderType(Boolean orderType) {
        this.orderType = orderType;
    }

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }
}