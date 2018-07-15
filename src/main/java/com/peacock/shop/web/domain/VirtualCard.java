package com.peacock.shop.web.domain;

public class VirtualCard {
    private Integer cardId;

    private Integer goodsId;

    private String cardSn;

    private String cardPassword;

    private Integer addDate;

    private Integer endDate;

    private Boolean isSaled;

    private String orderSn;

    private String crc32;

    public VirtualCard(Integer cardId, Integer goodsId, String cardSn, String cardPassword, Integer addDate, Integer endDate, Boolean isSaled, String orderSn, String crc32) {
        this.cardId = cardId;
        this.goodsId = goodsId;
        this.cardSn = cardSn;
        this.cardPassword = cardPassword;
        this.addDate = addDate;
        this.endDate = endDate;
        this.isSaled = isSaled;
        this.orderSn = orderSn;
        this.crc32 = crc32;
    }

    public VirtualCard() {
        super();
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getCardSn() {
        return cardSn;
    }

    public void setCardSn(String cardSn) {
        this.cardSn = cardSn == null ? null : cardSn.trim();
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword == null ? null : cardPassword.trim();
    }

    public Integer getAddDate() {
        return addDate;
    }

    public void setAddDate(Integer addDate) {
        this.addDate = addDate;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    public Boolean getIsSaled() {
        return isSaled;
    }

    public void setIsSaled(Boolean isSaled) {
        this.isSaled = isSaled;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public String getCrc32() {
        return crc32;
    }

    public void setCrc32(String crc32) {
        this.crc32 = crc32 == null ? null : crc32.trim();
    }
}