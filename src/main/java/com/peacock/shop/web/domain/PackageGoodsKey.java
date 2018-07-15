package com.peacock.shop.web.domain;

public class PackageGoodsKey {
    private Integer packageId;

    private Integer goodsId;

    private Byte adminId;

    private Integer productId;

    public PackageGoodsKey(Integer packageId, Integer goodsId, Byte adminId, Integer productId) {
        this.packageId = packageId;
        this.goodsId = goodsId;
        this.adminId = adminId;
        this.productId = productId;
    }

    public PackageGoodsKey() {
        super();
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Byte getAdminId() {
        return adminId;
    }

    public void setAdminId(Byte adminId) {
        this.adminId = adminId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}