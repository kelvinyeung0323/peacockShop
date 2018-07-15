package com.peacock.shop.web.domain;

import java.util.Date;

public class Sns {
    private Integer userId;

    private String openId;

    private Byte vendor;

    private Date createdAt;

    private Date updatedAt;

    public Sns(Integer userId, String openId, Byte vendor, Date createdAt, Date updatedAt) {
        this.userId = userId;
        this.openId = openId;
        this.vendor = vendor;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Sns() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Byte getVendor() {
        return vendor;
    }

    public void setVendor(Byte vendor) {
        this.vendor = vendor;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}