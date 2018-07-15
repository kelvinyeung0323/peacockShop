package com.peacock.shop.web.domain;

public class ExchangeGoods {
    private Integer goodsId;

    private Integer exchangeIntegral;

    private Boolean isExchange;

    private Boolean isHot;

    public ExchangeGoods(Integer goodsId, Integer exchangeIntegral, Boolean isExchange, Boolean isHot) {
        this.goodsId = goodsId;
        this.exchangeIntegral = exchangeIntegral;
        this.isExchange = isExchange;
        this.isHot = isHot;
    }

    public ExchangeGoods() {
        super();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getExchangeIntegral() {
        return exchangeIntegral;
    }

    public void setExchangeIntegral(Integer exchangeIntegral) {
        this.exchangeIntegral = exchangeIntegral;
    }

    public Boolean getIsExchange() {
        return isExchange;
    }

    public void setIsExchange(Boolean isExchange) {
        this.isExchange = isExchange;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }
}