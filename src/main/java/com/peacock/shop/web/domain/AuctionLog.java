package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class AuctionLog {
    private Integer logId;

    private Integer actId;

    private Integer bidUser;

    private BigDecimal bidPrice;

    private Integer bidTime;

    public AuctionLog(Integer logId, Integer actId, Integer bidUser, BigDecimal bidPrice, Integer bidTime) {
        this.logId = logId;
        this.actId = actId;
        this.bidUser = bidUser;
        this.bidPrice = bidPrice;
        this.bidTime = bidTime;
    }

    public AuctionLog() {
        super();
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public Integer getBidUser() {
        return bidUser;
    }

    public void setBidUser(Integer bidUser) {
        this.bidUser = bidUser;
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