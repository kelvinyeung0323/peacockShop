package com.peacock.shop.web.domain;

public class GoodsCatKey {
    private Integer goodsId;

    private Short catId;

    public GoodsCatKey(Integer goodsId, Short catId) {
        this.goodsId = goodsId;
        this.catId = catId;
    }

    public GoodsCatKey() {
        super();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }
}