package com.peacock.shop.web.domain;

public class Wholesale {
    private Integer actId;

    private Integer goodsId;

    private String goodsName;

    private String rankIds;

    private Byte enabled;

    private String prices;

    public Wholesale(Integer actId, Integer goodsId, String goodsName, String rankIds, Byte enabled, String prices) {
        this.actId = actId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.rankIds = rankIds;
        this.enabled = enabled;
        this.prices = prices;
    }

    public Wholesale() {
        super();
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getRankIds() {
        return rankIds;
    }

    public void setRankIds(String rankIds) {
        this.rankIds = rankIds == null ? null : rankIds.trim();
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices == null ? null : prices.trim();
    }
}