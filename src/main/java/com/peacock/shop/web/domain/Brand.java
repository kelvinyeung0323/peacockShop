package com.peacock.shop.web.domain;

public class Brand {
    private Short brandId;

    private String brandName;

    private String brandLogo;

    private String siteUrl;

    private Byte sortOrder;

    private Boolean isShow;

    private String brandDesc;

    public Brand(Short brandId, String brandName, String brandLogo, String siteUrl, Byte sortOrder, Boolean isShow, String brandDesc) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandLogo = brandLogo;
        this.siteUrl = siteUrl;
        this.sortOrder = sortOrder;
        this.isShow = isShow;
        this.brandDesc = brandDesc;
    }

    public Brand() {
        super();
    }

    public Short getBrandId() {
        return brandId;
    }

    public void setBrandId(Short brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo == null ? null : brandLogo.trim();
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl == null ? null : siteUrl.trim();
    }

    public Byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc == null ? null : brandDesc.trim();
    }
}