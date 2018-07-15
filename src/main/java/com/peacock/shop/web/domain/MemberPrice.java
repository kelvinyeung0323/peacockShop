package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class MemberPrice {
    private Integer priceId;

    private Integer goodsId;

    private Byte userRank;

    private BigDecimal userPrice;

    public MemberPrice(Integer priceId, Integer goodsId, Byte userRank, BigDecimal userPrice) {
        this.priceId = priceId;
        this.goodsId = goodsId;
        this.userRank = userRank;
        this.userPrice = userPrice;
    }

    public MemberPrice() {
        super();
    }

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Byte getUserRank() {
        return userRank;
    }

    public void setUserRank(Byte userRank) {
        this.userRank = userRank;
    }

    public BigDecimal getUserPrice() {
        return userPrice;
    }

    public void setUserPrice(BigDecimal userPrice) {
        this.userPrice = userPrice;
    }
}