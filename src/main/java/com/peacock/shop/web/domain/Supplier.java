package com.peacock.shop.web.domain;

public class Supplier {
    private Short suppliersId;

    private String suppliersName;

    private Boolean isCheck;

    private String suppliersDesc;

    public Supplier(Short suppliersId, String suppliersName, Boolean isCheck, String suppliersDesc) {
        this.suppliersId = suppliersId;
        this.suppliersName = suppliersName;
        this.isCheck = isCheck;
        this.suppliersDesc = suppliersDesc;
    }

    public Supplier() {
        super();
    }

    public Short getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Short suppliersId) {
        this.suppliersId = suppliersId;
    }

    public String getSuppliersName() {
        return suppliersName;
    }

    public void setSuppliersName(String suppliersName) {
        this.suppliersName = suppliersName == null ? null : suppliersName.trim();
    }

    public Boolean getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Boolean isCheck) {
        this.isCheck = isCheck;
    }

    public String getSuppliersDesc() {
        return suppliersDesc;
    }

    public void setSuppliersDesc(String suppliersDesc) {
        this.suppliersDesc = suppliersDesc == null ? null : suppliersDesc.trim();
    }
}