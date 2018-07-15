package com.peacock.shop.web.domain;

public class ShippingWithBLOBs extends Shipping {
    private String shippingPrint;

    private String configLable;

    public ShippingWithBLOBs(Byte shippingId, String shippingCode, String shippingName, String shippingDesc, String insure, Boolean supportCod, Boolean enabled, String printBg, Boolean printModel, Byte shippingOrder, String shippingPrint, String configLable) {
        super(shippingId, shippingCode, shippingName, shippingDesc, insure, supportCod, enabled, printBg, printModel, shippingOrder);
        this.shippingPrint = shippingPrint;
        this.configLable = configLable;
    }

    public ShippingWithBLOBs() {
        super();
    }

    public String getShippingPrint() {
        return shippingPrint;
    }

    public void setShippingPrint(String shippingPrint) {
        this.shippingPrint = shippingPrint == null ? null : shippingPrint.trim();
    }

    public String getConfigLable() {
        return configLable;
    }

    public void setConfigLable(String configLable) {
        this.configLable = configLable == null ? null : configLable.trim();
    }
}