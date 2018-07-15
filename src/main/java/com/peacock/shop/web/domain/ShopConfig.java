package com.peacock.shop.web.domain;

public class ShopConfig {
    private Short id;

    private Short parentId;

    private String code;

    private String type;

    private String storeRange;

    private String storeDir;

    private Byte sortOrder;

    private String value;

    public ShopConfig(Short id, Short parentId, String code, String type, String storeRange, String storeDir, Byte sortOrder, String value) {
        this.id = id;
        this.parentId = parentId;
        this.code = code;
        this.type = type;
        this.storeRange = storeRange;
        this.storeDir = storeDir;
        this.sortOrder = sortOrder;
        this.value = value;
    }

    public ShopConfig() {
        super();
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStoreRange() {
        return storeRange;
    }

    public void setStoreRange(String storeRange) {
        this.storeRange = storeRange == null ? null : storeRange.trim();
    }

    public String getStoreDir() {
        return storeDir;
    }

    public void setStoreDir(String storeDir) {
        this.storeDir = storeDir == null ? null : storeDir.trim();
    }

    public Byte getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}