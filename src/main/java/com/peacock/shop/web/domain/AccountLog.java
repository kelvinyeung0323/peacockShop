package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class AccountLog {
    private Integer logId;

    private Integer userId;

    private BigDecimal userMoney;

    private BigDecimal frozenMoney;

    private Integer rankPoints;

    private Integer payPoints;

    private Integer changeTime;

    private String changeDesc;

    private Byte changeType;

    public AccountLog(Integer logId, Integer userId, BigDecimal userMoney, BigDecimal frozenMoney, Integer rankPoints, Integer payPoints, Integer changeTime, String changeDesc, Byte changeType) {
        this.logId = logId;
        this.userId = userId;
        this.userMoney = userMoney;
        this.frozenMoney = frozenMoney;
        this.rankPoints = rankPoints;
        this.payPoints = payPoints;
        this.changeTime = changeTime;
        this.changeDesc = changeDesc;
        this.changeType = changeType;
    }

    public AccountLog() {
        super();
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public BigDecimal getFrozenMoney() {
        return frozenMoney;
    }

    public void setFrozenMoney(BigDecimal frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    public Integer getRankPoints() {
        return rankPoints;
    }

    public void setRankPoints(Integer rankPoints) {
        this.rankPoints = rankPoints;
    }

    public Integer getPayPoints() {
        return payPoints;
    }

    public void setPayPoints(Integer payPoints) {
        this.payPoints = payPoints;
    }

    public Integer getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Integer changeTime) {
        this.changeTime = changeTime;
    }

    public String getChangeDesc() {
        return changeDesc;
    }

    public void setChangeDesc(String changeDesc) {
        this.changeDesc = changeDesc == null ? null : changeDesc.trim();
    }

    public Byte getChangeType() {
        return changeType;
    }

    public void setChangeType(Byte changeType) {
        this.changeType = changeType;
    }
}