package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class AffiliateLog {
    private Integer logId;

    private Integer orderId;

    private Integer time;

    private Integer userId;

    private String userName;

    private BigDecimal money;

    private Integer point;

    private Boolean separateType;

    public AffiliateLog(Integer logId, Integer orderId, Integer time, Integer userId, String userName, BigDecimal money, Integer point, Boolean separateType) {
        this.logId = logId;
        this.orderId = orderId;
        this.time = time;
        this.userId = userId;
        this.userName = userName;
        this.money = money;
        this.point = point;
        this.separateType = separateType;
    }

    public AffiliateLog() {
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

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Boolean getSeparateType() {
        return separateType;
    }

    public void setSeparateType(Boolean separateType) {
        this.separateType = separateType;
    }
}