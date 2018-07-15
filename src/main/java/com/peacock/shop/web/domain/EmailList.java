package com.peacock.shop.web.domain;

public class EmailList {
    private Integer id;

    private String email;

    private Boolean stat;

    private String hash;

    public EmailList(Integer id, String email, Boolean stat, String hash) {
        this.id = id;
        this.email = email;
        this.stat = stat;
        this.hash = hash;
    }

    public EmailList() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getStat() {
        return stat;
    }

    public void setStat(Boolean stat) {
        this.stat = stat;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }
}