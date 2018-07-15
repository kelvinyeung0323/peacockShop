package com.peacock.shop.web.domain;

public class OrderReview {
    private Integer userId;

    private Integer orderId;

    private Integer goodsId;

    public OrderReview(Integer userId, Integer orderId, Integer goodsId) {
        this.userId = userId;
        this.orderId = orderId;
        this.goodsId = goodsId;
    }

    public OrderReview() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}