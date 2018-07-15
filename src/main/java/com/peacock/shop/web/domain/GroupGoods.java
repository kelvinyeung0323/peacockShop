package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class GroupGoods extends GroupGoodsKey {
    private BigDecimal goodsPrice;

    public GroupGoods(Integer parentId, Integer goodsId, Byte adminId, BigDecimal goodsPrice) {
        super(parentId, goodsId, adminId);
        this.goodsPrice = goodsPrice;
    }

    public GroupGoods() {
        super();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}