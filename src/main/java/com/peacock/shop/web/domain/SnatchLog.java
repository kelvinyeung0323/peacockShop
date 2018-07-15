package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class SnatchLog {
    private Integer logId;

    private Byte snatchId;

    private Integer userId;

    private BigDecimal bidPrice;

    private Integer bidTime;

    public SnatchLog(Integer logId, Byte snatchId, Integer userId, BigDecimal bidPrice, Integer bidTime) {
        this.logId = logId;
        this.snatchId = snatchId;
        this.userId = userId;
        this.bidPrice = bidPrice;
        this.bidTime = bidTime;
    }

    public SnatchLog() {
        super();
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Byte getSnatchId() {
        return snatchId;
    }

    public void setSnatchId(Byte snatchId) {
        this.snatchId = snatchId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(BigDecimal bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Integer getBidTime() {
        return bidTime;
    }

    public void setBidTime(Integer bidTime) {
        this.bidTime = bidTime;
    }
}