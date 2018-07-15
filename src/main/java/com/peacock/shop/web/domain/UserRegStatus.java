package com.peacock.shop.web.domain;

public class UserRegStatus {
    private Integer userId;

    private Byte isCompleted;

    public UserRegStatus(Integer userId, Byte isCompleted) {
        this.userId = userId;
        this.isCompleted = isCompleted;
    }

    public UserRegStatus() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Byte isCompleted) {
        this.isCompleted = isCompleted;
    }
}