package com.peacock.shop.web.domain;

public class CoincidenceKey {
    private String typeId;

    private String type;

    public CoincidenceKey(String typeId, String type) {
        this.typeId = typeId;
        this.type = type;
    }

    public CoincidenceKey() {
        super();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}