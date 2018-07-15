package com.peacock.shop.web.domain;

import java.math.BigDecimal;

public class UserAccount {
    private Integer id;

    private Integer userId;

    private String adminUser;

    private BigDecimal amount;

    private Integer addTime;

    private Integer paidTime;

    private String adminNote;

    private String userNote;

    private Boolean processType;

    private String payment;

    private Boolean isPaid;

    public UserAccount(Integer id, Integer userId, String adminUser, BigDecimal amount, Integer addTime, Integer paidTime, String adminNote, String userNote, Boolean processType, String payment, Boolean isPaid) {
        this.id = id;
        this.userId = userId;
        this.adminUser = adminUser;
        this.amount = amount;
        this.addTime = addTime;
        this.paidTime = paidTime;
        this.adminNote = adminNote;
        this.userNote = userNote;
        this.processType = processType;
        this.payment = payment;
        this.isPaid = isPaid;
    }

    public UserAccount() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser == null ? null : adminUser.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Integer paidTime) {
        this.paidTime = paidTime;
    }

    public String getAdminNote() {
        return adminNote;
    }

    public void setAdminNote(String adminNote) {
        this.adminNote = adminNote == null ? null : adminNote.trim();
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote == null ? null : userNote.trim();
    }

    public Boolean getProcessType() {
        return processType;
    }

    public void setProcessType(Boolean processType) {
        this.processType = processType;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public Boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }
}