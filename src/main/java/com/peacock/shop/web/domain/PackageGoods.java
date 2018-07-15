package com.peacock.shop.web.domain;

public class PackageGoods extends PackageGoodsKey {
    private Short goodsNumber;

    public PackageGoods(Integer packageId, Integer goodsId, Byte adminId, Integer productId, Short goodsNumber) {
        super(packageId, goodsId, adminId, productId);
        this.goodsNumber = goodsNumber;
    }

    public PackageGoods() {
        super();
    }

    public Short getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Short goodsNumber) {
        this.goodsNumber = goodsNumber;
    }
}