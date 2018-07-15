package com.peacock.shop.web.domain;

import java.util.Date;

public class KeywordKey {
    private Date date;

    private String searchengine;

    private String keyword;

    public KeywordKey(Date date, String searchengine, String keyword) {
        this.date = date;
        this.searchengine = searchengine;
        this.keyword = keyword;
    }

    public KeywordKey() {
        super();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSearchengine() {
        return searchengine;
    }

    public void setSearchengine(String searchengine) {
        this.searchengine = searchengine == null ? null : searchengine.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }
}