package com.peacock.shop.web.domain;

public class AutoManageKey {
    private Integer itemId;

    private String type;

    public AutoManageKey(Integer itemId, String type) {
        this.itemId = itemId;
        this.type = type;
    }

    public AutoManageKey() {
        super();
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}