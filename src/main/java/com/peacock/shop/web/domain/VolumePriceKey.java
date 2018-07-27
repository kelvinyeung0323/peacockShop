package com.peacock.shop.web.domain;

public class VolumePriceKey {
    private Byte priceType;

    private Integer goodsId;

    private Short volumeNumber;

    public VolumePriceKey(Byte priceType, Integer goodsId, Short volumeNumber) {
        this.priceType = priceType;
        this.goodsId = goodsId;
        this.volumeNumber = volumeNumber;
    }

    public VolumePriceKey() {
        super();
    }

    public Byte getPriceType() {
        return priceType;
    }

    public void setPriceType(Byte priceType) {
        this.priceType = priceType;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Short getVolumeNumber() {
        return volumeNumber;
    }

    public void setVolumeNumber(Short volumeNumber) {
        this.volumeNumber = volumeNumber;
    }
}