package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class FavourableActivity {
    private Short actId;

    private String actName;

    private Integer startTime;

    private Integer endTime;

    private String userRank;

    private Byte actRange;

    private String actRangeExt;

    private BigDecimal minAmount;

    private BigDecimal maxAmount;

    private Byte actType;

    private BigDecimal actTypeExt;

    private Byte sortOrder;

    private String gift;

    public FavourableActivity(Short actId, String actName, Integer startTime, Integer endTime, String userRank, Byte actRange, String actRangeExt, BigDecimal minAmount, BigDecimal maxAmount, Byte actType, BigDecimal actTypeExt, Byte sortOrder, String gift) {
        this.actId = actId;
        this.actName = actName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.userRank = userRank;
        this.actRange = actRange;
        this.actRangeExt = actRangeExt;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.actType = actType;
        this.actTypeExt = actTypeExt;
        this.sortOrder = sortOrder;
        this.gift = gift;
    }

    public FavourableActivity() {
        super();
    }

    public Short getActId() {
        return actId;
    }

    public void setActId(Short actId) {
        this.actId = actId;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getUserRank() {
        return userRank;
    }

    public void setUserRank(String userRank) {
        this.userRank = userRank == null ? null : userRank.trim();
    }

    public Byte getActRange() {
        return actRange;
    }

    public void setActRange(Byte actRange) {
        this.actRange = actRange;
    }

    public String getActRangeExt() {
        return actRangeExt;
    }

    public void setActRangeExt(String actRangeExt) {
        this.actRangeExt = actRangeExt == null ? null : actRangeExt.trim();
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Byte getActType() {
        return actType;
    }

    public void setActType(Byte actType) {
        this.actType = actType;
    }

    public BigDecimal getActTypeExt() {
        return actTypeExt;
    }

    public void setActTypeExt(BigDecimal actTypeExt) {
        this.actTypeExt = actTypeExt;
    }

    public Byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift == null ? null : gift.trim();
    }
}