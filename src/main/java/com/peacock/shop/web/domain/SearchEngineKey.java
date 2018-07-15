package com.peacock.shop.web.domain;

import java.util.Date;

public class SearchEngineKey {
    private Date date;

    private String searchengine;

    public SearchEngineKey(Date date, String searchengine) {
        this.date = date;
        this.searchengine = searchengine;
    }

    public SearchEngineKey() {
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
}