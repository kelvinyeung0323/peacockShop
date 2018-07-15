package com.peacock.shop.web.domain;

public class Product {
    private Integer productId;

    private Integer goodsId;

    private String goodsAttr;

    private String productSn;

    private Integer productNumber;

    public Product(Integer productId, Integer goodsId, String goodsAttr, String productSn, Integer productNumber) {
        this.productId = productId;
        this.goodsId = goodsId;
        this.goodsAttr = goodsAttr;
        this.productSn = productSn;
        this.productNumber = productNumber;
    }

    public Product() {
        super();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr == null ? null : goodsAttr.trim();
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }
}