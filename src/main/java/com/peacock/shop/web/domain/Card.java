package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class Card {
    private Byte cardId;

    private String cardName;

    private String cardImg;

    private BigDecimal cardFee;

    private BigDecimal freeMoney;

    private String cardDesc;

    public Card(Byte cardId, String cardName, String cardImg, BigDecimal cardFee, BigDecimal freeMoney, String cardDesc) {
        this.cardId = cardId;
        this.cardName = cardName;
        this.cardImg = cardImg;
        this.cardFee = cardFee;
        this.freeMoney = freeMoney;
        this.cardDesc = cardDesc;
    }

    public Card() {
        super();
    }

    public Byte getCardId() {
        return cardId;
    }

    public void setCardId(Byte cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getCardImg() {
        return cardImg;
    }

    public void setCardImg(String cardImg) {
        this.cardImg = cardImg == null ? null : cardImg.trim();
    }

    public BigDecimal getCardFee() {
        return cardFee;
    }

    public void setCardFee(BigDecimal cardFee) {
        this.cardFee = cardFee;
    }

    public BigDecimal getFreeMoney() {
        return freeMoney;
    }

    public void setFreeMoney(BigDecimal freeMoney) {
        this.freeMoney = freeMoney;
    }

    public String getCardDesc() {
        return cardDesc;
    }

    public void setCardDesc(String cardDesc) {
        this.cardDesc = cardDesc == null ? null : cardDesc.trim();
    }
}