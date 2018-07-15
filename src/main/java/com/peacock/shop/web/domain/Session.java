package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class Session {
    private String sesskey;

    private Integer expiry;

    private Integer userid;

    private Integer adminid;

    private String ip;

    private String userName;

    private Byte userRank;

    private BigDecimal discount;

    private String email;

    private String data;

    public Session(String sesskey, Integer expiry, Integer userid, Integer adminid, String ip, String userName, Byte userRank, BigDecimal discount, String email, String data) {
        this.sesskey = sesskey;
        this.expiry = expiry;
        this.userid = userid;
        this.adminid = adminid;
        this.ip = ip;
        this.userName = userName;
        this.userRank = userRank;
        this.discount = discount;
        this.email = email;
        this.data = data;
    }

    public Session() {
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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Byte getUserRank() {
        return userRank;
    }

    public void setUserRank(Byte userRank) {
        this.userRank = userRank;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}