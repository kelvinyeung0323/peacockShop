package com.peacock.shop.web.domain;

public class ArticleCat {
    private Short catId;

    private String catName;

    private Boolean catType;

    private String keywords;

    private String catDesc;

    private Byte sortOrder;

    private Boolean showInNav;

    private Short parentId;

    public ArticleCat(Short catId, String catName, Boolean catType, String keywords, String catDesc, Byte sortOrder, Boolean showInNav, Short parentId) {
        this.catId = catId;
        this.catName = catName;
        this.catType = catType;
        this.keywords = keywords;
        this.catDesc = catDesc;
        this.sortOrder = sortOrder;
        this.showInNav = showInNav;
        this.parentId = parentId;
    }

    public ArticleCat() {
        super();
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    public Boolean getCatType() {
        return catType;
    }

    public void setCatType(Boolean catType) {
        this.catType = catType;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getCatDesc() {
        return catDesc;
    }

    public void setCatDesc(String catDesc) {
        this.catDesc = catDesc == null ? null : catDesc.trim();
    }

    public Byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getShowInNav() {
        return showInNav;
    }

    public void setShowInNav(Boolean showInNav) {
        this.showInNav = showInNav;
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }
}