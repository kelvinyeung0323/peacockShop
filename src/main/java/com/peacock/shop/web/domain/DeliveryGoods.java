package com.peacock.shop.web.domain;

public class DeliveryGoods {
    private Integer recId;

    private Integer deliveryId;

    private Integer goodsId;

    private Integer productId;

    private String productSn;

    private String goodsName;

    private String brandName;

    private String goodsSn;

    private Boolean isReal;

    private String extensionCode;

    private Integer parentId;

    private Short sendNumber;

    private String goodsAttr;

    public DeliveryGoods(Integer recId, Integer deliveryId, Integer goodsId, Integer productId, String productSn, String goodsName, String brandName, String goodsSn, Boolean isReal, String extensionCode, Integer parentId, Short sendNumber, String goodsAttr) {
        this.recId = recId;
        this.deliveryId = deliveryId;
        this.goodsId = goodsId;
        this.productId = productId;
        this.productSn = productSn;
        this.goodsName = goodsName;
        this.brandName = brandName;
        this.goodsSn = goodsSn;
        this.isReal = isReal;
        this.extensionCode = extensionCode;
        this.parentId = parentId;
        this.sendNumber = sendNumber;
        this.goodsAttr = goodsAttr;
    }

    public DeliveryGoods() {
        super();
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
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

    public String getExtensionCode() {
        return extensionCode;
    }

    public void setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode == null ? null : extensionCode.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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