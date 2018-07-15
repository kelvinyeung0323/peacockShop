package com.peacock.shop.web.domain;

public class CollectGoods {
    private Integer recId;

    private Integer userId;

    private Integer goodsId;

    private Integer addTime;

    private Boolean isAttention;

    public CollectGoods(Integer recId, Integer userId, Integer goodsId, Integer addTime, Boolean isAttention) {
        this.recId = recId;
        this.userId = userId;
        this.goodsId = goodsId;
        this.addTime = addTime;
        this.isAttention = isAttention;
    }

    public CollectGoods() {
        super();
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Boolean getIsAttention() {
        return isAttention;
    }

    public void setIsAttention(Boolean isAttention) {
        this.isAttention = isAttention;
    }
}