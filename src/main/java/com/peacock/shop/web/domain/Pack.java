package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class Pack {
    private Byte packId;

    private String packName;

    private String packImg;

    private BigDecimal packFee;

    private Short freeMoney;

    private String packDesc;

    public Pack(Byte packId, String packName, String packImg, BigDecimal packFee, Short freeMoney, String packDesc) {
        this.packId = packId;
        this.packName = packName;
        this.packImg = packImg;
        this.packFee = packFee;
        this.freeMoney = freeMoney;
        this.packDesc = packDesc;
    }

    public Pack() {
        super();
    }

    public Byte getPackId() {
        return packId;
    }

    public void setPackId(Byte packId) {
        this.packId = packId;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName == null ? null : packName.trim();
    }

    public String getPackImg() {
        return packImg;
    }

    public void setPackImg(String packImg) {
        this.packImg = packImg == null ? null : packImg.trim();
    }

    public BigDecimal getPackFee() {
        return packFee;
    }

    public void setPackFee(BigDecimal packFee) {
        this.packFee = packFee;
    }

    public Short getFreeMoney() {
        return freeMoney;
    }

    public void setFreeMoney(Short freeMoney) {
        this.freeMoney = freeMoney;
    }

    public String getPackDesc() {
        return packDesc;
    }

    public void setPackDesc(String packDesc) {
        this.packDesc = packDesc == null ? null : packDesc.trim();
    }
}