package com.peacock.shop.web.domain;

public class SessionData {
    private String sesskey;

    private Integer expiry;

    private String data;

    public SessionData(String sesskey, Integer expiry, String data) {
        this.sesskey = sesskey;
        this.expiry = expiry;
        this.data = data;
    }

    public SessionData() {
        super();
    }

    public String getSesskey() {
        return sesskey;
    }

    public void setSesskey(String sesskey) {
        this.sesskey = sesskey == null ? null : sesskey.trim();
    }

    public Integer getExpiry() {
        return expiry;
    }

    public void setExpiry(Integer expiry) {
        this.expiry = expiry;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}