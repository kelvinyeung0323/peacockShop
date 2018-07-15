package com.peacock.shop.web.domain;

public class BackGoods {
    private Integer recId;

    private Integer backId;

    private Integer goodsId;

    private Integer productId;

    private String productSn;

    private String goodsName;

    private String brandName;

    private String goodsSn;

    private Boolean isReal;

    private Short sendNumber;

    private String goodsAttr;

    public BackGoods(Integer recId, Integer backId, Integer goodsId, Integer productId, String productSn, String goodsName, String brandName, String goodsSn, Boolean isReal, Short sendNumber, String goodsAttr) {
        this.recId = recId;
        this.backId = backId;
        this.goodsId = goodsId;
        this.productId = productId;
        this.productSn = productSn;
        this.goodsName = goodsName;
        this.brandName = brandName;
        this.goodsSn = goodsSn;
        this.isReal = isReal;
        this.sendNumber = sendNumber;
        this.goodsAttr = goodsAttr;
    }

    public BackGoods() {
        super();
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getBackId() {
        return backId;
    }

    public void setBackId(Integer backId) {
        this.backId = backId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    public Boolean getIsReal() {
        return isReal;
    }

    public void setIsReal(Boolean isReal) {
        this.isReal = isReal;
    }

    public Short getSendNumber() {
        return sendNumber;
    }

    public void setSendNumber(Short sendNumber) {
        this.sendNumber = sendNumber;
    }

    public String getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr == null ? null : goodsAttr.trim();
    }
}