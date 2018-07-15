package com.peacock.shop.web.domain;

import java.util.Date;

public class Keyword extends KeywordKey {
    private Integer count;

    public Keyword(Date date, String searchengine, String keyword, Integer count) {
        super(date, searchengine, keyword);
        this.count = count;
    }

    public Keyword() {
        super();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}