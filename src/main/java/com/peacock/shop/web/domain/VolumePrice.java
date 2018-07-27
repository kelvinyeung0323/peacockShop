package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class VolumePrice extends VolumePriceKey {
    private BigDecimal volumePrice;

    public VolumePrice(Byte priceType, Integer goodsId, Short volumeNumber, BigDecimal volumePrice) {
        super(priceType, goodsId, volumeNumber);
        this.volumePrice = volumePrice;
    }

    public VolumePrice() {
        super();
    }

    public BigDecimal getVolumePrice() {
        return volumePrice;
    }

    public void setVolumePrice(BigDecimal volumePrice) {
        this.volumePrice = volumePrice;
    }
}