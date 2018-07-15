package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class Cart {
    private Integer recId;

    private Integer userId;

    private String sessionId;

    private Integer goodsId;

    private String goodsSn;

    private Integer productId;

    private String goodsName;

    private BigDecimal marketPrice;

    private BigDecimal goodsPrice;

    private Short goodsNumber;

    private Boolean isReal;

    private String extensionCode;

    private Integer parentId;

    private Boolean recType;

    private Short isGift;

    private Boolean isShipping;

    private Byte canHandsel;

    private String goodsAttrId;

    private String goodsAttr;

    public Cart(Integer recId, Integer userId, String sessionId, Integer goodsId, String goodsSn, Integer productId, String goodsName, BigDecimal marketPrice, BigDecimal goodsPrice, Short goodsNumber, Boolean isReal, String extensionCode, Integer parentId, Boolean recType, Short isGift, Boolean isShipping, Byte canHandsel, String goodsAttrId, String goodsAttr) {
        this.recId = recId;
        this.userId = userId;
        this.sessionId = sessionId;
        this.goodsId = goodsId;
        this.goodsSn = goodsSn;
        this.productId = productId;
        this.goodsName = goodsName;
        this.marketPrice = marketPrice;
        this.goodsPrice = goodsPrice;
        this.goodsNumber = goodsNumber;
        this.isReal = isReal;
        this.extensionCode = extensionCode;
        this.parentId = parentId;
        this.recType = recType;
        this.isGift = isGift;
        this.isShipping = isShipping;
        this.canHandsel = canHandsel;
        this.goodsAttrId = goodsAttrId;
        this.goodsAttr = goodsAttr;
    }

    public Cart() {
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

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Short getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Short goodsNumber) {
        this.goodsNumber = goodsNumber;
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

    public Boolean getRecType() {
        return recType;
    }

    public void setRecType(Boolean recType) {
        this.recType = recType;
    }

    public Short getIsGift() {
        return isGift;
    }

    public void setIsGift(Short isGift) {
        this.isGift = isGift;
    }

    public Boolean getIsShipping() {
        return isShipping;
    }

    public void setIsShipping(Boolean isShipping) {
        this.isShipping = isShipping;
    }

    public Byte getCanHandsel() {
        return canHandsel;
    }

    public void setCanHandsel(Byte canHandsel) {
        this.canHandsel = canHandsel;
    }

    public String getGoodsAttrId() {
        return goodsAttrId;
    }

    public void setGoodsAttrId(String goodsAttrId) {
        this.goodsAttrId = goodsAttrId == null ? null : goodsAttrId.trim();
    }

    public String getGoodsAttr() {
        return goodsAttr;
    }

    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr == null ? null : goodsAttr.trim();
    }
}