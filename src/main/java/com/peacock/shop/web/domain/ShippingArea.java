package com.peacock.shop.web.domain;

public class ShippingArea {
    private Short shippingAreaId;

    private String shippingAreaName;

    private Byte shippingId;

    private String configure;

    public ShippingArea(Short shippingAreaId, String shippingAreaName, Byte shippingId, String configure) {
        this.shippingAreaId = shippingAreaId;
        this.shippingAreaName = shippingAreaName;
        this.shippingId = shippingId;
        this.configure = configure;
    }

    public ShippingArea() {
        super();
    }

    public Short getShippingAreaId() {
        return shippingAreaId;
    }

    public void setShippingAreaId(Short shippingAreaId) {
        this.shippingAreaId = shippingAreaId;
    }

    public String getShippingAreaName() {
        return shippingAreaName;
    }

    public void setShippingAreaName(String shippingAreaName) {
        this.shippingAreaName = shippingAreaName == null ? null : shippingAreaName.trim();
    }

    public Byte getShippingId() {
        return shippingId;
    }

    public void setShippingId(Byte shippingId) {
        this.shippingId = shippingId;
    }

    public String getConfigure() {
        return configure;
    }

    public void setConfigure(String configure) {
        this.configure = configure == null ? null : configure.trim();
    }
}