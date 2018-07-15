package com.peacock.shop.web.domain;

public class LinkGoods extends LinkGoodsKey {
    private Boolean isDouble;

    public LinkGoods(Integer goodsId, Integer linkGoodsId, Byte adminId, Boolean isDouble) {
        super(goodsId, linkGoodsId, adminId);
        this.isDouble = isDouble;
    }

    public LinkGoods() {
        super();
    }

    public Boolean getIsDouble() {
        return isDouble;
    }

    public void setIsDouble(Boolean isDouble) {
        this.isDouble = isDouble;
    }
}