package com.peacock.shop.web.domain;

public class SearchHistory {
    private Integer id;

    private String keyword;

    private Integer count;

    private String type;

    private Integer storeId;

    private Integer updated;

    public SearchHistory(Integer id, String keyword, Integer count, String type, Integer storeId, Integer updated) {
        this.id = id;
        this.keyword = keyword;
        this.count = count;
        this.type = type;
        this.storeId = storeId;
        this.updated = updated;
    }

    public SearchHistory() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }
}