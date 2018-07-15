package com.peacock.shop.web.domain;

import java.util.Date;

public class SearchEngine extends SearchEngineKey {
    private Integer count;

    public SearchEngine(Date date, String searchengine, Integer count) {
        super(date, searchengine);
        this.count = count;
    }

    public SearchEngine() {
        super();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}