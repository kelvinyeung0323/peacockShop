package com.peacock.shop.web.domain;

public class Shipping {
    private Byte shippingId;

    private String shippingCode;

    private String shippingName;

    private String shippingDesc;

    private String insure;

    private Boolean supportCod;

    private Boolean enabled;

    private String printBg;

    private Boolean printModel;

    private Byte shippingOrder;

    public Shipping(Byte shippingId, String shippingCode, String shippingName, String shippingDesc, String insure, Boolean supportCod, Boolean enabled, String printBg, Boolean printModel, Byte shippingOrder) {
        this.shippingId = shippingId;
        this.shippingCode = shippingCode;
        this.shippingName = shippingName;
        this.shippingDesc = shippingDesc;
        this.insure = insure;
        this.supportCod = supportCod;
        this.enabled = enabled;
        this.printBg = printBg;
        this.printModel = printModel;
        this.shippingOrder = shippingOrder;
    }

    public Shipping() {
        super();
    }

    public Byte getShippingId() {
        return shippingId;
    }

    public void setShippingId(Byte shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    public String getShippingDesc() {
        return shippingDesc;
    }

    public void setShippingDesc(String shippingDesc) {
        this.shippingDesc = shippingDesc == null ? null : shippingDesc.trim();
    }

    public String getInsure() {
        return insure;
    }

    public void setInsure(String insure) {
        this.insure = insure == null ? null : insure.trim();
    }

    public Boolean getSupportCod() {
        return supportCod;
    }

    public void setSupportCod(Boolean supportCod) {
        this.supportCod = supportCod;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getPrintBg() {
        return printBg;
    }

    public void setPrintBg(String printBg) {
        this.printBg = printBg == null ? null : printBg.trim();
    }

    public Boolean getPrintModel() {
        return printModel;
    }

    public void setPrintModel(Boolean printModel) {
        this.printModel = printModel;
    }

    public Byte getShippingOrder() {
        return shippingOrder;
    }

    public void setShippingOrder(Byte shippingOrder) {
        this.shippingOrder = shippingOrder;
    }
}