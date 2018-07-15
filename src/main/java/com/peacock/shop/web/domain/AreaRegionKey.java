package com.peacock.shop.web.domain;

public class AreaRegionKey {
    private Short shippingAreaId;

    private Short regionId;

    public AreaRegionKey(Short shippingAreaId, Short regionId) {
        this.shippingAreaId = shippingAreaId;
        this.regionId = regionId;
    }

    public AreaRegionKey() {
        super();
    }

    public Short getShippingAreaId() {
        return shippingAreaId;
    }

    public void setShippingAreaId(Short shippingAreaId) {
        this.shippingAreaId = shippingAreaId;
    }

    public Short getRegionId() {
        return regionId;
    }

    public void setRegionId(Short regionId) {
        this.regionId = regionId;
    }
}