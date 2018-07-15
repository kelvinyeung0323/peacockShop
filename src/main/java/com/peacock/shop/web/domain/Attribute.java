package com.peacock.shop.web.domain;

public class Attribute {
    private Short attrId;

    private Short catId;

    private String attrName;

    private Boolean attrInputType;

    private Boolean attrType;

    private Boolean attrIndex;

    private Byte sortOrder;

    private Boolean isLinked;

    private Boolean attrGroup;

    private String attrValues;

    public Attribute(Short attrId, Short catId, String attrName, Boolean attrInputType, Boolean attrType, Boolean attrIndex, Byte sortOrder, Boolean isLinked, Boolean attrGroup, String attrValues) {
        this.attrId = attrId;
        this.catId = catId;
        this.attrName = attrName;
        this.attrInputType = attrInputType;
        this.attrType = attrType;
        this.attrIndex = attrIndex;
        this.sortOrder = sortOrder;
        this.isLinked = isLinked;
        this.attrGroup = attrGroup;
        this.attrValues = attrValues;
    }

    public Attribute() {
        super();
    }

    public Short getAttrId() {
        return attrId;
    }

    public void setAttrId(Short attrId) {
        this.attrId = attrId;
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public Boolean getAttrInputType() {
        return attrInputType;
    }

    public void setAttrInputType(Boolean attrInputType) {
        this.attrInputType = attrInputType;
    }

    public Boolean getAttrType() {
        return attrType;
    }

    public void setAttrType(Boolean attrType) {
        this.attrType = attrType;
    }

    public Boolean getAttrIndex() {
        return attrIndex;
    }

    public void setAttrIndex(Boolean attrIndex) {
        this.attrIndex = attrIndex;
    }

    public Byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsLinked() {
        return isLinked;
    }

    public void setIsLinked(Boolean isLinked) {
        this.isLinked = isLinked;
    }

    public Boolean getAttrGroup() {
        return attrGroup;
    }

    public void setAttrGroup(Boolean attrGroup) {
        this.attrGroup = attrGroup;
    }

    public String getAttrValues() {
        return attrValues;
    }

    public void setAttrValues(String attrValues) {
        this.attrValues = attrValues == null ? null : attrValues.trim();
    }
}